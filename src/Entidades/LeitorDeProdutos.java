package Entidades;

import Entidades.Produto;
import Entidades.Fabricas.ProdutoFactory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LeitorDeProdutos {

    public static ArrayList<Produto> lerProdutos(String arquivo) {
        ArrayList<Produto> produtos = new ArrayList<>();
        try {
            List<String> linhas = Files.readAllLines(Paths.get(arquivo));
            for (String linha : linhas) {
                if (linha == null || linha.trim().isEmpty()) {
                    continue;
                }

                String[] partes = linha.split(",");
                Map<String, String> parametros = new HashMap<>();

                String tipo = partes[0];
                parametros.put("tipo", tipo);

                for (int i = 1; i < partes.length; i++) {
                    parametros.put("param" + i, partes[i]);
                }

                Produto produto = ProdutoFactory.criarProduto(parametros);
                produtos.add(produto);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return produtos;
    }

    @Override
    public String toString() {
        return "LeitorDeProdutos{}";
    }
}
