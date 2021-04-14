package com.produtos.apirest.model;


import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    @ManyToOne
    private Categoria categoria;
    private BigDecimal valorCompra;
    private BigDecimal valorVenda;
    private String tamanho;
    private String cor;

}
