package com.devcaotics.model;

import com.devcaotics.model.Livro;
import com.devcaotics.model.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-05-10T18:07:13")
@StaticMetamodel(Cobranca.class)
public class Cobranca_ { 

    public static volatile SingularAttribute<Cobranca, Boolean> isPago;
    public static volatile SingularAttribute<Cobranca, Livro> livro;
    public static volatile SingularAttribute<Cobranca, Double> valor;
    public static volatile SingularAttribute<Cobranca, Usuario> comprador;
    public static volatile SingularAttribute<Cobranca, Long> id;

}