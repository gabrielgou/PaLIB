package com.devcaotics.model;

import com.devcaotics.model.Livro;
import com.devcaotics.model.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-05-31T09:31:11")
@StaticMetamodel(Pedido.class)
public class Pedido_ { 

    public static volatile SingularAttribute<Pedido, Livro> livro;
    public static volatile SingularAttribute<Pedido, String[]> boleto;
    public static volatile SingularAttribute<Pedido, Long> id;
    public static volatile SingularAttribute<Pedido, Usuario> user;
    public static volatile SingularAttribute<Pedido, Boolean> pago;

}