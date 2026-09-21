
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double nota1, nota2, nota3, MEDIA;
        
        nota1 = leia.nextDouble();
        nota2 = leia.nextDouble();
        nota3 = leia.nextDouble();
        
        MEDIA = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;
        
        System.out.printf("MEDIA = %.1f\n", MEDIA);
    }
}
