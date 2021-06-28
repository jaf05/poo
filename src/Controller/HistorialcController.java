/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Beans.Historialc;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Dr Baltazar
 */
public class HistorialcController {

    private ArrayList<Historialc> listhis;

    public HistorialcController() {
        listhis = new ArrayList<Historialc>();
        cargar();              
    }

    //Agregar objetos al arreglo
    public void add(Historialc obj) {
        listhis.add(obj);
    }
    //Obtener un objeto

    public Historialc get(int indice) {
        return listhis.get(indice);
    }
    //Tamaño total

    public int size() {
        return listhis.size();
    }

    //Eliminar objetos
    public void remove(Historialc objhist) {
        listhis.remove(objhist);
    }

    //Coorelativo - Indetity
    public int getCorrelativo() {
        if (listhis.size() == 0) {
            return 1;
        } else {
            return listhis.get(listhis.size() - 1).getHistclini() + 1;
        }
    }

    //Métodos
    //Buscadores
    //Buscador por historia clinica
    public Historialc buscar(int histclini) { //buscar3 previamente
        for (int i = 0; i < listhis.size(); i++) {
            if (listhis.get(i).getHistclini() == histclini) {
                return listhis.get(i);
            }
        }
        return null;
    }

    //Total de pacientes               //por revisar
    public int TotalHistorialc() {
        return size();
    }

    // temperatura normal = 36,5 a 37.0, no es normal = lo demas
    //frecuencia cardiaca normal = 60 100, Arritmia. 
    //frecuencia respitoria norma =18 a 20, sino Disnea.
    //
    //MÉTODOS DE REGISTROS DE DATOS
//Método para almacenar datos en un archivo    
    public void grabar() {
        try {
            PrintWriter pw;
            String linea;
            pw = new PrintWriter(new FileWriter("C:/Users/Dr Baltazar/Desktop/PO/Apache/TrabajoFinalPoo/historialc.txt")); //para insertar datos en un archivo
            for (int i = 0; i < size(); i++) {    //Leer la lista
                linea = (listhis.get(i).getHistclini() + ";"
                        + listhis.get(i).getCita() + ";"
                        + listhis.get(i).getSintomas() + ";"
                        + listhis.get(i).getTiempos() + ";"
                        + listhis.get(i).getEnfermedad() + ";"
                        + listhis.get(i).getTemperatura() + ";"                         
                        + listhis.get(i).getFrecuenciacardi() + ";"
                        + listhis.get(i).getFrecuenciarespi() + ";"
                        + listhis.get(i).getSaturacion() + ";"
                        + listhis.get(i).getAnamnesis() + ";");
                pw.println(linea);  //Agregar el registro al archivo    
            }
            pw.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

//Método para cargar los datos de un archivo    
    public void cargar() {
        try {                        //Cada vez que se manejan archivo se usa un try and catch
            BufferedReader br; //para leer las listas
            String linea = null;
            String[] array = null;
            br = new BufferedReader(new FileReader("C:/Users/Dr Baltazar/Desktop/PO/Apache/TrabajoFinalPoo/historialc.txt"));//abrir un espacio en la memoria para meter el dato del archivo
            while ((linea = br.readLine()) != null) {
                array = linea.split(";"); //separado con slipt en vez de tokenizer
                //Crear el objeto de tipo paciente con los datos del archivo
                Historialc objhist
                        = new Historialc( //nuevo objeto del archivo producto
                                Integer.parseInt(array[0].trim()),
                                Integer.parseInt(array[1].trim()),
                                array[2].trim(),
                                Integer.parseInt(array[3].trim()),
                                array[4].trim(),
                                Double.parseDouble(array[5].trim()),
                                Integer.parseInt(array[6].trim()),
                                Integer.parseInt(array[7].trim()),
                                Integer.parseInt(array[8].trim()),
                                array[9].trim()
                        ) {
                };
                //Agregar el objeto al ArrayList
                listhis.add(objhist);//para pasar lo informacion del archivo al arreglo(array)
            }
            br.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
