package edu.ucla.cs.cs144;

import java.util.Date;

public class ItemBean {
	private String itemId;
	private String name;
	private String[] categories;
	private String currently;
	private String firstBid;
	private String numberOfBids;
	private BidBean[] bids;
	private String location;
	private String country;
	private Date started;
	private Date ends;
	private UserBean seller;
	private String description;
	
	public ItemBean() {}
    
	public ItemBean(String itemXML) {
		// Parse the item
		
		/*<Item ItemID="1497021345">
		<Name>DR. WHO ARK IN SPACE Tom Baker VHS</Name>
		<Category>Movies &amp; Television</Category>
		<Category>Sci-Fi</Category>
		<Category>VHS</Category>
		<Category>Video, Film</Category>
		<Currently>$9.95</Currently>
		<First_Bid>$9.95</First_Bid>
		<Number_of_Bids>0</Number_of_Bids>
		<Bids/>
		<Location>Kitchener, Ontario</Location>
		<Country>Canada</Country>
		<Started>Dec-14-01 20:21:46</Started>
		<Ends>Dec-21-01 20:21:46</Ends>
		<Seller UserID="migomipink" Rating="1075"/>
		<Description>DR. WHO ARK IN SPACE Tom Baker VHS Doctor Who gambles with his own life to save the human race from a swarm of alien insects who have taken over the bodies of ordinary humans. Stars Tom Baker. VHS, NTSC. This is a NEW IN BOX (NIB) FACTORY SEALED VIDEO. Need your Item for Christmas? In order to ensure that your item arrives in for Christmas please include extra funds for Airmail. Also please make sure that your payment arrives by December 14 (December 10 for Asia, Australia, Europe, Caribbean &amp; December 3 for Africa and Central/South America). Have a Happy Holidays from the Migomi Corporation. We need to recieve your payments as quickly as possible - so why not use eBay Payments or PayPal . Successful Bidder agrees to prepay plus Shipping. Shipping is $4.00 This is for surface mail to the U.S., elsewhere will be more. CANADIANS pay ACTUAL shipping &amp; HANDLING costs. If you would like it sent by air please ask for a quote. Consolidation with other of our items is possible and will save on postage. Canadians add 7% GST and Ontario residents add 8% PST. Payment by money orders or Cashier&#39;s checks will insure quick delivery. -- Personal Checks will take up to a month to process regardless of the amount of positive feedback of the successful bidder. Money orders can be purchased online at www.bidpay.com &amp; www.energyflow.com. Most Tapes are Shipped in Boxes. If Buying more than one item the Billpoint information seen below after the auction ends will be incorrect. Please email for correct pricing. Lots of other Great items currently being auctioned! We ONLY sell ORIGINAL tapes and collectibles. No BOOTLEGS or SCREENERS as these are ILLEGAL! All our items have a 30-day 100% Satisfaction Guarantee! Check out our other auctions for other wonderful and rare items! Click here to send your comments or concerns about the items we sell. If you would like to see our About Me page click here. Seller reserves the right to request payment by money order from those users with no feedback &amp; to cancel bids from users with excessive negative feedback. By bidding on this item you are entering into a legally binding agreement. DO NOT bid if you lack the means to finalize your transaction. Successful bidders are legally bound to finalize purchase of auction item at the highest bid. Bidder must make contact within 3 days of auction close and must make payment within 10 days. Failure to do so will result in negative feedback. Patience, Politeness and Respect are appreciated and will be rewarded and reciprocated. Thanks for your time and interest! Created by eBay Seller&#39;s Assistant Pro</Description>
		</Item>*/
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getCategories() {
		return categories;
	}

	public void setCategories(String[] categories) {
		this.categories = categories;
	}

	public String getCurrently() {
		return currently;
	}

	public void setCurrently(String currently) {
		this.currently = currently;
	}

	public String getFirstBid() {
		return firstBid;
	}

	public void setFirstBid(String firstBid) {
		this.firstBid = firstBid;
	}

	public String getNumberOfBids() {
		return numberOfBids;
	}

	public void setNumberOfBids(String numberOfBids) {
		this.numberOfBids = numberOfBids;
	}

	public BidBean[] getBids() {
		return bids;
	}

	public void setBids(BidBean[] bids) {
		this.bids = bids;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Date getStarted() {
		return started;
	}

	public void setStarted(Date started) {
		this.started = started;
	}

	public Date getEnds() {
		return ends;
	}

	public void setEnds(Date ends) {
		this.ends = ends;
	}

	public UserBean getSeller() {
		return seller;
	}

	public void setSeller(UserBean seller) {
		this.seller = seller;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
