/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arquivos;
import java.io.File;
/**
 *
 * @author Vênisson Cardoso
 */
public class UsoEscritor {
      public static void escreverArquivo() {
          File arquivo = new File("arquivo.txt");
          String texto = "Isto é o esboço dessa classe";
          
          Escritor.escrever(arquivo, texto);
    }
    
}
