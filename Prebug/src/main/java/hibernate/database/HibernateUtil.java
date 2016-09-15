package hibernate.database;

import java.io.File;

import org.hibernate.SessionFactory;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
 
public class HibernateUtil {
 
    private static final SessionFactory sessionFactory = buildSessionFactory();
 
    private static SessionFactory buildSessionFactory() {
        try {
            // Create the SessionFactory from hibernate.cfg.xml
        	
//        	Configuration config = new AnnotationConfiguration().configure(new File("C:\\Users\\Ashwini\\workspace\\Prebug\\src\\main\\resources\\hibernate.cfg.xml"));
//            return     config.buildSessionFactory();
//            return new AnnotationConfiguration().configure(new File("C:\\Users\\Ashwini\\workspace\\Prebug\\src\\main\\resources\\hibernate.cfg.xmlhibernate.cfg.xml"))
//                    .buildSessionFactory();
            
            return new AnnotationConfiguration().configure().buildSessionFactory();


        } catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
 
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    
    public static void shutdown() {
    	// Close caches and connection pools
    	getSessionFactory().close();
    }

}
