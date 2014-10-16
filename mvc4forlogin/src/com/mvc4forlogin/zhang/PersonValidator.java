package com.mvc4forlogin.zhang;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class PersonValidator implements Validator {

	@Override
	public boolean supports(Class clazz) {
		// TODO Auto-generated method stub
		
		return LoginForm.class.equals(clazz);
	}

	@Override
	public void validate(Object obj, Errors e) {
		// TODO Auto-generated method stub
		LoginForm p=(LoginForm)obj;
		String userName = "UserName";
		String password = "password";
		if(p.getUserName().length()==0){
			e.rejectValue("userName", "username.empty");
			
		}else if(p.getPassword().length()==0){
			e.rejectValue("password", "password.empty");

		}else if(!p.getUserName().equals(userName)
				|| !p.getPassword().equals(password)){
		
			e.rejectValue("password", "password.error");
		}
		
	}

}
