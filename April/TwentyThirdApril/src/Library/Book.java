package Library;

public class Book {
	private String name;
	private Authour authourName;
	private Genre genre;
	private String dateOfMade;
	private String isbn;

	public Book(String name, Authour authourName, Genre genre, String dateOfMade, String isbn) {
		setName(name);
		setAuthourName(authourName);
		setGenre(genre);
		setDateOfMade(dateOfMade);
		setIsbn(isbn);
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		HelperCheck.checkForNull(name);
		this.name = name;
	}

	private String getAuthourName(Authour authourName) {
		return authourName.toString();
	}

	private void setAuthourName(Authour authourName) {
		HelperCheck.checkForNull(authourName);
		this.authourName = authourName;
	}

	public String getGenre(Genre genre) {
		return this.genre.name();
	}

	public void setGenre(Genre genre) {
		HelperCheck.checkForNull(genre);
		this.genre = genre;
	}

	public String getDateOfMade(String dateOfMade) {
		return this.dateOfMade;
	}

	public void setDateOfMade(String dateOfMade) {
		HelperCheck.checkForNull(dateOfMade);
		this.dateOfMade = dateOfMade;
	}

	public String getIsbn() {
		return this.isbn;
	}

	public void setIsbn(String isbn) {
		HelperCheck.checkForNull(isbn);
		this.isbn = isbn;
	}
}
