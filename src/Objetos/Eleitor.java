package Objetos;
import interfaces.ValidarEleitor;

/**
 * A classe "Eleitor" implementa a interface "ValidarEleitor"
 *
 * @author Kaylane
 */
public class Eleitor implements ValidarEleitor {
    
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

    public boolean validarEleitor(String nome, String tituloEleitoral) {
        if (nome.isEmpty() || tituloEleitoral.length() != 10) {
            return false;
        }
        try {
            Integer.parseInt(tituloEleitoral);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}