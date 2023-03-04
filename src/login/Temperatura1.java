
package login;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Temperatura1 extends JPanel{
 private  JLabel lbltempf,lblresult;
 private  JTextField txttempf, txtresult;
 private  JButton btnconverter, btnlimpar;

    public Temperatura1() {
    inicializarComponentes();
    definirEventos();
}
private void inicializarComponentes() {
    setLayout(null);
    lbltempf = new JLabel("Digite a temperatura");
    lbltempf.setBounds(10,30,100,20);
    lblresult = new JLabel("Resultado em C");
    lblresult.setBounds(10,60,120,20);
    
    txttempf = new JTextField();
    txttempf.setBounds(124,30,100,20);
    txtresult = new JTextField();
    txtresult.setBounds(124,60,100,20);
    
    btnconverter = new JButton("Converter");
    btnconverter.setBounds(20,140,150,38);
    btnlimpar = new JButton("Limpar");
    btnlimpar.setBounds(180,140,150,38);
    
    add(lbltempf);
    add(txttempf);
    add(lblresult);
    add(txtresult);
    add(btnconverter);
    add(btnlimpar);
}
private void definirEventos () {
btnconverter.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
    double tempf=0,result=0;
     try
     {
     tempf = Double.parseDouble(txttempf.getText());
     }
    catch(NumberFormatException erro)
    {
      txtresult.setText("Digite só numeros");
      return;
    }
     result = (tempf-32) * 5/9;
          txtresult.setText("" + result);
}
});
 btnlimpar.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
     txttempf.setText("");
     txtresult.setText("");
         }
     });
    }



















}