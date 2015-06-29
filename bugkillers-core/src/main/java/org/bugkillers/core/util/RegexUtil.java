package org.bugkillers.core.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by liuxinyu on 15/6/29.
 */
public class RegexUtil {
    /**
     * email 正则校验
     */
    public static final String RE_EMAIL = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";

    /**
     * 正则校验
     * @param regex 正则匹配字符串
     * @param checkedString 需要校验的字符串
     * @return
     */
    public static boolean check(String regex,String checkedString){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(checkedString);
        return matcher.matches();
    }

}
