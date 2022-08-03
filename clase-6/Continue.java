public class Continue {

    public static void main(String[] args) {

        int i = 0; // Variable de control

        while(i<10){ // Condición
            i++; // Incremento
            if(i==4 || i == 9)
                continue;
            System.out.println("\n\t i = "+i);
        }

    }

}
