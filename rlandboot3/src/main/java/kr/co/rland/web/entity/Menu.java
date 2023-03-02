package kr.co.rland.web.entity;

import java.util.Date;

public class Menu {
	private long id;
	private String name;
	private int privce;
	private Date regDate; // 타입은 반드시 util로 sql아니다.
	private int categoryId;
	private long regMemberId;

	public Menu(){
		
	}
	
	public Menu(long id, String name, int privce, Date regDate, int categoryId, long regMemberId) {
		this.id = id;
		this.name = name;
		this.privce = privce;
		this.regDate = regDate;
		this.categoryId = categoryId;
		this.regMemberId = regMemberId;
	}

	public Menu(String name, int privce, int categoryId) {
		super();
		this.name = name;
		this.privce = privce;
		this.categoryId = categoryId;
	}

	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPrivce() {
		return privce;
	}


	public void setPrivce(int privce) {
		this.privce = privce;
	}


	public Date getRegDate() {
		return regDate;
	}


	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}


	public int getCategoryId() {
		return categoryId;
	}


	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}


	public long getRegMemberId() {
		return regMemberId;
	}


	public void setRegMemberId(long regMemberId) {
		this.regMemberId = regMemberId;
	}


	@Override
	public String toString() {
		return "Menu [id=" + id + ", name=" + name + ", privce=" + privce + ", regDate=" + regDate + ", categoryId="
				+ categoryId + ", regMemberId=" + regMemberId + "]";
	}
	
	
	
	
	
}