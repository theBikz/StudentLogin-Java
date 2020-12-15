
package com.company;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class Marks extends GenericServlet {
	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
        out.print("<html>");
		out.print("<body>");
		out.print("<h1>Welcome Bipin:  </h2>");
		out.print("<h3>Your Marks </h3>");
		out.print("<h5>Sub 1 : 85</h3>");
		out.print("<h5>Sub 2 : 98</h3>");
		out.print("<h5>Sub 3 : 82</h3>");
		out.print("<h5>Sub 3 : 87</h3>");
		out.print("<h5>Sub 3 : 62</h3>");
		out.print("<h5>Sub 3 : 92</h3>");
		out.print("</body>");
		out.print("</html>");
}

}



