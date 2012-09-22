package org.ampd.action;

import com.opensymphony.xwork2.ActionSupport;

public class Login extends ActionSupport{

	private String userName;
	private char[] password;
	
	
	public String getLogin(){
		return SUCCESS;
	}
	
	public String login(){
		if(userName.equals("admin"))
			return SUCCESS;
		return ERROR;
	}
	
	
	public char[] getPassword() {
		return password;
	}
	public void setPassword(char[] password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
}
