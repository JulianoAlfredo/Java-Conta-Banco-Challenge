import java.util.Scanner;

public class ContaTerminal
 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá! Bem vindo, digite seu nome !");
        String nome = scanner.nextLine();

        System.out.println("Obrigado por informar seu nome, "+nome+", agora, digite o numero da sua conta");
        int contaNumero = scanner.nextInt();

        System.out.println("Conta numero: "+contaNumero+" registrado! \nPor favor, agora digite os digitos da agencia!");
        String agenciaDigito = scanner.next();

        System.out.println("Sucesso! Digito da agencia cadastrado com sucesso. \nPor favor, me informe o seu saldo !\nObs: Digite o valor dessa forma -> 99,99 | 100,99");
        Double saldo = scanner.nextDouble();
        

        System.out.println("\n\n\n\n\n\n\n\nOlá "+ nome+", obrigado por criar uma conta em nosso banco, sua agência é "+agenciaDigito+", conta "+contaNumero+" seu saldo "+saldo+" já está disponível para saque");
        
        scanner.close();
    }
}
