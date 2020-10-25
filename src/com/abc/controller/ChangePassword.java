package com.abc.controller;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.abc.model.Model;
import com.mysql.cj.Session;

public class ChangePassword extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pwd = request.getParameter("npwd");
		HttpSession session = request.getSession();
		
		int accno = (int) session.getAttribute("accno");
		
		try {
			Model m = new Model();
			m.setAccno(accno);
			m.setPwd(pwd);
			
			boolean b = m.changePwd();
			if(b == true) {
				response.sendRedirect("/BankingApplication/ChangePasswordSuccess.html");
			}
			else {
				response.sendRedirect("/BankingApplication/ChangePasswordFailure.html");
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
