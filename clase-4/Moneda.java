public class Moneda {

    public static void main(String[] args) {

        // Math.random() nos devuelve un número double
        // La coersión en Java es acto de transformar
        // de un tipo de dato a otro, hay dos tipos:
        // 1) Explícita (forzado)
        // 2) Implícita (automatico)
        int moneda=(int)(Math.random()*2);
        // 0.4 -> 0.8 = 0 , 0.7 -> 1.4 = 1 ,

        if(moneda==0){
            System.out.println("\n\t "+LadosMoneda.SOOOOOOOOOL);
        }else{
            System.out.println("\n\t "+LadosMoneda.AGUILAAAAAA);
        }

    }

}

/*
*   Ejemplo de listas donde los elementos son constantes:
*
*   1) Los dias de una semana (lunes, martes,...)
*   2) Cara de una moneda (cara,sol)
*   3) Dias festivos ( dia del amor y amistad, dia de las mamas, dia de la idependencia)
*
* */
