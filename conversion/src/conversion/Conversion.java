/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversion;

/**
 *
 * @author LENOVO
 */
public class Conversion {

    public static long convertirBinarioADecimal(String binario) {
        return Long.parseLong(binario, 2);
    }

    public static String decimalAHexadecimal(int decimal) {
        String hexadecimal = "";
        String caracteresHexadecimales = "0123456789ABCDEF";
        while (decimal > 0) {
            int residuo = decimal % 16;
            hexadecimal = caracteresHexadecimales.charAt(residuo) + hexadecimal; // Agregar a la izquierda
            decimal /= 16;
        }
        return hexadecimal;
    }

    public static String HexadecimalABinario(String hexa) {
        int numHex = Integer.parseInt(hexa, 16);
        String binary = Integer.toBinaryString(numHex);
        return binary;
    }
  
}
