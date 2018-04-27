package twitter;

import java.util.HashMap;
import java.util.Map;

import org.apache.flume.Context;
import org.apache.flume.Event;
import org.apache.flume.EventDrivenSource;
import org.apache.flume.channel.ChannelProcessor;
import org.apache.flume.conf.Configurable;
import org.apache.flume.event.EventBuilder;
import org.apache.flume.source.AbstractSource;

import Configuration.Authenticating;
import Configuration.TwitterConfiguration;
import Configuration.TwitterFlumeConstants;
import twitter4j.FilterQuery;
import twitter4j.StallWarning;
import twitter4j.Status;
import twitter4j.StatusDeletionNotice;
import twitter4j.StatusListener;
import twitter4j.TwitterStream;
import twitter4j.TwitterStreamFactory;
import twitter4j.conf.ConfigurationBuilder;
import twitter4j.json.DataObjectFactory;

public class TwitterSource extends AbstractSource implements EventDrivenSource, Configurable, StatusListener {

	private static TwitterStream twitterStream;
	private ChannelProcessor channel;
	private Map<String, String> headers;

	@Override
	public void configure(Context context) {
		System.out.println("##########Configure Flume##########");
		// TODO Auto-generated method stub
		twitterStream = authToTwitter();
		// Add Listener For Status
		twitterStream.addListener(this);

	}

	@Override
	public void start() {
		System.out.println("##########Start Flume##########");
		// The channel is the piece of Flume that sits between the Source and Sink,
		// and is used to process events.
		this.channel = getChannelProcessor();
		this.headers = new HashMap<String, String>();

		// Set up a Configuration to pull out the relevant tweets in Real Treatments it
		// will be Sent from The teh App
		TwitterConfiguration configuration = new TwitterConfiguration("Liverpool", 200, null, null, null,
				TwitterFlumeConstants.LIKES, TwitterFlumeConstants.SUBSCRIPTIONS);
		// Applying The Filter to The Stream
		twitterStream.filter(TwitterConfiguration.getFilterQuery(configuration));

		// Start The Searching
		super.start();
	}

	@Override
	public void stop() {
		System.out.println("##########Stop Flume##########");
		twitterStream.shutdown();
		super.stop();
	}

	@Override
	public void onException(Exception arg0) {
		// TODO Auto-generated method stub
		System.out.println("##########on Exception##########");
	}

	@Override
	public void onDeletionNotice(StatusDeletionNotice arg0) {
		// TODO Auto-generated method stub
		System.out.println("##########on Deletion Notice##########");
	}

	@Override
	public void onScrubGeo(long arg0, long arg1) {
		// TODO Auto-generated method stub
		System.out.println("##########on Scrub Geo##########");
	}

	@Override
	public void onStallWarning(StallWarning arg0) {
		// TODO Auto-generated method stub
		System.out.println("##########on Stall Warning##########");
	}

	@Override
	public void onStatus(Status status) {
		// TODO Auto-generated method stub
		System.out.println("##########on Status##########");
		// The EventBuilder is used to build an event using the headers and
		// the raw JSON of a tweet

		headers.put("timestamp", String.valueOf(status.getCreatedAt().getTime()));
		@SuppressWarnings("deprecation")
		Event event = EventBuilder.withBody(DataObjectFactory.getRawJSON(status).getBytes(), headers);

		channel.processEvent(event);

	}

	@Override
	public void onTrackLimitationNotice(int arg0) {
		// TODO Auto-generated method stub
		System.out.println("##########on Track Limitation Notice##########");
	}

	// get an Instance Of The TwitterStream
	private TwitterStream authToTwitter() {
		// getting The Best Account To Use
		Authenticating account = Authenticating.bestAccountToUse();

		System.out.println("##########TwitterData.Authenticating##########");
		ConfigurationBuilder conf_Build = new ConfigurationBuilder();

		conf_Build.setOAuthConsumerKey(account.getCONSUMERKEY()).setOAuthConsumerSecret(account.getCONSUMERSECRET())
				.setOAuthAccessToken(account.getACCESSTOKEN()).setOAuthAccessTokenSecret(account.getACCESSTOKENSECRET())
				.setJSONStoreEnabled(true).setIncludeEntitiesEnabled(true);

		return new TwitterStreamFactory(conf_Build.build()).getInstance();
	}

}
