package org.bugkillers.core.config.datesource;

/**
 *
 */
public class DataSourceHandler {

    // 线程变量 存储根据Key 获取数据源
    private final static ThreadLocal<String> handler = new ThreadLocal<String>();

    /**
     * 设置数据源类型
     *
     * @param dataSourceType 数据源类型
     */
    public static void setDataSourceType(String dataSourceType) {
        handler.set(dataSourceType);
    }

    /**
     * 获取数据源类型
     *
     * @return 数据源类型
     */
    public static String getDataSourceType() {
        return (String) handler.get();
    }

    /**
     * 清空线程的数据源类型
     */
    public static void clearDataSourceType() {
        handler.remove();
    }
}