package uguryagmur;

public class MusicChannel extends Channel {

	private String musicType;

	
	
	public MusicChannel(String channelName, int channelNo, String musicType) {
		super(channelName, channelNo);
		this.musicType = musicType;
	}



	public String getMusicType() {
		return musicType;
	}



	public void setMusicType(String musicType) {
		this.musicType = musicType;
	}
	
	
	
	
	
}
