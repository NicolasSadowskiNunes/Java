package Interfaces;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import JavaBeans.Contato;

public class PanelCadastro extends JPanel implements ActionListener{
    
    JLabel lNome;
    JLabel lTel;
    JLabel lCel;
    JLabel lEmail;
    JLabel lGrupo;
    JLabel lPrincipal1;
    JLabel lPrincipal2;

    JTextField tNome;
    JTextField tTel;
    JRadioButton rTel;
    JRadioButton rCel;
    JTextField tCel;
    JTextField tEmail;
    JComboBox cGrupo;

    JButton salvar;
    JButton fechar;
    JButton limpar;

    ArrayList dados;

    public PanelCadastro(ArrayList dados){

        ButtonGroup bt = new ButtonGroup();
        

       this.dados = dados;

        lNome = new JLabel("Nome:");
            lNome.setBounds(20, 20, 50, 50);

        tNome = new JTextField();
            tNome.setBounds(100, 40, 250, 18);

        lTel = new JLabel("Telefone:");
            lTel.setBounds(20, 60, 100, 50);
        
        tTel = new JTextField();
            tTel.setBounds(100, 80, 150, 18);

        lCel = new JLabel("Celular:");
            lCel.setBounds(20, 100, 100, 50);

        tCel = new JTextField();
            tCel.setBounds(100, 120, 150, 18);

        lEmail = new JLabel("E-MAIL:");
            lEmail.setBounds(20, 140, 100, 50);

        tEmail = new JTextField();
            tEmail.setBounds(100, 160, 250, 18);

        lGrupo = new JLabel("Grupo:");
            lGrupo.setBounds(20, 180, 100, 50);

        cGrupo = new JComboBox();
            cGrupo.addItem("Nenhum");
            cGrupo.addItem("Favoritos");
            cGrupo.addItem("Contato Padrão");
            cGrupo.setBounds(100, 200, 250, 18);

        lPrincipal1 = new JLabel("Principal");
            lPrincipal1.setBounds(287, 80, 150, 18);
        
        rTel = new JRadioButton();
            rTel.setBounds(260, 83, 20, 15);

        lPrincipal2 = new JLabel("Principal");
            lPrincipal2.setBounds(287, 120, 150, 18);

        rCel = new JRadioButton();
            rCel.setBounds(260, 123, 20, 15);

        ImageIcon sal = new ImageIcon("src/Images/salvar.png");
        salvar = new JButton(sal);
            salvar.setBounds(30, 320, 80, 80);

        ImageIcon fec = new ImageIcon("src/Images/fechar.png");
            fechar = new JButton(fec);
                fechar.setBounds(150, 320, 80, 80);

        ImageIcon limp = new ImageIcon("src/Images/limpar.png");
        limpar = new JButton(limp);
            limpar.setBounds(265, 320, 80, 80);

        this.setBounds(10, 130, 380, 420);
        this.setLayout(null);
        this.setVisible(false);
        this.setBorder(BorderFactory.createTitledBorder("Novo Contato"));
        
        this.add(lNome);
        this.add(lTel);
        this.add(lCel);
        this.add(lEmail);
        this.add(lGrupo);
        this.add(lPrincipal1);
        this.add(lPrincipal2);
        this.add(tNome);
        this.add(tTel);
        this.add(tCel);
        this.add(tEmail);
        this.add(cGrupo);
        this.add(rTel);
        this.add(rCel);
        this.add(salvar);
        this.add(fechar);
        this.add(limpar);
        bt.add(rCel);
        bt.add(rTel);

        salvar.addActionListener(this);
        fechar.addActionListener(this);
        limpar.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      
        if(e.getSource().equals(salvar)){
    
            JOptionPane.showMessageDialog(null, "Contato Adicionado!" );
            Contato contato = new Contato();
            contato.setNome(tNome.getText());
            contato.setTel(Long.parseLong(tTel.getText()));
            contato.setCel(Long.parseLong(tCel.getText()));
            contato.setEmail(tEmail.getText());
            contato.setGrupo((String) cGrupo.getSelectedItem());
            dados.add(contato);
            tNome.setText("");
            tTel.setText("");
            tCel.setText("");
            tEmail.setText("");
            cGrupo.setSelectedItem("Nenhum");
            rTel.setSelected(false);
            rCel.setSelected(false);
           
        }

        else if(e.getSource().equals(fechar)){
            this.setVisible(false);

        }
        
        else if(e.getSource().equals(limpar)){
            tNome.setText("");
            tTel.setText("");
            tCel.setText("");
            tEmail.setText("");
            cGrupo.setSelectedItem("Nenhum");
            rTel.setSelected(false);
            rCel.setSelected(false);
        }
        
    }

}
