import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Contacto> contactos = new ArrayList<>();

        // Para el menú:
        int opcion=0;
        int id_global=1;

        // Variables auxiliares:
        String nombre="";
        String telefono="";
        int id_contado=0;
        boolean banderilla; // Nos dice si algo fué encontrado o no

        // Simulador de CRUD de una agenda:
        // CRUD: create, read, update and delete.
        while(opcion!=5){

            // Iniciando un proceso en windows:

            try{
                ProcessBuilder processBuilder = new ProcessBuilder("cmd", "/c", "cls"); // Construir el proceso
                Process iniciarProceso = processBuilder.inheritIO().start(); // Inicia el proceso
                iniciarProceso.waitFor(); // Ayuda a esperar a que windows ejecute el proceso
            }catch (Exception exception){
                System.out.println("\n\t Error: "+exception.getMessage());
            }
            banderilla=false;

            //Menú:
            System.out.print("\n\t +--------Agenda de contactos--------+");
            System.out.print("\n\t | Selecciona una opción:            |");
            System.out.print("\n\t | 1) Agregar contacto               |");
            System.out.print("\n\t | 2) Ver contactos                  |");
            System.out.print("\n\t | 3) Actualizar contacto            |");
            System.out.print("\n\t | 4) Eliminar contacto              |");
            System.out.print("\n\t | 5) Salir de la agenda             |");
            System.out.print("\n\t +-----------------------------------+");
            System.out.print("\n\t ||||||||||||| Opción: ");
            opcion = scanner.nextInt(); scanner.nextLine();

            // Funcionalidad de cada opción:

            switch (opcion){
                case 1 -> { // Agregar contacto:
                    System.out.print("\n\t <Agregando contacto>");
                    System.out.print("\n\t Nombre: ");
                    nombre=scanner.nextLine();
                    System.out.print("\n\t Teléfono: ");
                    telefono= scanner.nextLine();
                    Contacto contacto = new Contacto(id_global,nombre,telefono);
                    id_global++;
                    contactos.add(contacto);
                    System.out.print("\n\t Contacto guardado!");
                    contacto.mostrarContacto();
                }
                case 2 -> { // Ver los contactos
                    System.out.print("\n\t +---------Lista de contactos----------+");
                    if(contactos.isEmpty()){
                        System.out.print("\n\t | Agenda vacía...");
                    }else{
                        for (Contacto contacto : contactos) {
                            contacto.mostrarContacto();
                        }
                    }
                }
                case 3 -> { // Actualizar un contacto:
                    System.out.print("\n\t Dame el id del contacto a actualizar: ");
                    id_contado = scanner.nextInt(); scanner.nextLine();

                    // Algortimo de busqueda secuencial:
                    for(Contacto contacto : contactos){
                        if(id_contado==contacto.getId()){
                            System.out.print("\n\t +----------Contacto encontrado---------+");
                            System.out.print("\n\t <Modificando contacto>");
                            contacto.mostrarContacto();

                            // Modificando el contacto:
                            System.out.print("\n\t Nombre: ");
                            nombre=scanner.nextLine();
                            System.out.print("\n\t Teléfono: ");
                            telefono= scanner.nextLine();

                            // Usando los setters:
                            contacto.setNombre(nombre);
                            contacto.setTelefono(telefono);
                            System.out.print("\n\t +----------Contacto modificado---------+");
                            contacto.mostrarContacto();
                            banderilla=true;
                            break; // Rompe con el ciclo for para no seguir buscando
                        }
                    }
                    if(banderilla==false){
                        System.out.print("\n\t Ningún contacto tiene el ID proporcionado...");
                    }
                }
                case 4 -> {
                    System.out.print("\n\t Dame el id del contacto a eliminar: ");
                    id_contado = scanner.nextInt(); scanner.nextLine();

                    // Algortimo de busqueda secuencial:
                    for(Contacto contacto : contactos) {
                        if (id_contado == contacto.getId()) {
                            System.out.print("\n\t +----------Contacto encontrado---------+");
                            System.out.print("\n\t <Eliminando contacto>");
                            contacto.mostrarContacto();
                            contactos.remove(contacto); // Eliminando el contacto de la lista
                            System.out.print("\n\t Contacto eliminado...");
                            banderilla=true;
                            break;
                        }
                    }
                    if(banderilla==false){
                        System.out.print("\n\t Ningún contacto cuenta con el ID proporcionado.");
                    }

                }

                case 5 -> {
                    System.out.println("\n\t Nos vemos pronto...");
                }

            }

            System.out.print("\n\t Pulsa [ENTER] para continuar...");
            scanner.nextLine(); // Simula un enter...
        }

        scanner.close();

    }

}
