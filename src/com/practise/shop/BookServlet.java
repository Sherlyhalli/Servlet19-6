package com.practise.shop;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;


/**
 * Servlet implementation class Book
 */
@WebServlet("/BookServlet")
public class BookServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletContext context=request.getServletContext();
		String offmsg=context.getInitParameter("ofmsg");
		String offperc=context.getInitParameter("ofpds");
		Product p=(Product) context.getAttribute("product");
		PrintWriter out=response.getWriter();
		out.println("<html><body bgcolor='yellow'>"+"<h1>Cloth Product Details</h1>"+" "+ offmsg + " %off "+offperc+"<br>"+"<a href=\"Product.html\">Back</a>"+"<body></html>");
		out.flush();
		out.close();
		
		
	}

}
