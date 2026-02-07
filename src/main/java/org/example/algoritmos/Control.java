package org.example.algoritmos;

import java.util.Scanner;
import java.util.ArrayList;

//EN ESTA CLASE MANEJAREMOS LA TERMINAL!!
public class Control {

    public static void main(String[] args) {

        Coleccion coleccion = new Coleccion();
        Scanner sc = new Scanner(System.in);

        coleccion.cargarArchivo("datos.txt");

        //MENU DE OPCIONES

        int op;

        do{
            System.out.println("SISTEMA DE SALUD MENTAL INTEGRAL");
            System.out.println("--------------------------------");
            System.out.println("1. Agregar instrumento");
            System.out.println("2. Consultar instrumento");
            System.out.println("3. Eliminar instrumento por clave");
            System.out.println("4. Salir");

            op = sc.nextInt();
            sc.nextLine();

            switch(op){
                case 1:
                    System.out.println("--------------------------------");
                    System.out.println("Ingresa la clave del instrumento:");
                    int clave = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Ingresa el nombre del instrumento:");
                    String nombre = sc.nextLine();

                    System.out.print("¿Cual es su condición? (ESTRES, ANSIEDAD, AMBAS): ");
                    Instrumento.Condicion condicion =
                            Instrumento.Condicion.valueOf(sc.nextLine().toUpperCase());

                    System.out.print("¿Cual es su forma? (TEST, ESCALA, CUESTIONARIO): ");
                    Instrumento.Forma forma =
                            Instrumento.Forma.valueOf(sc.nextLine().toUpperCase());

                    System.out.println("¿Que tipo de instrumento? (true = identificar o false = manejar)");
                    boolean tipo = sc.nextBoolean();
                    sc.nextLine();

                    System.out.println("Ingresa el autor(es) del instrumento:");
                    String autores = sc.nextLine();

                    System.out.println("¿Es de confianza? (true = si  false = no)");
                    boolean confianza = sc.nextBoolean();
                    sc.nextLine();

                    System.out.println("¿Tiene validez? (true = si  false = no)");
                    boolean validez = sc.nextBoolean();
                    sc.nextLine();

                    System.out.println("Ingresa la cita del instrumento:");
                    String citaDeEvaluacion = sc.nextLine();

                    Instrumento nuevoInstrumento = new Instrumento(clave,nombre,condicion,forma,tipo,autores,confianza,validez,citaDeEvaluacion);
                    coleccion.agregarInstrumento(nuevoInstrumento);
                    System.out.println("Instrumento agregado!!");

                break;

                case 2:
                    int opConsulta;
                    do {
                        System.out.println("--------------------------------");
                        System.out.println("MENU DE CONSULTAS");
                        System.out.println("--------------------------------");
                        System.out.println("1. Consultar por clave");
                        System.out.println("2. Consultar por autor");
                        System.out.println("3. Consultar por tipo");
                        System.out.println("4. Consultar por forma");
                        System.out.println("5. Consultar por condicion");
                        System.out.println("6. Consultar por validez");
                        System.out.println("7. Consultar por confianza");
                        System.out.println("8. Consultar por condicion y validez");
                        System.out.println("9. Regresar al menu principal");
                        opConsulta = sc.nextInt();
                        sc.nextLine();


                        switch (opConsulta) {
                            case 1:
                                System.out.println("------------------------------");
                                System.out.println("Ingresa la clave del instrumento:");
                                int claveC = sc.nextInt();
                                sc.nextLine();

                                ArrayList<Instrumento> porClave =
                                        coleccion.consultarPorClave(claveC);

                                for (Instrumento i : porClave) {
                                    System.out.println(i);
                                }

                            break;

                            case 2:
                                System.out.println("------------------------------");
                                System.out.println("Ingresa el nombre del instrumento:");
                                String autorC = sc.nextLine();

                                ArrayList<Instrumento> porAutor =
                                        coleccion.consultarPorAutor(autorC);

                                for (Instrumento i : porAutor) {
                                    System.out.println(i);
                                }
                            break;

                            case 3:
                                System.out.println("------------------------------");
                                System.out.println("Ingresa el tipo: (true = identificar o false = manejar)");
                                boolean tipoC = sc.nextBoolean();
                                sc.nextLine();

                                ArrayList<Instrumento> porTipo =
                                        coleccion.consultarPorTipo(tipoC);

                                for (Instrumento i : porTipo) {
                                    System.out.println(i);
                                }

                            break;

                            case 4:
                                System.out.println("------------------------------");
                                System.out.print("Ingresa su forma: (TEST, ESCALA, CUESTIONARIO): ");
                                Instrumento.Forma formaC =
                                        Instrumento.Forma.valueOf(sc.nextLine().toUpperCase());

                                ArrayList<Instrumento> porForma =
                                        coleccion.consultarPorForma(formaC);

                                for (Instrumento i : porForma) {
                                    System.out.println(i);
                                }
                            break;

                            case 5:
                                System.out.println("------------------------------");
                                System.out.print("Ingresa su condición: (ESTRES, ANSIEDAD, AMBAS): ");
                                Instrumento.Condicion condicionC =
                                        Instrumento.Condicion.valueOf(sc.nextLine().toUpperCase());

                                ArrayList<Instrumento> porCondicion =
                                        coleccion.consultarPorCondicion(condicionC);

                                for (Instrumento i : porCondicion) {
                                    System.out.println(i);
                                }
                            break;

                            case 6:
                                System.out.println("------------------------------");
                                System.out.println("Ingresa si tiene validez: (true = si  false = no) ");
                                boolean validezC = sc.nextBoolean();
                                sc.nextLine();

                                ArrayList<Instrumento> porValidez =
                                        coleccion.consultarPorValidez(validezC);

                                for (Instrumento i : porValidez) {
                                    System.out.println(i);
                                }

                            break;

                            case 7:
                                System.out.println("------------------------------");
                                System.out.println("Ingresa si es de confianza: (true = si  false = no) ");
                                boolean confianzaC = sc.nextBoolean();
                                sc.nextLine();

                                ArrayList<Instrumento> porConfianza =
                                        coleccion.consultarPorConfiabilidad(confianzaC);

                                for (Instrumento i : porConfianza) {
                                    System.out.println(i);
                                }

                            break;

                            case 8:
                                System.out.println("------------------------------");
                                System.out.print("Ingresa la condición: (ESTRES, ANSIEDAD, AMBAS): ");
                                Instrumento.Condicion condicionV =
                                        Instrumento.Condicion.valueOf(sc.nextLine().toUpperCase());

                                ArrayList<Instrumento> porCondicionYValidez =
                                        coleccion.consultarPorCondicionYValidez(condicionV);

                                for (Instrumento i : porCondicionYValidez) {
                                    System.out.println(i);
                                }
                            break;

                            case 9:
                                System.out.println("------------------------------");

                            break;

                            default:
                                System.out.println("------------------------------");
                                System.out.println("Opcion no valida, vuelve a intentarlo");
                        }
                    }while(opConsulta!=9);

                break;

                case 3:
                    System.out.println("--------------------------------");
                    System.out.println("Ingrese la clave del instrumento");
                    int claveInstr = sc.nextInt();
                    sc.nextLine();

                    if (coleccion.eliminar(claveInstr)){
                        System.out.println("El instrumento se eliminado correctamente");
                    }
                    else{
                        System.out.println("El instrumento no existe");
                    }

                    break;

                case 4:
                    System.out.println("--------------------------------");
                    coleccion.actualizarArchivo("datos.txt");
                    System.out.println("Muchas gracias por visitar, saliendo!!");
                break;

                default:
                    System.out.println("--------------------------------");
                    System.out.println("Opcion no valida, vuelva a intentarlo");
                    System.out.println("------------------------------");
            }
        }while(op !=4);

        sc.close();

    }
}
