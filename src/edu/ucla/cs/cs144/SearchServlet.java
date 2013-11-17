package edu.ucla.cs.cs144;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SearchServlet extends HttpServlet implements Servlet {
       
    public SearchServlet() {}

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
    	String query = request.getParameter("q");
    	int numResultsToSkip = Integer.valueOf(request.getParameter("numResultsToSkip"));
    	int numResultsToReturn = Integer.valueOf(request.getParameter("numResultsToReturn"));
    	
    	SearchResult results[] = AuctionSearchClient.basicSearch(query, numResultsToSkip, numResultsToReturn);
    	
    	PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>Servlet Example</title></head>");
        out.println("<body>Hello from a Java Servlet</body>");
        out.println("<p>Request: " + query + "</p>");
        out.println("<p>Skip: " + numResultsToSkip + "</p>");
        out.println("<p>Return: " + numResultsToReturn + "</p>");
        out.println("</html>");
        out.close();
    }
}
