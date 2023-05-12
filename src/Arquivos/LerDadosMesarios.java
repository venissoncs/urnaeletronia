/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arquivos;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import objetos.Mesario;

/**
 *
 * @author Vênisson Cardoso
 */

public class LerDadosMesarios {
    public static ArrayList<Mesario> lerMesarios(String nameArquivo){
        ArrayList<Mesario> mesarios = new ArrayList<>();
        BufferedReader br = null;
        
        try {
            br = new BufferedReader(new FileReader(nameArquivo));
            String linha = br.readLine();
            while (linha != null) {
                String[] dados = linha.split(";");
                if (dados.length >=4){
                    String nome = dados[0];
                    String titulo = dados[1];
                    String matricula = dados[2];
                    String senha = dados[3];
                    Mesario mesario = new Mesario(nome, titulo, matricula, senha);
                    mesarios.add(mesario);
                }                
                linha = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    System.out.println("Erro ao fechar o arquivo.");
                    e.printStackTrace();
                }
            }
        }
        return mesarios;
    }
}