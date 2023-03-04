
package combustivel;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/*@author Pichau*/
public class Combustivel extends JFrame implements ActionListener{
    JLabel lbltviagem,lblvmedia,lbldistancia,lblresult;
    JTextField txttviagem,txtvmedia,txtdistancia,txtresult;
    JButton btncalcular,btnlimpar;
    Combustivel()
    {
        setTitle("Calcular a quantidade de combustivel usada em uma viagem");
        setBounds(150,150,250,250);
        setResizable(false);
        getContentPane().setBackground(new Color(255,215,0));
        getContentPane().setLayout(new GridLayout(5,2));
        lbltviagem = new JLabel("Digite o Tempo");
        lblvmedia = new JLabel("Digite a Velocidade Media");
        lbldistancia = new JLabel("Distancia");
        lblresult = new JLabel("Litros usados");
        
        txttviagem = new JTextField();
        txtvmedia = new JTextField();
        txtdistancia = new JTextField();
        txtresult = new JTextField();
        
        btncalcular = new JButton("Cacular"); btncalcular.addActionListener(this);
        btnlimpar = new JButton("Limpar");  btnlimpar.addActionListener(this);
        
        getContentPane().add(lbltviagem); getContentPane().add(txttviagem);
        getContentPane().add(lblvmedia); getContentPane().add(txtvmedia);
        getContentPane().add(lbldistancia); getContentPane().add(txtdistancia);
        getContentPane().add(lblresult); getContentPane().add(txtresult);
        getContentPane().add(btncalcular); getContentPane().add(btnlimpar);
        
    }
    
    public void actionPerformed(ActionEvent e)
    {
     double tviagem=0, vmedia=12 ,distancia=0, result=0;
     try
     { 
        tviagem = Double.parseDouble(txttviagem.getText());
        vmedia = Double.parseDouble(txtvmedia.getText());
     }  
      catch(NumberFormatException erro)  
      {
          txtresult.setText("Digite so numeros");
          txtdistancia.setText("Digite so numeros");
          return;
      }
     if(e.getSource()==btncalcular){
     distancia = tviagem * vmedia;
     txtdistancia.setText(""+distancia);
     result = distancia/12;
     txtresult.setText(""+result);
     }
     if(e.getSource()==btnlimpar){
         txttviagem.setText("");
         txtvmedia.setText("");
         txtdistancia.setText("");
         txtresult.setText("");
     }
    }
    public static void main(String[] args) {
     JFrame janela = new Combustivel();
     janela.setUndecorated(true);
     janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
     janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     janela.setVisible(true);
    }
     
}
