package com.Kannadakali.web.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
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
@CrossOrigin(origins = "http://localhost:4200/")
public class restApis {

	@Autowired
	PagevisitService pagevisitservice;

	@Autowired
	RegisterUserService registerUserService;

	/**
	 * Web service endpoint to add new entry on every page visit.
	 * 
	 * 
	 * @RequestBody is of the type Page visit object which will load the ip address
	 *              of the user.
	 * 
	 * @return it Returns HttpStatus as OK.
	 */

	@RequestMapping(value = ("/pagevisit"), method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Pagevisit> registerIp(@RequestBody Pagevisit visit) {
		Pagevisit resp = pagevisitservice.addVisitedUser(visit);
		return new ResponseEntity<Pagevisit>(HttpStatus.OK);
	}

	/**
	 * Web service endpoint to add new User details.
	 * 
	 * 
	 * @RequestBody is of the type RegisterUser object which will save the user
	 *              details and send an email of confirmation of the email for
	 *              further postes.
	 * 
	 * @return it Returns HttpStatus as OK.
	 */

	@RequestMapping(value = ("/registeruser"), method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Pagevisit> registerUser(@RequestBody RegisterUser user) throws Exception {
		try {
			RegisterUser resp = registerUserService.registerNewUser(user);
			return new ResponseEntity<Pagevisit>(HttpStatus.OK);
		} catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<Pagevisit>(HttpStatus.BAD_REQUEST);
		}
	}

	/**
	 * Web service endpoint to subscribe user details.
	 * 
	 * 
	 * @RequestBody is of the type gets the user email and find the user from the db
	 *              and unsubscribe them.
	 * 
	 * @return it Returns HttpStatus as OK.
	 */

	@RequestMapping(value = ("/subscribeuser"), method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Pagevisit> subscribeUser(@PathVariable String uemail) {
		try {
			RegisterUser resp = registerUserService.subscribeRegisterUser(uemail);
			return new ResponseEntity<Pagevisit>(HttpStatus.OK);
		} catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<Pagevisit>(HttpStatus.BAD_REQUEST);
		}
	}

	/**
	 * Web service endpoint to unsubscribe user details.
	 * 
	 * 
	 * @RequestBody @RequestBody is of the type gets the user email and find the
	 *              user from the db and unsubscribe them.
	 * 
	 * @return it Returns HttpStatus as OK.
	 */
	@RequestMapping(value = ("/unsubscribe"), method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Pagevisit> unsubscribeRegisterUser(@PathVariable String uemail) {
		try {
			RegisterUser resp = registerUserService.unsubscribeRegisterUser(uemail);
			return new ResponseEntity<Pagevisit>(HttpStatus.OK);
		} catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<Pagevisit>(HttpStatus.BAD_REQUEST);
		}
	}

}
