package DAO;

import java.util.List;

import com.moddels.Rue;

public interface I_DAO <T>{
List<T> getAll();
	
	T getOne(int id);
	
	boolean save(T obj);
	
	boolean update(T obj);
	
	boolean delete(T obj);

	List<Rue> getAll1();
}
