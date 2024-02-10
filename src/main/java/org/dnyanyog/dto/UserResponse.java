package org.dnyanyog.dto;

import org.springframework.stereotype.Component;

@Component
public class UserResponse {
	private String status;
	private String message;
	private long UserId;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public long getUserId() {
		return UserId;
	}
	public void setUserId(long UserId) {
		this.UserId = UserId;
	}

}
