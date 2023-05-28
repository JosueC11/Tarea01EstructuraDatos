package tarea01;

import javax.swing.JOptionPane;

public class Menu {

    public void mostrarMenu() {
        Ejercicios e = new Ejercicios();

        int respuesta = Integer.parseInt(
                JOptionPane.showInputDialog("""
                                            Menú\n
                                            1.   Problema 1 
                                            2.   Problema 2 
                                            3.   Problema 3 
                                            4.   Problema 4 
                                            5.   Problema 5 
                                            6.   Problema 6\n
                                            Digite una opcion:
                                            """));

        switch (respuesta) {
            case 1:
                
                try {

                    int numeroInvertir = Integer.parseInt
                            (JOptionPane.showInputDialog("Digite el numero "
                                    + "a invertir: "));

                    int res1 = e.invertirCifras(numeroInvertir);

                    if (res1 == -1) {
                    
                        JOptionPane.showMessageDialog(null,
                            "El número es negativo!!");

                    } else {
                    
                        JOptionPane.showMessageDialog(null,
                            "Número a invertir: " + numeroInvertir + "   ->   "
                            + "Número invertido: " + res1);
                    
                    }
                
                } catch (NumberFormatException ex) {
                
                    JOptionPane.showMessageDialog(null, "Error, "
                        + "debe ser un número");
                
            }

            break;

            case 2:

                String cadena = JOptionPane.showInputDialog("Digite la "
                                    + "cadena a escribir: ");

                String res2 = e.imprimirString(cadena);

                if (res2.equals("false")) {
                    
                    JOptionPane.showMessageDialog(null,
                            "No digitó ningun caracter!!");

                } else {
                    
                    JOptionPane.showMessageDialog(null,
                            "Cadena letra por letra:\n\n" + res2);
                    
                }

                break;

            case 3:
                
                try {

                    int tamañoVector = Integer.parseInt
                            (JOptionPane.showInputDialog("Digite el  "
                                + "tamaño del vector: "));

                    String res3 = e.llenarVector(tamañoVector);

                    if (res3.equals("flase")) {

                        JOptionPane.showMessageDialog(null,
                            "Error en el tamaño del vector!!");

                    } else {

                        JOptionPane.showMessageDialog(null, 
                                res3);

                    }
                } catch (NumberFormatException ex) {

                    JOptionPane.showMessageDialog(null, "Error, "
                        + "debe ser un número");

            }

            break;

            case 4:
                
                try {

                    int cantididadNumeros = Integer.parseInt
                        (JOptionPane.showInputDialog("Digite la "
                                + "cantidad de numeros: "));

                    int res4 = e.sumarNumeros(cantididadNumeros);

                    if (res4 == -1) {

                        JOptionPane.showMessageDialog(null,
                            "Error en la cantidad de numeros!!");

                    } else {

                        JOptionPane.showMessageDialog(null, 
                                "La suma de los numeros es: " + res4);

                    }
                } catch (NumberFormatException ex) {

                    JOptionPane.showMessageDialog(null, "Error, "
                        + "debe ser un número");

                }
                
                break;

            case 5:
                
                try {

                    int tabla = Integer.parseInt
                        (JOptionPane.showInputDialog("Digite la "
                                + "tabla de multiplicar: "));

                    String res5 = e.tablasMultiplicar(tabla);

                    if (res5.equals("false")) {

                        JOptionPane.showMessageDialog(null,
                            "Error en el numero de la tabla!!");

                    } else {

                        JOptionPane.showMessageDialog(null, 
                                "la tabla del:  " + tabla + " es: \n\n" + res5);

                    }
                } catch (NumberFormatException ex) {

                    JOptionPane.showMessageDialog(null, "Error, "
                        + "debe ser un número");

                }

                break;

            case 6:
                
                try {

                    int numeroSumar = Integer.parseInt
                        (JOptionPane.showInputDialog("Digite la "
                                + "tabla de multiplicar: "));

                    int res6 = e.sumarCifrasNumero(numeroSumar,"");

                    if (res6 == -1) {

                        JOptionPane.showMessageDialog(null,
                            "Error en numero para sumar sus cifras, debe ser positivo!!");

                    } else {

                        JOptionPane.showMessageDialog(null, 
                                "La suma de las cifras del numero: " + numeroSumar + "   es:   " + res6);

                    }
                } catch (NumberFormatException ex) {

                    JOptionPane.showMessageDialog(null, "Error, "
                        + "debe ser un número");

                }
                
                break;

            default:

                JOptionPane.showMessageDialog(null, "Error");
        }
    }
}
