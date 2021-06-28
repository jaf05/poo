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
public class Historialc extends Paciente implements PacienteSup{
    private int histclini;
    private int cita;
    private String sintomas;
    private int tiempos;
    private String enfermedad;
    private double temperatura;
    private int frecuenciacardi;
    private int frecuenciarespi;
    private int saturacion;
    private String anamnesis;
    
    public Historialc(){
    }
    //contructor

    public Historialc(int histclini) {
        super(histclini);
    }
    
    
    //Constructor de la super clase
    
    //Constructor de la subclase
    public Historialc(int histclini, int cita, String sintomas, int tiempos, String enfermedad, double temperatura, int frecuenciacardi, int frecuenciarespi, int saturacion, String anamnesis) {    
        this.histclini = histclini;
        this.cita = cita;
        this.sintomas = sintomas;
        this.tiempos = tiempos;
        this.enfermedad = enfermedad;
        this.temperatura = temperatura;
        this.frecuenciacardi = frecuenciacardi;
        this.frecuenciarespi = frecuenciarespi;
        this.saturacion = saturacion;
        this.anamnesis = anamnesis;
    }


    //Getter and setter

    public int getHistclini() {
        return histclini;
    }

    public void setHistclini(int histclini) {
        this.histclini = histclini;
    }

    public int getCita() {
        return cita;
    }

    public void setCita(int cita) {
        this.cita = cita;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public int getTiempos() {
        return tiempos;
    }

    public void setTiempos(int tiempos) {
        this.tiempos = tiempos;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public int getFrecuenciacardi() {
        return frecuenciacardi;
    }

    public void setFrecuenciacardi(int frecuenciacardi) {
        this.frecuenciacardi = frecuenciacardi;
    }

    public int getFrecuenciarespi() {
        return frecuenciarespi;
    }

    public void setFrecuenciarespi(int frecuenciarespi) {
        this.frecuenciarespi = frecuenciarespi;
    }

    public int getSaturacion() {
        return saturacion;
    }

    public void setSaturacion(int saturacion) {
        this.saturacion = saturacion;
    }

    public String getAnamnesis() {
        return anamnesis;
    }

    public void setAnamnesis(String anamnesis) {
        this.anamnesis = anamnesis;
    }
    
    
}