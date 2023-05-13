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
public class Eleitor extends Individuos {
    private String tituloEleitor;

    public Eleitor(Individuos individuo, String tituloEleitor) {
        super(individuo.getNome());
        this.tituloEleitor = tituloEleitor;
    }

    public String getTituloEleitor() {
        return tituloEleitor;
    }

    public void setTituloEleitor(String tituloEleitor) {
        this.tituloEleitor = tituloEleitor;
    }
    
    @Override
    public String getDados() {
        return super.getDados() + " - " + tituloEleitor;
    }
}
