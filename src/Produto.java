public class Produto {

	private int id;
	private int preco;
	private String nome;
	private String Descricao;
	private int estoque;
	private int carro; // contador de produtos no carrinho.
	private static int cont = 0;

	public Produto(int id, int preco, String nome, String descricao, int estoque) {
		this.id = cont++;
		this.preco = preco;
		this.nome = nome;
		Descricao = descricao;
		this.estoque = estoque;
		this.carro = 0;
	}

	public Produto() {
		this.id = cont++;
		this.carro = 0;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return Descricao;
	}

	public void setDescricao(String descricao) {
		Descricao = descricao;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public static int getCont() {
		return cont;
	}

	public static void setCont(int cont) {
		Produto.cont = cont;
	}

	public int getCarro() {
		return carro;
	}

	public void setCarro(int carro) {
		this.carro = carro;
	}

	public void incrementaEstoque() {
		this.estoque++;
	}

	public void diminuiEstoque() {
		this.estoque--;
	}

	public void aumentaCarro() {
		this.carro++;
	}

	public void diminuiCarro() {
		this.carro--;
	}
}