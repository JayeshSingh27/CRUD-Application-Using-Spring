package in.ineuron.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.dao.IBooksDao;
import in.ineuron.model.Books;


@Service
public class BooksServiceImpl implements IBooksService{

	@Autowired
	IBooksDao repo;
	
	@Override
	public List<Books> getAllBooks() {
		List<Books> list = new ArrayList<>();
		repo.findAll().forEach(newlist -> list.add(newlist));
		return list;
	}

	@Override
	public Books getBooksById(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public void saveOrUpdate(Books books) {
		// TODO Auto-generated method stub
		repo.save(books);
		System.out.println("saveOrUpdate Success");
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		System.out.println("Deletion Succesfull");
		
	}

	@Override
	public void update(Books books) {
		// TODO Auto-generated method stub
		Optional<Books> opt = repo.findById(books.getBookid()); 
		if(opt.get() != null) {
			repo.save(books);
			System.out.println("Updated Succesfully");
		}else {
			System.out.println("Record Not Found");
		}
		
	}

}
