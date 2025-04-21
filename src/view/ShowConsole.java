package view;
import java.util.Scanner;

public class ShowConsole {

    private Scanner scanner = new Scanner(System.in);

    public void showMenu(){
        //System.out.println("Metodo Busqueda Binaria");
    }

    public int getEdad(){
        System.out.printf("Ingrese la edad -> ");
        int edad = scanner.nextInt();
        return edad;
    }

    public void showMesagge(String message){
        System.out.println(message);
    }
}
