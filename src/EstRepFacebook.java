import java.util.Scanner;

public class EstRepFacebook {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String emailCorreto = "leonardoamqs@gmail.com";
        String senhaCorreta = "123456";


        int tentativas = 0;
        while (tentativas < 3) {
            System.out.println("Informe seu email ");
            String email = sc.next();

            System.out.println("Informe sua senha ");
            String senha = sc.next();

            if (email.equals(emailCorreto) && senha.equals(senhaCorreta)) {
                System.out.println("Acesso liberado");
                break;

            } else {
                System.out.println("Email e senha incorretos");
                tentativas++;
            }
        }
    }
}
// 5 tentativas  
