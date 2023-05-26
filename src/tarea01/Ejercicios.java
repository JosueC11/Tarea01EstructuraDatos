package tarea01;

import javax.swing.JOptionPane;

public class Ejercicios 
{ 
    //////////  EJERCICIO NÚMERO 1 //////////
    
    public int invertirCifras(int numeroInvertir)
    {
        if (numeroInvertir < 0)
        { 
            return -1;
        }
        else
        {
            return invertirCifrasR(numeroInvertir, 0,0);   
        }
    }
    
    private int invertirCifrasR(int numeroInvertir, int respuesta, int dig)
    {
        if (numeroInvertir > 0)
        {
            dig  = numeroInvertir % 10;
            respuesta = (respuesta * 10) + dig;
            numeroInvertir = numeroInvertir / 10;
            
            return invertirCifrasR(numeroInvertir, respuesta,0);
        }
        else
        {
            return respuesta;
        }
    }
    
    //////////  FIN  //////////
    
    //////////  EJERCICIO NÚMERO 2 //////////
    
    public String imprimirString(String cadena){
        
        if (cadena.length() == 0){
            
            return "false";
        }
        
        return imprimirStringR(cadena,0," ");
    }
    
    private String imprimirStringR(String cadena, int indice, String nuevaCadena)
    { 
        if(indice < cadena.length())
        {
            nuevaCadena += "C" + (indice+1) + " = " + cadena.charAt(indice) 
                    + "\n";
            
            return imprimirStringR(cadena, indice + 1, nuevaCadena);
        }
        else
        {
            return nuevaCadena;  
        }
    }
    
    //////////  FIN  //////////
    
    //////////  EJERCICIO NÚMERO 3 //////////

    
    public String llenarVector(int tamañoVector)
    { 
        if (tamañoVector < 1)
        {
            return "false";   
        }
        else
        {
            int vec [] = new int [tamañoVector];
            
            return llenarVectorR(vec, 0,0);
        }
    }

    private String llenarVectorR(int [] vec, int indice,int valor)
    {
        if (indice < vec.length)
        {
            valor = Integer.parseInt(
                    JOptionPane.showInputDialog("Digite un valor para "
                                                + "llenar el vector: "));
            
            vec [indice] = valor;
            
            return llenarVectorR(vec, indice + 1,0);
        }
        else
        {
            return convertirVectorR(vec,0,"");
        }      
    }

    private String convertirVectorR(int [] vec, int indice,String vecString){
        
        if (indice < vec.length)
        {
            vecString += " " + vec[indice] + ",  ";
            
            return convertirVectorR(vec, indice + 1, vecString);
        }
        else
        {
            return mostrarVectorYDatos(vec, 0, vecString,vec[0]);
        }
    }
    
    private String mostrarVectorYDatos(int [] vec, int indice, String vecString,int mayor)
    {
        if (indice < vec.length)
        {
            if (vec[indice] > mayor)
            {
                mayor = vec[indice];    
            }   
            
            return mostrarVectorYDatos(vec, indice + 1, vecString,mayor);
        }
        else
        {
            return "El vector es: " + vecString + "\n\n" + "El mayor valor es:   " + mayor;
        }
        
    }
}
