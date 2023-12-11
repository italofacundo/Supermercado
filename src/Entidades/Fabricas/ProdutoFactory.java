package Entidades.Fabricas;
import Entidades.Produto;
import Entidades.Produtos.Alimenticios.*;
import Entidades.Produtos.NaoAlimenticios.*;

import java.util.Map;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class ProdutoFactory {
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    public static Produto criarProduto(Map<String, String> parametros) throws ParseException {
        String tipo = parametros.get("tipo");

        switch (tipo.toLowerCase()) {
            case "bebida":
                return criarBebida(parametros);
            case "carne":
                return criarCarne(parametros);
            case "eletronico":
                return criarEletronico(parametros);
            case "limpeza":
                return criarLimpeza(parametros);
            case "utensilio":
                return criarUtensilio(parametros);
            default:
                throw new IllegalArgumentException("Tipo de produto desconhecido: " + tipo);
        }
    }

    // Bebida: nome, preco, quantidade, dataValidade, unidadeMedida, ehAlcoolica
    private static Bebida criarBebida(Map<String, String> parametros) throws ParseException {
        Date dataValidade = sdf.parse(parametros.get("param4"));
        boolean ehAlcoolica = Boolean.parseBoolean(parametros.get("param6"));
        return new Bebida(
                parametros.get("param1"),
                Double.parseDouble(parametros.get("param2")),
                Integer.parseInt(parametros.get("param3")),
                dataValidade,
                parametros.get("param5"),
                ehAlcoolica
        );
    }

    // nome, preco, quantidade, dataValidade, unidadeMedida, tipoCarne
    private static Carne criarCarne(Map<String, String> parametros) throws ParseException {
        Date dataValidade = sdf.parse(parametros.get("param4"));
        return new Carne(
                parametros.get("param1"),
                Double.parseDouble(parametros.get("param2")),
                Integer.parseInt(parametros.get("param3")),
                dataValidade,
                parametros.get("param5"),
                parametros.get("param6")
        );
    }

    // nome, preco, quantidade, garantiaMeses
    private static Eletronico criarEletronico(Map<String, String> parametros) {
        return new Eletronico(
                parametros.get("param1"),
                Double.parseDouble(parametros.get("param2")),
                Integer.parseInt(parametros.get("param3")),
                Integer.parseInt(parametros.get("param4"))
        );
    }

    // nome, preco, quantidade, localUso
    private static Limpeza criarLimpeza(Map<String, String> parametros) {
        return new Limpeza(
                parametros.get("param1"),
                Double.parseDouble(parametros.get("param2")),
                Integer.parseInt(parametros.get("param3")),
                parametros.get("param4")
        );
    }

    // nome, preco, quantidade, material
    private static Utensilio criarUtensilio(Map<String, String> parametros) {
        return new Utensilio(
                parametros.get("param1"),
                Double.parseDouble(parametros.get("param2")),
                Integer.parseInt(parametros.get("param3")),
                parametros.get("param4")
        );
    }
}
