/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package urnaeletronica;

import java.util.ArrayList;
import Arquivos.LeituraArquivo;
import Objetos.Mesario;


/**
 *
 * @author Kaylane
 * @coauthor Vênisson Cardoso
 */
public class UrnaEletronica {
    public static void main(String[] args) {
        ArrayList<Mesario> mesarios = LeituraArquivo.lerMesarios("C:\\mesario.txt");
        for (Mesario mesario : mesarios) {
            System.out.println("Nome: "+ mesario.getNome()+", Matricula: "+mesario.getMatricula()+", Senha: "+mesario.getSenha());
        }
    }
}
