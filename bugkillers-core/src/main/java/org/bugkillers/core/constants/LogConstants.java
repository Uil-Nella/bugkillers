package org.bugkillers.core.constants;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 日志常量
 */
public interface LogConstants {

    // 错误日志持有者
    Logger ERROR_LOGGER = LoggerFactory.getLogger("error");

    // 服务层面日志持有者
    Logger SERVICE_LOGGER = LoggerFactory.getLogger("service");


    Logger JOB_LOGGER = LoggerFactory.getLogger("job");

    // controller
    Logger CONTROLLER_LOGGER = LoggerFactory.getLogger("controller");
}