package com.ssm.controller;

import com.ssm.pojo.employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ssm.mapper.UserMapper;
import com.ssm.service.impl.UserDaoServiceImple;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.sql.Timestamp;


@Controller//

public class HelloController  {
	
	  @Autowired 
	  UserDaoServiceImple daoService;
	@Autowired
	UserMapper mapper;

	  @RequestMapping("/add")
	  public ModelAndView add(HttpServletRequest request) throws UnsupportedEncodingException {
	  	System.out.println("添加新员工");
	  	request.setCharacterEncoding("UTF-8");
	  	String username=request.getParameter("name");
	  	String email=request.getParameter("email");
	  	String cardId=request.getParameter("cardId");
	  	String education=request.getParameter("education");
	  	String phone=request.getParameter("phone");
	  	String tel=request.getParameter("tel");
	  	String party=request.getParameter("party");
	  	String qq=request.getParameter("qqNum");
	  	String address=request.getParameter("address");
	  	String postcode=request.getParameter("postCode");
	  	Timestamp birthday=Timestamp.valueOf(request.getParameter("birthday"));
	  	String race=request.getParameter("race");
	  	String speciality=request.getParameter("speciality");
	  	String hobby=request.getParameter("hobby");
	  	String sex=request.getParameter("sex");
	  	int dept_id=Integer.parseInt(request.getParameter("dept_id"));
	  	int job_id=Integer.parseInt(request.getParameter("job_id"));
	  	String remark=request.getParameter("remark");
	  	employee employee=new employee(dept_id, username, cardId,address,postcode, tel,phone, qq, email, sex, party, birthday, race, education, speciality, hobby, remark,job_id);
		mapper.addUser(employee);
		return  null;

	  }
	 
	
	@RequestMapping("/hello")
	public  ModelAndView method01(HttpServletRequest req) {
		System.out.println("hello测试");
		try {
			req.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}



		return  null;
		
	}

	@RequestMapping("/adduser")
	public  ModelAndView method02() {
		System.out.println("添加一个...");
		System.out.println("添加成功");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("findOne");
		return mav;
	}

}
