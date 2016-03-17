package business;

/* Movie is the central class we are working with */
public class Movie {
	
	private String title;
	private String category;

	public Movie() {}

	public Movie(String title, String category) {
		this.title = title;
		this.category = category;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getcategory() {
		return category;
	}

	public void setcategory(String category) {
		this.category = category;
	}

}
