import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    ArrayList<Persona> agenda = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void ingresarPersona(){
        System.out.println("Ingrese el nombre de la persona: ");
        String nombre = scanner.next();
        System.out.println("Ingrese el apellido de la persona: ");
        String apellido = scanner.next();
        System.out.println("Ingrese el documento de la persona: ");
        Integer documento = scanner.nextInt();
        System.out.println("Ingrese fecha de nacimiento: ");
        String fechaNacimiento = scanner.next();
        
        Persona persona = new Persona(nombre,apellido,documento,fechaNacimiento);
        agenda.add(persona);        
        System.out.println("Persona cargada con exito");
    }
    
    public void buscarPersona() {
        
        System.out.print("Ingrese el documento a buscar: ");
        Integer documentoBuscar = scanner.nextInt();
        for (Persona persona : agenda) {
            if(persona.documento == documentoBuscar) {
                System.out.println("Persona encontrada");
                System.out.println("Nombre: " + persona.nombre);
                System.out.println("Apellido: " + persona.apellido);
                System.out.println("Documento: " + persona.documento);
                System.out.println("Fecha de Nacimiento: " + persona.fechaNacimiento);               
            }
        }
        System.out.println("Persona no encontrada.");
    }
    
    public void listarPersona(){
        
        System.out.println("Lista de personas");
        for(Persona persona : agenda){
            System.out.println("Nombre: " + persona.nombre);
            System.out.println("Apellido: " + persona.apellido);
            System.out.println("Documento: " + persona.documento);
            System.out.println("Fecha de nacimiento: " + persona.fechaNacimiento);
        }
    }
}
