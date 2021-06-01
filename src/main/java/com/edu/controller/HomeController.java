package com.edu.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//외부 라이브러리(모듈) 사용 = import
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 이 클래스는 MVC웹 프로젝트를 최초로 생성시 자동으로 생성되는 클래스
 * 웹브라우저의 요청사항을 view단 (jsp)에 연결시켜주는 클래스 @controller.
 * 스프링에서 관리하는 클래스를 스프링빈(콩) = 스프링빈을 명시 @controller 애노테이션
 * 스프링이 관리하는 클래스는 파일아이콘에 S가 붙습니다.
 */

@Controller
public class HomeController {
	//스프링번(클래스) 에서는 로거로 디버그를 합니다. = 로거 객체를 만듦
	// 로그중 slf4j(Spring Log For Java)
//	private Logger logger = Logger
//private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * 사용자요청(웹브라우저)을 받아서=@RequestMapping인터페이스를 사용해서 메서드명을
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String homepage(Model model) {
		String jspVar = "@서비스(DB)에서 처리한 결과";
		model.addAttribute("jspObject", jspVar);//home.jsp파일로 자료를 전송하는 기능 model
		return "home";
	}
	
}
