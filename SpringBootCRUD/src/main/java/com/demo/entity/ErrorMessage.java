package com.demo.entity;

import org.springframework.http.HttpStatus;

/*
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
*/
/*@Data
@NoArgsConstructor
@AllArgsConstructor*/
public class ErrorMessage {

	private HttpStatus status;
	public ErrorMessage(HttpStatus status, String message) {
		super();
		this.status = status;
		this.message = message;
	}
	public HttpStatus getStatus() {
		return status;
	}
	public ErrorMessage() {
		super();
	}
	@Override
	public String toString() {
		return "ErrorMessage [status=" + status + ", message=" + message + "]";
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	private String message;
}
