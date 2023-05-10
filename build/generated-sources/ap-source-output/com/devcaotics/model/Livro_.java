package com.devcaotics.model;

import com.devcaotics.model.Tag;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-05-10T18:07:13")
@StaticMetamodel(Livro.class)
public class Livro_ { 

    public static volatile SingularAttribute<Livro, String> sinopse;
    public static volatile SingularAttribute<Livro, Double> preco;
    public static volatile SingularAttribute<Livro, byte[]> capa;
    public static volatile SingularAttribute<Livro, String> categoria;
    public static volatile SingularAttribute<Livro, String> nome;
    public static volatile SingularAttribute<Livro, Long> id;
    public static volatile SingularAttribute<Livro, String> autor;
    public static volatile SingularAttribute<Livro, byte[]> content;
    public static volatile ListAttribute<Livro, Tag> tags;

}