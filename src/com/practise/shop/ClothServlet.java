package com.practise.shop;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
/**
 * Servlet implementation class ClothServlet
 */
@WebServlet("/ClothServlet")
public class ClothServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClothServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletContext context=request.getServletContext();
		String offmsg=context.getInitParameter("ofms");
		String offperc=context.getInitParameter("ofpd");
		PrintWriter out=response.getWriter();
		out.println("<html><body bgcolor='orange'>"+"<h1>Cloth Product Details</h1>"+" "+ offmsg + " %off "+offperc+"<br>"+"<a href=\"Product.html\">Back</a>"+"<body></html>");
		out.flush();
		out.close();
		
	}

}
