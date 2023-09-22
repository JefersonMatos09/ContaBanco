import java.util.Locale;
import java.util.Scanner;

public class contaScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
     System.out.println("Por favor Informe seu nome:");
String nome = scanner.next();

        System.out.println("Informe seu sobrenome: ");
String sobrenome = scanner.next();

       System.out.println("A sua agencia é o Banco: ");
String banco = scanner.next();

       System.out.println("Por favor digite o numero da sua conta:");
int conta = scanner.nextInt();

       System.out.println("Saldo disponivel: ");
double saldo = scanner.nextDouble();

System.out.println("Olá "+ nome+ " " + sobrenome+ ",obrigado por criar uma conta em nosso banco,sua agencia é "+ banco + ",conta: "+ conta + ",e seu saldo: "+ saldo +",ja esta disponivel para saque."  );

    }
    
}
