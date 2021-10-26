package co.micro.prj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/Login")
public class Loing extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Loing() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8"); //한글 깨짐 방지
		PrintWriter out = response.getWriter();
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		out.println("<h1> 당신의 아이디는 "+id+"입니다. </h1>");
		out.println("<h1> 당신의 비밀번호는 "+password+"입니다. </h1>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet(request, response); //get이든 post든 get에서 쓰겠다.
		response.setContentType("text/html; charset=UTF-8"); //한글 깨짐 방지
		PrintWriter out = response.getWriter();
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		out.println("<h1> 당신의 아이디는 "+id+"입니다. </h1>");
		
	}

}
