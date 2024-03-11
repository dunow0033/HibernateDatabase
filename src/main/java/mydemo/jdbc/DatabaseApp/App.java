package mydemo.jdbc.DatabaseApp;

import mydemo.jdbc.DatabaseApp.entities.Product;


import org.hibernate.*;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory sesfact = new Configuration().
    			configure("Project.cfg.xml").
    			addAnnotatedClass(Product.class).buildSessionFactory();
    	
    	Session session=sesfact.openSession();
    	Transaction tx=session.beginTransaction();
    	Product p=new Product();
    	p.setProductid(1);
    	p.setProductname("Sofa");
    	p.setPrice(90000);
    	p.setQuantity(2);
    	session.save(p);
    	tx.commit();
    	System.out.println("Data saved");
    }
}
