package DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.moddels.Rue;


public class DAO_Rue implements I_DAO<Rue> {

	@Override
	public List<Rue> getAll() {
		Session session = ma.ismo.crj.util.HibernateUtils.getSessionfactory().getCurrentSession();
		Transaction tr = session .beginTransaction(); 
		
		List<Rue> etr=session.createQuery("from Rue").getResultList();
		
		tr.commit();
		session.close();
		return etr;
	}

	@Override
	public Rue getOne(int id) {
		Session session = ma.ismo.crj.util.HibernateUtils.getSessionfactory().getCurrentSession();
		Transaction t = session.beginTransaction();

		Rue entreprise = session.get(Rue.class, id);

		t.commit();
		session.close();
		return entreprise;
	}

	@Override
	public boolean save(Rue obj) {
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
	public boolean update(Rue obj) {
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
	public boolean delete(Rue obj) {
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
