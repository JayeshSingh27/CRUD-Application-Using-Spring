package in.ineuron.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.ineuron.model.Books;
import in.ineuron.service.IBooksService;

@RestController
@RequestMapping("/crud")
public class CustomerController {
	
	@Autowired  
	IBooksService booksService;  
	
	   
	@GetMapping("/getbook")  
	private List<Books> getAllBooks()   
	{  
		return booksService.getAllBooks();  
	}  
	
	
	@GetMapping("/getbookbyid")  
	private Books getBooks(@RequestParam Integer bookid)   
	{  
		return booksService.getBooksById(bookid);  
	}  
	  
	@DeleteMapping("/deletebook")  
	private void deleteBook(@RequestParam Integer bookid)   
	{  
		booksService.delete(bookid);  
	}  
	  
	@PostMapping("/insertbook")  
	private int saveBook(@RequestParam Integer bookid, @RequestParam String bookname, 
			@RequestParam String author, @RequestParam Integer price)   
	{  
		Books b = new Books(bookid,bookname,author,price);
		booksService.saveOrUpdate(b);  
		return b.getBookid();  
	}  
	   
	@PutMapping("/updatebook")  
	private Books update(@RequestParam Integer bookid, @RequestParam String bookname, 
			@RequestParam String author, @RequestParam Integer price)   
	{  
		Books b = new Books(bookid,bookname,author,price);
		booksService.update(b);  
		return b;  
	} 
}
