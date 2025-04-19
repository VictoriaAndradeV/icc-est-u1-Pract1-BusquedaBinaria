package controllers;

import view.ShowConsole;
import models.Persona;

public class MetodoBBinaria {

    private Persona[] people;
    private ShowConsole showConsole;
    private int [] arregloEdades;
    

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

            if(arregloEdades[central] == edad){
                return central;
            }

            if(arregloEdades[central] < edad){ //nos vamos a la derecha, se actualiza el bajo
                bajo = central + 1;
            }else {
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
            showConsole.showMesagge("Persona con la edad -> " + ageToFind + " ENCONTRADA");
            showConsole.showMesagge(people[indexPerson].toString());
        }
    }
    

}
