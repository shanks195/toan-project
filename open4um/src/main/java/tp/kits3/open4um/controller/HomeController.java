package tp.kits3.open4um.controller;

 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import tp.kits3.open4um.service.SourceService;
import tp.kits3.open4um.service.UserService;
import tp.kits3.open4um.vo.Source;

 

/**
 * 
 * @author nguyenthai_thien
 *
 */
@Controller
public class HomeController {

	@Autowired
	private SourceService sourceService;

	@RequestMapping(value = { "/home", "/" }, method = RequestMethod.GET)
	public String Index(Model model) {
		 
		List<Source> listSource = sourceService.ListSources();
		model.addAttribute("listSource", listSource);
		return "users/index";
	}
	
	@GetMapping("/login")
	public String login() {
		return "users/login";
	}
	
	@GetMapping("/403")
	@ResponseBody
	public String error() {
		return "403 not found";
	}
	
	@GetMapping("/register")
	public String register() {
		return "users/register";
	}
	
	

}
