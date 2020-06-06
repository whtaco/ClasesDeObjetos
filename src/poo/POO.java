/*
Implementar un algoritmo que determine la presión máxima de compresión de un motor de 
encendido provocado basado en una red neuronal artificial recurrente
 */
package poo;

import java.util.Scanner;

/**
 *
 * @author William Hernan Taco Taco
 */
public class POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner objeto=new Scanner(System.in);
        
        System.out.println("Requerimientos Funcioneles y No Funcionales");
        
        System.out.println("Ingrese los Requerimientos Funcionales");
        String requerimientos_f=objeto.nextLine();
        
        System.out.println("Ingrese los Requerimientos No Funcionales");
        String requerimientos_nof=objeto.nextLine();
        
        System.out.println("Diseño Orientado a Objetos");
        
        System.out.println("Ingrese objetos del mundo real");
        String real=objeto.nextLine();
        
        System.out.println("Ingrese objeto del mundo informatico");
        String informatico=objeto.nextLine();
        
        System.out.println("Ingrese los atributos del objeto informatico");
        String atributos=objeto.nextLine();
        
        System.out.println("Ingrese los servicios del objeto informatico");
        String servicios=objeto.nextLine();
        
        System.out.println("Ingrese el sistema");
        String sistema=objeto.nextLine();
        
        System.out.println("Ingrese el modulo");
        String modulo=objeto.nextLine();
        
        System.out.println("Ingrese la clase de obeto, atributo, servicio");
        String clase=objeto.nextLine();
        
        System.out.println("Ingrese la jerarquia");
        String jerarquia=objeto.nextLine();
        
        System.out.println("Ingrese el polimorfismo");
        String polimorfismo=objeto.nextLine();
        
        System.out.println("Requerimientos Funcionales: "+requerimientos_f);
        System.out.println("Requerimientos No Funcionales: "+requerimientos_nof);
        System.out.println("Objetos del mundo real: "+real);
        System.out.println("Objeto del mundo informatico: "+informatico);
        System.out.println("Atributos del objeto informatico: "+atributos);
        System.out.println("Servicios del objeto informatico: "+servicios);
        System.out.println("Sistema: "+sistema);
        System.out.println("Modulo: "+modulo);
        System.out.println("Clase de objeto, atributo, servicio: "+clase);
        System.out.println("Jerarquia: "+jerarquia);
        System.out.println("Polimorfismo: "+polimorfismo);
        
    }
    
}
