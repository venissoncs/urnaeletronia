/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Kaylane
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LerDadosEleitores {
    public static void main(String[] args) {
        String nomeArquivo = "eleitores.txt";
        ArrayList<Eleitor> eleitores = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha = br.readLine();
            while (linha != null) {
                String[] dados = linha.split(";");
                String nome = dados[0];
                int titulo = Integer.parseInt(dados[1]);
                Eleitor eleitor = new Eleitor(nome, titulo);
                eleitores.add(eleitor);
                linha = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo " + nomeArquivo);
            e.printStackTrace();
        }
    }