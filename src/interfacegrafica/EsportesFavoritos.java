/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacegrafica;

/**
 *
 * @author Kaylane
 */
import objetos.Capoeira;
import objetos.Esportes;
import objetos.Futebol;
import objetos.Natacao;
import objetos.Skate;
import objetos.Volei;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EsportesFavoritos extends JFrame {
    
    private JCheckBox futebolCheckBox;
    private JCheckBox natacaoCheckBox;
    private JCheckBox capoeiraCheckBox;
    private JCheckBox skateCheckBox;
    private JCheckBox voleiCheckBox;
    private JButton votarButton;

    public EsportesFavoritos() {
        // Configurações da janela principal
        setTitle("Escolha seu esporte favorito");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Inicializa os componentes
        futebolCheckBox = new JCheckBox("Futebol");
        natacaoCheckBox = new JCheckBox("Natação");
        capoeiraCheckBox = new JCheckBox("Capoeira");
        skateCheckBox = new JCheckBox("Skate");
        voleiCheckBox = new JCheckBox("Vôlei");
        votarButton = new JButton("Votar");

        // Cria o painel para os esportes
        JPanel esportesPanel = new JPanel();
        esportesPanel.setLayout(new BoxLayout(esportesPanel, BoxLayout.PAGE_AXIS));
        esportesPanel.setBorder(BorderFactory.createTitledBorder("Escolha seu esporte favorito"));
        esportesPanel.add(futebolCheckBox);
        esportesPanel.add(natacaoCheckBox);
        esportesPanel.add(capoeiraCheckBox);
        esportesPanel.add(skateCheckBox);
        esportesPanel.add(voleiCheckBox);

        // Adiciona o botão de votar
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(votarButton);

        // Adiciona os painéis na janela principal
        setLayout(new BorderLayout());
        add(esportesPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        // Adiciona um listener para o botão de votar
        votarButton.addActionListener(new ActionListener() {
        boolean jaVotou = false;
        public void actionPerformed(ActionEvent e) {
        // Verifica se alguma caixa de seleção foi selecionada
        if (!futebolCheckBox.isSelected() && !natacaoCheckBox.isSelected() && !capoeiraCheckBox.isSelected() && !skateCheckBox.isSelected() && !voleiCheckBox.isSelected()) {
            JOptionPane.showMessageDialog(EsportesFavoritos.this, "Selecione pelo menos um esporte para votar.");
            return;
        }
        // Verifica se já houve um voto
        if (jaVotou) {
            JOptionPane.showMessageDialog(EsportesFavoritos.this, "Você já votou. Apenas um voto por pessoa é permitido.");
            return;
        }
        // Verifica quais caixas de seleção foram selecionadas
        if (futebolCheckBox.isSelected()) {
            Esportes futebol = new Futebol();
            futebol.adicionarVoto();
            jaVotou = true;
        }
        if (natacaoCheckBox.isSelected()) {
            Esportes natacao = new Natacao();
            natacao.adicionarVoto();
            jaVotou = true;
        }
        if (capoeiraCheckBox.isSelected()) {
            Esportes capoeira = new Capoeira();
            capoeira.adicionarVoto();
            jaVotou = true;
        }
        if (skateCheckBox.isSelected()) {
            Esportes skate = new Skate();
            skate.adicionarVoto();
            jaVotou = true;
        }
        if (voleiCheckBox.isSelected()) {
            Esportes volei = new Volei();
            volei.adicionarVoto();
            jaVotou = true;
        }
        // Exibe mensagem de confirmação
        JOptionPane.showMessageDialog(EsportesFavoritos.this, "Voto computado com sucesso!");
        }
     });
    }
}