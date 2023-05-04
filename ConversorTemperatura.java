import java.util.Scanner;

public class ConversorTemperatura{
        public static void main(String[] args){
            //Declaração de variaveis
            double c, f;
            int op;

            //Criação e instância do objeto de entrada
            Scanner entrada = new Scanner(System.in);

        do{
            System.out.println("\n\t\t\t -- Conversor Simples --\n");
                System.out.println("1. Celsius -> Fahren");
                System.out.println("2. Fahren -> Celsius");
                System.out.println("3. Sair");
                System.out.println("Opção:");
                op = entrada.nextInt();

                if(op == 1){
                    System.out.println("\n\t\t\tCelsius -> Fahren\n");
                    
                    //Entrada
                    System.out.println("Informe Celsius: ");
                    c = entrada.nextDouble();
                    
                    //Processamento
                    f = (9 * c) / 5 + 32;
                    
                    //Saida
                    System.out.printf(c + " é igual à " + f);
                

            }



        }while(op!=3);
    }
}