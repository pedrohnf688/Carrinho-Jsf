import java.util.ArrayList;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.component.html.HtmlCommandButton;

@ManagedBean
@ApplicationScoped
public class Loja {

	ArrayList<Produto> listaCarrinho = new ArrayList<Produto>();
	private Produto produto = new Produto();

	public Loja() {

		produto = new Produto();

		Produto p1 = new Produto(1, 2, "Pipoca", "Salgada", 20);
		Produto p2 = new Produto(2, 1, "Salgado", "Variados", 15);
		Produto p3 = new Produto(3, 5, "Refrigerante", "Coca-Cola", 30);

		listaCarrinho.add(p1);
		listaCarrinho.add(p2);
		listaCarrinho.add(p3);

	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public ArrayList<Produto> getListaCarrinho() {
		return listaCarrinho;
	}

	public void setListaCarrinho(ArrayList<Produto> listaCarrinho) {
		this.listaCarrinho = listaCarrinho;
	}

	public void CadastrarProduto() {
		if (!listaCarrinho.contains(produto)) {
			listaCarrinho.add(produto);
			produto = new Produto();

		}

	}
}
