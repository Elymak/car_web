package car.tp4.entity;

import java.util.Set;

import javax.ejb.Local;

@Local
public interface BibliothequeItf {
	public void init();
	public void addbook(Book b);
	public boolean createBook(String titre, String auteur, int annee);
	public boolean editBook(Book b, String titre, String auteur, int annee);
	public Set<Book> listBooks();
	public Set<String> listAuteur();
}
