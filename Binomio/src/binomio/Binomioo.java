/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binomio;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

/**
 *
 * @author Alumno
 */
public class Binomioo extends JFrame implements ActionListener, Serializable {

    JTextField t1,t2;
    JLabel l1,l2,l3,l4,l5;
    JButton b1, b2;

    Binomioo() {
        inicio();
        ventana();
    }

    public void inicio() {
        setTitle("Binomio Cuadrado");
        setSize(300, 300);
        setResizable(false);
        setLocationRelativeTo(null);
        this.setLayout(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void ventana() {
        
        l1 = new JLabel("Ingrese los valores de a y b");
        l1.setBounds(50, 40, 200, 30);
        add(l1);
        l1.setVisible(true);
        
        l2 = new JLabel("(");
        l2.setBounds(30, 90, 20, 30);
        l2.setFont(new Font("Arial", Font.BOLD, 18));
        add(l2);
        l2.setVisible(true);
        
        t1 = new JTextField();
        t1.setBounds(55, 90, 40, 30);
        t1.setFont(new Font("Arial", Font.BOLD, 18));
        add(t1);
        t1.setVisible(true);
        
        l3 = new JLabel("+");
        l3.setBounds(100, 90, 20, 30);
        l3.setFont(new Font("Arial", Font.BOLD, 18));
        add(l3);
        l3.setVisible(true);
        
        t2 = new JTextField();
        t2.setBounds(150, 90, 40, 30);
        t2.setFont(new Font("Arial", Font.BOLD, 18));
        add(t2);
        t2.setVisible(true);
        
        l4 = new JLabel(")^n");
        l4.setBounds(200, 90, 30, 30);
        l4.setFont(new Font("Arial", Font.BOLD, 18));
        add(l4);
        l4.setVisible(true);
        
        b1= new JButton("Calcular al cuadrado");
        b1.setBounds(50, 150, 200, 40);
        b1.setFont(new Font("Arial", Font.BOLD, 15));
        b1.addActionListener(this);
        add(b1);
        b1.setVisible(true);
        
        b2= new JButton("Calcular al cubo");
        b2.setBounds(50, 200, 150, 40);
        b2.setFont(new Font("Arial", Font.BOLD, 15));
        b2.addActionListener(this);
        add(b2);
        b2.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            
            String n1=t1.getText();
            String n2=t2.getText();
            
            int a,b,c,f;
            a=(Integer.parseInt(t1.getText()))*(Integer.parseInt(t1.getText()));
            b=2*(Integer.parseInt(t1.getText()))*(Integer.parseInt(t2.getText()));
            c=(Integer.parseInt(t2.getText()))*(Integer.parseInt(t2.getText()));
            f=a+b+c;
            JOptionPane.showMessageDialog(null, "("+n1+"+"+n2+")^2 =  "+n1+"^2 + 2 ("+n1+")("+n2+") + "+n2+"^2 ="+a+"+"+b+"+"+c+"= "+f, "REsultado" , JOptionPane.INFORMATION_MESSAGE);
        
        }else if(e.getSource()==b2){
            
            String n1=t1.getText();
            String n2=t2.getText();
            
            int a,b,c,d,f;
            a=(Integer.parseInt(t1.getText()))*(Integer.parseInt(t1.getText())*(Integer.parseInt(t1.getText())));
            b=3*(Integer.parseInt(t1.getText()))*(Integer.parseInt(t1.getText()))*(Integer.parseInt(t2.getText()));
            c=3*(Integer.parseInt(t1.getText()))*(Integer.parseInt(t2.getText()))*(Integer.parseInt(t2.getText()));
            d=(Integer.parseInt(t2.getText()))*(Integer.parseInt(t2.getText())*(Integer.parseInt(t2.getText())));
            f=a+b+c+d;
            JOptionPane.showMessageDialog(null, "("+n1+"+"+n2+")^3 =  "+n1+"^3 + 3 ("+n1+")^2("+n2+") "
                    + "+ 3 ("+n1+")("+n2+")^2 + "+n2+"^3 ="+a+"+"+b+"+"+c+"+"+d+"= "+f, "REsultado" , JOptionPane.INFORMATION_MESSAGE);
        
        }
    }
}

