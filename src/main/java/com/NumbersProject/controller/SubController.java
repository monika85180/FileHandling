package com.NumbersProject.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.NumbersProject.model.SubNumbers;

@WebServlet("/sub")
public class SubController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public SubController() {
        super();
       }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				int num1 = Integer.parseInt(request.getParameter("num1"));
				int num2 = Integer.parseInt(request.getParameter("num2"));
				
				SubNumbers a = new SubNumbers();
				int result = a.subNumber(num1, num2);
				
				request.setAttribute("res", result);
				
				RequestDispatcher rd = request.getRequestDispatcher("sub_numbers.jsp");
						rd.forward(request, response);
	
	
	}

}
