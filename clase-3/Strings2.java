public class Strings2 {

    public static void main(String[] args) {

        String nombre = "Erick ";
        System.out.println("\n\t Primera letra nombre: "
                +nombre.charAt(0));

        String apellido = "Alvarez";
        System.out.println("\n\t Primera letra apellido: "
                +apellido.charAt(0));

        System.out.println("\n\t Concatenadas: "
                +nombre.charAt(0)
                +apellido.charAt(0));

        System.out.println("\n\t "+nombre.concat(apellido));

    }

}
