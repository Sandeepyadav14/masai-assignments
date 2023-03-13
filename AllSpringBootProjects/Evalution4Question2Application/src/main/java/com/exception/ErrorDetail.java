package com.exception;

import java.time.LocalDateTime;

public class ErrorDetail {

	
	private LocalDateTime time;
	private String msg;
	private String desc;
	public LocalDateTime getTime() {
		return time;
	}
	public void setTime(LocalDateTime time) {
		this.time = time;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public ErrorDetail(LocalDateTime time, String msg, String desc) {
		super();
		this.time = time;
		this.msg = msg;
		this.desc = desc;
	}
	public ErrorDetail() {
		
		// TODO Auto-generated constructor stub
	}
	
	
	

	
	
}