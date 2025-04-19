package controllers;
import models.Persona;

public class MetodoOrdenamiento {

    public void ordenamientoPersonas(int cantidad, Persona[] personas){

        for(int i = 0; i < cantidad; i++){
            for(int j = 0; j < cantidad -i-1; j++){

                if(personas[j].getEdad() > personas[j + 1].getEdad()){ // colocamos getEdad porq nuestro atributo es privado
                    Persona temp = personas[j];
                    personas[j] = personas[j + 1];
                    personas[j + 1] = temp;
                }
            }
        }
    }

    public int[] arregloEdades(Persona[] personas, int cantidad){
        int[] edades = new int[cantidad];

        for(int i = 0; i < cantidad; i++){
            edades[i] = personas[i].getEdad();
        }

        return edades;
    }

    public void imprimirArreglo(int [] edades){
        for(int i = 0; i < edades.length; i++){
            System.out.print(edades[i] + "  |  ");
        }
        System.out.println();
    }
}
