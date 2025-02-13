import java.util.Scanner;

public class ClinicaVeterinaria {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o seu nome ?");
        String nome = sc.next();

        System.out.println("Qual o seu cpf ?");
        String cpf = sc.next();

        System.out.println("Qual o nome do seu cachorro ?");
        String nomeDog = sc.next();

        if (cpf.length() != 11){
            System.out.println(nome + ", o seu cachorro, " + nomeDog + ", não foi cadastrado .");
        }else {
            System.out.println( nome + ", o seu cachorro, " + nomeDog + ", foi cadastrado .");

        }
    }
}
