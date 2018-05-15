package com.Kannadakali.serviceImp;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Kannadakali.domain.Pagevisit;
import com.Kannadakali.repo.PagevisitRepo;
import com.Kannadakali.service.PagevisitService;

@Service
public class PagevisitServiceImp implements PagevisitService {
	
	@Autowired
	PagevisitRepo pagevisitRepo;

	@Override
	public Pagevisit addVisitedUser(Pagevisit visit) {
		Pagevisit pvisit = new Pagevisit();
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		pvisit.setTimestamp(timeStamp);
		return pagevisitRepo.save(pvisit);
	}
}
