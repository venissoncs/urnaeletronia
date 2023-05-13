/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;



/**
 *
 * @author Kaylane
 * @coauthor Vênisson Cardoso
 */
public class Mesario extends Individuos {
    private String matricula;
    private String senha;

    public Mesario(String nome, String matricula, String senha) {
        super(nome);
        this.matricula = matricula;
        this.senha = senha;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}

