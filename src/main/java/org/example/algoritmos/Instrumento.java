package org.example.algoritmos;

public class Instrumento {

    enum Condicion{
        ESTRES, ANSIEDAD, AMBAS
    }

    enum Forma{
        TEST, ESCALA, CUESTIONARIO
    }

    private int clave;//ID DEL INSTRUMENTO
    private String nombre;//NOMBRE DEL INSTRUMENTO
    private Condicion condicion;//ANSIEDAD ESTRES O AMBAS
    private Forma forma;//TEST, ESCALA O CUESTIONARIO
    private boolean tipo; //ES PARA IDENTIFICAR O TRATAR
    private String autores;//NOMBRE DEL AUTOR O AUTORES
    private boolean confianza;//CUENTA O NO CON EVALUACION DE CONFIANZA
    private boolean validez;//CUENTA O NO CON EVALUACION DE VALIDEZ
    private String citaDeEvaluacion;

    //MODIFICARLO A MI MODELO PROPIO UWU
    public Instrumento(int clave, String nombre, Condicion condicion, Forma forma,boolean tipo,
                       String autores, boolean confianza, boolean validez, String citaDeEvaluacion) {
        this.clave = clave;
        this.nombre = nombre;
        this.condicion = condicion;
        this.forma = forma;
        this.tipo=tipo;
        this.autores = autores;
        this.confianza = confianza;
        this.validez=validez;
        this.citaDeEvaluacion = citaDeEvaluacion;
    }

    //GETTERS
    public String getNombre(){return nombre;}
    public Condicion getCondicion(){return condicion;}
    public Forma getForma() {return forma;}
    public boolean getTipo() {return tipo;}
    public String getAutores(){return autores;}
    public int getClave() {return clave;}
    public String getCitaDeEvaluacion() {return citaDeEvaluacion;}
    public boolean isConfianza() {return confianza;}
    public boolean isValidez() {return validez;}

    //SETTERS
    public void setCondicion(Condicion condicion) {this.condicion = condicion;}
    public void setForma(Forma forma) {this.forma = forma;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setAutores(String autores) {this.autores = autores;}
    public void setCitaDeEvaluacion(String citaDeEvaluacion) {this.citaDeEvaluacion = citaDeEvaluacion;}
    public void setTipo(boolean tipo) {this.tipo = tipo;}
    public void setClave(int clave) {this.clave = clave;}
    public void setConfianza(boolean confianza) {this.confianza = confianza;}
    public void setValidez(boolean validez) {this.validez = validez;}


    //otros metodos
    public String toString(){
        return "Instrumento {" +
                "clave=" + clave +
                ", \n nombre='" + nombre + '\'' +
                ", \n condicion=" + condicion +
                ", \n forma=" + forma +
                ", \n autor(es)='" + autores + '\'' +
                ", \n tipo=" + tipo +
                ", \n confiabilidad=" + (confianza ? "Sí" : "No") +
                ", \n validez=" + (validez ? "Sí" : "No") +
                ", \n cita='" + citaDeEvaluacion + '\'' +
                '}';
    }
}