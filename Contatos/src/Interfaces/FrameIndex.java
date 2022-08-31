package Interfaces;

import java.awt.Color;
import java.awt.Container;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameIndex extends JFrame implements ActionListener{
    
    JLabel titulo;
    JButton adicionar;
    JButton pesquisar;

    PanelCadastro panelCad;
    PanelPesquisa panelPesq;

    ArrayList dados;

    public FrameIndex(){

        dados = new ArrayList();

        panelCad = new PanelCadastro(dados);
        panelPesq = new PanelPesquisa(dados);

        ImageIcon add = new ImageIcon("src/Images/add.png");
        ImageIcon pesq = new ImageIcon("src/Images/pesquisar.png");

        Container fundo;
        fundo = this.getContentPane();
        fundo.setBackground(new Color(203, 212, 169));
        
        titulo = new JLabel("AGENDA DE CONTATOS");
            titulo.setBounds(125, 5, 300, 100);

        adicionar = new JButton(add);
            adicionar.setBounds(150, 70, 50, 50);
            adicionar.setBorder(null);
            adicionar.setFocusable(false);
            adicionar.setOpaque(false);
            adicionar.setContentAreaFilled(false);
            adicionar.setBorderPainted(false);
        
        pesquisar = new JButton(pesq);
            pesquisar.setBounds(210, 70, 50, 50);
            pesquisar.setBorder(null);
            pesquisar.setFocusable(false);
            pesquisar.setOpaque(false);
            pesquisar.setContentAreaFilled(false);
            pesquisar.setBorderPainted(false);
        
        adicionar.addActionListener(this);
        pesquisar.addActionListener(this);

        this.setTitle("Contatos");
        this.setSize(400, 600);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.add(titulo);
        this.add(adicionar);
        this.add(pesquisar);
        this.add(panelCad);
        this.add(panelPesq);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
        if(e.getSource().equals(adicionar)){

            panelCad.setVisible(true);
            panelPesq.setVisible(false);

        }

        else if(e.getSource().equals(pesquisar)){

            panelPesq.setVisible(true);
            panelCad.setVisible(false);

        }
        
    }

}
