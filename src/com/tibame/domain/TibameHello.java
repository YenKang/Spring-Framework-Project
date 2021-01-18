package com.tibame.domain;

public class TibameHello implements ITibameHello {
	// attribute
	private String companyName;
	
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	// 自訂建構子
	public TibameHello(){
		
	}
	
	// 建構子overloading
	public TibameHello(String companyName){
		this.companyName = companyName;
	}

	@Override
	public String helloWorld(String who) {
		// TODO Auto-generated method stub
		return String.format("%s hello world in A version", who);
	}
	
}
