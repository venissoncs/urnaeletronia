package Arquivos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Kaylane


import Objetos.Eleitor;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

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
                String titulo = Integer.parseInt(dados[1]);
                Eleitor eleitor = new Eleitor(nome, titulo);
                eleitores.add(eleitor);
                linha = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo " + nameArquivo);
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    System.out.println("Erro ao fechar o arquivo " + nameArquivo);
                    e.printStackTrace();
                }
            }
        }
        return eleitores;
    }
}
 */
import Objetos.Eleitor;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

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
                    System.out.println("Erro ao fechar o arquivo: " + nameArquivo);
                    e.printStackTrace();
                }
            }   
        }   
        return eleitores;
    }
}