package co.edu.unbosque.calculadora.entity;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "operacion")
public class Operacion {
	
	private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) long id;
	private int numero1;
	private int numero2;
	private int resultado;
	
	public Operacion() {
		// TODO Auto-generated constructor stub
	}

	public Operacion( int numero1, int numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getNumero1() {
		return numero1;
	}

	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}

	public int getNumero2() {
		return numero2;
	}

	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}

	public int getResultado() {
		return resultado;
	}

	public void setResultado(int resultado) {
		this.resultado = resultado;
	}

	@Override
	public String toString() {
		return "Operacion [id=" + id + ", numero1=" + numero1 + ", numero2=" + numero2 + ", resultado=" + resultado
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, numero1, numero2, resultado);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Operacion other = (Operacion) obj;
		return id == other.id && numero1 == other.numero1 && numero2 == other.numero2 && resultado == other.resultado;
	}
	
	

}
