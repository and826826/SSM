package com.ssm.controller;

import com.ssm.pojo.employee;
import com.ssm.service.UserDaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ssm.mapper.UserMapper;
import com.ssm.service.impl.UserDaoServiceImple;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;


@RestController//

public class HelloController {

	@Autowired
	UserDaoServiceImple daoService;
	@Autowired
	UserMapper mapper;

	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest request) throws UnsupportedEncodingException {
		System.out.println("添加新员工");
		request.setCharacterEncoding("UTF-8");
		String username = request.getParameter("name");
		String email = request.getParameter("email");
		String cardId = request.getParameter("cardId");
		String education = request.getParameter("education");
		String phone = request.getParameter("phone");
		String tel = request.getParameter("tel");
		String party = request.getParameter("party");
		String qq = request.getParameter("qqNum");
		String address = request.getParameter("address");
		String postcode = request.getParameter("postCode");
		Timestamp birthday = Timestamp.valueOf(request.getParameter("birthday"));
		String race = request.getParameter("race");
		String speciality = request.getParameter("speciality");
		String hobby = request.getParameter("hobby");
		String sex = request.getParameter("sex");
		int dept_id = Integer.parseInt(request.getParameter("dept_id"));
		int job_id = Integer.parseInt(request.getParameter("job_id"));
		String remark = request.getParameter("remark");
		employee employee = new employee(dept_id, username, cardId, address, postcode, tel, phone, qq, email, sex, party, birthday, race, education, speciality, hobby, remark, job_id);
		mapper.addUser(employee);
		ModelAndView mav = new ModelAndView("employee");
		return mav;
//		return null;

	}


	@RequestMapping("/hello")
	public ModelAndView method01(HttpServletRequest req) {
		System.out.println("hello测试");
		try {
			req.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}


		return null;

	}

	@RequestMapping("/delete")
	public ModelAndView method02(HttpServletRequest request) throws UnsupportedEncodingException {
		System.out.println("删除...");
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("ids");
		for (String retval : id.split(",")) {
			int i = Integer.parseInt(retval);
			daoService.deleteEmployee(i);
			System.out.println("删除第" + i + "个");
		}

		System.out.println("删除成功");
		return null;
	}

	@RequestMapping("/update")
	public ModelAndView update(HttpServletRequest request) throws UnsupportedEncodingException {
		System.out.println("修改...");
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String card_id = request.getParameter("cardId");
		String education = request.getParameter("education");
		String phone = request.getParameter("phone");
		String tel = request.getParameter("tel");
		String party = request.getParameter("party");
		String qq = request.getParameter("qqNum");
		String address = request.getParameter("address");
		String post_code = request.getParameter("postCode");
		Timestamp birthday = Timestamp.valueOf(request.getParameter("birthday"));
		String race = request.getParameter("race");
		String speciality = request.getParameter("speciality");
		String hobby = request.getParameter("hobby");
		String sex = request.getParameter("sex");
		int dept_id = Integer.parseInt(request.getParameter("dept_id"));
		int job_id = Integer.parseInt(request.getParameter("job_id"));
		String remark = request.getParameter("remark");
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println(id);
		employee employee = new employee( id,dept_id, job_id, name, card_id, address, post_code,  tel,  phone, qq, email, party, birthday,race, education,speciality, hobby, remark, sex);
		daoService.updateEmployee(employee);
//		System.out.println(sex);
		return null;
	}

	@RequestMapping("/show")
	public void show(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		List<employee> employeeList = daoService.findAll();
		System.out.println(employeeList);
		req.setAttribute("employeeList", employeeList);
			HttpSession session=req.getSession();



	}

	@RequestMapping("/search")
	public List<employee> search(HttpServletRequest request) throws UnsupportedEncodingException {
		System.out.println("查找...");
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String sex = request.getParameter("sex");
		String card_id = request.getParameter("cardId");
		String phone = request.getParameter("phone");
		int dept_id = Integer.parseInt(request.getParameter("dept_id"));
		int job_id = Integer.parseInt(request.getParameter("job_id"));
		System.out.println(name);
		employee employee=new employee(dept_id, job_id,  name, card_id, phone,sex);

		List<employee> employeeList=mapper.searchEmployee(employee);
		System.out.println(employeeList);


		System.out.println("查找成功" );
		return employeeList;
	}
}

