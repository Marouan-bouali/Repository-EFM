package DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.moddels.Etage;
import com.moddels.Rue;





public class DAO_Etage implements I_DAO<Etage> {

	@Override
	public List<Etage> getAll() {
		
			Session session = ma.ismo.crj.util.HibernateUtils.getSessionfactory().getCurrentSession();
			Transaction tr = session .beginTransaction(); 
			
			List<Etage> etr=session.createQuery("from Etage").getResultList();
			
			tr.commit();
			session.close();
			return etr;
	}

	@Override
	public Etage getOne(int id) {
		Session session = ma.ismo.crj.util.HibernateUtils.getSessionfactory().getCurrentSession();
		Transaction t = session.beginTransaction();

		Etage entreprise = session.get(Etage.class, id);

		t.commit();
		session.close();
		return entreprise;
	}

	@Override
	public boolean save(Etage obj) {
		try {
			Session session = ma.ismo.crj.util.HibernateUtils.getSessionfactory().getCurrentSession();
			Transaction t = session.beginTransaction();

			Object o = session.save(obj);

			System.out.println(o);

			t.commit();
			session.close();

			if (o == null)
				return false;
			else
				return true;

		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean update(Etage obj) {
		try {
			Session session = ma.ismo.crj.util.HibernateUtils.getSessionfactory().getCurrentSession();
			Transaction t = session.beginTransaction();

			session.update(obj);

			t.commit();
			session.close();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean delete(Etage obj) {
		try {
			Session session = ma.ismo.crj.util.HibernateUtils.getSessionfactory().getCurrentSession();
			Transaction t = session.beginTransaction();

			session.delete(obj);

			t.commit();
			session.close();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public List<Rue> getAll1() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
