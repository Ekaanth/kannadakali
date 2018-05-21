package com.Kannadakali.serviceImp;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Kannadakali.domain.WordOfTheDay;
import com.Kannadakali.repo.WordOfTheDayRepo;
import com.Kannadakali.service.WordOfTheDayService;


@Service
@Transactional
public class WordOfTheDayServiceImp implements WordOfTheDayService{

	@Autowired
	WordOfTheDayRepo wordofthedayrepo;
	
	@Override
	public WordOfTheDay addNewWord(WordOfTheDay word) {
		return wordofthedayrepo.save(word);
	}

	@Override
	public WordOfTheDay getTodayWord() {
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd").format(new Date());
		return wordofthedayrepo.findByTimestamp(timeStamp);
	}

	@Override
	public Collection<WordOfTheDay> findAll() {
		Collection<WordOfTheDay> allWordsList = wordofthedayrepo.findAll();
		return allWordsList;
	}
}
