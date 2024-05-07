
import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Por favor, digite o número da conta:");
        int numero = Integer.parseInt(scanner.nextLine());
        
        System.out.println("Por favor, digite o número da agência:");
        String agencia = scanner.nextLine();
        
        System.out.println("Por favor, digite o nome do cliente:");
        String nomeCliente = scanner.nextLine();
        
        System.out.println("Por favor, digite o saldo:");
        double saldo = Double.parseDouble(scanner.nextLine());
        
        
        System.out.println("\n=======================================");
        System.out.println("          DETALHES DA CONTA BANCÁRIA");
        System.out.println("=======================================");
        System.out.printf("Titular da Conta: %s\n", nomeCliente);
        System.out.printf("Número da Agência: %s\n", agencia);
        System.out.printf("Número da Conta: %d\n", numero);
        System.out.printf("Saldo Atual: R$%.2f\n", saldo);
        System.out.println("=======================================");
        System.out.println("Sua conta está pronta para ser utilizada!");
        System.out.println("=======================================\n");
        
        
        scanner.close();
    }
}