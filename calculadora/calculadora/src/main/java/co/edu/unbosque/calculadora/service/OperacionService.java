package co.edu.unbosque.calculadora.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unbosque.calculadora.dto.OperacionDTO;
import co.edu.unbosque.calculadora.entity.Operacion;
import co.edu.unbosque.calculadora.repository.OperacionRepository;

@Service
public class OperacionService implements CRUDoperation<OperacionDTO>{
	
	@Autowired
	private OperacionRepository operacionRepo;
	@Autowired
	private ModelMapper mapper;

	
	@Override
	public int suma(OperacionDTO data) {
		data.setResultado(data.getNumero1() + data.getNumero2());
		Operacion entity = mapper.map(data, Operacion.class);
		operacionRepo.save(entity);
		return 0;
	}
	@Override
	public int resta(OperacionDTO data) {
		data.setResultado(data.getNumero1() - data.getNumero2());
		Operacion entity = mapper.map(data, Operacion.class);
		operacionRepo.save(entity);
		return 0;
	}
	@Override
	public int multi(OperacionDTO data) {
		data.setResultado(data.getNumero1() * data.getNumero2());
		Operacion entity = mapper.map(data, Operacion.class);
		operacionRepo.save(entity);
		return 0;
	}
	@Override
	public int divi(OperacionDTO data) {
		data.setResultado(data.getNumero1() / data.getNumero2());
		Operacion entity = mapper.map(data, Operacion.class);
		operacionRepo.save(entity);
		return 0;
	}
	@Override
	public List<OperacionDTO> getAll() {
		List<Operacion> entityList = (List<Operacion>) operacionRepo.findAll();
		List <OperacionDTO> dtoList = new ArrayList<>();
		
		entityList.forEach((entity) -> {
			OperacionDTO dto = mapper.map(entity, OperacionDTO.class);
			dtoList.add(dto);
		});
		return dtoList;
	}
	
	
	
	
	
	

}
