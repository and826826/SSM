package com.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ssm.mapper.UserMapper;
import com.ssm.service.impl.UserDaoServiceImple;

/**
 * �˽⣺
 * 	 1��ʵ�� httpRequstHandler�ӿ�
 * 	 2��ʵ��Controller�ӿ�
 * �������գ�
 * 	 ע�⣺@controller
 * 
 * @author Administrator
 *
 */
//shift +ctrl +o��ݵ���
@Controller//������ע�⣬��ʾ�����ܿͻ��˷��͵�url

public class HelloController  {
	
	  @Autowired 
	  UserDaoServiceImple daoService;
	 
	
	@RequestMapping("/hello")
	public  ModelAndView method01() {
		System.out.println("hello测试");

		return  null;
		
	}
	@Autowired
	UserMapper mapper;
	@RequestMapping("/adduser")
	public  ModelAndView method02() {
		System.out.println("添加一个...");
		mapper.addUser();
		System.out.println("添加成功");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("findOne");
		return mav;
	}

}
