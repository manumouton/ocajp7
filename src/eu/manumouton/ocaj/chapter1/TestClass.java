package eu.manumouton.ocaj.chapter1;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.io.IOException;

/**
 * Created by manu on 30/11/14.
 */
public class TestClass {
     public static void main(String args[]) throws IOException{
         new File("logs").mkdir();
         DateFormat df = new SimpleDateFormat("yyyyMMddhhmmss");
         Date now = new Date();
         String date = df.format(now);
         String logFileName = "logs/testLog-" + date + ".txt";
         FileHandler myFileHandler = new FileHandler(logFileName);
         myFileHandler.setFormatter(new SimpleFormatter());
         Logger logger = Logger.getLogger("My logger");
         logger.setLevel(Level.ALL);
         logger.addHandler(myFileHandler);
         logger.info("\nTest de log info");
         myFileHandler.close();
     }
}
