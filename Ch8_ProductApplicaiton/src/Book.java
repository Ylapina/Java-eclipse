
public class Book extends Product{
	private String author;
	
	public Book() {
		    super(); //call default constructor
			author = "";
			count++;
		}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+ "by"+ author;
	}
	
	}


