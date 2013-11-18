<%@ page import="edu.ucla.cs.cs144.ItemBean" %>
<%@ page import="edu.ucla.cs.cs144.UserBean" %>
<%@ page import="edu.ucla.cs.cs144.BidBean" %>

<html>
<head>
    <title>Item result</title>
</head>
<body>

	<%
	ItemBean item = (ItemBean)request.getAttribute("item");
	UserBean seller = item.getSeller();
	%>
	
	<p>
			Item <br>
   			Id: <%= item.getItemId() %>. <br>
   			Name: <%= item.getName() %>. <br>
   			Location: <%= item.getLocation() %>. <br>
   			Country: <%= item.getCountry() %>. <br>
   			Started: <%= item.getStarted().toString() %>. <br>
   			Ends: <%= item.getEnds().toString() %>. <br>
   	</p>
   	
   	<p>
   			Description<br>
   			<%= item.getDescription() %>. <br>
   	</p>
   	
   	<p>
   			Categories <br>
   			<% String[] categories = item.getCategories();
    		for (int i = 0; i < categories.length; i++) {
        	%>
   				<%= categories[i] %>.<br>
        	<%
        	}
        	%>
   			
   	</p>
   	
   	<p>
   			Seller <br>
   			Id: <%= seller.getUserId() %>. <br>
   			Rating: <%= seller.getRating() %>. <br>
   			Location: <%= item.getLocation() %>. <br>
   			Country: <%= item.getCountry() %>. <br>
   	</p>
   	
   	<p>	
   			Bidding Info <br>
   			Currently: <%= item.getCurrently() %>. <br>
   			First Bid: <%= item.getFirstBid() %>. <br>
   			Number of Bids: <%= item.getNumberOfBids() %>. <br>
   	</p>
   	
   	<p>
   			Bids <br>
   			<% BidBean[] bids = item.getBids(); 
   			for (int i = 0; i < bids.length; i++) {
   			BidBean bid = bids[i];
   			UserBean bidder = bid.getBidder();
   			%>
   				<p>
   				Bid<br>
   				
   				Bidder<br>
   				Id: <%= bidder.getUserId() %>. <br>
   				Rating: <%= bidder.getRating() %>. <br>
   				Location: <%= bidder.getLocation() %>. <br>
   				Country: <%= bidder.getCountry() %>. <br>
   				
   				<br>
   				
   				Time: <%= bid.getTime().toString() %>. <br>
   				Amount: <%= bid.getAmount() %>. <br>
   				
   				</p>
   			<%
   			}
   			%>
	</p>
	
</body>
</html>
