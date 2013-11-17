<%@ page import="edu.ucla.cs.cs144.ItemBean" %>

<html>
<head>
    <title>Item result</title>
</head>
<body>
    Hello, world.
    
	<%
	ItemBean item = (ItemBean)request.getAttribute("item");
	%>
    
</body>
</html>
