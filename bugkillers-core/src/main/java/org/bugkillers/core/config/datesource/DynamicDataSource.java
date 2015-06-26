package org.bugkillers.core.config.datesource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 *
 */
public class DynamicDataSource extends AbstractRoutingDataSource {

    /**
     * 获取数据源类型
     */
    protected Object determineCurrentLookupKey() {
        return DataSourceHandler.getDataSourceType();
    }
}