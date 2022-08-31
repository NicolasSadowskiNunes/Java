package Interfaces;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.AbstractDocument.BranchElement;

import JavaBeans.Contato;

import java.util.Iterator;

public class PanelPesquisa extends JPanel implements ActionListener{

    JLabel lNome;
    JLabel lTel;
    JLabel lCel;
    JLabel lEmail;
    JLabel lGrupo;
    JLabel lPesquisar;
    JRadioButton rNome;
    JRadioButton rTC;
    JTextField tNome;
    JTextField tTel;
    JTextField tCel;
    JTextField tEmail;
    JTextField tPesquisar;
    JTextField tGrupo;
    JButton bEditar;
    JButton bRemover;
    JButton bFechar;
    JButton bPesquisa;
    JLabel pNome;
    JLabel pTC;
    
    ArrayList dados;
   
    Contato contato; 

    public PanelPesquisa(ArrayList dados){


        ButtonGroup bt = new ButtonGroup();

       this.dados = dados;

        lNome = new JLabel("Nome:");
            lNome.setBounds(20, 80, 50, 50);

        tNome = new JTextField();
            tNome.setBounds(100, 100, 250, 18);

        lTel = new JLabel("Telefone:");
            lTel.setBounds(20, 120, 100, 50);
        
        tTel = new JTextField();
            tTel.setBounds(100, 140, 250, 18);

        lCel = new JLabel("Celular:");
            lCel.setBounds(20, 160, 100, 50);

        tCel = new JTextField();
            tCel.setBounds(100, 180, 250, 18);

        lEmail = new JLabel("E-MAIL:");
            lEmail.setBounds(20, 200, 100, 50);

        tEmail = new JTextField();
            tEmail.setBounds(100, 220, 250, 18);

        lGrupo = new JLabel("Grupo:");
            lGrupo.setBounds(20, 240, 100, 50);

        tGrupo = new JTextField();
            tGrupo.setBounds(100, 260, 250, 18);

        lPesquisar = new JLabel("Pesquisar Por: ");
            lPesquisar.setBounds(20, 30, 150, 18);

        tPesquisar = new JTextField();
            tPesquisar.setBounds(20, 55, 275, 18);
            
        rNome = new JRadioButton();
            rNome.setBounds(130, 34, 20, 15);

        pNome = new JLabel("Nome");
            pNome.setBounds(150, 31, 50, 18);
        
        rTC = new JRadioButton();
            rTC.setBounds(200, 34, 20, 15);

        pTC = new JLabel("Celular");
            pTC.setBounds(220, 31, 100, 18);

        ImageIcon pesq = new ImageIcon("src/Images/pesquisar.png");
        bPesquisa = new JButton(pesq);
            bPesquisa.setBounds(300, 22, 50, 50);

        ImageIcon edit = new ImageIcon("src/Images/editar.png");
        bEditar = new JButton(edit);
            bEditar.setBounds(30, 320, 80, 80);
    
        ImageIcon rem = new ImageIcon("src/Images/remover.png");
        bRemover = new JButton(rem);
            bRemover.setBounds(265, 320, 80, 80);
    
        ImageIcon fec = new ImageIcon("src/Images/fechar.png");
        bFechar = new JButton(fec);
            bFechar.setBounds(150, 320, 80, 80);


        bPesquisa.addActionListener(this);
        bEditar.addActionListener(this);
        bRemover.addActionListener(this);
        bFechar.addActionListener(this);
   
        this.setBounds(10, 130, 380, 420);
        this.setLayout(null);
        this.setVisible(false);
        this.setBorder(BorderFactory.createTitledBorder("Pesquisar Contato"));
        
        this.add(lNome);
        this.add(lTel);
        this.add(lCel);
        this.add(lEmail);
        this.add(lGrupo);
        this.add(tNome);
        this.add(tTel);
        this.add(tCel);
        this.add(tEmail);
        this.add(tGrupo);

        this.add(bPesquisa);
        this.add(lPesquisar);
        this.add(tPesquisar);

        bt.add(rNome);
        bt.add(rTC);

        this.add(rNome);
        this.add(pNome);
        this.add(rTC);
        this.add(pTC);

        this.add(bEditar);
        this.add(bRemover);
        this.add(bFechar);
        
    }



    @Override
    public void actionPerformed(ActionEvent e) {

       if(e.getSource().equals(bPesquisa)){

        boolean exist = false;

        if(rNome.isSelected()){
                
                Iterator it = dados.iterator();

                while(it.hasNext()){
                
                Contato  contato1 = (Contato) it.next();
                    

                if(contato1.getNome().equalsIgnoreCase(tPesquisar.getText())){

                    exist = true;
                    tNome.setText(contato1.getNome());
					tTel.setText(Long.toString(contato1.getTel()));
					tCel.setText(Long.toString(contato1.getCel()));
					tEmail.setText(contato1.getEmail());
                    tGrupo.setText((String) contato1.getGrupo());
                    contato = contato1;
                    break;
                    
                }
                
            }

            if(exist = false){
                JOptionPane.showMessageDialog(null, "Contato não encontrado");
            }

        }

        else if(rTC.isSelected()){

            long tempTC = Long.parseLong(tPesquisar.getText());

            Iterator it = dados.iterator();

            while(it.hasNext()){
                
             Contato contato1 = (Contato) it.next();

                if(contato1.getTel()==tempTC||contato.getCel()==tempTC){
                    exist = true;   

                tNome.setText(contato1.getNome());
                tTel.setText(Long.toString(contato1.getTel()));
                tCel.setText(Long.toString(contato1.getCel()));
                tEmail.setText(contato1.getEmail());
                tGrupo.setText((String) contato1.getGrupo());

                contato = contato1;  
                break;

                }

            }

            if(exist = false){
                JOptionPane.showMessageDialog(null, "Contato não encontrado");
            }
        }

        }
        
       else if(e.getSource().equals(bEditar)){

        contato.setNome(tNome.getText());
        contato.setTel(Long.parseLong(tTel.getText()));
        contato.setCel(Long.parseLong(tCel.getText()));
        contato.setEmail(tEmail.getText());
        contato.setGrupo(tGrupo.getText());
        JOptionPane.showMessageDialog(null, "Contato editado!");

       }

       else if(e.getSource().equals(bRemover)){

        tPesquisar.setText("");
        tNome.setText("");
        tTel.setText("");
        tCel.setText("");
        tEmail.setText("");
        tGrupo.setText("");


        if(contato != null){
            dados.remove(contato);
            JOptionPane.showMessageDialog(null, "Contato removido!");
        }

       }

       else if(e.getSource().equals(bFechar)){
        this.setVisible(false);
     }

    }
       
}



