package co.edu.unbosque.calculadora.service;

import java.util.List;

public interface CRUDoperation <T> {
	
	public int suma (T data);
	public int resta (T data);
	public int multi (T data);
	public int divi (T data);
	public List<T> getAll ();
	

}
