package tp.kits3.open4um.apiloginregister;

import java.util.Collection;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import tp.kits3.open4um.service.UserService;
import tp.kits3.open4um.vo.RoleUser;
import tp.kits3.open4um.vo.User;

/**
 * 
 * @author nguyen thai
 *
 */

@Controller
@RequestMapping("/api")
@SessionAttributes("user")
public class ApiController {

	@Autowired
	private UserService userService;
 
	@RequestMapping("/login")
	public String loggin() {
		return "users/login";
	}
	
	@RequestMapping("/author")
	public String author(Model model) {
		
		Collection<? extends GrantedAuthority> allRole = SecurityContextHolder.getContext().getAuthentication().getAuthorities();
		
		 
		for(GrantedAuthority s: allRole) {
			System.out.println(s);
			 if(s.equals("ROLE_admin")) {
				 return "redirect:/admin";
			 }
		}
		return "redirect:/";
	}
	
	@RequestMapping("/register")
	public String register( User user,  Model model, RoleUser roleUser) {
		String hash = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt(12));
		user.setPassword(hash);
		user.setStatus("active");
		String us = user.getUsername();
		userService.insertUser(user);
		user = userService.selectUser(us);
		
		roleUser.setUserid(user.getUserid());
		roleUser.setRoleid(1);
		userService.insertRoleUser(roleUser);
		model.addAttribute("user", user);
		return "redirect:/";
	}
	
}
