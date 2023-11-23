
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        int repetidor;
        do {
            
            Scanner scanner = new Scanner(System.in);
            System.out.println("Bienvenidos a la agenda, que desea realizar?");
            System.out.println("1) Ingresar una persona");
            System.out.println("2) Buscar una persona por documento");
            System.out.println("3) Mostrar un listado de personas cargadas");
            System.out.println("4) Salir del programa");    
            Integer opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1 -> {
                    menu.ingresarPersona();
                    repetidor = 0;
                }
                case 2 -> {
                    menu.buscarPersona();
                    repetidor = 0;
                }
                case 3 -> {
                    menu.listarPersona();
                    repetidor = 0;
                }
                case 4 -> {
                    System.out.println("Programa terminado. Adios");
                    repetidor = 4;
                }
                default -> {
                    System.out.println("Opcion no valida. Intente de nuevo.");
                    repetidor = 0;
                }
            }
            
            

        } while (repetidor != 4);
    }
}