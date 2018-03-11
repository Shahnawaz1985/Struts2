package com.bac.sample.actions;

import java.io.File;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Actions;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Namespaces;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
import org.apache.struts2.convention.annotation.Results;

import com.opensymphony.xwork2.ActionSupport;

@org.apache.struts2.convention.annotation.ParentPackage(value = "struts-default") 
@Namespaces(value=@Namespace("/"))
@ResultPath(value="/WEB-INF/pages")
@Results({ @Result(location="registration_success.jsp", name="success"),  @Result(location="register_portfolio.jsp", name= "input")
, @Result(location="/index.jsp", name= "error")})
@Actions(value={@Action("portfolio-handler")})
public class PortfolioHandler extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3962378441558465736L;
	
	private File portfolio_doc;
	private String portfolio_docContentType;
	private String portfolio_docFileName;
	public File getPortfolio_doc() {
		return portfolio_doc;
	}
	public void setPortfolio_doc(File portfolio_doc) {
		this.portfolio_doc = portfolio_doc;
	}
	public String getPortfolio_docContentType() {
		return portfolio_docContentType;
	}
	public void setPortfolio_docContentType(String portfolio_docContentType) {
		this.portfolio_docContentType = portfolio_docContentType;
	}
	public String getPortfolio_docFileName() {
		return portfolio_docFileName;
	}
	public void setPortfolio_docFileName(String portfolio_docFileName) {
		this.portfolio_docFileName = portfolio_docFileName;
	}
	
	public String create() {
		System.out.println("Uploaded File Name:"+getPortfolio_docFileName()+", File size:"+getPortfolio_doc().length());
		return "success";
	}
	

}
