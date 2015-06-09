package org.bugkillers.core.util.security;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * 加密算法
 */
public class SecurityUtil {
    public static final String MD2 = "MD2";
    public static final String MD5 = "MD5";
    public static final String SHA_1 = "SHA1";
    public static final String SHA_256 = "SHA256";
    public static final String SHA_384 = "SHA384";
    public static final String SHA_512 = "SHA512";

    /**
     * 加密字符串
     *
     * @param sourceStr    需要加密目标字符串
     * @param algorithmsName 算法名称(如:MD2,MD5,SHA1,SHA256,SHA384,SHA512)
     * @return
     */
    public static String passAlgorithmsCiphering(String sourceStr,String algorithmsName){
        String password = "";
        switch(algorithmsName){
            case "MD2":
                password = DigestUtils.md2Hex(sourceStr);
                break;
            case "MD5":
                password = DigestUtils.md5Hex(sourceStr);
                break;
            case "SHA1":
                password = DigestUtils.sha1Hex(sourceStr);
                break;
            case "SHA256":
                password = DigestUtils.sha256Hex(sourceStr);
                break;
            case "SHA384":
                password = DigestUtils.sha384Hex(sourceStr);
                break;
            case "SHA512":
                password = DigestUtils.sha512Hex(sourceStr);
                break;
        }
        return password;
    }
}