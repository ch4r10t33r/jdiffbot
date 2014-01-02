package org.zincoshine.jdiffbot;

import java.net.URL;
import java.util.List;
import com.google.gson.JsonObject;
import com.google.gson.Gson;
/**
 * 
 * @author zincoshine
 *
 */

public interface JDiffBotWrapper {
	/**
	 * List of constants that can be used to determine the DiffBot api to be called.
	 */
	public static final String ARTICLE = "ARTICLE";
	public static final String FRONT_PAGE = "FRONTPAGE";
	public static final String PRODUCT = "PRODUCT";
	public static final String IMAGE = "IMAGE";
	public static final String CLASSIFIER = "CLASSIFIER";
	/**
	 * Method to call the appropriate DiffBot API
	 */
	public JsonObject diffBot(URL theUrl,String token,String api,List fields,int version) throws JDiffBotException;
	/**
	 * Method to call the appropriate DiffBot API to get the output as a JSON string.
	 */
	public String diffBotAsString(URL theUrl, String token, String api, List fields, int version) throws JDiffBotException;
}