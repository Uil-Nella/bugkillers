package org.bugkillers.core.config.datesource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @author yangxuxin
 * @version V1.0
 * @Title: DynamicDataSource.java
 * @Description: 动态数据源类 (一写多读)
 * @Company:meituan
 * @date 15/1/21 19:40
 */
public class DynamicDataSource extends AbstractRoutingDataSource {

    /**
     * 获取数据源类型
     */
    protected Object determineCurrentLookupKey() {
        return DataSourceHandler.getDataSourceType();
    }
}