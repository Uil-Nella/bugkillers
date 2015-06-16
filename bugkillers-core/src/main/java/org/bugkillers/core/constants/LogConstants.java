package org.bugkillers.core.constants;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface LogConstants {

	//	API层日志持有者
	public final static Logger API_LOGGER = LoggerFactory.getLogger("apiTime");

	// 错误日志持有者
	public final static Logger ERROR_LOGGER = LoggerFactory.getLogger("error");

    // 服务层面日志持有者
    public final static Logger SERVICE_LOGGER = LoggerFactory.getLogger("service");

    // solr日志持有者
    public final static Logger SOLR_LOGGER = LoggerFactory.getLogger("solr");

    public final static Logger JOB_LOGGER = LoggerFactory.getLogger("job");
}