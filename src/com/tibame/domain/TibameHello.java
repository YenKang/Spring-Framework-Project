package com.tibame.domain;

public class TibameHello implements ITibameHello {
	//Attribute
	private String companyName="Tibame";
	
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	// 自訂建構子（空參數）
	public TibameHello(){}
	
	// 自訂建構子overloading
	public TibameHello(String companyName){
		this.companyName = companyName;
	}


	@Override
	public String helloWorld(String who) {
		// TODO Auto-generated method stub
		return String.format("company:%s Say hi to %s", companyName, who);
	}
	
}
