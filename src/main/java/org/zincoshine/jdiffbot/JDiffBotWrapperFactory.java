package org.zincoshine.jdiffbot;
/**
 * 
 * @author zincoshine
 *
 */
public class JDiffBotWrapperFactory {
	public static JDiffBotWrapper getInstance () {
		return new org.zincoshine.jdiffbot.impl.JDiffBotWrapperImpl();
	}
}