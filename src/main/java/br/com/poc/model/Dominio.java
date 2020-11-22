package br.com.poc.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
@IdClass(DominioId.class)
public class Dominio implements Serializable {

    @Id
    @Column(length = 50, nullable = false)
    private String chave;

    @Id
    @Column(length = 50, nullable = false)
    private String valor;

    @Column(nullable = false)
    private Date vigencia;

    @Column(length = 100, nullable = false)
    private String nome;

    @Column(length = 255)
    private String descricao;

    @Column
    private boolean obrigatorio;

    @Column(nullable = false, updatable = false)
    @CreationTimestamp
    private LocalDateTime inserido;
}
