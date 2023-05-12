/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author Kaylane
 */
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;

public class Hash {

    public static void main(String[] args) throws Exception {

        // Lista de arquivos a serem processados
        List<File> arquivos = new ArrayList<File>();
        arquivos.add(new File("Eleitor.java"));
        arquivos.add(new File("Mesario.java"));
        arquivos.add(new File("Esportes.java"));

        // Itera sobre a lista de arquivos e gera a hash para cada um
        for (File arquivo : arquivos) {
            // Carrega o arquivo de entrada
            FileInputStream fis = new FileInputStream(arquivo);

            // Cria o objeto de hash SHA256
            MessageDigest digest = MessageDigest.getInstance("SHA-256");

            // Lê o arquivo de entrada em blocos
            byte[] buffer = new byte[8192];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                // Alimenta o objeto de hash com os dados lidos
                digest.update(buffer, 0, bytesRead);
            }
            fis.close();

            // Gera a hash SHA256 em formato de string hexadecimal
            byte[] hashBytes = digest.digest();
            StringBuffer hexString = new StringBuffer();
            for (int i = 0; i < hashBytes.length; i++) {
                String hex = Integer.toHexString(0xff & hashBytes[i]);
                if (hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }
            String hash = hexString.toString();

            // Imprime a hash gerada
            System.out.println("Hash SHA256 do arquivo " + arquivo.getName() + ": " + hash);
        }
    }
}