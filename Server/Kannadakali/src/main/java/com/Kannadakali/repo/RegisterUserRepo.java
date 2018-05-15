package com.Kannadakali.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Kannadakali.domain.RegisterUser;

@Repository
public interface RegisterUserRepo extends JpaRepository<RegisterUser, Long> {

	public RegisterUser findByUemail(String uemail);
}
