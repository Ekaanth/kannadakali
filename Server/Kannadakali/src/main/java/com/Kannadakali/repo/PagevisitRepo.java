package com.Kannadakali.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Kannadakali.domain.Pagevisit;

@Repository
public interface PagevisitRepo extends JpaRepository<Pagevisit, Long>{

}
