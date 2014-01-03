package org.zincoshine.jdiffbot.impl;

import java.net.URL;
import java.util.List;
import com.google.gson.JsonObject;
import com.google.gson.Gson;
import org.zincoshine.jdiffbot.JDiffBotWrapper;
import org.zincoshine.jdiffbot.JDiffBotException;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.HttpResponse;

/**
 * 
 * @author zincoshine
 *
 */

public class JDiffBotWrapperImpl implements JDiffBotWrapper {
	/**
	 * This method implements the diffBot method of JDiffBotWrapper interface.
	 */
	public JsonObject diffBot(URL theUrl,String token,String api,List fields,int version) throws JDiffBotException {
		JsonObject jsonObject = null;
		try {
			
		} catch(Exception e) {
			
		}
		return jsonObject;
	}
	
	/**
	 * This method implements the diffBotAsString method of JDiffBotWrapper interface.
	 */
	public String diffBotAsString(URL theUrl,String token,String api,List fields,int version) throws JDiffBotException {
		//TODO
		return null;
	}
}