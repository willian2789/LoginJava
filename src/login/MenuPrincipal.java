package login;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuPrincipal extends JFrame{
    private Container container;
    private JMenuBar jmnubarra;
    private JMenu mnuarquivo, mnuatividades;
    private JMenuItem  jmnuisair,jmnuatraso,jmnucombustivel,jmnutemperatura,
    jmnuvolume;
    
    public MenuPrincipal (){
    inicializarComponentes();
    definirEventos();
} 
    private void inicializarComponentes (){
     //  setLayout(null);
       setTitle("Menu Principal");
       setBounds(0,0,800,600);
       container = getContentPane();
       jmnubarra = new JMenuBar();
       mnuarquivo = new JMenu("Arquivos");
       mnuatividades = new JMenu ("Atividades");
       jmnuisair = new JMenuItem ("Sair");
       jmnuisair.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
       jmnuatraso = new JMenuItem("Atraso");
       jmnucombustivel = new JMenuItem("Combustivel");
       jmnutemperatura = new JMenuItem("Temperatura");
       jmnuvolume = new JMenuItem("Volume");
       mnuarquivo.add(jmnuisair);
       mnuatividades.add(jmnuatraso);
       mnuatividades.add(jmnucombustivel);
       mnuatividades.add(jmnutemperatura);
       mnuatividades.add(jmnuvolume);
       jmnubarra.add(mnuatividades);
       jmnubarra.add(mnuarquivo);
       setJMenuBar(jmnubarra);
}
    private void definirEventos(){
        jmnuisair.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
           System.exit(0);
        }
   });
        jmnuatraso.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            Atraso1 atraso1 = new Atraso1();
            container.removeAll();
            container.add(atraso1);
            container.validate();
        }    
        });
        
        jmnucombustivel.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
     Combustivel1 combustivel1 = new Combustivel1();
     container.removeAll();
     container.add(combustivel1);
     container.validate();
     }   
    });
        jmnutemperatura.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e){
                Temperatura1 temperatura1 = new Temperatura1();
                container.removeAll();
                container.add(temperatura1);
                container.validate();
           }
        });   
        
        jmnuvolume.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        Volume1 volume1 = new Volume1(); 
            container.removeAll();
            container.add(volume1);
            container.validate();
        }    
        });
}


    
    
        public static void abrir(){
            MenuPrincipal principal = new MenuPrincipal();
            principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
            principal.setLocation((tela.width - principal.getSize().width)/2 ,
                    (tela.height - principal.getSize().height) / 2);
                    principal.setVisible(true);
        }


}

