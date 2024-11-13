package br.com.keli.keli_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "comodo")
public class Comodo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @NotNull
    private String nome;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Prioridade prioridade;

    @NotNull
    @Enumerated(EnumType.STRING)
    private TipoComodo tipoComodo;

    public Comodo() {}

    public Comodo(String nome, Prioridade prioridade, TipoComodo tipoComodo) {
        this.nome = nome;
        this.prioridade = prioridade;
        this.tipoComodo = tipoComodo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Prioridade prioridade) {
        this.prioridade = prioridade;
    }

    public TipoComodo getTipoComodo() {
        return tipoComodo;
    }

    public void setTipoComodo(TipoComodo tipoComodo) {
        this.tipoComodo = tipoComodo;
    }
}