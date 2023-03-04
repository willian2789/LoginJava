
package login;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/*@author Pichau*/
public class Combustivel1 extends JPanel{
  private  JLabel lblviagem,lblvmedia,lbldistancia,lblresult;
   private JTextField txtviagem,txtvmedia,txtdistancia,txtresult;
    private JButton btncalcular,btnlimpar;
    
    public Combustivel1() {
        inicializarComponentes();
     definirEventos();
    }
    private void inicializarComponentes() {
       setLayout(null);
       lblviagem = new JLabel("Digite o Tempo");
       lblviagem.setBounds(10,30,100,20);
       lblvmedia = new JLabel ("Digite a Velocidade Media");
       lblvmedia.setBounds(10,60,120,20);
       lbldistancia = new JLabel("Distancia");
       lbldistancia.setBounds(10,90,100,20);
       lblresult = new JLabel ("Litros usados");
       lblresult.setBounds(10,120,100,20);
       
       txtviagem = new JTextField();
       txtviagem.setBounds(124,30,100,20);
       txtvmedia = new JTextField();
       txtvmedia.setBounds(124,60,100,20);
       txtdistancia = new JTextField();
       txtdistancia.setBounds(124,90,120,20);
       txtresult = new JTextField();
       txtresult.setBounds(123,120,100,20);
       btncalcular = new JButton("Calcular");
       btncalcular.setBounds(20,140,150,38);
       btnlimpar = new JButton ("Limpar");
       btnlimpar.setBounds(180,140,150,38);
       add(lblviagem);
       add(txtviagem);
       add(lblvmedia);
       add(txtvmedia);
       add(lbldistancia);
       add(txtdistancia);
       add(lblresult);
       add(txtresult);
       add(btncalcular);
       add(btnlimpar);
    }
    private void definirEventos(){
    btncalcular.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
    
     double tviagem=0, vmedia=12 ,distancia=0, result=0;
     try
     { 
        tviagem = Double.parseDouble(txtviagem.getText());
        vmedia = Double.parseDouble(txtvmedia.getText());
     }  
      catch(NumberFormatException erro)  
      {
          txtresult.setText("Digite so numeros");
          txtdistancia.setText("Digite so numeros");
          return;
      }
     
     distancia = tviagem * vmedia;
     txtdistancia.setText(""+distancia);
     result = distancia/12;
     txtresult.setText(""+result);
     }
    });
     btnlimpar.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
     txtviagem.setText("");
     txtvmedia.setText("");
     txtdistancia.setText("");
     txtresult.setText("");
         }
     });
    }
}
