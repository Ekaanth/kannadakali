package com.Kannadakali.serviceImp;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Kannadakali.domain.RegisterUser;
import com.Kannadakali.repo.RegisterUserRepo;
import com.Kannadakali.service.RegisterUserService;
import com.amtica.constant.Status;

@Service
@Transactional
public class RegisterUserServiceImp implements RegisterUserService {

	
	@Autowired
	RegisterUserRepo registerUserRepo;
	
	@Override
	public RegisterUser registerNewUser(RegisterUser user) {
		RegisterUser entity = new RegisterUser();
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		entity.setTimestamp(timeStamp);
		entity.setUstatus(Status.ACTIVE);
		return registerUserRepo.save(entity);
	}

	@Override
	public RegisterUser unsubscribeRegisterUser(String uemail) {
		RegisterUser entity = registerUserRepo.findByUemail(uemail);
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		entity.setUnsubscribedtimestamp(timeStamp);
		entity.setUstatus(Status.INACTIVE);
		return registerUserRepo.save(entity);
	}
}
