package services;

import org.springframework.beans.factory.annotation.Autowired;

import dao.AdDAO;
import entity.Ad;

public class AdServiceImpl implements AdService{
	
	@Autowired
		private AdDAO adDao;
	
	public Ad create(Ad ad)
	{
		return adDao.create(ad);
	}

}
