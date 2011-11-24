package de.gzockoll.spielwiese.actorrole.client;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launcher {
	private static Log log=LogFactory.getLog(Launcher.class);
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Launcher().launch();

	}

	private void launch() {
		try {
			String[] contextPaths = new String[] { "/data-beans.xml", "/control-beans.xml", "/gui-beans.xml" };
			new ClassPathXmlApplicationContext(contextPaths);
		} catch (Throwable e) {
			log.error(e);
		}
	}
}
