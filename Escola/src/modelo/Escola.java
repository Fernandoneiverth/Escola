/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Administrador
 */
public class Escola {
    private int codigo;
private int nralunos;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
private double area;

    public int getNralunos() {
        return nralunos;
    }

    public void setNralunos(int nralunos) {
        this.nralunos = nralunos;
    }
    @Override
    public String toString() {
        return nome;
    }
    private String nome;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    private String sigla;
    private String endereco;
}
