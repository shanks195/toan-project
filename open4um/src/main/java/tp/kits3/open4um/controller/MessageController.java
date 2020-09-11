package tp.kits3.open4um.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import tp.kits3.open4um.service.MessageService;
import tp.kits3.open4um.vo.Message;
/**
 * 
 * @author Thong
 *
 */
@Controller
public class MessageController {
	@Autowired
	private MessageService messageS;
	//jsonMessage Thong
	@RequestMapping(value="/thong", method = RequestMethod.GET)
	@ResponseBody
	public List<Message> selectAll(){
		return messageS.selectAll(1);
	}
	//ListMessage Thong
	@RequestMapping(value = "/chatting")
	public String chat() {
		return "users/chatting";
	}
}
