import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.println("Quanto você ganha por hora? ");
        double ganhoHora = console.nextDouble();
        System.out.println("Quantas horas você trabalha por mês? ");
        int horasTrabalhadas = console.nextInt();
    
        double salario = horasTrabalhadas * ganhoHora;
    
        System.out.println("O valor do seu salário mensal é " + salario);
    
        console.close();
        }
}
