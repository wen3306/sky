package com.sky.util;

/**
 * 转义字符串中包含的<、>的工具类
 */
public class EscapeStringUtil {
	/**
     * 用户输入<、>、&amp;gt;、&amp;lt;将被分别替换为&amp;gt;、'&amp;gt;'、&amp;lt;、'&amp;lt;'   <br>
     * <、>这两个字符有特用殊处，若用户输入则替换掉      <br>
     * @param value 原字符串
     * @return 转义后的字符串（存储到数据库中的内容）
     */
    public static String escapeValue(String value){
        return value.replace("&gt;", "'&gt;'").replace(">", "&gt;").replace("&lt;", "'&lt;'").replace("<", "&lt;");
    }
    
    /**
     * 数据库中存储的&amp;gt;、'&amp;gt;'、&amp;lt;、'&amp;lt;'将被分别替换为<、>、&amp;gt;、&amp;lt;
     * @param value 原字符串
     * @return 转义后的字符串
     */
    public static String reEscapeValue(String value){
        return value.replace("&gt;", ">").replace("'>'", "&gt;").replace("&lt;", "<").replace("'<'", "&lt;");
    }
}
