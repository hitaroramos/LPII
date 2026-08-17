public class Livro
{
	protected String lsbn;
	protected String autor;
	protected String editora;
	protected String livroTitulo;
	
	public Livro(String lsbn, String autor, String editora, String livroTitulo)
	{
		this.lsbn = lsbn;
		this.autor = autor;
		this.editora = editora;
		this.livroTitulo = livroTitulo;
	}

	public String getLsbn()
	{
		return lsbn;
	}

	public String getAutor()
	{
		return autor;
	}

	public String getEditora()
	{
		return editora;
	}

	public String getLivroTitulo()
	{
		return livroTitulo;
	}
}
