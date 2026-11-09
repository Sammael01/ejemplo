package co.edu.unbosque.calculadora.dto;

import java.util.Objects;

public class OperacionDTO {

	private long id;
	private int numero1;
	private int numero2;
	private int resultado;
	
	public OperacionDTO() {
		// TODO Auto-generated constructor stub
	}

	public OperacionDTO(int numero1, int numero2) {
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
		return "OperacionDTO [id=" + id + ", numero1=" + numero1 + ", numero2=" + numero2 + ", resultado=" + resultado
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
		OperacionDTO other = (OperacionDTO) obj;
		return id == other.id && numero1 == other.numero1 && numero2 == other.numero2 && resultado == other.resultado;
	}
	
	

}
