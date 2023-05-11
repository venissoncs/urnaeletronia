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
public class Mesario extends Eleitor {
    private String matricula;
    private String senha;
    
    public Mesario(String nome, String tituloEleitor, String matricula, String senha) {
        super(nome, tituloEleitor);
        this.matricula = matricula;
        this.senha = senha;
    }
    public Mesario(){
        throw new UnsupportedOperationException("Not support yet.");
        
    }
    public String getMatricula() {
        return matricula;
    }
    public String getSenha() {
        return senha;
    }
}
