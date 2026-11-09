package co.edu.unbosque.calculadora.repository;

import org.springframework.data.repository.CrudRepository;

import co.edu.unbosque.calculadora.entity.Operacion;

public interface OperacionRepository extends CrudRepository <Operacion, Long>{

}
