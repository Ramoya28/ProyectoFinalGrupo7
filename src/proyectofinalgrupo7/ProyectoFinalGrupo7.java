package proyectofinalgrupo7;

import javax.swing.JOptionPane;

public class ProyectoFinalGrupo7 {

    public static void main(String[] args) {
        
        //Prueba de Fecha y Hora
        Tools t = new Tools();
        System.out.println(t.FechayHora());
        
        //Prueba Menu
        Menu m = new Menu();
        m.MenuPrincipal();
        
        /*/Prueba Cola
        Cola1 c = new Cola1 ();
        c.encola(new Tiquete("Randall",1 ,22 ,1, Tramite.Depositos, Tipo.P));
        JOptionPane.showMessageDialog(null, c);
        c.atiende();
        JOptionPane.showMessageDialog(null, c);
        c.encola(new Tiquete("Randall",2 ,22 ,1, Tramite.Depositos, Tipo.P));
        JOptionPane.showMessageDialog(null, c.encontrar(2));*/
        
        
    }
    
}
