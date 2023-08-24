import java.util.Scanner;

import model.entiites.Conta;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Informe os dados da conta");
        System.out.print("Número: ");
        int numero = sc.nextInt();
        System.out.print("Correntista: ");
        sc.nextLine();
        String nome = sc.nextLine();
        System.out.print("Saldo inicial: ");
        double saldo = sc.nextDouble();
        System.out.print("Limite de saque: ");
        double limite = sc.nextDouble();

        Conta novaConta = new Conta(numero, nome, saldo, limite);

        System.out.println();
        System.out.println(novaConta);
        
        System.out.println();

        System.out.print("Informo o valor desejado para saque: ");
        double quantiaSaque = sc.nextDouble();

        try{
            novaConta.saque(quantiaSaque);
        }
        catch (IllegalArgumentException e){
            System.out.println("Erro no saque: " + e.getMessage());
        }

        sc.close();
    }
}
