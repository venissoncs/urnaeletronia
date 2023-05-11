/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Arquivos;
import java.util.ArrayList;
import Objetos.Eleitor;
<<<<<<< HEAD

=======
import Arquivos.LerDadosEleitores;
>>>>>>> 841aeee1e509115f4f9691d9664db7501dafdb3d
/**
 *
 * @author Vênisson Cardoso
 */
public class Urnaeletronica {
    public static void main(String[] args) {
<<<<<<< HEAD
        ArrayList<Eleitor> eleitores = LerDadosEleitores.lerEleitores("./eleitores.txt");
=======
        ArrayList<Eleitor> eleitores = LerDadosEleitores.lerEleitores("C:\\eleitores.txt");
>>>>>>> 841aeee1e509115f4f9691d9664db7501dafdb3d

        for (Eleitor eleitor : eleitores){
            System.out.println("Nome: " + eleitor.getNome() + ", Título: " + eleitor.getTituloEleitor());
        }

    }

}
