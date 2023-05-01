package Arquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author Vênisson Cardoso
 */

public class Escritor{
    public static void escrever(File arquivo, String texto){
        try {
            FileWriter escritor = new FileWriter(arquivo);
            char[] caracter = texto.toCharArray();
            for(int contador = 0; contador<caracter.length; contador++){
                escritor.write(caracter[contador]);
            }
            escritor.close();
        } catch(IOException e) {
            e.printStackTrace();
            System.out.println("Não foi possível escrever o arquivo....");
        }
    }
}