/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package urnaeletronica;

import java.util.ArrayList;
import arquivos.LerDadosMesarios;
import arquivos.LerDadosEleitores;
import objetos.Mesario;
import objetos.Eleitor;


/**
 *
 * @author Kaylane
 * @coauthor Vênisson Cardoso
 */
public class UrnaEletronica {
    public static void main(String[] args) {
        ArrayList<Mesario> mesarios = LerDadosMesarios.lerMesarios("C:\\mesario.txt");
        for (Mesario mesario : mesarios) {
            System.out.println("Nome: "+ mesario.getNome()+", Titulo: "+mesario.getTituloEleitor()+", Matricula: "+mesario.getMatricula()+", Senha: "+mesario.getSenha());
        }
    }
}
