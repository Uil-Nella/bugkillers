package org.bugkillers.core.util;

import org.dozer.DozerBeanMapper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 简单封装Dozer, 实现深度转换Bean<->Bean的Mapper.实现:
 * <p/>
 * 1. 持有Mapper的单例.
 * 2. 返回值类型转换.
 * 3. 批量转换Collection中的所有对象.
 * 4. 区分创建新的B对象与将对象A值复制到已存在的B对象两种函数.
 */
@Component
public class BeanMapper {

    /**
     * 持有Dozer单例, 避免重复创建DozerMapper消耗资源.
     */
    @Resource(name = "dozer")
    private DozerBeanMapper dozer;

    /**
     * 基于Dozer转换对象的类型.
     */
    public <T> T map(Object source, Class<T> destinationClass) {
        return dozer.map(source, destinationClass);
    }

    /**
     * 基于Dozer转换Collection中对象的类型.
     */
    public <T> List<T> mapList(Collection sourceList,
                               Class<T> destinationClass) {
        List<T> destinationList = new ArrayList<T>();
        for (Object sourceObject : sourceList) {
            T destinationObject = dozer.map(sourceObject, destinationClass);
            destinationList.add(destinationObject);
        }
        return destinationList;
    }

    /**
     * 基于Dozer转换Collection中对象的类型.
     */
    public <T> List<T> mapList(Object[] sourceList, Class<T> destinationClass) {
        List<T> destinationList = new ArrayList();
        for (Object sourceObject : sourceList) {
            T destinationObject = dozer.map(sourceObject, destinationClass);
            destinationList.add(destinationObject);
        }
        return destinationList;
    }

    /**
     * 基于Dozer将对象A的值拷贝到对象B中.
     */
    public void copy(Object source, Object destinationObject) {
        dozer.map(source, destinationObject);
    }
}
