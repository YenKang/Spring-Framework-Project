package com.tibame.view;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tibame.domain.ITibameHello;
import com.tibame.domain.TibameHello;

@WebServlet("/TibameHelloServlet")
public class TibameHelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ClassPathXmlApplicationContext factory = 
			new ClassPathXmlApplicationContext("applicationContext.xml"); 
	
	public TibameHelloServlet() {
		super();
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//ITibameHello hello = new TibameHello();
		ITibameHello hello = factory.getBean("tibamehello2", ITibameHello.class);
		String msg = hello.helloWorld("Tom");
		response.getWriter().println(msg); // UI display
		
	}

}
