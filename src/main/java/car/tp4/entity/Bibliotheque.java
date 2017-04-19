package car.tp4.entity;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.ejb.Stateful;

@Stateful(name="maBibliotheque")
public class Bibliotheque implements BibliothequeItf {

	private Map<Book, Integer> books;
	
	public Bibliotheque() {
		books = new HashMap<Book, Integer>();
	}
	
	@Override
	public void init() {
		books.put(new Book("J.K. Rolling", "Harry Potter", 1997), 3);
		books.put(new Book("J.R.R. Tolkien", "The Lord of the rings", 1937), 6);
		books.put(new Book("Georges R.R. Martin", "Game Of Thrones", 2015), 0);
	}

	@Override
	public boolean createBook(String titre, String auteur, int annee) {
		for(Map.Entry<Book, Integer> entry : books.entrySet()){
			Book b = entry.getKey();
			if(b.getAuthor().equals(auteur) && b.getTitle().equals(titre) && b.getYear() == annee){
				addbook(b);
				return false;
			}
		}
		books.put(new Book(titre, auteur, annee), 1);
		return true;
	}
	
	@Override
	public void addbook(Book b){
		books.put(b, books.get(b) +1);
	}

	@Override
	public boolean editBook(Book b, String titre, String auteur, int annee) {
		Set<Book> set = books.keySet();
		for(Book book : set){
			if(book.equals(b)){
				book.setAuthor(auteur);
				book.setTitle(titre);
				book.setYear(annee);
				return true;
			}
		}
		return false;
	}

	@Override
	public Set<Book> listBooks() {
		return books.keySet();
	}

	@Override
	public Set<String> listAuteur() {
		Set<Book> set = listBooks();
		Set<String> result = new HashSet<String>();
		for(Book b : set)
			result.add(b.getAuthor());
		return result;
	}
}
