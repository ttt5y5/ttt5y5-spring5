package com.edu.vo;

import java.util.Date;

/**
 * 이 클래스는 DB에서 Model클래스로 입출력, Model에서 Service클래스로 입출력
 * Service에서 Controller클래스 데이터를 입출력,
 * Controller에서 jsp로 데이터를 주고받을때 사용하는 클래스
 * @author User
 *
 */
public class MemberVO {
	//ERD를 보고 멤벼변수를 만듦.
	private String user_id;
	private String user_pw;
	private String user_name;
	private String email;
	private Integer point; //int를 사용하지않고, Integer를사용하는 이유는 클래스(참조형)데이터형은 Null을 허용하기때문에 사용.
	private Boolean enabled;//불린현boolean 사용
	private String levels;
	private Date reg_date;
	private Date update_date;
	//롬복loombok.jar 을 사용하지 않음, 사용시 아래내용 생략
	//Get/Set 사용
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_pw() {
		return user_pw;
	}
	public void setUser_pw(String user_pw) {
		this.user_pw = user_pw;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getPoint() {
		return point;
	}
	public void setPoint(Integer point) {
		this.point = point;
	}
	public Boolean getEnabled() {
		return enabled;
	}
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}
	public String getLevels() {
		return levels;
	}
	public void setLevels(String levels) {
		this.levels = levels;
	}
	public Date getReg_date() {
		return reg_date;
	}
	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}
	public Date getUpdate_date() {
		return update_date;
	}
	public void setUpdate_date(Date update_date) {
		this.update_date = update_date;
	}
}
