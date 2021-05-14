package exer3fase1;
import java.util.Scanner;
public class Exer3fase1 {
    public static void main(String[] args) {
        // Declaració de variables per generar la sèrie
        int n, f = 0;
        int t1 = 1;
        int t2;
        
        // Inicialització Scanner
        Scanner lector = new Scanner(System.in);
        
        // Demanem un nombre per el teclat
        System.out.print("Escriu un nombre: ");
        n = lector.nextInt();
        
        // Bucle for per generar la seqüència i mostrar per consola
        for (int i = 1; i <=n; i++) {
            t2 = f;
            f = t1 + f;
            t1 = t2;
            System.out.print(t1 + " ");
        }
        System.out.println();
    }
}

   

