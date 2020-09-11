package tp.kits3.open4um.controller;

/**
 * @author Thong
 */
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import tp.kits3.open4um.service.HistoryMoneyService;
import tp.kits3.open4um.vo.HistoryMoney;

@Controller
public class HistoryMoneyController {
	@Autowired
	private HistoryMoneyService historyS;
	/**
	 * 
	 * @param Thong listInput
	 * @return
	 */
	@RequestMapping(value="/historymoney", method = RequestMethod.GET)
	public String historyMoney(Model model) {
		List<HistoryMoney> list = historyS.selectAll(1);
		model.addAttribute("historyMoney", list);
		return "users/history-input";
	}
	/**
	 * 
	 * @param Thong searchInput
	 * @return
	 */
	@RequestMapping(value="/search-input", method = RequestMethod.GET)
	public String searchInput(Model model, @RequestParam("searchInput") String searchInput) {
		List<HistoryMoney> list = historyS.selectSearch(1, searchInput);
		model.addAttribute("historyMoney", list);
		return "users/history-input";
	}
}
