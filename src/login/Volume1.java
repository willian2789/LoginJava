
package login;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Volume1 extends JPanel {
  private  JLabel lblraio,lblaltura,lblresult;
    private JTextField txtraio,txtaltura,txtresult;
    private JButton btncalcular,btnlimpar;

    public  Volume1(){
        inicializarComponentes();
        definirEventos();
    }
    private void inicializarComponentes(){
        setLayout(null);
        lblraio = new JLabel("Digite Raio");
        lblraio.setBounds(10,30,100,20);
        lblaltura = new JLabel("Digite a altura");
        lblaltura.setBounds(10,60,120,20);
        lblresult = new JLabel("O volume é");
        lblresult.setBounds(10,120,100,20);
        
        txtraio = new JTextField();
        txtraio.setBounds(124,30,100,20);
        txtaltura = new JTextField();
        txtaltura.setBounds(124,60,100,20);
        txtresult = new JTextField();
        txtresult.setBounds(123,120,100,20);
        
          btncalcular = new JButton("Calcular");
          btncalcular.setBounds(20,140,150,38);
          btnlimpar = new JButton("Limpar");
          btnlimpar.setBounds(180,140,150,38);
          add(lblraio);
          add(txtraio);
          add(lblaltura);
          add(txtaltura);
          add(lblresult);
          add(txtresult);
          add(btncalcular);
          add(btnlimpar);
}
    private void definirEventos() {
        btncalcular.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
      double raio=0, altura=0, result=0;
           try
           {
            raio = Double.parseDouble(txtraio.getText());
            altura = Double.parseDouble(txtaltura.getText());
           }
           catch(NumberFormatException erro) 
           {
            txtresult.setText("digite só numeros");
            return;
           }
            result = 3.14159 * raio * raio * altura;
               txtresult.setText("" + result);
    }
        });
    btnlimpar.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
     txtraio.setText("");
     txtaltura.setText("");
     txtresult.setText("");
         }
     });
    
    
    
    
    }
    }
    