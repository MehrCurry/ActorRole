package de.gzockoll.prototype.actorrole.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
            String[] contextPaths = new String[] { "/data-beans.xml", "/control-beans.xml", "/gui-beans.xml" };
            new ClassPathXmlApplicationContext(contextPaths);
        } catch (Throwable e) {
            log.error("Spring:", e);
        }
    }
}
