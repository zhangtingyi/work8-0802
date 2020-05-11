/**
 * 纸张接口
 * 
 * @author迅腾国际
 * 
 */
package com.xtgj.j2ee.chapter08.spring;
interface Paper {
	public static final String newline = "\r\n";

	/**
	 * 输出字符到纸张
	 */
	public void putInChar(char c);

	/**
	 * 得到输出到纸张上的内容
	 */
	public String getContent();
}


