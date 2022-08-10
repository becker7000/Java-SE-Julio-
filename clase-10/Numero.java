public class Numero {

    private String numero;

    public Numero(String numero) {
        this.numero = numero;
    }

    public String transformarARomano(){

        // 0 y 3999
        Integer num = Integer.parseInt(numero);
        StringBuilder romano = new StringBuilder();

        // Ejemplo 3457
        // 3000 (miles) + 400 (centenas) + 50 (decenas) +7 (unidades)
        // MMM (miles) + CD (centenas) + L (decenas) + VII (unidades
        // 3457 = MMMCDLVII

        int miles = num/1000; num%=1000; // miles = 3, num = 457
        int centenas = num/100; num%=100; // centenas = 4 , num = 57
        int decenas = num/10; num%=10; // decenas = 5 , num = 7
        int unidades = num;

        switch (miles){
            case 1 -> romano.append("M");
            case 2 -> romano.append("MM");
            case 3 -> romano.append("MMM");
        }

        switch (centenas){
            case 1 -> romano.append("C");
            case 2 -> romano.append("CC");
            case 3 -> romano.append("CCC");
            case 4 -> romano.append("CD");
            case 5 -> romano.append("D");
            case 6 -> romano.append("DC");
            case 7 -> romano.append("DCC");
            case 8 -> romano.append("DCCC");
            case 9 -> romano.append("CM");
        }

        switch (decenas){
            case 1 -> romano.append("X");
            case 2 -> romano.append("XX");
            case 3 -> romano.append("XXX");
            case 4 -> romano.append("XL");
            case 5 -> romano.append("L");
            case 6 -> romano.append("LX");
            case 7 -> romano.append("LXX");
            case 8 -> romano.append("LXXX");
            case 9 -> romano.append("XC");
        }

        switch (unidades){
            case 1 -> romano.append("I");
            case 2 -> romano.append("II");
            case 3 -> romano.append("III");
            case 4 -> romano.append("IV");
            case 5 -> romano.append("V");
            case 6 -> romano.append("VI");
            case 7 -> romano.append("VII");
            case 8 -> romano.append("VIII");
            case 9 -> romano.append("IX");
        }

        return romano.toString();
    }

    public void mostrar(){
        System.out.println("\n\t El número es: "+numero);
    }

}


// int Integer
// char Char
// double Double