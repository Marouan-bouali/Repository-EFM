package DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.moddels.Immeuble;
import com.moddels.Rue;

 

public class DAO_Immeuble implements I_DAO<Immeuble> {

	@Override
	public List<Immeuble> getAll() {
		Session session = ma.ismo.crj.util.HibernateUtils.getSessionfactory().getCurrentSession();
		Transaction tr = session .beginTransaction(); 
		
		List<Immeuble> etr=session.createQuery("from Immeuble").getResultList();
		
		tr.commit();
		session.close();
		return etr;
	}
	

	@Override
	public Immeuble getOne(int id) {
		Session session = ma.ismo.crj.util.HibernateUtils.getSessionfactory().getCurrentSession();
		Transaction t = session.beginTransaction();

		Immeuble entreprise = session.get(Immeuble.class, id);

		t.commit();
		session.close();
		return entreprise;
	}

	@Override
	public boolean save(Immeuble obj) {
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
	public boolean update(Immeuble obj) {
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
	public boolean delete(Immeuble obj) {
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
