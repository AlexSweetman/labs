
import gui.Menu;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sweal144
 */
public class main {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            new Menu().setVisible(true);
         }
      });
   }
}
