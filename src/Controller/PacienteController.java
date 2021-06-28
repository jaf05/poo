/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Beans.Historialc;
import Beans.Paciente;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Dr Baltazar
 */
public class PacienteController {
    private ArrayList<Paciente> listpa;
    
    
public PacienteController(){
        listpa = new ArrayList<Paciente>();
        cargar(); //el metodo de cargar los datos de un archivo "semana 11"              
    }    
    
    
       //Agregar objetos al arreglo
    public void add(Paciente obj){
       listpa.add(obj);
    }
   //Obtener un objeto
    public Paciente get(int indice){
        return listpa.get(indice);
    }
   //Tamaño total
    public int size(){
        return listpa.size();
    }
    
    
   //Eliminar objetos
    public void remove(Paciente objpac){
        listpa.remove(objpac);
    }
    
    //Coorelativo - Indetity
    public int getCorrelativo(){
       if(listpa.size() == 0){
         return 1;
       }else{
           return listpa.get(listpa.size()-1).getHistclini() + 1;
       }
    }
    
        //Métodos
    
    //Buscadores
        //Buscador por historia clinica
    
     public Paciente buscar(int histclini){ //buscar3 previamente
     for(int i=0;i<listpa.size();i++)
         if(listpa.get(i).getHistclini() == histclini)
             return listpa.get(i);
    return null;
    }  
    
        //Buscador por código
    
     public Paciente buscar2(int dni){ //buscar3 previamente
     for(int i=0;i<listpa.size();i++)
         if(listpa.get(i).getDni() == dni)
             return listpa.get(i);
    return null;
    }  
    
     //Total de pacientes               //por revisar
    public int getTotalP(){
        int totalp =0;
        for (int i=0;i<listpa.size();i++){
            totalp=(int) (listpa.size());
        }
        return totalp;
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
        pw = new PrintWriter(new FileWriter("C:/Users/Dr Baltazar/Desktop/PO/Apache/TrabajoFinalPoo/paciente.txt")); //para insertar datos en un archivo
        for (int i=0; i<size();i++){    //Leer la lista
            linea=(listpa.get(i).getHistclini()+";"+
                   listpa.get(i).getNomape()+";"+                    
                   listpa.get(i).getEdad()+";"+
                   listpa.get(i).getSexo()+";"+                    
                   listpa.get(i).getDni()+";"+
                   listpa.get(i).getAntecepato()+";"
                    );
            pw.println(linea);  //Agregar el registro al archivo    
        }
        pw.close();    
    } catch (Exception e){
        System.out.println(e.getMessage());
    }
    }
        
//Método para cargar los datos de un archivo    
    public void cargar(){
    try{                        //Cada vez que se manejan archivo se usa un try and catch
        BufferedReader br; //para leer las listas
        String linea=null;
        String[] array=null;
        br= new BufferedReader(new FileReader("C:/Users/Dr Baltazar/Desktop/PO/Apache/TrabajoFinalPoo/paciente.txt"));//abrir un espacio en la memoria para meter el dato del archivo
        while((linea = br.readLine())!=null){
            array = linea.split(";"); //separado con slipt en vez de tokenizer
                    //Crear el objeto de tipo paciente con los datos del archivo
                    Paciente objpac =
                            new Paciente(       //nuevo objeto del archivo producto
                                    Integer.parseInt(array[0].trim()), 
                                    array[1].trim(),                                    
                                    Integer.parseInt(array[2].trim()),
                                    array[3].trim(),                                    
                                    Integer.parseInt(array[4].trim()),
                                    array[5].trim()
                                    ) {};
                    //Agregar el objeto al ArrayList
                    listpa.add(objpac);//para pasar lo informacion del archivo al arreglo(array)
        }
        br.close();
    }catch (Exception e){
        System.out.println(e.getMessage());
    }
    }
}
