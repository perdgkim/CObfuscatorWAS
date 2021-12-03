package com.tistory.stlab;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "gwork", urlPatterns = "/gwork")
public class Gwork extends HttpServlet {


	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		RunnerObfu ob = new RunnerObfu();
		String text = req.getParameter("fn");
		text = ob.run(text);
		req.setAttribute("fn", text);
		
		ServletContext context =getServletContext();
        RequestDispatcher dispatcher = context.getRequestDispatcher("/strProc.jsp"); //넘길 페이지 주소
        dispatcher.forward(req, resp);
		
	}
	
	
}
