import java.util.Scanner;

public class AppContador{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número inicial do intervalo -->");
        int num1 = scanner.nextInt();

        System.out.println("Digite o número final do intervalo -->");
        int num2 = scanner.nextInt();

        try {
            
            if(num1 > num2){
                throw new ParametrosInvalidosException(null);
            }
            else{
                Contar(num1, num2);
            }
        }
        catch(ParametrosInvalidosException exception){
            System.out.println(exception.getMessage());
        }
    }

    public static void Contar(int n1, int n2){
       int contador = n2 - n1; 

       for(int i = 1; i <= contador; i++){
        System.out.println("Imprimindo o número  " + i);
       }
    }
}