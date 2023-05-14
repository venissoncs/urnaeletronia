/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arquivos;

/**
 *
 * @author Kaylane
 */
import objetos.Esportes;
import objetos.Eleitor;
import objetos.Mesario;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class LeituraArquivo {
    public static List<Eleitor> lerEleitores(File arquivo) throws IOException {
        List<Eleitor> eleitores = new ArrayList<>();
        
        BufferedReader leitor = new BufferedReader(new FileReader(arquivo));
        String linha;
        while ((linha = leitor.readLine()) != null) {
            String[] campos = linha.split(";");
            String nome = campos[0];
            String tituloEleitor = campos[1];
            Eleitor eleitor = new Eleitor(nome, tituloEleitor);
            eleitores.add(eleitor);
        }
        leitor.close();
        
        return eleitores;
    }
    
    public static List<Esportes> lerEsportes(File arquivo) throws IOException {
        List<Esportes> esportes = new ArrayList<>();
        
        BufferedReader leitor = new BufferedReader(new FileReader(arquivo));
        String linha;
        while ((linha = leitor.readLine()) != null) {
            String[] campos = linha.split(";");
            String nome = campos[0];
            int numero = Integer.parseInt(campos[1]);
            Esportes esportes = new Esportes(nome, numero);
            esportes.add(esportes);
        }
        leitor.close();
        
        return esportes;
    }
    
    public static List<Mesario> lerMesarios(File arquivo) throws IOException {
        List<Mesario> mesarios = new ArrayList<>();
        
        BufferedReader leitor = new BufferedReader(new FileReader(arquivo));
        String linha;
        while ((linha = leitor.readLine()) != null) {
            String[] campos = linha.split(";");
            String nome = campos[0];
            String matricula = campos[1];
            String senha = campos[2];
            Mesario mesario = new Mesario(nome, matricula, senha);
            mesarios.add(mesario);
        }
        leitor.close();
        
        return mesarios;
    }

    public static ArrayList<Mesario> lerMesarios(String cmesariotxt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
   