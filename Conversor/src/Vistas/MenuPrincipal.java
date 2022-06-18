/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import Funcionalidades.Funciones;

/**
 *
 * @author jeise
 */
public class MenuPrincipal {
    
    public static void main(String[] args) {
        
       String[] optionsConversion = {"Seleccione","Conversor de Moneda", "Conversor de Temperatura", "Conversor de Longitud"};              
       
       String valorConvertir = "";
       
       Funciones fn = new  Funciones();
       
        String[] optionsMonedas = {"Dolares EUA", "Euros", "Bolivares VE", "Brasil Real", "Soles", "Yen",
        "Peso AR", "Peso Chile", "Peso MX", "Peso DOM", "Guaraní"};
        Image icon = new ImageIcon("src/img/Monedas.png").getImage();
        ImageIcon icon2 = new ImageIcon(icon.getScaledInstance(100, 124,Image.SCALE_SMOOTH));
        
        String[] optionsTemperaturas = {"Celsius", "Kelvin"};
        Image iconTemp = new ImageIcon("src/img/temp.jpg").getImage();
        ImageIcon icon2Temp = new ImageIcon(iconTemp.getScaledInstance(100, 124,Image.SCALE_SMOOTH));

        String[] optionsLongitd = {"Kilometro", "Centimetro","Milimetro","Micrometro","Namometro","Milla","Yarda","Pie","Pulgada",
        "Milla Nautica"};
        Image iconLong = new ImageIcon("src/img/long.jpg").getImage();
        ImageIcon icon2Long = new ImageIcon(iconLong.getScaledInstance(100, 124,Image.SCALE_SMOOTH));
        
        String moneda;
        String temperatura;
        String longitud;
        double valorConvertido;
        int n = 0;
        String conversor ;
        
       do {
            conversor = (String)JOptionPane.showInputDialog(null, "Seleccione el tipo de conversión", 
                                 "Conversor", JOptionPane.QUESTION_MESSAGE,null, optionsConversion, optionsConversion[0]);

            if(conversor == "Conversor de Moneda"){
                n = 0;
                 while (fn.validarNumeroMoneda(valorConvertir) == 0){
                     valorConvertir = JOptionPane.showInputDialog(null,"Ingresa la cantidad de dinero en peso Colombiano que deseas convertir",
                           "Conversor", JOptionPane.QUESTION_MESSAGE);
                     
                     if (valorConvertir == null){
                         break;
                     }
                 }
                 if (fn.validarNumeroMoneda(valorConvertir) !=0){

                     while (n == 0){

                         moneda = (String)JOptionPane.showInputDialog(null, "Seleccione la moneda", 
                         "Monedas", JOptionPane.QUESTION_MESSAGE, icon2, optionsMonedas, optionsMonedas[0]);
                         valorConvertido = fn.realizarConversionMoneda(moneda, Double.parseDouble(valorConvertir));
                         Object[] options = {"Elegir Otra Moneda",
                         "Menu Conversiones",
                         "Salir"};
                         n = JOptionPane.showOptionDialog(null,
                         "Resultado Conversión: " + valorConvertir + " Pesos son: " + Math.round(valorConvertido*100.0)/100.0 + " " + moneda ,
                         "Conversion",
                         JOptionPane.YES_NO_CANCEL_OPTION,
                         JOptionPane.QUESTION_MESSAGE,
                         null,
                         options,
                         options[2]);

                         if (n == 2){
                             break;
                         }
                     }
                     
                     valorConvertir = "";

                 }

             }
             
             if(conversor == "Conversor de Temperatura"){
                 n = 0;
                 while (fn.validarNumeroTemperatura(valorConvertir) == 0){
                     valorConvertir = JOptionPane.showInputDialog(null,"Ingresa la temperatura en °F que deseas convertir",
                           "Conversor", JOptionPane.QUESTION_MESSAGE);
                 }
                

                     while (n == 0){

                         temperatura = (String)JOptionPane.showInputDialog(null, "Seleccione la unidad de temperatura", 
                         "Unidades de temperatura", JOptionPane.QUESTION_MESSAGE, icon2Temp, optionsTemperaturas, optionsTemperaturas[0]);
                         valorConvertido = fn.realizarConversionTemperatura(temperatura, Double.parseDouble(valorConvertir));
                         Object[] options = {"Elegir Otra unidad",
                         "Menu Conversiones",
                         "Salir"};
                         n = JOptionPane.showOptionDialog(null,
                         "Resultado Conversión: " + valorConvertir + " Grados Fahrenheit son: " + Math.round(valorConvertido*100.0)/100.0 + " " + temperatura ,
                         "Conversion",
                         JOptionPane.YES_NO_CANCEL_OPTION,
                         JOptionPane.QUESTION_MESSAGE,
                         null,
                         options,
                         options[2]);

                         if (n == 2){
                             break;
                         }
                     }

                 valorConvertir = "";

             }
             
              if(conversor == "Conversor de Longitud"){
                 n = 0;
                 while (fn.validarNumeroLongitud(valorConvertir) == 0){
                     valorConvertir = JOptionPane.showInputDialog(null,"Ingresa la longitud en Metros que deseas convertir",
                           "Conversor", JOptionPane.QUESTION_MESSAGE);
                 }
                

                     while (n == 0){

                         longitud = (String)JOptionPane.showInputDialog(null, "Seleccione la unidad de longitud", 
                         "Unidades de temperatura", JOptionPane.QUESTION_MESSAGE, icon2Long, optionsLongitd, optionsLongitd[0]);
                         valorConvertido = fn.realizarConversionLongitud(longitud, Double.parseDouble(valorConvertir));
                         Object[] options = {"Elegir Otra unidad",
                         "Menu Conversiones",
                         "Salir"};
                         n = JOptionPane.showOptionDialog(null,
                        "Resultado Conversión: " + valorConvertir + " Metros son: " + Math.round(valorConvertido*100.0)/100.0 + " " + longitud ,
                         "Conversion",
                         JOptionPane.YES_NO_CANCEL_OPTION,
                         JOptionPane.QUESTION_MESSAGE,
                         null,
                         options,
                         options[2]);

                         if (n == 2){
                             break;
                         }
                     }

                 valorConvertir = "";

             }
             if (conversor!=null || n == 2){
                 break;
             }
         }while(n == 1 || conversor!=null || n == 2);
    }
}

