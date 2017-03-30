package br.com.fiap.pizzaria;

/**
 * Created by logonrm on 09/03/2017.
 */

public class PizzaBean {

    private String sabor;
    private double preco;
    private int imagem;

    public PizzaBean(){}

    public PizzaBean(String sabor, double preco, int imagem) {
        this.sabor = sabor;
        this.preco = preco;
        this.imagem = imagem;
    }

    public String getSabor() {
        return sabor;
    }

    public double getPreco() {
        return preco;
    }

    public int getImagem() {
        return imagem;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    @Override
    public String toString() {
        return "PizzaBean{" +
                "sabor='" + sabor + '\'' +
                ", preco=" + preco +
                ", imagem=" + imagem +
                '}';
    }
}
