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
    
</body>
</html>
