package com.NumbersProject.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.NumbersProject.model.DivNumber;


@WebServlet("/div")
public class DivController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public DivController() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			int num1 = Integer.parseInt(request.getParameter("num1"));
			int num2 = Integer.parseInt(request.getParameter("num2"));
			
			DivNumber div = new DivNumber();
			int result = div.divNumber(num1, num2);
			int result1 = div.addNumber(num1, num2);
			
			request.setAttribute("res", result);
			request.setAttribute("resul", result1);
			
			RequestDispatcher rd =request.getRequestDispatcher("div_numbers.jsp");
			rd.forward(request, response);
			
	
	}

}
