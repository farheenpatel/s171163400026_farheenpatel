package com.niit.editdelete.controller;

import com.niit.editdelete.model.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class productdtls
 */
@WebServlet("/productdtls")
public class productdtls extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public productdtls() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String recvalue = request.getParameter("category_id");
		
		
		
		productDB objdb = new productDB();

		List<product> obj = objdb.getall();
		
		
		
		request.setAttribute("obj", obj);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
		dispatcher.forward(request,response);
		

		pw.println("<html><body>");
		pw.println("<h1>Product Details</h1>");
		pw.println("<table border=1><thead><tr colspan=2>");
		pw.println("<th colspan=2 rowspan=2>Product ID</th>");
		pw.println("<th colspan=2 rowspan=2>product Name</th>");
		pw.println("<th colspan=2 rowspan=2>Category id</th>");
		pw.println("<th colspan=2 rowspan=2>Category name</th>");
		pw.println("<th colspan=2 rowspan=2>Discription</th>");
		pw.println("<th colspan=2 rowspan=2>Brand</th>");
		pw.println("<th colspan=2 rowspan=2>Price</th>");
		pw.println("</tr></thead>");

		for (int i = 0; i < obj.size(); i++)
		{
			if (obj.get(i).getCategory_id().equals(recvalue)) {

				pw.println("<tbody><tr><td colspan=2 rowpan=2>" + obj.get(i).getProduct_id() + "</td>");
				pw.println("<td colspan=2 rowpan=2>" + obj.get(i).getProduct_name() + "</td>");
				pw.println("<td colspan=2 rowpan=2>" + obj.get(i).getCategory_id() + "</td>");
				pw.println("<td colspan=2 rowpan=2>" + obj.get(i).getProduct_category() + "</td>");
				pw.println("<td colspan=2 rowpan=2>" + obj.get(i).getProduct_discription() + "</td>");
				pw.println("<td colspan=2 rowpan=2>" + obj.get(i).getProduct_brand() + "</td>");
				pw.println("<td colspan=2 rowpan=2>" + obj.get(i).getPrice() + "</td>");
				pw.println("</tr><br>");
			}

		}
		pw.println("</tbody></table>");
		pw.println("</body></html>");
	}

}

	


