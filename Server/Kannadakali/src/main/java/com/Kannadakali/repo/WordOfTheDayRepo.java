package com.Kannadakali.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Kannadakali.domain.WordOfTheDay;

@Repository
public interface WordOfTheDayRepo extends JpaRepository<WordOfTheDay, Long> {

	public WordOfTheDay findByTimestamp(String today);
	
	public Optional<WordOfTheDay> findById(Long id);
}
