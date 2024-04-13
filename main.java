import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    adivina nuemero (1,59,100);


    public static void adivinador (int menor, int mayor )50
    Random random = new Random();
    int numeroAleatorio=random.nextInt(100)
    int intento, intento = 0;
    Scanner input = new Scanner(System.in);

    boolean adivinador = false;System.out.println("adivina el numero entre 0 a 100!");

    while(!adivinador)
    {
        System.out.println("ingrese numero");
        numero = numero.nextInt();
        numero++;

        if (numero > numeroAleatorio) {
            System.out.println("muy alto intentalo de nuevo");
        } else if (numero > numeroAleatorio) {
            System.out.println("muy bajo intentelo de nuevo ");
        } else {
            adivinador = true;
        }
        if (adivinador) {
            System.out.println("!felicitaciones¡ !adivinaste el nuemero¡");
        } else {
            System.out.println("oh no¡ !Has perdido¡ El nuemero era: " + numeroAleatorio);

        }
    }
}
}