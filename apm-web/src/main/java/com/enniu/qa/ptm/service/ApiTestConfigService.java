package com.enniu.qa.ptm.service;

import com.enniu.qa.ptm.dao.ApiTestConfigDao;
import com.enniu.qa.ptm.model.Api;
import com.enniu.qa.ptm.model.FileEntry;
import com.enniu.qa.ptm.model.ApiTestConfig;
import org.ngrinder.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

import static org.ngrinder.common.util.Preconditions.checkNotNull;
/**
 * Created by fuyong on 8/19/15.
 */

@Service
public class ApiTestConfigService {
	@Autowired
	ApiTestConfigDao dao;

	public void deleteByApi(Api api) {
		dao.deleteByApi(api);
	}

	public ApiTestConfig findById(long id){
		return dao.findById(id);
	}

	public ApiTestConfig addNewConfig(ApiTestConfig config){
		return dao.saveAndFlush(config);
	}

	public ApiTestConfig findByApi(Api api){
		return dao.findByApiId(api.getId());
	}

	@Transactional
	public ApiTestConfig save(ApiTestConfig config){
		checkNotNull(config);
		if (config.exist()){
			ApiTestConfig existConfig=dao.findById(config.getId());
			config=existConfig.merge(config);
		}else{

		}
		return dao.saveAndFlush(config);
	}


}
