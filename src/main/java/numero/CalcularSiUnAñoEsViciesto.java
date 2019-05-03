/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numero;

/**
 *
 * @author Vaio
 */
public class CalcularSiUnAñoEsViciesto {
 public boolean calcular(int anio){
        boolean esDivisiblePorCuatro =(anio % 4 == 0);
        boolean esDivisiblePor4cientos =(anio % 400 == 0);
        boolean noEsDivisiblePorCien = (anio % 100 != 0);
        boolean reglasDeLosSoglos = ( noEsDivisiblePorCien ||esDivisiblePor4cientos );
        return (
                reglasDeLosSoglos&&esDivisiblePorCuatro 
                );
    }   
}
