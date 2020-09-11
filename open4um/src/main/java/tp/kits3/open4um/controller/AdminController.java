package tp.kits3.open4um.controller;
/**
 * 
 * @author nguyento_the_toan
 *
 */


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import tp.kits3.open4um.dto.ProductRoleDto;
import tp.kits3.open4um.dto.UserRoleDto;
import tp.kits3.open4um.service.MessageService;
import tp.kits3.open4um.service.OrderHistoryService;
import tp.kits3.open4um.service.ProductService;
import tp.kits3.open4um.service.SourceService;

import tp.kits3.open4um.service.UserService;
import tp.kits3.open4um.vo.Message;
import tp.kits3.open4um.vo.OrderHistory;
import tp.kits3.open4um.vo.Source;
import tp.kits3.open4um.vo.User;


@Controller
public class AdminController {
	@Autowired
	private UserService usersv;
	@Autowired
	private ProductService productsv;
	@Autowired
	private SourceService sourcesv;
	@Autowired
	private MessageService messagesv;
	@Autowired
	private OrderHistoryService orderhistorysv;
	
	

	
// author:Toan  
	@RequestMapping(value= {"/admin/"},method = RequestMethod.GET)
	public String Index(Model model,Model model1,Model model2,Model model3,Model model4,Model model5) {
		List<User> list = usersv.selectuserName();
		int i = list.size();
		model.addAttribute("name",i);
		
		List<Source> list1 = sourcesv.selectsourceName();
		int i1 = list1.size();
		model1.addAttribute("sourcename",i1);
		
		List<Message> list2 = messagesv.selectMessageName();
		int i2 = list2.size();
		model2.addAttribute("messagename",i2);
		
		List<OrderHistory> list3 = orderhistorysv.selectOrderHistoryName();
		int i3 = list3.size();
		model3.addAttribute("orderhistoryname",i3);
		System.out.println("conflic ne");
		List<UserRoleDto> list4 = usersv.selectthanhviencu();
			model4.addAttribute("listuser",list4);

		List<ProductRoleDto> list5 = productsv.selectdanhsachbaiviet();
			model5.addAttribute("listproduct",list5);
		
		return "admin/index";

		
		
	}
	@RequestMapping(value= {"/admin/quanlybaiviet/list/"},method = RequestMethod.GET)
	public String listbaiviet(Model model5,Model model1) {
		List<ProductRoleDto> list5 = productsv.selectdanhsachbaiviet();
		model5.addAttribute("listproduct",list5);
		
		List<ProductRoleDto> list1 = productsv.selectdanhsachbaiviet();
		model1.addAttribute("listproduct",list1);
		return "admin/danhsachbaiviet";
	}
	//het author:Toan
}
