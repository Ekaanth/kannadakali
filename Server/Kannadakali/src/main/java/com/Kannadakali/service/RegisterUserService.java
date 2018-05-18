package com.Kannadakali.service;

import com.Kannadakali.domain.RegisterUser;

public interface RegisterUserService {

	RegisterUser registerNewUser(RegisterUser user);

	RegisterUser unsubscribeRegisterUser(String uemail);

	RegisterUser subscribeRegisterUser(String uemail);

}
