package br.com.springboot.Repository;

import org.springframework.data.repository.CrudRepository;

import br.com.springboot.Model.Emprego;

public interface EmpregoRepository extends CrudRepository<Emprego, Long> {

}
