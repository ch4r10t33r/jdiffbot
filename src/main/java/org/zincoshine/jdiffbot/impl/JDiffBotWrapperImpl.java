package org.zincoshine.jdiffbot.impl;

import java.net.URL;
import java.util.List;
import com.google.gson.JsonObject;
import com.google.gson.Gson;
import org.zincoshine.jdiffbot.JDiffBotWrapper;
import org.zincoshine.jdiffbot.JDiffBotException;
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
		//TODO
		return null;
	}
	
	/**
	 * This method implements the diffBotAsString method of JDiffBotWrapper interface.
	 */
	public String diffBotAsString(URL theUrl,String token,String api,List fields,int version) throws JDiffBotException {
		//TODO
		return null;
	}
}