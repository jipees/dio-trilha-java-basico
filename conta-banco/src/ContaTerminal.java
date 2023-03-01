import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
         //obter dados
         Scanner get = new Scanner(System.in).useLocale(Locale.US);
        
         System.out.print("Por favor, digite seu nome! ");
         String nomeCliente = get.next();
         
         System.out.print("Senho(a) " + nomeCliente + " Digite sua Agêcia! ");
         String agencia = get.next();
 
         System.out.print("Digite o numero da conta! ");
         int numero = get.nextInt();
         
         System.out.print("Digite o saldo em conta! ");
         double saldo = get.nextDouble();
 
         
         //imprimindo os dados obtidos pelo usuario
         System.out.println("Olá "+ nomeCliente + ", obrigado por criar uma conta em nosso banco,");
         System.out.println("sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo +
          "\njá está disponível para saque.");
          get.close();
    }
}
