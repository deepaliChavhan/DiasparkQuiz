package com;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "th", eager = true)
@SessionScoped
public class Thanx { 
	public Thanx() { 
	} 

	public String getMessage() {
		return "Thank you"; 
	} 
}
