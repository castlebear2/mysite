package com.douzone.mysite.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.douzone.mysite.web.mvc.main.MainActionFactory;
import com.douzone.mysite.web.mvc.user.UserActionFactory;
import com.douzone.web.mvc.Action;
import com.douzone.web.mvc.ActionFactory;

public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		 
		String actionName = request.getParameter("a");
		// 실행 안되면 코드 줄인 거 지우고, 주석 2개 해제...
//		ActionFactory af = new UserActionFactory();
//		Action action = af.getAction(actionName);
		Action action = new UserActionFactory().getAction(actionName); 
		action.execute(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}