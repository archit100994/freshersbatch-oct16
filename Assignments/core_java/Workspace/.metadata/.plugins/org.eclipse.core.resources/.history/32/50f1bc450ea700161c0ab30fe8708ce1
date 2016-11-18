package dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import entity.Ad;

public class AdDAOImpl implements AdDAO 
{
	@Autowired
		private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public Ad create(Ad ad) {
		hibernateTemplate.save(ad);
		return ad;
	}

}
