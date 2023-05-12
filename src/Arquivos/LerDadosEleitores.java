/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arquivos;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import objetos.Eleitor;

/**
 *
 * @author venis
 */
public class LerDadosEleitores {
    public static ArrayList<Eleitor> lerEleitores(String nameArquivo) {
        ArrayList<Eleitor> eleitores = new ArrayList<>();
        BufferedReader br = null;
        
        try {
            br = new BufferedReader(new FileReader(nameArquivo));
            String linha = br.readLine();
            while (linha != null) {
                String[] dados = linha.split(";");
                String nome = dados[0];
                String titulo = dados[1];
                Eleitor eleitor = new Eleitor(nome, titulo);
                eleitores.add(eleitor);
                linha = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    System.out.println("Erro ao fechar ao arquivo");
                    e.printStackTrace();
                }
            }
        }
        return eleitores;
    }
}
