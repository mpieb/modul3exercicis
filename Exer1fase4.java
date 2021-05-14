package exer1fase4;
public class Exer1fase4 {
    public static void main(String[] args) {
         // Declaració de les  variables String 
        String primeraCiutat = ("Barcelona");
        String segonaCiutat = ("Madrid");
        String terceraCiutat = ("Valencia");
        String quartaCiutat = ("Malaga");
        String cinquenaCiutat = ("Cadis");
        String sisenaCiutat = ("Santander");
        String primerArray = " ";
        String segonArray = " ";
        String tercerArray = " ";
        String quartArray = " ";
        String cinqueArray = " ";
        String siseArray = " ";
        
        // Declaració dels arrays amb la llargada de cada String
        String array[] = new String[primeraCiutat.length()];
        for (int i = 0; i < primeraCiutat.length(); i++) {
            array[i] = primeraCiutat + i;
            primerArray = array[i];
        }
        
        String arrayDos[] = new String[segonaCiutat.length()];
        for (int i = 0; i < segonaCiutat.length(); i++) {
            arrayDos[i] = segonaCiutat + i;
            segonArray = arrayDos[i];
        }
        
        String arrayTres[] = new String[terceraCiutat.length()];
        for (int i = 0; i < terceraCiutat.length(); i++) {
            arrayTres[i] = terceraCiutat + i;
            tercerArray = arrayTres[i];
        }
        
        String arrayQuatre[] = new String[quartaCiutat.length()];
        for (int i = 0; i < quartaCiutat.length(); i++) {
            arrayQuatre[i] = quartaCiutat + i;
            quartArray = arrayQuatre[i];
        }
        
        String arrayCinc[] = new String[cinquenaCiutat.length()];
        for (int i = 0; i < cinquenaCiutat.length(); i++) {
            arrayCinc[i] = cinquenaCiutat + i;
        }
        
        String arraySis[] = new String[sisenaCiutat.length()];
        for (int i = 0; i < sisenaCiutat.length(); i++) {
            arraySis[i] = sisenaCiutat + i;
        }
        
        // Es mostra per consola els nous arrays amb els noms invertits
        System.out.println("Els noms de les ciutats invertits!");
        for (int i = primeraCiutat.length()-1; i >= 0; i--) {
            System.out.print(primeraCiutat.charAt(i));
        }
        System.out.println();
        
        for (int i = segonaCiutat.length()-1; i >= 0; i--) {
            System.out.print(segonaCiutat.charAt(i));
        }
        System.out.println();
        
        for (int i = terceraCiutat.length()-1; i >= 0; i--) {
            System.out.print(terceraCiutat.charAt(i));
        }
        System.out.println();
        
        for (int i = quartaCiutat.length()-1; i >= 0; i--) {
            System.out.print(quartaCiutat.charAt(i));
        }
        System.out.println();
        
        for (int i = cinquenaCiutat.length()-1; i >= 0; i--) {
            System.out.print(cinquenaCiutat.charAt(i));
        }
        System.out.println();
        
        for (int i = sisenaCiutat.length()-1; i >=0; i--) {
            System.out.print(sisenaCiutat.charAt(i));
        }
        System.out.println();
    }
}


    
    

    
        

