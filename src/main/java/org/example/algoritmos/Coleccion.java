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
        return coleccion;
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

    //CONSULTAS

    //CONSULTA - recibe el autor y regresa una cadena (los instrumentos)
    public ArrayList<Instrumento> consultarPorAutor(String autor) {
        ArrayList<Instrumento> instrumentos = new ArrayList<>();
        return coleccion.stream()
                .filter(i -> i.getAutores().toLowerCase().contains(autor.toLowerCase()))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    //CONSULTA - recibe el tipo y regresa una cadena (los instrumentos)
    public ArrayList<Instrumento> consultarPorTipo(boolean tipo) {
        return coleccion.stream()
                .filter(i -> i.getTipo() == tipo)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public ArrayList<Instrumento> consultarPorClave(int clave) {
        return coleccion.stream()
                .filter(i -> i.getClave() == clave)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public ArrayList<Instrumento> consultarPorForma(Instrumento.Forma forma) {
        return coleccion.stream()
                .filter(i -> i.getForma() == forma)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public ArrayList<Instrumento> consultarPorCondicion(Instrumento.Condicion condicion) {
        return coleccion.stream()
                .filter(i -> i.getCondicion() == condicion)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public ArrayList<Instrumento> consultarPorValidez(boolean validez){
        return coleccion.stream()
                .filter(i -> i.isValidez() == validez)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public ArrayList<Instrumento> consultarPorConfiabilidad(boolean confianza){
        return coleccion.stream()
                .filter(i -> i.isConfianza() == confianza)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public ArrayList<Instrumento> consultarPorCita(String cita) {
        return coleccion.stream()
                .filter(i -> i.getCitaDeEvaluacion().toLowerCase().contains(cita.toLowerCase()))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    //Realizar una consulta extra, mostrar los instrumentos de acuerdo a la condición y si están validados

    public ArrayList<Instrumento> consultarPorCondicionYValidez(Instrumento.Condicion condicion) {
        return coleccion.stream()
                .filter(i -> i.getCondicion() == condicion && i.isValidez())
                .collect(Collectors.toCollection(ArrayList::new));
    }

    //ELIMINAR - elimina por clave
    public boolean eliminar(int Clave) {
        return coleccion.removeIf(i -> i.getClave() == Clave);
    }
}