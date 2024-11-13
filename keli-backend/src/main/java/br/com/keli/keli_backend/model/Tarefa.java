package br.com.keli.keli_backend.model;

import java.sql.Time;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "tarefa")
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private Comodo comodo;

    @NotNull
    private String nome;

    private String descricao;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Materiais materiais;

    private Time duracao;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Prioridade prioridade;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Status status;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Dificuldade dificuldade;

    public Tarefa() {}

    public Tarefa(Comodo comodo, String nome, String descricao, Materiais materiais, Time duracao, Prioridade prioridade, Status status, Dificuldade dificuldade) {
        this.comodo = comodo;
        this.nome = nome;
        this.descricao = descricao;
        this.materiais = materiais;
        this.duracao = duracao;
        this.prioridade = prioridade;
        this.status = status;
        this.dificuldade = dificuldade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Comodo getComodo() {
        return comodo;
    }

    public void setComodo(Comodo comodo) {    
        this.comodo = comodo;
    }    

    public String getNome() {
        return nome;
    }    

    public void setNome(String nome) {    
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Materiais getMateriais() {
        return materiais;    
    }

    public void setMateriais(Materiais materiais) {
        this.materiais = materiais;    
    }

    public Time getDuracao() {
        return duracao;
    }

    public void setDuracao(Time duracao) {
        this.duracao = duracao;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Prioridade prioridade) {
        this.prioridade = prioridade;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Dificuldade getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(Dificuldade dificuldade) {
        this.dificuldade = dificuldade;
    }
}