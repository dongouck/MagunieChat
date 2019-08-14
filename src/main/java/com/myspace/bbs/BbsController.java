package com.myspace.bbs;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myspace.bbs.Service.BbsDTO;
import com.myspace.bbs.Service.BbsService;

@Controller
public class BbsController {

	@Resource(name = "bbsService")
	private BbsService bbsService;

	@Autowired
	private SqlSession sqlSession;

	@RequestMapping(value = "/bbs")
	public String init(ModelMap model) {

		HashMap<String, String> parameter = new HashMap<String, String>();
		parameter.put("COUNTRY", "INDIA");

		List<HashMap<String, String>> outputs = sqlSession.selectList("com.myspace.bbs.Service.impl.BbsMapper.getEmpName",
				parameter);
		//System.out.println(outputs.toString());
		System.out.println("bbs page loaded");
		model.addAttribute("bbsList", outputs);

		return "views/bbs.tiles";
	}

	@RequestMapping(value = "/upload")
	public String init2() {

		return "views/bbs/upload.tiles";
	}

	@RequestMapping(value = "/testingdb")
	public String init3() {

		List<Map> testList = bbsService.selectTestList();

		System.out.println(testList);

		return "views/main.tiles";
	}
	
	@RequestMapping(value="/testingInsert")
	public String init4(BbsDTO bbsDto) {
		
		System.out.println(bbsDto);
		System.out.println(bbsDto.getCountry());
		System.out.println(bbsDto.getDept());
		System.out.println(bbsDto.getEmp_name());
		/*
		 * @RequestParam HashMap<String, String> paraMap
		 * 
		 * System.out.println(paraMap); System.out.println(paraMap.get("emp_id"));
		 * System.out.println(paraMap.get("emp_no"));
		 * System.out.println(paraMap.get("emp_name"));
		 * System.out.println(paraMap.get("country"));
		 */
		
		/*
		 * int emp_id=Integer.parseInt(request.getParameter("emp_id")); int
		 * emp_no=Integer.parseInt(request.getParameter("emp_no")); String
		 * emp_name=request.getParameter("emp_name"); String
		 * country=request.getParameter("country"); String
		 * dept=request.getParameter("dept");
		 * 
		 * System.out.println(emp_id + emp_no + emp_name + country + dept);
		 * 
		 * BbsDTO dto= new BbsDTO(emp_id ,emp_no ,emp_name ,country ,dept);
		 * bbsService.testingInsert(dto); //String System.out.println(dto);
		 * //bbsService.testingInsert();
		 */
		return "views/bbs.tiles";
	}

}
