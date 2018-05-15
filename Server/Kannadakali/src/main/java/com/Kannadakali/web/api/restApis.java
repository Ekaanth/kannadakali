package com.Kannadakali.web.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Kannadakali.domain.Pagevisit;
import com.Kannadakali.domain.RegisterUser;
import com.Kannadakali.repo.RegisterUserRepo;
import com.Kannadakali.service.PagevisitService;
import com.Kannadakali.service.RegisterUserService;

@RestController
@RequestMapping("/kannadakali/resources/api/")
@CrossOrigin(origins= "http://localhost:4200/")
public class restApis {
	
	@Autowired
	PagevisitService pagevisitservice;
	
	@Autowired
	RegisterUserService registerUserService;
	
	@RequestMapping(value = ("/pagevisit"), method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Pagevisit> registerIp(@RequestBody Pagevisit visit) {
		Pagevisit resp = pagevisitservice.addVisitedUser(visit);
		return new ResponseEntity<Pagevisit>(HttpStatus.OK);
	}
	
	@RequestMapping(value = ("/registeruser"), method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Pagevisit> registerUser(@RequestBody RegisterUser user) {
		RegisterUser resp = registerUserService.registerNewUser(user);
		return new ResponseEntity<Pagevisit>(HttpStatus.OK);
	}
	
	@RequestMapping(value = ("/unsubscribe"), method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Pagevisit> unsubscribeRegisterUser(@PathVariable String uemail) {
		RegisterUser resp = registerUserService.unsubscribeRegisterUser(uemail);
		return new ResponseEntity<Pagevisit>(HttpStatus.OK);
	}

}
