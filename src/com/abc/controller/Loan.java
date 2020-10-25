package com.abc.controller;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.abc.model.Model;

@WebServlet("/Loan")

public class Loan extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		int accno = (int) session.getAttribute("accno");
		
		try {
			Model m = new Model();
			m.setAccno(accno);			
					
			boolean b = m.applyLoan();
			if(b == true) {
				session.setAttribute("name", m.getName());
				session.setAttribute("email", m.getEmail());
				response.sendRedirect("/BankingApplication/LoanSuccess.jsp");
			}
			else {
				response.sendRedirect("/BankingApplication/LoanFail.html");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private boolean applyLoan() {
		
		return false;
	}

	
	

}
