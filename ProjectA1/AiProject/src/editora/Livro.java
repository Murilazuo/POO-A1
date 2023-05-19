package editora;

public class Livro {
	String titulo;
	String autor;
	int idEditora;
	int ano;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) { this.titulo = titulo; }
	public String getAutor() { return autor; }
	public void setAutor(String autor) { this.autor = autor; }
	public int getIdEditora() { return idEditora; }
	public void setIdEditora(int idEditora) { this.idEditora = idEditora; }
	public int getAno() { return ano; }
	public void setAno(int ano) { this.ano = ano; }
	@Override
	public String toString() {
		return     "Livro - " + titulo
				+"\n  Autor - " + autor
				+"\n  Ano - " + ano
				+"\n  Id - " + idEditora;
	}
}
