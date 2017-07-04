package org.sky.common.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * @annotation 日期工具类
 * @version 1.0
 * @author zhanggaohao
 * @date 2017年7月4日 下午9:14:29
 */
public class DateUtils {

	/**
	 * @annotation 获取指定格式日期字符串
	 * @param time 时间戳
	 * @param format
	 * @return
	 */
	public static String parse(Long time, String format){
		return new SimpleDateFormat(format).format(new Date(time));
	}
	/**
	 * @annotation 获取指定格式日期时间戳
	 * @param date 日期字符串
	 * @param format
	 * @return
	 * @throws ParseException
	 */
	public static Long parse(String date, String format) throws ParseException{
		return new SimpleDateFormat(format).parse(date).getTime();
	}
	/**
	 * @annotation 获取当前指定格式日期字符串
	 * @param format
	 * @return
	 */
	public static String getNowDateString(String format){
		return new SimpleDateFormat(format).format(new Date()); 
	}
	
}
