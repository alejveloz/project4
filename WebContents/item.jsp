<html>
<head>
    <title>Item result</title>
</head>
<body>
    Hello, world.
    
	<%
	String itemXML = (String)request.getAttribute("itemXML");
	out.print(itemXML);
	%>
    
</body>
</html>
