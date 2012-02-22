package de.gzockoll.prototype.actorrole.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import de.gzockoll.prototype.actorrole.Main;
import de.gzockoll.prototype.actorrole.api.ActorService;

public class Launcher {
	private static Logger log = LoggerFactory.getLogger(Launcher.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Launcher().launch();

	}

	private void launch() {
		try {
			String[] contextPaths = new String[] { "/data-beans.xml",
					"/control-beans.xml", "/gui-beans.xml" };
			ApplicationContext ctx = new ClassPathXmlApplicationContext(
					contextPaths);

			ActorService main = ctx.getBean(Main.class);
			main.init();
		} catch (Throwable e) {
			log.error("Spring:", e);
		}
	}
}
