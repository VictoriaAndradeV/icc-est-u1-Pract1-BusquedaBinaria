package controllers;

import models.Persona;
import view.ShowConsole;

public class MetodoBBinaria {

    private Persona[] people;
    private ShowConsole showConsole;
    private int [] arregloEdades; //arreglo ordenado
    

    public MetodoBBinaria(int[] arregloEdades, Persona[] personas) {
        this.arregloEdades = arregloEdades;
        this.people = personas;
        this.showConsole = new ShowConsole();
        showConsole.showMesagge("Metodo de Busqueda Binaria");
    }

    public int findPersonByAge(int edad){
        int bajo = 0;
        int alto = (arregloEdades.length - 1);

        
        while(bajo <= alto){

            int central = (bajo + alto)/2;
            System.out.print("Bajo = " +bajo + "  Alto = " + alto + "   centro = " +central + "  valorCentro = " +arregloEdades[central]);

            if(arregloEdades[central] == edad){ // caso en el que el numero buscado coincide con el central calculado
                return central;
            }

            if(arregloEdades[central] < edad){ //nos vamos a la derecha, se actualiza el bajo
                System.out.println("  DERECHA --> ");
                bajo = central + 1;
            }else {
                System.out.println("  IZQUIERDA --> ");
                alto = central - 1;
            }
        }
        return -1;
    }

    public void showPersonByAge(){
        int ageToFind = showConsole.getEdad();
        int indexPerson = findPersonByAge(ageToFind);

        if(indexPerson == -1){
            showConsole.showMesagge("NO existe la persona buscada");
        } else{
            System.out.println();
            showConsole.showMesagge("Persona con la edad -> " + ageToFind + " ENCONTRADA");
            showConsole.showMesagge(people[indexPerson].toString());
        }
    }
    

}
