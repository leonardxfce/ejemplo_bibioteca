package utilidades;

public class CalcuadoraNumerosEspeciales {

    public boolean calcularAñoBisiestoDe(int anio){
        
        boolean esDivisiblePorCuatro = (anio % 4 == 0);
        
        boolean esDivisiblePor4Cientos = (anio % 400 == 0);
        boolean noEsDivisiblePorCien = (anio % 100 != 0);
        
        boolean reglaDeLosSiglos = (noEsDivisiblePorCien || esDivisiblePor4Cientos);
        
        return (esDivisiblePorCuatro && reglaDeLosSiglos);
        
        // return ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)));
        
    }

}
