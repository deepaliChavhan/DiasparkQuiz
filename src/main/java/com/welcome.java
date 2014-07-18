package com;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "welcome", eager = true)
@SessionScoped
public class welcome { 
	public welcome() { 
	} 

	public String getMessage() {
		return "Welcome User"; 
	} 
}
