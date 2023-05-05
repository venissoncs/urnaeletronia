package Objetos;


/**
 * 
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

    public Eleitor() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNome() {
        return nome;
    }

    public int getTituloEleitor() {
        return tituloEleitor;
    }
}