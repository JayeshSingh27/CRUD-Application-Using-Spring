package in.ineuron.dao;

import org.springframework.data.repository.CrudRepository;

import in.ineuron.model.Books;

public interface IBooksDao extends CrudRepository<Books, Integer> {

}
