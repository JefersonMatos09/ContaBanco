public class contaTerminal {
    public static void main(String[] args) {
         String nome = args [0];
         double saldo = Double.valueOf(args[1]);
         int conta = Integer.valueOf(args [2]);
         String banco = args [3]; 
         
         System.out.println("Por favor Insira seu nome:");

        System.out.println("Por favor digite o numero da sua conta:");

        System.out.println("A sua agencia é o Banco: ");

        System.out.println("Olá "+ nome + ",obrigado por criar uma conta em nosso banco,sua agencia é "+ banco + ",conta: "+ conta + ",e seu saldo: "+ saldo +",ja esta disponivel para saque."  );

System.out.println("Não desista");
    }
}
