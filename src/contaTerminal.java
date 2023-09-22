public class contaTerminal {
    public static void main(String[] args) {
         String nome = args [0];
         String sobrenome = args[1];
         String banco = args [2]; 
         int conta = Integer.valueOf(args [3]);
        double saldo = Double.valueOf(args[4]); 
         
         System.out.println("Por favor Informe seu nome:" + nome);

         System.out.println("Informe seu sobrenome: "+ sobrenome);

        System.out.println("Por favor digite o numero da sua conta:"+conta );

        System.out.println("A sua agencia é o Banco: "+banco);

        System.out.println("Saldo disponivel: "+ saldo);

        System.out.println("Olá "+ nome+ " " + sobrenome+ ",obrigado por criar uma conta em nosso banco,sua agencia é "+ banco + ",conta: "+ conta + ",e seu saldo: "+ saldo +",ja esta disponivel para saque."  );

    }
}
