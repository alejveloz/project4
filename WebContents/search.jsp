<%@ page import="edu.ucla.cs.cs144.SearchResult" %>

<html>
<head>
    <title>Search results</title>
</head>
<body>

	<p>Search a new item below and hit submit!</p>

	<form action="search" method="GET">
  		Keywords: <input type="text" name="q"><br>
  		<input type="hidden" name="numResultsToSkip" value="0" /> 
  		<input type="hidden" name="numResultsToReturn" value="20" /> 
  		<input type="submit" /> 
	</form>

	<h1>Search Results</h1>

	<%
	SearchResult[] results = (SearchResult[])request.getAttribute("results");
	String range = (String)request.getAttribute("range");
	
	if(results.length == 0)
		out.println("No results found! Please try searching again!");
	else
		out.println("Showing results: " + range);
	
    for (int i = 0; i < results.length; i++) {
    	SearchResult result = results[i];
        %>
        <p>
   			Item: <%= result.getItemId() %>. Name: <%= result.getName() %>. <br>
   			<a href="item?id=<%= result.getItemId() %>">More info</a>
		</p>
        <%
    }
%>

<br>
<br>


<%
String prev = (String)request.getAttribute("prev") ;
if(prev != null) {
out.println("<a href=\"search?" + prev + "\">Previous</a> ");
}
%>

<%
String next = (String)request.getAttribute("next") ;
if(next != null) {
out.println("<a href=\"search?" + next + "\">Next</a>");
}
%>


</body>
</html>
