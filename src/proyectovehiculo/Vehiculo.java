/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectovehiculo;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Boni
 */
public class Vehiculo {
    private String matricula;
    private int anio; 
    private int numeroCilindros;
    private double kilometrosRecorridos;
    private double rendimiento;

    public Vehiculo() {
    }
    
    
    public Vehiculo(String matricula, int anio, int numeroCilindros, double kilometrosRecorridos) {
        this.matricula = matricula;
        this.anio = anio; 
        this.validacionCilindros(numeroCilindros);
        this.kilometrosRecorridos = kilometrosRecorridos;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    } 
    public int getNumeroCilindros() {
        return numeroCilindros;
    }
 
    public double getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    public void setKilometrosRecorridos(double kilometrosRecorridos) {
        this.kilometrosRecorridos = kilometrosRecorridos;
    } 
    
    public void validacionCilindros (int cilindros){
        Scanner v=new Scanner(System.in); 
        
            while(!(cilindros==4 || cilindros==6 || cilindros==8)){
            System.out.println("ingresa un numero de cilindros valido (4,6,8)");
            cilindros=v.nextInt(); 
            if(cilindros==4 || cilindros==6 || cilindros==8){
            break;
            }
            }
            numeroCilindros=cilindros;
         
    }
    public void aumentarKilometrosRecorridos(int rand){ 
        
        this.kilometrosRecorridos+=rand;
    }
    public void calcularRendimiento(){ 
        double _rendimiento=0;
        if (anio>=2004) {
            switch(numeroCilindros){
                case 4:
                    _rendimiento=11;
                    break;
                case 6: 
                    _rendimiento=9;
                    break;
                case 8:
                    _rendimiento=7;
                    break;
            }
        } else {
            if (anio>=2005 && this.anio<=2014) {
                switch(numeroCilindros){
                case 4:
                    _rendimiento=13;
                    break;
                case 6: 
                    _rendimiento=10;
                    break;
                case 8:
                    _rendimiento=6;
                    break;
            }
            } else {
                if (anio>=2015) {
                    switch(numeroCilindros){
                case 4:
                    _rendimiento=16;
                    break;
                case 6: 
                    _rendimiento=12;
                    break;
                case 8:
                    _rendimiento=8;
                    break;
            }
                }
            }
        } 
        if (kilometrosRecorridos>20000) 
            this.rendimiento=_rendimiento*.95;
        else
            this.rendimiento=_rendimiento; 
    }
    
    public void modeloReciente(Vehiculo v1,Vehiculo v2){
        if (v1.anio > v2.anio) { 
            System.out.println("El vehiculo mas nuevo tiene matricula "+v1.matricula);
        } else {
            if (v1.anio == v2.anio) {
                System.out.println("Son del mismo año");
            } else {
                System.out.println("El vehiculo mas nuevo tiene matricula "+v2.matricula);
            }
            
        }
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "matricula:" + matricula + ", anio:" + anio + ", numeroCilindros:" + numeroCilindros + ", kilometrosRecorridos:" + kilometrosRecorridos + ", rendimiento:" + rendimiento + '}';
    }
    
    
    
}
