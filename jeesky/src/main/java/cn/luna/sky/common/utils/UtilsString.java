package cn.luna.sky.common.utils;

public class UtilsString {
	/**
	 * 返回字符串,如果值为null则返回空字符串
	 * @param obj
	 * @return
	 */
	public static String getStrValue(Object obj){
		return obj == null ? "" : obj.toString();
	}
}
