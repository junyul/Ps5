package pkgLibrary;

import java.util.ArrayList;
import java.util.Date;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class Book {

	private String id;
	private String author;
	private String title;
	private String genre;
	private double price;
	private Date publish_date;
	private String description;

	public Book() {

	}
	public static Book GetBook(String id) throws BookException  {
		Catalog c = ReadXMLFile();
		ArrayList<Book> BookList = c.getBooks();
		Book Number = null; 
		
		for (Book i : BookList )
			if (i.getId().equals(id)) {
				Number = i;
			}
				
		if (Number == null) {
			throw new BookException("Book cannot be found");
		}
		else
			return Number;
	}
	private static Catalog ReadXMLFile() {
		
		return null;
	}
	
	
	public Book(String id, String author, String title, String genre, double price, Date publish_date, String description)
	{
		super();
		this.id = id;
		this.author = author;
		this.title = title;
		this.genre = genre;		
		this.price = price;
		this.publish_date = publish_date;
		this.description = description;
	}
	
	
	
	public static void AddBook(int CatalogID, Book BookInstance)；
		if (Number == null) {
						BookList.add(BookInstance);
						c.setBooks(BookList);
						WriteXMLFile(c);

	public String getId() {
		return id;
	}

	@XmlAttribute
	public void setId(String id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	@XmlElement
	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	@XmlElement
	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	@XmlElement
	public void setGenre(String genre) {
		this.genre = genre;
	}

	public double getPrice() {
		return price;
	}

	@XmlElement
	public void setPrice(double price) {
		this.price = price;
	}

	public Date getPublish_date() {
		return publish_date;
	}

	@XmlElement
	public void setPublish_date(Date publish_date) {
		this.publish_date = publish_date;
	}

	public String getDescription() {
		return description;
	}

	@XmlElement
	public void setDescription(String description) {
		this.description = description;
	}

	
	

}
