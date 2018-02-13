package com.test;
import com.opensymphony.xwork2.ActionSupport;


public class Test extends ActionSupport{
	private static final long serialVersionUID = 2347642115878188701L;

	public String test(){
		System.out.println("ok");
		System.out.println("ok2");
		return SUCCESS;
	}
}
