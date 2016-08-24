package com.iyonger.apm.web.dao;

import com.iyonger.apm.web.model.ApiTestRun;
import com.iyonger.apm.web.model.TestReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2015/8/12 0012.
 */
@Repository
public interface TestReportDao extends JpaRepository<TestReport,Long>{
    TestReport findById(long id);
    TestReport findByApiTestRun(ApiTestRun run);
}
