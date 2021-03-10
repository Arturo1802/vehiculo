/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectovehiculo;

import java.util.Random;
import java.util.Scanner;
 
public class ProyectoVehiculo { 
  
    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
        Random r =new Random();
        Vehiculo vehiculo1=new Vehiculo("ABG02D",2005,5,50);
        Vehiculo vehiculo2=new Vehiculo();
        System.out.println("Ingrese la matricula del Vehiculo 2");
        vehiculo2.setMatricula(v.next());
        System.out.println("Ingrese el modelo(año) del vehiculo");
        vehiculo2.setAnio(v.nextInt());
        System.out.println("Ingrese la cantidad de cilindros");
        vehiculo2.validacionCilindros(v.nextInt()); 
        System.out.println(vehiculo1.toString());
        System.out.println(vehiculo2.toString());
        vehiculo1.aumentarKilometrosRecorridos(r.nextInt(30000));
        vehiculo2.aumentarKilometrosRecorridos(r.nextInt(30000));
        System.out.println("↠↠↠↠↠↠↠↠↠↠↠↠↠↠↞↞↞↞↞↞↞↞↞↞↞↞↞↞");
        System.out.println(vehiculo1.toString());
        System.out.println(vehiculo2.toString());
        System.out.println("↠↠↠↠↠↠↠↠↠↠↠↠↠↠↞↞↞↞↞↞↞↞↞↞↞↞↞↞");
        vehiculo1.modeloReciente(vehiculo1, vehiculo2);
        
        
        
        
        
        
        
        
        
    }
    
}
