package br.com.fiap.votacao;

/**
 * Created by logonrm on 30/03/2017.
 */

public class Candidato {

    private String nome;
    private String partido;
    private Cargo cargo;

    public Candidato() {}

    public Candidato(String nome, String partido, Cargo cargo) {
        this.nome = nome;
        this.partido = partido;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
}
