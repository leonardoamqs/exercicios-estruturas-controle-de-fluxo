import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    //todo:crie um algoritimo e valide a media de um aluno , se a media for igual ou maior que 6 ele esta aprovado , se nao  ele esta reprovado

        int nota01 = 0;
        int nota02 = 1;
        int nota03 = 2;
        double media = (nota01 + nota02 + nota03) /3;

        if (media >=6) {
            System.out.println("aprovado");

        }else {
            System.out.println("reprovado");
        }
    }
}