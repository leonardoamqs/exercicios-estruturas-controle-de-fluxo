import java.util.Scanner;

public class ClassificacaoIdade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String nome = sc.next();

        System.out.println("Digite sua idade");
        int idade = sc.nextInt();

        if (idade >0 && idade <=12) {
            System.out.println(nome +","+" você é uma criança");
        }else if (idade >=13 && idade <=17) {
            System.out.println(nome +","+" você é um adolescente");
        }else if (idade >=18 && idade <=64) {
            System.out.println(nome +","+" você é um adulto");
        }else {
            System.out.println(nome +","+" Você é um idoso");
        }
    }
}
