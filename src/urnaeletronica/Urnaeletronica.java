/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package urnaeletronica;
import java.util.ArrayList;
import Objetos.Eleitor;
import Arquivos.*;
/**
 *
 * @author Vênisson Cardoso
 */
public class Urnaeletronica {
    public static void main(String[] args) {
        ArrayList<Eleitor> eleitores = LerDadosEleitores.lerEleitores("eleitores.txt");

        for (Eleitor eleitor : eleitores) {
            System.out.println("Nome: " + eleitor.getNome() + ", Tìtulo: " + eleitor.getTituloEleitor());
        }

    }

}
