/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.unidad03_01.vista;

import javax.swing.JFrame;

/**
 *
 * @author eceba
 */
public class Principal {
    public static void main(String[]args){
    var ventana1 = new Ventana0301a("Ecuador");
    var ventana2 = new Ventana0301a("Qatar");
    var ventana3 = new Ventana0301a("Paises bajos");
    var ventana4 = new Ventana0301a("Senegal");
    
    ventana1.iniciarComponentes();
    ventana2.iniciarComponentes();
    ventana3.iniciarComponentes();
    ventana4.iniciarComponentes();

    ventana1.setVisible(true);
    ventana2.setVisible(true);
    ventana3.setVisible(true);
    ventana4.setVisible(true);
    
    
    }
}
    

