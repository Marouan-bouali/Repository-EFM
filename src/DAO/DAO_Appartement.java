package DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.moddels.Appartement;
import com.moddels.Rue;


public class DAO_Appartement implements I_DAO<Appartement> {

	@Override
	public List<Appartement> getAll() {
		Session session = ma.ismo.crj.util.HibernateUtils.getSessionfactory().getCurrentSession();
		Transaction tr = session .beginTransaction(); 
		
		List<Appartement> etr=session.createQuery("from Appartement").getResultList();
		
		tr.commit();
		session.close();
		return etr;
	}

	@Override
	public Appartement getOne(int id) {
		Session session = ma.ismo.crj.util.HibernateUtils.getSessionfactory().getCurrentSession();
		Transaction t = session.beginTransaction();

		Appartement entreprise = session.get(Appartement.class, id);

		t.commit();
		session.close();
		return entreprise;
	}

	@Override
	public boolean save(Appartement obj) {
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
	public boolean update(Appartement obj) {
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
	public boolean delete(Appartement obj) {
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
