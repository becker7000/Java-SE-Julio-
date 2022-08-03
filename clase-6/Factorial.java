import java.util.Scanner;
// 5! = 5*4*3*2*1 = 120
public class Factorial {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // TODO: crear un filtro para numeros entre 1 y 10
        System.out.print("\n\t Dame un número entero positivo: ");
        int num = scanner.nextInt(); scanner.nextLine();

        // Nota: las variables que guarden multiplicaciones
        // se inician en 1:
        long factorial=1;
        for(int i=num;i>1;i--){
            factorial*=i;
        }

        System.out.printf("\n\t Factorial:  %d! = %d",num,factorial);

        // i=5
        // factorial=1*5;
        // factorial=5*4; ...

        scanner.close();

    }

}


/*
*  int maximo pueden ser de -5 a 5
*  cuenta del 1 al 15
*
*   1,2,3,4,5,4,3,2,1,0,-1,-2,-3,-4
*
* */