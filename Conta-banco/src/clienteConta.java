public class clienteConta {
    public static void main(String[] args) throws Exception {
        
        terminalConta TerminalConta = new terminalConta();

        System.out.println("Digite o nome do cliente: " + TerminalConta.nome);
        System.out.println("Qual o banco: " + TerminalConta.agencia);
        System.out.println("Por favor digite o numero da agencia: "+ TerminalConta.numero);
        System.out.println("Olá "+ TerminalConta.nome + ", obrigado por criar uma conta em nosso banco, sua agencia é "+ TerminalConta.agencia + ", conta:" + TerminalConta.numero + ",e seu saldo: " + TerminalConta.saldo + "já esta disponível para saque .");
    
    }
}
