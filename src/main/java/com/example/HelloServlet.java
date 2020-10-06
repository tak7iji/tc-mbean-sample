package com.example;

import java.io.*;
import javax.servlet.*;
//import javax.servlet.annotation.*;
import javax.servlet.http.*;

//@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    
  /**
   *
   */
  private static final long serialVersionUID = 6609194461949755629L;

  public void doGet(HttpServletRequest req, HttpServletResponse res)
    throws ServletException, IOException {
        
    PrintWriter out = res.getWriter();
    out.println("<html><body>");
    out.println("<h1>Hello Servlet !!</h1>");
    out.println("</body></html>");
  }
}
