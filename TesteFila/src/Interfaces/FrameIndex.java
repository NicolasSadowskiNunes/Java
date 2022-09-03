package Interfaces;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Beam.Arquivo;
import EstruturaDeDados.Fila;

public class FrameIndex extends JFrame implements ActionListener{
    
    JLabel lArq;
    JLabel lQtd;
    JTextField tArq;
    JTextField tQtd;
    JButton bAdd;
    JButton bEnv;


    Fila fila;
   

    public FrameIndex(){

        fila = new Fila();

        Container bg = this.getContentPane();
        bg.setBackground(Color.gray);

        lArq = new JLabel("Arquivo: ");
            lArq.setBounds(200, 50, 100, 100);
            lArq.setFont(new Font("Arial", 50, 18));

        lQtd = new JLabel("Quantidade: ");
            lQtd.setBounds(200, 100, 120, 100);
            lQtd.setFont(new Font("Arial", 50, 18));

        tArq = new JTextField();
            tArq.setBounds(320, 92, 150, 20);

        tQtd = new JTextField();
            tQtd.setBounds(320, 142, 50, 20);

        bAdd = new JButton("Adicionar na Fila");
            bAdd.setBounds(230, 180, 200, 30);
            bAdd.setFont(new Font("Arial", 1, 15));

        bEnv = new JButton("Enviar p/ Imprimir");
            bEnv.setBounds(230, 240, 200, 30);
            bEnv.setFont(new Font("Arial", 1, 15));


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(640, 480);
        this.setTitle("Fila");
        this.setLayout(null);
        this.setVisible(true);
        this.setLocationRelativeTo(null);

        this.add(lArq);
        this.add(lQtd);
        this.add(tArq);
        this.add(tQtd);
        this.add(bAdd); bAdd.addActionListener(this);
        this.add(bEnv); bEnv.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource().equals(bAdd)){
            
            Arquivo arq = new Arquivo();
            arq.setNome(tArq.getText());
            arq.setQtd(Integer.parseInt(tQtd.getText()));
            
            fila.queue(arq);

            tArq.setText("");
            tQtd.setText("");

        }

        else if(e.getSource().equals(bEnv)){

            Arquivo arq = (Arquivo) fila.dequeue();

            JOptionPane.showMessageDialog(null," Arquivo Impresso "+arq.getNome() +", " +arq.getQtd() +" Cópias ");
        
        }
        
    }

}
