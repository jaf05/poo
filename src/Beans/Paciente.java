/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

/**
 *
 * @author Dr Baltazar
 */
public abstract class Paciente {
    private int histclini; //historia clínica
    private String nomape; //nombre y apellidos
    private int edad;
    private String sexo;
    private int dni;
    private String antecepato; //relato de la enfermedad día por día
    
    public Paciente(){
    }
    //Constructor

    public Paciente(int histclini, String nomape, int edad, String sexo, int dni, String antecepato) {
        this.histclini = histclini;
        this.nomape = nomape;
        this.edad = edad;
        this.sexo = sexo;
        this.dni = dni;
        this.antecepato = antecepato;
    }

    public Paciente(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //Getter and setter
    public int getHistclini() {
        return histclini;
    }

    public void setHistclini(int histclini) {
        this.histclini = histclini;
    }

    public String getNomape() {
        return nomape;
    }

    public void setNomape(String nomape) {
        this.nomape = nomape;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getAntecepato() {
        return antecepato;
    }

    public void setAntecepato(String antecepato) {
        this.antecepato = antecepato;
    }

    
    
    
    
    
}
    
    