/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacegrafica;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import objetos.Mesario;

/**
 *
 * @author Kaylane
 */
public class LoginPanel extends JPanel {

    private Object loginButton;
    // Componentes de interface gráfica omitidos
    
    private JLabel matriculaLabel;
    private JTextField matriculaField;
    private JLabel senhaLabel;
    private JPasswordField senhaField;
    private final JButton loginButton;
    
    public LoginPanel() {
        // Configurações do painel
        setLayout(new BorderLayout());
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        
        // Componentes de interface gráfica
        JPanel formPanel = new JPanel(new GridLayout(2, 2, 10, 10));
        matriculaLabel = new JLabel("Matrícula:");
        formPanel.add(matriculaLabel);
        matriculaField = new JTextField(10);
        formPanel.add(matriculaField);
        senhaLabel = new JLabel("Senha:");
        formPanel.add(senhaLabel);
        senhaField = new JPasswordField(10);
        formPanel.add(senhaField);
        add(formPanel, BorderLayout.CENTER);
        
        loginButton = new JButton("Entrar");
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        buttonPanel.add(loginButton);
        add(buttonPanel, BorderLayout.SOUTH);        // Configurações do painel omitidas
        
        // Adiciona um ouvinte de ação ao botão de login
        loginButton.addActionListener(new ActionListener() {
            private Object matriculaField;
            private Object senhaField;
            @Override
            public void actionPerformed(ActionEvent e) {
                // Cria um objeto Mesario com as informações fornecidas
                Mesario mesario = new Mesario("", "", matriculaField.getMatricula(), new String(senhaField.getSenha()));
                
                // Verifica as credenciais do mesário
                if (logar(mesario)) {
                    // Login bem-sucedido
                    JOptionPane.showMessageDialog(LoginPanel.this, "Login bem-sucedido!");
                } else {
                    // Login mal-sucedido
                    JOptionPane.showMessageDialog(LoginPanel.this, "Matrícula ou senha inválida.");
                }
            }
        });
    }
    
    // Implementa a interface Login
    public boolean logar(Mesario mesario) {
        // Abre o arquivo de mesários para verificar as credenciais
        try (Scanner scanner = new Scanner(new File("mesario.txt"))) {
            while (scanner.hasNextLine()) {
                // Lê uma linha do arquivo e divide em nome, título de eleitor, matrícula e senha
                String[] tokens = scanner.nextLine().split("; ");
                String nome = tokens[0];
                String tituloEleitor = tokens[1];
                String matricula = tokens[2];
                String senha = tokens[3];
                
                // Verifica se as credenciais correspondem ao mesário
                if (mesario.getMatricula().equals(matricula) && mesario.getSenha().equals(senha)) {
                    return true;
                }
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        
        return false;
    }
}