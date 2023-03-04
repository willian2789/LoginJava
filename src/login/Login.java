
package login;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Login extends JFrame {
 private JTextField txtlogin;
    private JPasswordField senha;
    private JLabel lbllogin;
    private JLabel lblsenha;
    private JButton btnentrar;
    private JButton btncancelar;
    private static Login janela;
    public Login()
    {
        inicializarComponentes();
        definirEventos();
    }
    private void inicializarComponentes(){
        setTitle("Login");
        setBounds(0,0,250,250);
        setLayout(null);
        txtlogin = new JTextField(10);
        senha = new JPasswordField(10);
        lbllogin = new JLabel ("Login");
        lblsenha = new JLabel ("Senha");
        btnentrar = new JButton ("Entrar");
        btncancelar = new JButton ("Cancelar");
        txtlogin.setBounds(100,30,80,25);
        lbllogin.setBounds(30,30,80,25);
        senha.setBounds(100,75,80,25);
        btnentrar.setBounds(20,120,100,25);
        btncancelar.setBounds(125,120,100,25);
        add(lbllogin);
        add(txtlogin);
        add(lblsenha);
        add(senha);
        add(btnentrar);
        add(btncancelar);
    }
        private void definirEventos() {
            btnentrar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                String senha1 = String.valueOf(senha.getPassword());
                if(txtlogin.getText().equals("willian123") && senha1.equals(("willian123"))){
                    //janela.setVisible(false);
                    MenuPrincipal.abrir();
                }
                else {
                    JOptionPane.showMessageDialog(null, "Login e Senha errados");
                }
            }    
            
        });
}

   
    public static void main(String[] args) 
    {
        SwingUtilities.invokeLater(new Runnable(){
            public void run (){
                janela = new Login ();
                janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
                janela.setLocation((tela.width - janela.getSize().width)/2 ,
                        (tela.height - janela.getSize().height) / 2);
                janela.setVisible(true);
            } 
        });
    }
    
}
