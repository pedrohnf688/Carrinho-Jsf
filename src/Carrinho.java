import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;



@ManagedBean
@SessionScoped
public class Carrinho {

	ArrayList<Produto> produtos = new ArrayList<Produto>();
	Produto produto;

	public Carrinho() {
	
	}

	public ArrayList<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}

	public Produto getProduto(int id) {
		Produto mp = null;
		for (Produto p : produtos) {
			if (p.getId() == id) {
				return p;
			}
		}
		return mp;
	}

	public void removeProduto(int id) {
		Produto p = getProduto(id);
		if (p.getCarro() > 1) {
			p.incrementaEstoque();
			p.setCarro(p.getCarro() - 1);
		} else {
			produtos.remove(p);
			p.incrementaEstoque();
		}

	}

	public void addProduto(Produto p) {
		if (getProduto(p.getId()) != null) {
			p.diminuiEstoque();
			p.setCarro(p.getCarro() + 1);
		} else {
			if (p.getEstoque() > 0) {
				produtos.add(p);
				p.diminuiEstoque();
				p.setCarro(1);
			}
		}
	}
	
	public void FinalizarCompra(){
		produtos.removeAll(produtos);
	}

}
