package Library;

import java.awt.List;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Library {
	private ArrayList<Book> classic;
	private ArrayList<Book> children;
	private ArrayList<Book> fantastic;
	private ArrayList<Book> biography;
	private ArrayList<Book> love;

	public Library() {
		this.classic = new ArrayList<Book>();
		this.children = new ArrayList<Book>();
		this.fantastic = new ArrayList<Book>();
		this.biography = new ArrayList<Book>();
		this.love = new ArrayList<Book>();
	}

	public void addBook(Book book, Genre ganre) {
		switch (ganre) {
		case classic:
			checkIfExist(book, this.classic);
			this.classic.add(book);
			break;
		case children:
			checkIfExist(book, this.children);
			this.children.add(book);
			break;
		case fantastic:
			checkIfExist(book, this.fantastic);
			this.fantastic.add(book);
			break;
		case biography:
			checkIfExist(book, this.biography);
			this.biography.add(book);
			break;
		case love:
			checkIfExist(book, this.love);
			this.love.add(book);
			break;
		default:
			throw new Error("Invalid choice!");
		}
	}

	public int countClassic() {
		return this.countGenreBook(Genre.classic);
	}

	public int countChildren() {
		return this.countGenreBook(Genre.children);
	}

	public int countFantastic() {
		return this.countGenreBook(Genre.fantastic);
	}

	public int countBiography() {
		return this.countGenreBook(Genre.biography);
	}

	public int countLove() {
		return this.countGenreBook(Genre.love);
	}

	public int searchByBookName(String name) {
		ArrayList<ArrayList<Book>> all = new ArrayList<ArrayList<Book>>();
		all.add(this.biography);
		all.add(this.love);
		all.add(this.classic);
		all.add(this.children);
		all.add(this.fantastic);

		for (int i = 0; i < 5; i++) {
			for (Book book : all.get(i)) {
				if (book.getName().toLowerCase() == name.toLowerCase()) {
					return all.get(i).indexOf(book);
				}
			}
		}

		return -1;
	}

	private int countGenreBook(Genre genre) {
		switch (genre) {
		case classic:
			return this.classic.size();
		case fantastic:
			return this.fantastic.size();
		case children:
			return this.classic.size();
		case biography:
			return this.biography.size();
		case love:
			return this.love.size();
		default:
			return 0;

		}
	}

	private void checkIfExist(Book book, ArrayList<Book> list) {
		for (Book bookk : list) {
			if (bookk.getIsbn().equals(book.getIsbn())) {
				throw new Error("The book is already exist!");
			}
		}
	}
}
