package my.test.web.practice.controller;

import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import my.test.web.practice.entity.DevicePreConfig;
import my.test.web.practice.service.QueryTableService;

@Controller
public class QueryTable {

	private static final Log log = LogFactory.getLog(QueryTable.class);

	@Autowired
	private QueryTableService qtService;

	@RequestMapping(value = "/page/QueryTable.do", method = RequestMethod.POST)
	@ResponseBody
	public List<DevicePreConfig> getTableContent(@RequestBody Map<String, String> searchParam) {
		log.debug("QueryTable::getTableContent start, searchParam:" + searchParam);

		List<DevicePreConfig> dplst = qtService.findPreconfigData(searchParam);

		log.debug("QueryTable::getTableContent end. dplst count:" + dplst.size());
		return dplst;
	}
	
/*
	@RequestMapping(value = "/page/showQueryTable.do", method = RequestMethod.POST)
	public ModelAndView queryTablePage(HttpServletRequest request) {
		log.debug("QueryTable::queryTablePage start, request:" + request);
		ModelAndView model = new ModelAndView("page/subpage/queryTable.jsp");


		log.debug("QueryTable::queryTablePage end");
		return model;
	}
	*/
}
