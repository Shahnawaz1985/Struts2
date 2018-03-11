package com.bac.sample.actions;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Actions;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Namespaces;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bac.service.TestService;
import com.opensymphony.xwork2.ActionSupport;
@org.apache.struts2.convention.annotation.ParentPackage(value = "struts-default") 
@Namespaces(value=@Namespace("/"))
@ResultPath(value="/WEB-INF/pages")
@Results({ @Result(location="register_portfolio.jsp", name="success"),  @Result(location="register.jsp", name= "input")
, @Result(location="/index.jsp", name= "error")})
@Actions(value={@Action("registration")})
@Component
public class RegistrationAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2246769456418025082L;
	
	private String userName;
	private String password;
	private String gender;
	private String occupation;
	private Integer age;
	
	@Autowired
	private TestService testService;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	/*public TestService getTestService() {
		return testService;
	}*/
	public void setTestService(TestService testService) {
		this.testService = testService;
	}
	public String create() {
		System.out.println("Inside RegistrationAction::create()");
		testService.doService();
		System.out.println("name :"+userName+", gender:"+gender+", occupation:"+occupation+", age:"+age);		
		return "success";
	}
	
	public void validate() {
		if(getUserName().length()==0) {
			addFieldError("userName", getText("registration.userName.blank"));
		}
		if(getPassword().length()==0) {
			addFieldError("password", getText("registration.password.blank"));
		}
		if(getGender().length()==0) {
			addFieldError("gender", getText("registration.gender.blank"));
		}
		if(getOccupation().length()==0) {
			addFieldError("occupation", getText("registration.occupation.blank"));
		}
		if(getAge()==null) {
			addFieldError("age", getText("registration.age.zero"));
		}
		
	}

}
