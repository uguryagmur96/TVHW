package uguryagmur;

public class NewsChannel extends Channel {
	
	private String newsType;
	
	
	public NewsChannel(String channelName, int channelNo, String newsType) {
		super(channelName, channelNo);
		this.newsType = newsType;
		
	}


	public String getNewsType() {
		return newsType;
	}


	public void setNewsType(String newsType) {
		this.newsType = newsType;
	}

	
	
	

	
	
	
}
