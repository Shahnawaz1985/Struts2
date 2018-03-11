package com.bac.sample.actions;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Actions;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Namespaces;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;
@org.apache.struts2.convention.annotation.ParentPackage(value = "struts-default") 
@Namespaces(value={@Namespace(""),@Namespace("/")})
@Result(location="/index.jsp", name="success")
//@Action(value="", )
@Actions(value={@Action("")})
public class IndexAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2495790543509407553L;

}
