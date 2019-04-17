package utilidades;

public class CalcuadoraNumerosEspeciales {

    public boolean calcular(int anio){
        return ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)));
    }

}
