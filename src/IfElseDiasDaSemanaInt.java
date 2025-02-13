import java.util.Scanner;

public class IfElseDiasDaSemanaInt {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("D igite o numero do seu dia preferido da semana usando 1,2,3,4,5,6,7 :");
        int Dia = sc.nextInt();

        if (Dia == 1){
            System.out.println("Seu dia preferido é Domingo " );
        }else if (Dia == 2){
            System.out.println("Seu dia preferido é Segunda-feira");
        }else if (Dia == 3){
            System.out.println("Seu dia preferido é Terça-feira");
        }else if (Dia == 4){
            System.out.println("Seu dia preferido é Quarta-feira");
        }else if (Dia == 5){
            System.out.println("Seu dia preferido é Quinta-feira");
        }else if (Dia == 6){
            System.out.println("Seu dia preferido é Sexta-feira");
        }else if (Dia == 7){
            System.out.println("Seu dia preferido é Sabado");
        }
    }
}
