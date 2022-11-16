/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.unidad03_01.vista;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author eceba
 */
public class Ventana0301a extends JFrame{
    private List<JPanel>jPanellList;

    public Ventana0301a(String title) throws HeadlessException {
        super(title);
        this.setSize(800, 600);
        this.setLocation(200, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.jPanellList =new ArrayList<>();
        this.setLayout(new FlowLayout());
    }

    void iniciarComponentes(){
        var jPanelRojo = new JPanel();
        var jPanelAzul = new JPanel();
        var jPanelVerde = new JPanel();
        var jPanelNaranja = new JPanel();
        var jPanelMagenta = new JPanel();
        var jPanelRosado = new JPanel();
        
        jPanelAzul.setBackground(Color.BLUE);
        jPanelRojo.setBackground(Color.RED);
        jPanelVerde.setBackground(Color.GREEN);
        jPanelNaranja.setBackground(Color.ORANGE);
        jPanelMagenta.setBackground(Color.MAGENTA);
        jPanelRosado.setBackground(Color.pink);
        
        this.jPanellList.add(jPanelRojo);
        this.jPanellList.add(jPanelAzul);
        this.jPanellList.add(jPanelVerde);
        this.jPanellList.add(jPanelNaranja);
        this.jPanellList.add(jPanelMagenta);
        this.jPanellList.add(jPanelRosado);
      
        
        for (var jPanel : this.jPanellList){
            this.getContentPane().add(jPanel);
        }
       
        
        /*
        this.getContentPane().add(this.jPanellList.get(0));
        this.getContentPane().add(this.jPanellList.get(1));
        this.getContentPane().add(this.jPanellList.get(2));
        */
                
    
    }
    
    
    
}
