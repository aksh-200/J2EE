package com.demo.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.service.EmpServiceImpl;
import com.demo.service.EmpService;

/**
 * Servlet implementation class DeleteEmpById
 */
@WebServlet("/deleteemp")
public class DeleteEmpById extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int empid = Integer.parseInt(request.getParameter("eid"));
		EmpService eservice = new EmpServiceImpl();
		eservice.deleteById(empid);
		RequestDispatcher rd=request.getRequestDispatcher("employee");
		rd.forward(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
