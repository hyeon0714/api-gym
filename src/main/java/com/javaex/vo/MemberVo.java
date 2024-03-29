package com.javaex.vo;


public class MemberVo {

	private int no;
	private String id;
	private String password;
	private String name;
	private String address;
	private String gender;
	private String hp;
	private int age;
	private String date;	//등록한날
	private int regiDay;	//등록일수
	private int resiDay;	//잔여일수	
	
	public MemberVo() {
		super();
	}

	public MemberVo(int no, String id, String password, String name, String address, String gender, String hp, int age,
			String date, int regiDay, int resiDay) {
		super();
		this.no = no;
		this.id = id;
		this.password = password;
		this.name = name;
		this.address = address;
		this.gender = gender;
		this.hp = hp;
		this.age = age;
		this.date = date;
		this.regiDay = regiDay;
		this.resiDay = resiDay;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getRegiDay() {
		return regiDay;
	}

	public void setRegiDay(int regiDay) {
		this.regiDay = regiDay;
	}

	public int getResiDay() {
		return resiDay;
	}

	public void setResiDay(int resiDay) {
		this.resiDay = resiDay;
	}

	@Override
	public String toString() {
		return "MemberVo [no=" + no + ", id=" + id + ", password=" + password + ", name=" + name + ", address="
				+ address + ", gender=" + gender + ", hp=" + hp + ", age=" + age + ", date=" + date + ", regiDay="
				+ regiDay + ", resiDay=" + resiDay + "]";
	}
	
	
	
}
