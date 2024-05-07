import java.util.Scanner;
public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int firstParam = sc.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int secondParam = sc.nextInt();
        
        try {
            count(firstParam, secondParam);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void count(int firstParam, int secondParam) throws ParametrosInvalidosException {
        if(secondParam < firstParam) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        } else {
            int count = secondParam - firstParam;
            for(int i = 0; i < count; i++){
                System.out.printf("Imprimindo o número %d\n", i + 1);
            }
        }
    }
}
