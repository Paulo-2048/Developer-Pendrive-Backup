import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o primeiro número para calcular MMC: ");
        int number1 = sc.nextInt();
        System.out.print("Insira o segundo número para calcular MMC: ");
        int number2 = sc.nextInt();

        int min;

        if (number1 < number2) {
            min = number1;
        } else {
            min = number2;
        }
            
        int mmc = 0;
        for (int i = 1; i <= min; i++) {
            if (number1 % i == 0 && number2 % i == 0) {
                mmc = i;
            }
        }
        System.out.println("O MMC de " + number1 + " e " + number2 + " é " + mmc);
        System.out.println(" ");

        sc.close();
    }
}
