package test;

import com.devcaotics.model.Livro;
import com.devcaotics.model.Pedido;
import com.devcaotics.model.Usuario;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;

public class PedidoTest {

    private Pedido pedido;
    private Usuario usuario;
    private Livro livro;
    private String[] boleto;

    @Before
    public void setup() {
        usuario = new Usuario();
        livro = new Livro();
        boleto = new String[]{"1234567890"};
        pedido = new Pedido(usuario, livro, boleto);
    }

    @Test
    public void testSetAndGetId() {
        long id = 1;
        pedido.setId(id);
        Assert.assertEquals(id, pedido.getId());
    }

    @Test
    public void testSetAndGetUser() {
        Usuario user = new Usuario();
        pedido.setUser(user);
        Assert.assertEquals(user, pedido.getUser());
    }

    @Test
    public void testIsSetAndIsPago() {
        boolean pago = true;
        pedido.setPago(pago);
        Assert.assertTrue(pedido.isPago());
    }

    @Test
    public void testSetAndGetBoleto() {
        String[] boleto = new String[]{"1234567890", "0987654321"};
        pedido.setBoleto(boleto);
        Assert.assertArrayEquals(boleto, pedido.getBoleto());
    }

    @Test
    public void testSetAndGetLivro() {
        Livro livro = new Livro();
        pedido.setLivro(livro);
        Assert.assertEquals(livro, pedido.getLivro());
    }

    @Test
    public void testConstructor() {
        Assert.assertNotNull(pedido);
        Assert.assertEquals(usuario, pedido.getUser());
        Assert.assertEquals(livro, pedido.getLivro());
        Assert.assertArrayEquals(boleto, pedido.getBoleto());
    }
}
