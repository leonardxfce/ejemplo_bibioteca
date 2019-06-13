package utilidades;


public class Utilidad {

    int contarVocalesDe(String araoz) {
        int conta=0;
        for (int i=0; i <araoz.length();i++){
            if((araoz.charAt(i) == 'a') ||(araoz.charAt(i) =='A')||(araoz.charAt(i)=='e')||(araoz.charAt(i)=='E')
                    ||(araoz.charAt(i)=='i')||(araoz.charAt(i)=='I')||(araoz.charAt(i)=='o')||(araoz.charAt(i)=='O')||(araoz.charAt(i)=='U')||(araoz.charAt(i)=='u')){
               conta++; 
            }
        }
        
        return conta;
    }
    
    
}
