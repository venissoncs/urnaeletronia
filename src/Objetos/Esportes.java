package Objetos;
/**
 * Classe abstrata Esportes
 *
 * @author Kaylane
 */
public abstract class Esportes {
    
    private String nome;
    private int votos;

    public Esportes (String nome) {
        this.nome = nome;
        this.votos = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getVotos() {
        return votos;
    }

    public void adicionarVoto() {
        votos++;
    }
}
