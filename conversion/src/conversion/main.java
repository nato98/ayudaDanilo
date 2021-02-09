/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversion;

import static conversion.Conversion.convertirBinarioADecimal;
import static conversion.Conversion.decimalAHexadecimal;
import static conversion.Conversion.HexadecimalABinario;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        menu men = new menu();
        
        int opc=men.men();
        while (opc!=6) {            
            
             String num = JOptionPane.showInputDialog("Digite el número a cambiar");
            switch (opc){
                case 1:
                    
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "La conversión a decimal es: "+convertirBinarioADecimal(num));
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "La conversión a hexadecimal es: "+decimalAHexadecimal(Integer.parseInt(num)));
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "La conversión a hexadecimal es: "+HexadecimalABinario(num));
                    break;
                case 5:
                    break;
                case 6:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Error en la opción digitada", "", JOptionPane.ERROR_MESSAGE);
            }
            opc=men.men();
        }
        JOptionPane.showMessageDialog(null, "¡Vuelva pronto!", "", JOptionPane.INFORMATION_MESSAGE);
        
    }
    
}
