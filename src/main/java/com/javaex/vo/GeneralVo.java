package com.javaex.vo;

public class GeneralVo {
	
	private int no;
	private String regDate;
	private String deadLine;
	private int price;
	
	
	public GeneralVo() {
		super();
	}


	public GeneralVo(int no, String regDate, String deadLine, int price) {
		super();
		this.no = no;
		this.regDate = regDate;
		this.deadLine = deadLine;
		this.price = price;
	}


	public int getNo() {
		return no;
	}


	public void setNo(int no) {
		this.no = no;
	}


	public String getRegDate() {
		return regDate;
	}


	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}


	public String getDeadLine() {
		return deadLine;
	}


	public void setDeadLine(String deadLine) {
		this.deadLine = deadLine;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "GeneralVo [no=" + no + ", regDate=" + regDate + ", deadLine=" + deadLine + ", price=" + price + "]";
	}
	
	
}
