/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversion;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class menu {

    public int men() {
        String opcion = JOptionPane.showInputDialog(null, "*****Bienvenido a la conversión de números*****\n"
                + "Digite una opción:\n"
                + "1. Coversión de números binario a hexadecimal\n"
                + "2. Coversión de números binario a decimal\n"
                + "3. Coversión de números decimal a hexadecimal\n"
                + "4. Coversión de números hexadecimal a binario\n"
                + "5. Coversión de números hexadecimal a decimal\n"
                + "6. Salir");
        try {
            int opc = Integer.parseInt(opcion);
            if (opc < 1 || opc >6) {
                JOptionPane.showMessageDialog(null, "La opción debe de estar dentro de la opción correcta, por favor intentelo de nuevo", "", JOptionPane.ERROR_MESSAGE);
                men();
            } 
            return opc;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "La opción debe de ser númerica, por favor intentelo de nuevo", "", JOptionPane.ERROR_MESSAGE);
            men();
        }
        return 0;
    }
}
