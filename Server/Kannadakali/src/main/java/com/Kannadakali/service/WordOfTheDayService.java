package com.Kannadakali.service;

import java.util.Collection;

import com.Kannadakali.domain.WordOfTheDay;

public interface WordOfTheDayService {

	
	public WordOfTheDay addNewWord(WordOfTheDay word);

	public Collection<WordOfTheDay> findAll();
	
	public WordOfTheDay getTodayWord(); 
}
