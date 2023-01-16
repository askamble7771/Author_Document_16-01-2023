package bll;

public class Document {
	
	private String author;
	private String title;
	private int copies;
	
	public Document() {
		
	}
	
	public Document(String author, String title) {
		super();
		this.author = author;
		this.title = title;
		copies = 0;
	}
	
	public String getAuthor() {
		
		return author;
	}
	
	public String getTitle() {
		
		return title;
	}
	
	public int getCopies() {
		return copies;
	}
	
	public void createCopies(int n) {
		copies = copies + n;
	}
	
	public void sellCopies(int n) {
		copies = copies - n;
	}
	
	
	
	@Override
	public String toString() {
		return "Document [name=" + author + ", title=" + title + 
				", Copies=" + copies + "]";
	}
	
	

}
