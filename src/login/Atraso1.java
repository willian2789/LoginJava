package login;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Atraso1 extends JPanel{
    
 private JLabel lblvalor,lbltaxa,lblatraso,lblresult;
    private JTextField txtvalor,txttaxa,txtatraso,txtresult;
     private JButton btncalcular,btnlimpar;
     
    public Atraso1() {
    inicializarComponentes();
    definirEventos();
    }
    private void inicializarComponentes() {
        setLayout(null);
        lblvalor = new JLabel("Digite o valor");
        lblvalor.setBounds(10,30,100,20);
        lbltaxa = new JLabel("Digite a taxa");
        lbltaxa.setBounds(10,60,120,20);
        lblatraso = new JLabel("Digite o tempo em atraso");
        lblatraso.setBounds(10,90,100,20);
        lblresult = new JLabel("prestação");
        lblresult.setBounds(10,120,100,20);
        
        txtvalor = new JTextField();
        txtvalor.setBounds(124,30,100,20);
        txttaxa = new JTextField();
        txttaxa.setBounds(124,60,100,20);
        txtatraso = new JTextField();
        txtatraso.setBounds(124,90,120,20);
        txtresult = new JTextField();
        txtresult.setBounds(123,120,100,20);
        
        btncalcular = new JButton("Calcular"); 
        btncalcular.setBounds(20,140,150,38);
        btnlimpar = new JButton("Limpar"); 
        btnlimpar.setBounds(180,140,150,38);
       add(lblvalor);
       add(txtvalor);
       add(lbltaxa); 
       add(txttaxa);
        add(lblatraso); 
        add(txtatraso);
        add(lblresult);
        add(txtresult);
       add(btncalcular);
       add(btnlimpar);
    
    }  
    private void definirEventos() {
    btncalcular.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e){            
    double valor=0, taxa=0, atraso=0, result=0;
    try
    {
        valor = Double.parseDouble(txtvalor.getText());
        taxa = Double.parseDouble(txttaxa.getText());
        atraso = Double.parseDouble(txtatraso.getText());
         
    }
    catch(NumberFormatException erro)
    {
        txtresult.setText("Digite só Números");
        return;
    }
     result = valor + (valor* taxa/100) *atraso;
       txtresult.setText("" + result);
    }
    });
    
    btnlimpar.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
            txtvalor.setText("");
            txttaxa.setText("");
            txtatraso.setText("");
            txtresult.setText("");
            return; 
           }
       });
   }
    

   
}

            

