package org.bugkillers.core.util;

import org.bugkillers.core.enums.DataValidEnum;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

/**
 * Created by liuxinyu on 15/7/13.
 */
public class FillAttributeUtil {

    /**
     * 填充属性
     * @param target
     * @param clazz
     */
    public static void fillNecessaryAttribute(Object target,Class<?> clazz){
        final String drSetterStr = "setDr";
        final String bkCreateSetterStr = "setBkCreate";
        final String bkModifiedSetterStr = "setBkModified";

        try {
            Method drSetter = clazz.getMethod(drSetterStr,Integer.class);
            Method bkCreateSetter = clazz.getMethod(bkCreateSetterStr, Date.class);
            Method bkModifiedSetter = clazz.getMethod(bkModifiedSetterStr,Date.class);
            drSetter.invoke(target, DataValidEnum.VALID.getIndex());
            bkCreateSetter.invoke(target,new Date());
            bkModifiedSetter.invoke(target,new Date());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
