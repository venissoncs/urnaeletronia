/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacegrafica;

/**
 *
 * @author Kaylane
 */
import arquivos.LerDadosMesarios;
import objetos.Eleitor;
import objetos.Mesario;
import interfaces.ValidarEleitor;
import interfaces.ValidarMesario;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TelaValidacao extends JFrame {
    private ValidarEleitor validarEleitor;
    private ValidarMesario validarMesario;

    private JLabel lblNome;
    private JTextField txtNome;

    private JLabel lblTitulo;
    private JTextField txtTitulo;

    private JLabel lblMatricula;
    private JTextField txtMatricula;

    private JLabel lblSenha;
    private JTextField txtSenha;

    private JButton btnValidar;
    private JLabel lblResultado;

    public TelaValidacao() {
        // Cria os objetos para validar o eleitor e o mesário
        validarEleitor = (ValidarEleitor) new Eleitor();
        validarMesario = new Mesario(new LerDadosMesarios());

        // Configura a janela
        setTitle("Validação de Eleitor pelo Mesário");
        setSize(400, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Cria os componentes da interface
        lblNome = new JLabel("Nome:");
        txtNome = new JTextField(20);

        lblTitulo = new JLabel("Título Eleitoral:");
        txtTitulo = new JTextField(20);

        lblMatricula = new JLabel("Matrícula:");
        txtMatricula = new JTextField(20);

        lblSenha = new JLabel("Senha:");
        txtSenha = new JTextField(20);

        btnValidar = new JButton("Validar");
        btnValidar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                validarEleitorEMesario();
            }
        });

        lblResultado = new JLabel();

        // Adiciona os componentes à janela
        setLayout(new GridLayout(5, 2));
        add(lblNome);
        add(txtNome);
        add(lblTitulo);
        add(txtTitulo);
        add(lblMatricula);
        add(txtMatricula);
        add(lblSenha);
        add(txtSenha);
        add(btnValidar);
        add(lblResultado);

        // Exibe a janela
        setVisible(true);
    }

    private void validarEleitorEMesario() {
        // Realiza a validação do eleitor e do mesário
        boolean validacaoEleitor = validarEleitor.validarEleitor(txtNome.getText(), txtTitulo.getText());
        boolean validacaoMesario = validarMesario.validarMesario(txtNome.getText(), txtMatricula.getText(), txtSenha.getText());

        // Exibe o resultado da validação na interface
        if (validacaoEleitor && validacaoMesario) {
            lblResultado.setText("Eleitor validado com sucesso!");
        } else {
            lblResultado.setText("Falha na validação do eleitor.");
        }
    }
}