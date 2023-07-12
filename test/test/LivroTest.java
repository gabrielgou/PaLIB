package test;

import com.devcaotics.model.Avaliacao;
import com.devcaotics.model.Livro;
import com.devcaotics.model.Tag;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class LivroTest {

    private Livro livro;

    @Before
    public void setup() {
        livro = new Livro();
    }

    @Test
    public void testSetAndGetId() {
        long id = 1;
        livro.setId(id);
        Assert.assertEquals(id, livro.getId());
    }

    @Test
    public void testSetAndGetNome() {
        String nome = "O Senhor dos Anéis";
        livro.setNome(nome);
        Assert.assertEquals(nome, livro.getNome());
    }

    @Test
    public void testSetAndGetAutor() {
        String autor = "J.R.R. Tolkien";
        livro.setAutor(autor);
        Assert.assertEquals(autor, livro.getAutor());
    }

    @Test
    public void testSetAndGetCategoria() {
        String categoria = "Fantasia";
        livro.setCategoria(categoria);
        Assert.assertEquals(categoria, livro.getCategoria());
    }

    @Test
    public void testSetAndGetTags() {
        List<Tag> tags = new ArrayList<>();
        Tag tag1 = new Tag();
        Tag tag2 = new Tag();
        tag1.setNome("Aventura");
        tag2.setNome("Épico");
        tags.add(tag1);
        tags.add(tag2);
        livro.setTags(tags);
        Assert.assertEquals(tags, livro.getTags());
        Assert.assertEquals(2, livro.getTags().size());
    }

    @Test
    public void testAddTags() {
        Tag tag1 = new Tag();
        Tag tag2 = new Tag();
        tag1.setNome("Aventura");
        tag2.setNome("Épico");
        livro.addTags(tag1);
        livro.addTags(tag2);
        Assert.assertEquals(2, livro.getTags().size());
    }

    @Test
    public void testSetAndGetPDF() {
        byte[] pdf = new byte[]{0x01, 0x02, 0x03};
        livro.setPDF(pdf);
        Assert.assertArrayEquals(pdf, livro.getPDF());
    }

    @Test
    public void testSetAndGetCapa() {
        byte[] capa = new byte[]{0x04, 0x05, 0x06};
        livro.setCapa(capa);
        Assert.assertArrayEquals(capa, livro.getCapa());
    }

    @Test
    public void testSetAndGetSinopse() {
        String sinopse = "Uma história épica de aventuras em um mundo fantástico.";
        livro.setSinopse(sinopse);
        Assert.assertEquals(sinopse, livro.getSinopse());
    }

    @Test
    public void testSetAndGetPreco() {
        double preco = 29.99;
        livro.setPreco(preco);
        Assert.assertEquals(preco, livro.getPreco(), 0.01);
    }

    @Test
    public void testSetAndGetAvaliacao() {
        List<Avaliacao> avaliacoes = new ArrayList<>();
        Avaliacao avaliacao1 = new Avaliacao();
        Avaliacao avaliacao2 = new Avaliacao();
        avaliacoes.add(avaliacao1);
        avaliacoes.add(avaliacao2);
        livro.setAvaliacao(avaliacoes);
        Assert.assertEquals(avaliacoes, livro.getAvaliacao());
        Assert.assertEquals(2, livro.getAvaliacao().size());
    }

    @Test
    public void testMediaRating() {
        List<Avaliacao> avaliacoes = new ArrayList<>();
        Avaliacao avaliacao1 = new Avaliacao();
        avaliacao1.setRating(4);
        Avaliacao avaliacao2 = new Avaliacao();
        avaliacao2.setRating(5);
        avaliacoes.add(avaliacao1);
        avaliacoes.add(avaliacao2);
        livro.setAvaliacao(avaliacoes);
        Assert.assertEquals((4+5)/2, livro.mediaRating(), 0.01);
    }

    @Test
    public void testFloatRating() {
        List<Avaliacao> avaliacoes = new ArrayList<>();
        Avaliacao avaliacao1 = new Avaliacao();
        avaliacao1.setRating(4);
        Avaliacao avaliacao2 = new Avaliacao();
        avaliacao2.setRating(5);
        avaliacoes.add(avaliacao1);
        avaliacoes.add(avaliacao2);
        livro.setAvaliacao(avaliacoes);
        Assert.assertEquals(4.5f, livro.floatRating(), 0.01);
    }
}
