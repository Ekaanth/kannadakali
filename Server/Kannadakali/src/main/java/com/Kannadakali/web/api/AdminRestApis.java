package com.Kannadakali.web.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Kannadakali.domain.WordOfTheDay;
import com.Kannadakali.service.WordOfTheDayService;


	@RestController
	@RequestMapping("/kannadakali/resources/admin/api/")
	@CrossOrigin(origins = "http://localhost:4200/")
	public class AdminRestApis {
		
		@Autowired
		WordOfTheDayService wordofthedayservice;
		
		@RequestMapping(value = ("/addnewword"), method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
		public ResponseEntity<WordOfTheDay> addnewword(@RequestBody WordOfTheDay word) {
			WordOfTheDay resp = wordofthedayservice.addNewWord(word);
			return new ResponseEntity<WordOfTheDay>(resp, HttpStatus.OK);
		}
		
		@RequestMapping(value = ("/wordoftheday"), method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
		public ResponseEntity<WordOfTheDay> wordoftheday() {
			WordOfTheDay resp = wordofthedayservice.getTodayWord();
			return new ResponseEntity<WordOfTheDay>(resp, HttpStatus.OK);
		}
}
