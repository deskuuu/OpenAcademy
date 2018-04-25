package Library;

public class Main {
	public static void main(String[] args) {
		Library library = new Library();

		Authour authour = new Authour("Ronda", "Burn", "american");
		Book bookFan = new Book("The secret", authour, Genre.fantastic, "12.09.1997", "12345678909860");
		library.addBook(bookFan, Genre.fantastic);
		
		Authour authourr = new Authour("Ronda", "Burn", "american");
		Book bookFann = new Book("Smile", authourr, Genre.fantastic, "12.09.1997", "123445678909860");
		library.addBook(bookFann, Genre.fantastic);
		
		System.out.println("Biography: " + library.countBiography());
		System.out.println("Children: " + library.countChildren());
		System.out.println("Classic: " + library.countClassic());
		System.out.println("Fantastic: " + library.countFantastic());
		System.out.println("Love: " + library.countLove());
		
		System.out.println(library.searchByBookName("Smile"));
	}
}
