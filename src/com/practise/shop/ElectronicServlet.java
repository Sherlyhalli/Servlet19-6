package com.practise.shop;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 * Servlet implementation class ElectronicServlet
 */
@WebServlet("/ElectronicServlet")
public class ElectronicServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ElectronicServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletContext context=request.getServletContext();
		String offmsg=context.getInitParameter("ofm");
		String offperc=context.getInitParameter("ofp");
		Product p=new Product();
		context.setAttribute("product", p);
		PrintWriter out=response.getWriter();
		out.println("<html><body bgcolor='pink'>"+"<h1>Electronic Product Details</h1>"+" "+ offmsg + " %off "+offperc+"<br>"+"<a href=\"Product.html\">Back</a>"+"<body></html>");
		out.flush();
		out.close();
		
	}

}
