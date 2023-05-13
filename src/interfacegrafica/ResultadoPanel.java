/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacegrafica;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Kaylane
 */
public class ResultadoPanel extends JPanel {
    private JLabel natacaoLabel;
    private JLabel voleiLabel;
    private JLabel futebolLabel;
    private JLabel capoeiraLabel;
    private JLabel skateLabel;
    
    public ResultadoPanel() {
        // Componentes de interface gráfica
        setLayout(new GridLayout(6, 2));
        
        JLabel tituloLabel = new JLabel("Resultado parcial da votação:");
        tituloLabel.setHorizontalAlignment(JLabel.CENTER);
        add(tituloLabel);
        
        add(new JLabel());
        
        JLabel natacaoTituloLabel = new JLabel("Natação:");
        natacaoTituloLabel.setHorizontalAlignment(JLabel.RIGHT);
        add(natacaoTituloLabel);
        natacaoLabel = new JLabel("0 votos");
        natacaoLabel.setHorizontalAlignment(JLabel.LEFT);
        add(natacaoLabel);
        
        JLabel voleiTituloLabel = new JLabel("Vôlei:");
        voleiTituloLabel.setHorizontalAlignment(JLabel.RIGHT);
        add(voleiTituloLabel);
        voleiLabel = new JLabel("0 votos");
        voleiLabel.setHorizontalAlignment(JLabel.LEFT);
        add(voleiLabel);
        
        JLabel futebolTituloLabel = new JLabel("Futebol:");
        futebolTituloLabel.setHorizontalAlignment(JLabel.RIGHT);
        add(futebolTituloLabel);
        futebolLabel = new JLabel("0 votos");
        futebolLabel.setHorizontalAlignment(JLabel.LEFT);
        add(futebolLabel);
        
        JLabel capoeiraTituloLabel = new JLabel("Capoeira:");
        capoeiraTituloLabel.setHorizontalAlignment(JLabel.RIGHT);
        add(capoeiraTituloLabel);
        capoeiraLabel = new JLabel("0 votos");
        capoeiraLabel.setHorizontalAlignment(JLabel.LEFT);
        add(capoeiraLabel);
        
        JLabel skateTituloLabel = new JLabel("Skate:");
        skateTituloLabel.setHorizontalAlignment(JLabel.RIGHT);
        add(skateTituloLabel);
        skateLabel = new JLabel("0 votos");
        skateLabel.setHorizontalAlignment(JLabel.LEFT);
        add(skateLabel);
    }
    
    // Métodos para atualizar o número de votos de cada esporte
    public void setNatacaoVotos(int votos) {
        natacaoLabel.setText(votos + " votos");
    }
    
    public void setVoleiVotos(int votos) {
        voleiLabel.setText(votos + " votos");
    }
    
    public void setFutebolVotos(int votos) {
        futebolLabel.setText(votos + " votos");
    }
    
    public void setCapoeiraVotos(int votos) {
        capoeiraLabel.setText(votos + " votos");
    }
    
    public void setSkateVotos(int votos) {
        skateLabel.setText(votos + " votos");
    }

    private void setLayout(GridLayout gridLayout) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void add(JLabel tituloLabel) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}