package org.blogdemo.twitterdemo;

public class SourceCounter {
	
	
	private int web = 0;
	private int android = 0;
	private int iphone = 0;
	private int others = 0;

	public void addType(String type){
		if("Web".equals(type))
			web ++;
		if("Android".equals(type))
			android++;
		if("iPhone".equals(type))
			iphone++;
		if("Others".equals(type))
			others++;
	}
	
	public void addWeb() {
		web++;
	}
	
	public void addAndroid() {
		android++;
	}
	
	public void addIphone() {
		iphone++;
	}
	
	public void addOthers() {
		others++;
	}
	
	
	
	
	
	public int getWeb() {
		return web;
	}
	
	public void setWeb(int web) {
		this.web = web;
	}
	public int getAndroid() {
		return android;
	}

	
	public void setAndroid(int android) {
		this.android = android;
	}
	public int getIphone() {
		return iphone;
	}
	public void setIphone(int iphone) {
		this.iphone = iphone;
	}

	
	public int getOthers() {
		return others;
	}

	public void setOthers(int others) {
		this.others = others;
	}
	
	

	
	public String toString() {
		return "web:["+web+"] iphone:["+iphone+"] android:["+android+"] others:["+others+"]";
	}
	
}
