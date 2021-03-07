package carrinho;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import produto.Produto;

public class CarrinhoTest {

    private Carrinho carro;

    @BeforeEach
    public void inicializa() {
        var item1 = new Produto("Tenis", 250.0);
        var item2 = new Produto("Calca", 90.0);
        var item3 = new Produto("blusa", 50.0);
        carro = new Carrinho();
        carro.addItem(item1);
        carro.addItem(item2);
        carro.addItem(item3);
    }
    @Test
    public void testEsvazia() {
        carro.esvazia();
        Assertions.assertEquals(carro.getQtdeItems(), 0.0);
    }

    @Test
    public void testValorTotal() {
        double valorTotal = 390.0;
        Assertions.assertEquals(valorTotal, carro.getValorTotal());
    }

    @Test
    public void testQtdItems() {
        int qtdItem = 3;
        Assertions.assertEquals(qtdItem, carro.getQtdeItems());
    }

}