package br.com.keli.keli_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "usuario")
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private String email;

    @NotNull
    private String senha;

    @NotNull
    private String nome;

    private FotoUsuario fotoUsuario;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }    

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {    
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public FotoUsuario getFotoUsuario() {
        return fotoUsuario;
    }

    public void setFotoUsuario(FotoUsuario fotoUsuario) {
        this.fotoUsuario = fotoUsuario;
    }
}