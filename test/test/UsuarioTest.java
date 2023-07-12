/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.devcaotics.model.Avaliacao;
import com.devcaotics.model.Endereco;
import com.devcaotics.model.Livro;
import com.devcaotics.model.Usuario;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UsuarioTest {

    private Usuario usuario;

    @Before
    public void setup() {
        usuario = new Usuario();
    }

    @Test
    public void testSetAndGetId() {
        long id = 1;
        usuario.setId(id);
        Assert.assertEquals(id, usuario.getId());
    }

    @Test
    public void testSetAndGetDataNasc() {
        Date dataNasc = new Date();
        usuario.setDataNasc(dataNasc);
        Assert.assertEquals(dataNasc, usuario.getDataNasc());
    }

    @Test
    public void testSetAndGetSenha() {
        String senha = "senha123";
        usuario.setSenha(senha);
        Assert.assertEquals(senha, usuario.getSenha());
    }

    @Test
    public void testSetAndGetNome() {
        String nome = "João";
        usuario.setNome(nome);
        Assert.assertEquals(nome, usuario.getNome());
    }

    @Test
    public void testSetAndGetEndereco() {
        Endereco endereco = new Endereco();
        usuario.setEndereco(endereco);
        Assert.assertEquals(endereco, usuario.getEndereco());
    }

    @Test
    public void testSetAndGetTelefone() {
        String telefone = "1234567890";
        usuario.setTelefone(telefone);
        Assert.assertEquals(telefone, usuario.getTelefone());
    }

    @Test
    public void testSetAndGetCpf() {
        String cpf = "123456789";
        usuario.setCpf(cpf);
        Assert.assertEquals(cpf, usuario.getCpf());
    }

    @Test
    public void testSetAndGetLivros() {
        List<Livro> livros = new ArrayList<>();
        Livro livro1 = new Livro();
        Livro livro2 = new Livro();
        livros.add(livro1);
        livros.add(livro2);
        usuario.setLivros(livros);
        Assert.assertEquals(livros, usuario.getLivros());
        Assert.assertEquals(2, usuario.getLivros().size());
    }

    @Test
    public void testSetAndGetAvaliacao() {
        List<Avaliacao> avaliacoes = new ArrayList<>();
        Avaliacao avaliacao1 = new Avaliacao();
        Avaliacao avaliacao2 = new Avaliacao();
        avaliacoes.add(avaliacao1);
        avaliacoes.add(avaliacao2);
        usuario.setAvaliacao(avaliacoes);
        Assert.assertEquals(avaliacoes, usuario.getAvaliacao());
        Assert.assertEquals(2, usuario.getAvaliacao().size());
    }

    @Test
    public void testDefaultConstructor() {
        Usuario usuario = new Usuario();
        Assert.assertNotNull(usuario.getEndereco());
    }

    @Test
    public void testEqualsAndHashCode() {
        Usuario usuario1 = new Usuario();
        usuario1.setId(1);
        Usuario usuario2 = new Usuario();
        usuario2.setId(1);
        Usuario usuario3 = new Usuario();
        usuario3.setId(2);

        Assert.assertEquals(usuario1, usuario2);
        Assert.assertEquals(usuario1.hashCode(), usuario2.hashCode());

        Assert.assertNotEquals(usuario1, usuario3);
        Assert.assertNotEquals(usuario1.hashCode(), usuario3.hashCode());
    }

    @Test
    public void testToString() {
        Usuario usuario = new Usuario();
        usuario.setId(1);
        usuario.setNome("João");
        usuario.setCpf("1234567890");

        String expectedString = "Usuario{id=1, cpf=1234567890, nome=João}";
        Assert.assertEquals(expectedString, usuario.toString());
    }
}
