/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

import interfaces.ValidarMesario;

/**
 *
 * @author Vênisson Cardoso
 */
public class Mesario implements ValidarMesario {
    private String nome;
    private int matricula;
    private int senha;

    public Mesario(String nome, int matricula, int senha_digitada) {
        this.nome = nome;
        this.matricula = matricula;
        this.senha = senha_digitada;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public int getSenhaDigitada() {
        return senha_digitada;
    }

    public boolean validarMesario(String nome, String matricula) {
        if (nome.isEmpty() || matricula.length() != 4 || senha_digitada != senha) {
            return false;
        }
        try {
            Integer.parseInt(matricula);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
