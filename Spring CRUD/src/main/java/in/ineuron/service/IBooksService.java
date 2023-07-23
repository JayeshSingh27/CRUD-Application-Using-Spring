package in.ineuron.service;

import java.util.List;

import in.ineuron.model.Books;

public interface IBooksService {
	public List<Books> getAllBooks();   
	public Books getBooksById(int id);
	public void saveOrUpdate(Books books);
	public void delete(int id);
	public void update(Books books);
}
