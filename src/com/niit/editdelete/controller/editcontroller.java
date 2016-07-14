package com.niit.editdelete.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Request;

import com.niit.editdelete.model.product;
import com.niit.editdelete.model.productDB;

/**
 * Servlet implementation class editcontroller
 */
@WebServlet("/editcontroller")
public class editcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public editcontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		ServletContext context = getServletContext();
		@SuppressWarnings("unchecked")
		List<product> originallist = (List<product>)context.getAttribute("obj");
		System.out.println(originallist.get(0).getProduct_name() + " " + originallist.size());
	
		System.out.println("hi");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
			//ServletContext context=getServletContext(); 
			
		List<product> templist = new ArrayList<product>();

			//context.setAttribute("originalobj", tempobjdb.getall());
			
			ServletContext context = getServletContext();
			@SuppressWarnings("unchecked")
			List<product> originallist = (List<product>)context.getAttribute("obj");
			
		String act = request.getParameter("act");
		if (act.equals("update")) {
			for (int i = 0; i <originallist.size(); i++)
			{
				if (originallist.get(i).getProduct_id().equals(request.getParameter("productid"))){
					
				}
				else
				{
					String a = originallist.get(i).getProduct_id();
					String b = originallist.get(i).getProduct_name();
					String c = originallist.get(i).getCategory_id();
					String d = originallist.get(i).getProduct_category();
					String e = originallist.get(i).getProduct_discription();
					String f = originallist.get(i).getProduct_brand();
					String g = originallist.get(i).getPrice();
					
					templist.add(new product(a,b,c,d,e,f,g));
				}

			}
			String prodid = request.getParameter("productid");
			String productname = request.getParameter("prodname");
			String categoryid = request.getParameter("catid");
			String categoryname = request.getParameter("catname");
			String description = request.getParameter("desc");
			String prodbrand = request.getParameter("brand");
			String prodprice = request.getParameter("price");
			
			templist.add(new product(prodid,productname,categoryid,categoryname,description,prodbrand,prodprice));
			
			originallist.removeAll(originallist);
					
			originallist = templist;
			
			context.setAttribute("obj",originallist);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
			dispatcher.forward(request,response);
			
		} else if (act.equals("cancel")) {
		    
			RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
			dispatcher.forward(request,response);
			
		} else if(act.equals("delete"))
		{
			for (int i = 0; i <originallist.size(); i++)
			{
				if (originallist.get(i).getProduct_id().equals(request.getParameter("productid")))
				{
					
				}
				else
				{
					String a = originallist.get(i).getProduct_id();
					String b = originallist.get(i).getProduct_name();
					String c = originallist.get(i).getCategory_id();
					String d = originallist.get(i).getProduct_category();
					String e = originallist.get(i).getProduct_discription();
					String f = originallist.get(i).getProduct_brand();
					String g = originallist.get(i).getPrice();
					
					templist.add(new product(a,b,c,d,e,f,g));
				}

			}
			originallist.removeAll(originallist);
			
			originallist = templist;
					context.setAttribute("obj",originallist);
					RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
					dispatcher.forward(request,response);
		}
			else if(act.equals("add")){
			String prodid = request.getParameter("productid");
			String productname = request.getParameter("prodname");
			String categoryid = request.getParameter("catid");
			String categoryname = request.getParameter("catname");
			String description = request.getParameter("desc");
			String prodbrand = request.getParameter("brand");
			String prodprice = request.getParameter("price");
			String[] check = request.getParameterValues(prodid);
			
			System.out.println(check);
			originallist.add(new product(prodid,productname,categoryid,categoryname,description,prodbrand,prodprice));
			System.out.println(prodid);
			context.setAttribute("obj",originallist);
			RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
			dispatcher.forward(request,response);
			
		}
		
		
	}

}
