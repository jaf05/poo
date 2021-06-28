/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Beans.Personal;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dr Baltazar
 */
public class PersonalController {
    
    private List<Personal> lstusuario;

    public PersonalController() {
        this.lstusuario = new ArrayList<Personal>();     
        cargar();
    }    
    public void add(Personal usu){
        this.lstusuario.add(usu);
    }
    public Personal get(int pos){
        return this.lstusuario.get(pos);
    }
    public int size(){
        return this.lstusuario.size();
    }
    
    public boolean getValidar(String usu,String pass){
        for(Personal obj:lstusuario){
            if(obj.getUsuario().equalsIgnoreCase(usu) && obj.getPass().equalsIgnoreCase(pass)){
                return true;            
            }                
        }
        return false;
    }
    
    public void grabar(){
    try{
        PrintWriter pw;
        String linea;
        pw= new PrintWriter(new FileWriter("C:/Users/Dr Baltazar/Desktop/PO/Apache/TrabajoFinalPoo/personal.txt"));
        for(int i=0;i<size();i++){
            linea=(lstusuario.get(i).getCodigo() + ";" +
                    lstusuario.get(i).getNombre()+";" +
                    lstusuario.get(i).getApellido()+";" +
                    lstusuario.get(i).getUsuario()+";" +
                    lstusuario.get(i).getPass() + ";" +
                    lstusuario.get(i).getTipo()
                    );
            pw.println(linea);//Agregar el registro al archivo
        }
        pw.close();
    }catch(Exception e){
        System.out.println(e.getMessage());
    }    
    }
    public void cargar(){
    try{
        BufferedReader br;
        String linea=null;
        String[] array=null;
        br = new BufferedReader(new FileReader("C:/Users/Dr Baltazar/Desktop/PO/Apache/TrabajoFinalPoo/personal.txt"));
        while((linea = br.readLine()) != null ){
            array = linea.split(";");
            //Crear el objeto de tipo producto con los datos del archivo
             Personal objper = 
                    new Personal(Integer.parseInt(array[0].trim()),
                                array[1].trim(),
                                array[2].trim(),
                                array[3].trim(),
                                array[4].trim(),
                                array[5].trim());
            //Agregar el objeto al ArrayList
            this.lstusuario.add(objper);
        }
        br.close();
    }catch(Exception e){
        System.out.println(e.getMessage());
        
    }
    }
}
