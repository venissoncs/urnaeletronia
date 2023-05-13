/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacegrafica;

/**
 *
 * @author Kaylane
 */
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import objetos.Eleitor;
import objetos.Esportes;
import objetos.Mesario;

public class PanelFinalizarUrna extends JPanel {
    private static final long serialVersionUID = 1L;
    
    private JLabel labelInfo;
    private JButton buttonSelecionarArquivo;
    private JButton buttonFinalizarUrna;
    
    private File arquivoVotos;
    private List<Eleitor> eleitores;
    private List<Esportes> esportes;
    private List<Mesario> mesarios;
    
    public PanelFinalizarUrna(List<Eleitor> eleitores, List<Esportes> esportes, List<Mesario> mesarios) {
        this.eleitores = eleitores;
        this.esportes = esportes;
        this.mesarios = mesarios;
        
        setLayout(new GridBagLayout());
        
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(10, 10, 0, 10);
        labelInfo = new JLabel("Selecione o arquivo de votos gerado pela urna:");
        add(labelInfo, c);
        
        c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 1;
        c.insets = new Insets(10, 10, 0, 10);
        buttonSelecionarArquivo = new JButton("Selecionar arquivo");
        buttonSelecionarArquivo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser chooser = new JFileChooser();
                FileNameExtensionFilter filter = new FileNameExtensionFilter("Arquivo de votos (*.txt)", "txt");
                chooser.setFileFilter(filter);
                int returnVal = chooser.showOpenDialog(PanelFinalizarUrna.this);
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    arquivoVotos = chooser.getSelectedFile();
                }
            }
        });
        add(buttonSelecionarArquivo, c);
        
        c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 2;
        c.insets = new Insets(10, 10, 10, 10);
        buttonFinalizarUrna = new JButton("Finalizar urna");
        buttonFinalizarUrna.addActionListener(new ActionListener() {
            private Object Votacao;
            public void actionPerformed(ActionEvent e) {
                if (arquivoVotos == null) {
                    JOptionPane.showMessageDialog(null, "Selecione o arquivo de votos!");
                    return;
                }
                Votacao.finalizarVotacao(eleitores, esportes, mesarios, arquivoVotos);
                JOptionPane.showMessageDialog(null, "Urna finalizada com sucesso!");
            }
        });
        add(buttonFinalizarUrna, c);
    }
}