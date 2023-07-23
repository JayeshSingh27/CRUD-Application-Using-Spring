package in.ineuron.model;

  
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity 
@Table  
@AllArgsConstructor
@NoArgsConstructor
public class Books  
{  
	
	@Id  	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookid;  	  
	private String bookname; 	  
	private String author;  	
	private int price;  
}
	
