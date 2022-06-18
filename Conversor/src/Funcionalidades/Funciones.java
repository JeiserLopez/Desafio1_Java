/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funcionalidades;

import java.util.regex.Pattern;

/**
 *
 * @author jeise
 */
public class Funciones {

    private Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");

    public boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false; 
        }
        return pattern.matcher(strNum).matches();
    }
    
    public double validarNumeroMoneda(String valorMoneda){
        if (isNumeric(valorMoneda)){
            return Double.parseDouble(valorMoneda);
        }
        return 0;
        
    }
    
    public double validarNumeroTemperatura(String valorTemperatura){
        if (isNumeric(valorTemperatura)){
            return Double.parseDouble(valorTemperatura);
        }
        return 0;
        
    }
    
    public double realizarConversionMoneda(String moneda, double valor){
            if (moneda == "Dolares EUA"){
                return valor/3905.90;
            }
            
            if (moneda == "Euros"){
                return valor*0.0002;
            }
            
            if (moneda == "Bolivares VE"){
                return valor*0.0014;
            }
            
            if (moneda == "Brasil Real"){
                return valor*0.0013;
            }
            if (moneda == "Soles"){
                return valor*0.0010;
            }
            
            if (moneda == "Yen"){
                return valor*0.0346;
            }
            
            if (moneda == "Peso AR"){
                return valor*0.0315;
            }
            
            if (moneda == "Peso Chile"){
                return valor*0.2224;
            }
            
            if (moneda == "Peso MX"){
                return valor*0.0052;
            }
            
            if (moneda == "Peso DOM"){
                return valor*0.0140;
            }
            
            if (moneda == "Guaraní"){
                return valor*1.76;
            }
            
            return 0;
    }
    
    public double realizarConversionTemperatura(String unidad, double valor){
        if (unidad == "Celsius"){
            return ((valor - 32) * 5)/9;
        }
         if (unidad == "Kelvin"){
            return (((valor - 32) * 5)/9) + 273.15;
        }
        return 0;
    }
    
     public double validarNumeroLongitud(String valorLongitud){
          if (isNumeric(valorLongitud)){
            return Double.parseDouble(valorLongitud);
        }
        return 0;
     }
     
     public double realizarConversionLongitud(String unidad, double valor){
         if (unidad == "Kilometro"){
             return valor/1000;
         }
         if (unidad == "Centimetro"){
             return valor/100;
         }
         if (unidad == "Milimetro"){
             return valor*1000;
         }
         if (unidad == "Micrometro"){
             return valor*1e+6;
         }
         if (unidad == "Namometro"){
             return valor*1e+9;
         }
         if (unidad == "Milla"){
             return valor/1609;
         }
         if (unidad == "Yarda"){
             return valor*1.094;
         }
         if (unidad == "Pie"){
             return valor*3.281;
         }
         
         if (unidad == "Milla Nautica"){
             return valor/1852;
         }
         
         return 0;
     }
}
