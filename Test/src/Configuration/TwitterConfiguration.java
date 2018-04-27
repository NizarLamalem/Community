package Configuration;

import java.util.Date;

import twitter4j.FilterQuery;

public class TwitterConfiguration {
	// Keywords Given By The User
	private String keywords;
	// Node Number
	private int max_Nomber_User;
	// Specific location of The Search for The Tweets
	private Location location;
	// Max and Min Date
	private Date minDate;
	private Date maxDate;
	// based on what we get the tweets
	private int[] tweets_Based_On;

	private static FilterQuery tweetFlterQuery;

	public TwitterConfiguration(String keywords, int max_Nomber_User, Location location, Date minDate, Date maxDate,
			int... types) {
		this.keywords = keywords;
		this.max_Nomber_User = max_Nomber_User;
		this.location = location;
		this.minDate = minDate;
		this.maxDate = maxDate;
		this.tweets_Based_On = types;
	}

	public TwitterConfiguration() {
		this.keywords = "Keywords";
		this.max_Nomber_User = 100;
		this.location = null;
		this.minDate = null;
		this.maxDate = null;
		;
		this.tweets_Based_On = null;
	}

	public String[] getKeywords() {
		return keywords.split(";");
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public int getMax_Nomber_User() {
		return max_Nomber_User;
	}

	public void setMax_Nomber_User(int max_Nomber_User) {
		this.max_Nomber_User = max_Nomber_User;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Date getMinDate() {
		return minDate;
	}

	public void setMinDate(Date minDate) {
		this.minDate = minDate;
	}

	public Date getMaxDate() {
		return maxDate;
	}

	public void setMaxDate(Date maxDate) {
		this.maxDate = maxDate;
	}

	public static FilterQuery getFilterQuery(TwitterConfiguration configuration) {
		if(tweetFlterQuery == null) {
			tweetFlterQuery = new FilterQuery() ;
		}
		tweetFlterQuery.track(configuration.getKeywords()) 
		   //			   .locations(locations)
		   //				Specifying Languages That we want to search in 
		   				   .language(new String[]{"en","ar","fr"}) ; 
		   
		return tweetFlterQuery ;
	}

}
