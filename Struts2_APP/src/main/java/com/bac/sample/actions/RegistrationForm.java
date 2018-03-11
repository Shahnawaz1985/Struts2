package com.bac.sample.actions;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Actions;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Namespaces;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.opensymphony.xwork2.ActionSupport;
@org.apache.struts2.convention.annotation.ParentPackage(value = "struts-default") 
@Namespaces(value=@Namespace("/"))
@ResultPath(value="/WEB-INF/pages")
@Result(location="register.jsp", name="success")
@Actions(value={@Action("register")})
public class RegistrationForm extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1432010889584388531L;
	
	public String index() {
		System.out.println("Inside RegistrationForm::index()");
		return "success";
	}

}
