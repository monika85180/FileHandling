package com.NumbersProject.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.NumbersProject.model.AddNumbers;


@WebServlet("/add")
public class AddController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public AddController() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 int num1 = Integer.parseInt(request.getParameter("num1"));  // changing this in integer bcoz servlet only take String value
	 int num2 = Integer.parseInt(request.getParameter("num2"));
	 
	 AddNumbers add = new AddNumbers();  // via this we are creating object of model class 
	 int result = add.addNumber(num1, num2);			// via this object we are giving data to model class to perform business logic and after that will take the data back
	
	 request.setAttribute("res", result);     // Set the data in "res" of result so we can send the data to view and retrive the data in view via using getAttribute
	 
	 
	 
	 // for sending the above result to view we need to use RequestDispatcher so the value will goto view page
	 RequestDispatcher rd = request.getRequestDispatcher("add_numbers.jsp");
	 rd.forward(request, response);   //forwarding the data to view page with objects
	
	
	}

}
