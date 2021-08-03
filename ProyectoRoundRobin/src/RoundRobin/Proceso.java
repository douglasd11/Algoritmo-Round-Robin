/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RoundRobin;

/**
 *
 * @author Admin
 */
public class Proceso {
    
    private int orden;
    private int Rafaga; //Carga la ráfaga en ejecución
    private int Quantum ; //Carga el quantum en ejecución
    private int ResiduoRafaga; //Carga el residuo en ejecución
    private int TiempoProceso; //Carga el tiempo que se dura procesando
    private String estado;
    private int memoria;

    public Proceso() {
    }

    public Proceso(int orden, int Rafaga, int Quantum, int ResiduoRafaga, int TiempoProceso, String estado, int memoria) {
        this.orden = orden;
        this.Rafaga = Rafaga;
        this.Quantum = Quantum;
        this.ResiduoRafaga = ResiduoRafaga;
        this.TiempoProceso = TiempoProceso;
        this.estado = estado;
        this.memoria = memoria;
    }

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }

    public int getRafaga() {
        return Rafaga;
    }

    public void setRafaga(int Rafaga) {
        this.Rafaga = Rafaga;
    }

    public int getQuantum() {
        return Quantum;
    }

    public void setQuantum(int Quantum) {
        this.Quantum = Quantum;
    }

    public int getResiduoRafaga() {
        return ResiduoRafaga;
    }

    public void setResiduoRafaga(int ResiduoRafaga) {
        this.ResiduoRafaga = ResiduoRafaga;
    }

    public int getTiempoProceso() {
        return TiempoProceso;
    }

    public void setTiempoProceso(int TiempoProceso) {
        this.TiempoProceso = TiempoProceso;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    @Override
    public String toString() {
        return " Proceso {\n Rafaga:" + Rafaga + " | Residio:" + ResiduoRafaga + " | estado=" + estado + " | memoria=" + memoria + "\n }";
    }
    
    
    
}
