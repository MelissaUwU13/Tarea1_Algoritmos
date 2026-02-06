package org.example.algoritmos;
import java.util.ArrayList;
import java.util.Locale;
import java.util.stream.Collectors;

//EN ESTA CLASE SE HACEN LAS COLECCIONES Y METODOS, MAS NO IMPRIME NADA!!
public class Coleccion {

    private ArrayList<Instrumento> coleccion;

    public Coleccion() {
        coleccion = new ArrayList<>();
    }

    public Coleccion(ArrayList<Instrumento> coleccion) {
        this.coleccion = coleccion;
    }


    //GETTERS
    public ArrayList<Instrumento> getColeccion() {
        return getColeccion();
    }

    //SETTERS
    public void setColeccion(ArrayList<Instrumento> coleccion) {
        this.coleccion = coleccion;
    }



//OTROS METODOS

    //AGREGAR - agrega un instrumento a la coleccion
    public void agregarInstrumento(Instrumento instrumento) {
        coleccion.add(instrumento);
    }


    //CONSULTASSSSSS

    //CONSULTA - recibe el autor y regresa una cadena (los instrumentos)
    public ArrayList<Instrumento> consultarPorAutor(String autor) {
        ArrayList<Instrumento> instrumentos = new ArrayList<>();

        //REVISAR
        //coleccion.stream().filter(instrumento -> instrumento.getAutores().toLowerCase.equals(autor.toLowerCase()).forEach(ArrayAutores::add)
          //      return arrayAutores;
        return null;
    }

    //CONSULTA - recibe el tipo y regresa una cadena (los instrumentos)
    public ArrayList<Instrumento> consultarPorTipo(boolean Tipo) {
      //  return(ArrayList<Instrumento>) coleccion.stream().filter(i -> i.getTipo==tipo){.collect(Collectors.toList())}
        return null; //TEMPORAL
    }

    public ArrayList<Instrumento> consultarPorClave(int clave) {
        return null;
    }

    public ArrayList<Instrumento> consultarPorForma(Instrumento.Forma forma) {
        return null;
    }

    public ArrayList<Instrumento> consultarPorCondicion(Instrumento.Condicion condicion) {
        return null;
    }

    public ArrayList<Instrumento> consultarPorValidez(boolean validez){
        return null;
    }

    public ArrayList<Instrumento> consultarPorConfiabilidad(boolean confianza){
        return null;
    }

    //UNA MAS Y YA

    public ArrayList<Instrumento> consultarPorCita(String cita) {
        return null;
    }

    //ELIMINAR - elimina por clave
    public void eliminar(int Clave) {
        coleccion.remove(Clave);
    }
}