/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author Kaylane
 * @coauthor Vênisson Cardoso
 */
public class Eleitor {
    private String nome;
    private String tituloEleitor;
    
    public Eleitor(String nome, String tituloEleitor) {
        this.nome = nome;
        this.tituloEleitor = tituloEleitor;
    }
    public Eleitor() {
        throw new UnsupportedOperationException("Not support yet.");
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getTituloEleitor() {
        return tituloEleitor;
    }
}
