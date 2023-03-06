package uguryagmur;

import java.util.ArrayList;
import java.util.List;
public class TV {
	
	private String brand;
	private String size;
	List<Channel> chList;
	
	
	
	public TV(String brand) {
		super();
		this.brand = brand;
		this.size = "15inch";
		
		
		this.chList=new ArrayList<>();;
		
	}



	public String getBrand() {
		return brand;
	}



	public void setBrand(String brand) {
		this.brand = brand;
	}

	



	public void createChannel() {
		NewsChannel ch1=new NewsChannel("BBCSport", 1, "Sport");
		chList.add(ch1);
		NewsChannel ch2=new NewsChannel("Bloomberg", 2, "StockMarket");
		chList.add(ch2);
		MusicChannel ch3=new MusicChannel("NR1", 3, "Music");
		chList.add(ch3);
		MusicChannel ch4=new MusicChannel("DreamTv", 4, "Music");
		chList.add(ch4);
	}



	@Override
	public String toString() {
		return "TV [brand=" + brand + ", size=" + size + ", chList=" + chList + "]";
	}
	
	
	

}
