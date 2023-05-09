/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package urnaeletronica;

import java.util.ArrayList;
import arquivos.LerDadosEleitores;
import objetos.Eleitor;


/**
 *
 * @author Kaylane
 * @coauthor Vênisson Cardoso
 */
public class UrnaEletronica {
    public static void main(String[] args) {
        ArrayList<Eleitor> eleitores = LerDadosEleitores.lerEleitores("C:\\eleitores.txt");
        for (Eleitor eleitor : eleitores) {
            System.out.println("Nome: "+ eleitor.getNome() +", Titulo: " +eleitor.getTituloEleitor());
        }
        
        
    }
    
}
