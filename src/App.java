import java.util.Scanner;

import controllers.MetodoOrdenamiento;
import models.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        int totalPersonas = validarPositivo(scanner);
        Persona[] personas = new Persona[totalPersonas];

        for(int i = 0; i < totalPersonas; i++){
            System.out.println("Ingrese datos de la persona " +(i+1));
            System.out.print("Nombre -> ");
            scanner.nextLine();
            String nombre = scanner.nextLine();
            int edad = validarEdad(scanner);

            personas[i] = new Persona(nombre, edad);
        }

        System.out.println("Personas ingresadas: ");
        for(Persona persona: personas){
            System.out.println(persona);
        }
        System.out.println();

        MetodoOrdenamiento metodoOrdenamiento = new MetodoOrdenamiento();
        metodoOrdenamiento.ordenamientoPersonas(totalPersonas, personas);

        int[] arreglo = metodoOrdenamiento.arregloEdades(personas, totalPersonas);
        metodoOrdenamiento.imprimirArreglo(arreglo);

        scanner.close();
    }

    // valida la cantidad de personas que se desean ingresar 
    public static int validarPositivo(Scanner scanner){
        int num = 0;
        do{
            System.out.printf("Ingrese la cantidad de Personas que desea ingresar: ");
            num = scanner.nextInt();
            if(num <= 0){
                System.out.println("La cantidad debe ser mayor a 0, ingrese nuevamente.");
            }
        } while (num <= 0);

        return num;
    }

    //Valida la Edad ingresada
    public static int validarEdad(Scanner scanner){
        int edad = 0; 
        do{
            System.out.print("Edad -> ");
            edad = scanner.nextInt();
            if ((edad <= 0)|| (edad > 110)){
                System.out.println("La edad debe ser positiva, ingrese nuevamente.");
            }
        }while ((edad <= 0)|| (edad > 110));

        return edad;
    }
}
