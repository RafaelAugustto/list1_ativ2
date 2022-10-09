import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        // requisito 1: pedir 1 número
        System.out.print("Dígite um Número: ");
        int x = sc.nextInt();
        System.out.print("O número informado foi " );
        System.out.println(x);
    }
}
