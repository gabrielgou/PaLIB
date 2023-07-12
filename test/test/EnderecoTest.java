package test;

import com.devcaotics.model.Endereco;
import com.devcaotics.model.Usuario;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EnderecoTest {

    private Endereco endereco;

    @Before
    public void setup() {
        endereco = new Endereco();
    }

    @Test
    public void testSetAndGetId() {
        long id = 1;
        endereco.setId(id);
        Assert.assertEquals(id, endereco.getId());
    }

    @Test
    public void testSetAndGetNome() {
        String nome = "Rua A";
        endereco.setNome(nome);
        Assert.assertEquals(nome, endereco.getNome());
    }

    @Test
    public void testSetAndGetNumero() {
        String numero = "123";
        endereco.setNumero(numero);
        Assert.assertEquals(numero, endereco.getNumero());
    }

    @Test
    public void testSetAndGetBairro() {
        String bairro = "Centro";
        endereco.setBairro(bairro);
        Assert.assertEquals(bairro, endereco.getBairro());
    }

    @Test
    public void testSetAndGetCidade() {
        String cidade = "São Paulo";
        endereco.setCidade(cidade);
        Assert.assertEquals(cidade, endereco.getCidade());
    }

    @Test
    public void testSetAndGetUf() {
        String uf = "SP";
        endereco.setUf(uf);
        Assert.assertEquals(uf, endereco.getUf());
    }

    @Test
    public void testSetAndGetCep() {
        String cep = "12345678";
        endereco.setCep(cep);
        Assert.assertEquals(cep, endereco.getCep());
    }

    @Test
    public void testSetAndGetUser() {
        Usuario user = new Usuario();
        endereco.setUser(user);
        Assert.assertEquals(user, endereco.getUser());
    }

    @Test
    public void testToString() {
        endereco.setId(1);
        endereco.setNome("Rua A");
        endereco.setNumero("123");
        endereco.setBairro("Centro");
        endereco.setCidade("São Paulo");
        endereco.setUf("SP");
        endereco.setCep("12345678");
        Usuario user = new Usuario();
        endereco.setUser(user);

        String expectedString = "Endereco{id=1, nome=Rua A, numero=123, bairro=Centro, cidade=São Paulo, uf=SP, cep=12345678}";
        Assert.assertEquals(expectedString, endereco.toString());
    }
}
