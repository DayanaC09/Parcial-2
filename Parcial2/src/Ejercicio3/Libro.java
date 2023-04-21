package Ejercicio3;

public class Libro {
	private String ISBN = "";
	private String titulo = "";
	private String autor = "";
	private int numeroDePaginas = 9;
	
	public Libro(String ISBN, String titulo, String autor, int numeroDePaginas) {
		setISBN(ISBN);
		setTitulo(titulo);
		setAutor(autor);
		setNumeroDePaginas(numeroDePaginas);
	}

	public String toString() {
		return "«El libro " + getTitulo() + " con ISBN " + getISBN() +" creado por el autor " + getTitulo() +" tiene " + getNumeroDePaginas() +" páginas»";
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumeroDePaginas() {
		return numeroDePaginas;
	}

	public void setNumeroDePaginas(int numeroDePaginas) {
		this.numeroDePaginas = numeroDePaginas;
	}
	

}
