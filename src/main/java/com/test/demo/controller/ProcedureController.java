package com.test.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.demo.service.BoardService;
import com.test.demo.vo.TransferVO;

@Controller
public class ProcedureController {

	@Autowired
	BoardService boardService;
	
	@RequestMapping("/hello")
	@ResponseBody
	public Map<String, Object> hello(){
		
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", "hello");
		return resultMap;
	}
	
	@RequestMapping(value = "/mapProcedureList.do")
	public String mapProcedureList(Model model) throws Exception {
	    Map<String, Object> map = boardService.mapProcedureList();
	     
	    model.addAttribute("list", map.get("resultList"));
	    model.addAttribute("name", map.get("name"));
	    System.out.println(model);
	    return "mapList";
	}
	
	@RequestMapping(value = "/procedureList.do")
	public String procedureList(Model model) throws Exception {
	    TransferVO transferVO = boardService.procedureList();
	     
	    model.addAttribute("list", transferVO.getResultList());
	    model.addAttribute("name", transferVO.getName());
	    System.out.println(model);
	    return "mapList";
	}
	
	@RequestMapping(value = "/anonymousBlockList.do")
	public String anonymousBlockList(Model model) throws Exception {
	    TransferVO transferVO = boardService.procedureList();
	     
	    model.addAttribute("list", transferVO.getResultList());
	    model.addAttribute("name", transferVO.getName());
	    System.out.println(model);
	    return "mapList";
	}

	@RequestMapping("/test")
	public String test() {
		Map<String, Object> map  = boardService.getEmpList();
		System.out.println(map);
		return "test";
	}
	
}
