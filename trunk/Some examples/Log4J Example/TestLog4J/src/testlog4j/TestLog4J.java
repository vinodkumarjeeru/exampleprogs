/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testlog4j;

import java.util.Properties;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 *
 * @author Admin
 */
public class TestLog4J {

    static Logger LOG = Logger.getLogger(TestLog4J.class);
    static Logger LOG1 = Logger.getLogger(TestLog4J.class);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        Properties p = new Properties();
//        InputStream inputStream = null;

//            inputStream = new FileInputStream(new File("log4j.properties"));
//            p.load(inputStream);






        Properties p = new Properties();
        p.setProperty("log4j.rootLogger", "DEBUG , logfile");
        p.setProperty("log4j.appender.logfile", "org.apache.log4j.DailyRollingFileAppender");
        p.setProperty("log4j.appender.logfile.File", "E:\\test.log");
        p.setProperty("log4j.appender.logfile.Append", "true");
        p.setProperty("log4j.appender.logfile.layout", "org.apache.log4j.PatternLayout");
        p.setProperty("log4j.appender.logfile.layout.ConversionPattern", "[%p]======(%d{dd MMM yyyy HH:mm:ss,SSS})-----(%C:%L)-------%m%n");


        PropertyConfigurator.configure(p);
        LOG.setLevel(Level.ALL);
        LOG.debug("Test Console LOG");
        LOG.warn("Warning");







    }
}
