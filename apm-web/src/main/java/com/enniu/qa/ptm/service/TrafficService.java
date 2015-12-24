package com.enniu.qa.ptm.service;

import com.enniu.qa.ptm.dao.TrafficDao;
import com.enniu.qa.ptm.model.Traffic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by fuyong on 7/20/15.
 */

@Service
public class TrafficService {
	@Autowired
	TrafficDao dao;

	public void addNewTraffic(Traffic traffic){
		dao.saveAndFlush(traffic);
	}

	public void delete(long id){
		dao.delete(id);
	}

	public void update(Traffic traffic){
		dao.saveAndFlush(traffic);
	}

	public Traffic findById(long apiId){
		return dao.findById(apiId);
	}

	/*public List<Traffic> findByIds(List<Integer> apiIds){
		return dao.findByIds(apiIds);
	}*/
}
