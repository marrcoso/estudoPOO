package entities;

import java.util.ArrayList;
import java.util.List;

public class Repositorio {
    private List<Produto> produtos = new ArrayList<>();
    private Produto Produto;

    public void adicionarProduto(){
        produtos.add(Produto);
    }

    public void removerProdutoPorId(String codigo){
        for (Produto produto : produtos){
            if (codigo.equalsIgnoreCase(produto.getCodigo())){
                produtos.remove(Produto);
            }
        }
    }

    public Produto buscarPorId(String codigo){
        for (Produto produto : produtos){
            if (codigo.equalsIgnoreCase(produto.getCodigo())) {
                return Produto;
            }
        }
        return null;
    }


}
