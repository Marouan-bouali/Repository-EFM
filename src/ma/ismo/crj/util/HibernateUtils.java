package ma.ismo.crj.util;


import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.moddels.Appartement;
import com.moddels.Etage;
import com.moddels.Immeuble;
import com.moddels.Rue;


public class HibernateUtils {
	
	private static final SessionFactory sessionFactory;
	private static final ServiceRegistry serviceRegistry;
	
	static {
		Configuration config = new Configuration();
		config.configure();
		
		config.addAnnotatedClass(Rue.class);
	   config.addAnnotatedClass(Immeuble.class);
	   config.addAnnotatedClass(Etage.class);
	   config.addAnnotatedClass(Appartement.class);


		
		
		serviceRegistry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
		sessionFactory = config.buildSessionFactory(serviceRegistry);
	}

	public static SessionFactory getSessionfactory() {
		return sessionFactory;
	}
}

