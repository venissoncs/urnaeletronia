/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Kaylane
 */
public class Eleitor {
    
    private String nome;
    private int tituloEleitor;

    public Eleitor(String nome, int tituloEleitor) {
        this.nome = nome;
        this.tituloEleitor = tituloEleitor;
    }

    public String getNome() {
        return nome;
    }

    public int getTituloEleitor() {
        return tituloEleitor;
    }
}