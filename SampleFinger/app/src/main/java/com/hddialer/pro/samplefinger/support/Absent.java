package com.hddialer.pro.samplefinger.support;

import android.net.Uri;


public class Absent {
	private String name;
	private String designation;
	private String url;
	private String statusAbsnt;
	private int type;

	public int getType(){
		return type;
	}

	public void setType(int type){
		this.type=type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation(){
		return designation;
	}
	public void setDesignation(String designation){
		this.designation=designation;
	}

	public String getUrl(){
		return url;
	}

	public void setUrl(String url){
		this.url=url;
	}

	public String getstatusAbsnt(){
		return statusAbsnt;
	}

	public  void setstatusAbsnt(String statusAbsnt){
		this.statusAbsnt=statusAbsnt;
	}


}
