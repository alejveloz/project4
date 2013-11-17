<%@ page import="edu.ucla.cs.cs144.SearchResult" %>

<html>
<head>
    <title>Search results</title>
</head>
<body>
    Hello, world.
    
	<%
	SearchResult[] results = (SearchResult[])request.getAttribute("results");
    for (int i = 0; i < results.length; i++) {
    	SearchResult result = results[i];
        %>
        <p>
   			Item: <%= result.getItemId() %>. Name: <%= result.getName() %>.
		</p>
        <%
    }
%>
    
</body>
</html>
