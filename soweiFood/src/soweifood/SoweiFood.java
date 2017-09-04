/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soweifood;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author collin
 */
public class SoweiFood {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcionTipoPan = 0;
        int opcionTipoCarne = 0;
        int opcionTipoAcompanante = 0;
        int edadCliente = 0;
        double totalSanduche = 0;
        double descuento = 0;
        double precioSanduche = 0;
        
        String tipoPan = "";
        String tipoCarne = "";
        String acompanante = "";
        String nombreCliente = "";
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("*******************SOWEI*******************\n"
        +"   \n"
        +"==============================================\n");
        //Ingreso de los datos del cliente
        System.out.println("Por favor ingrese su nombre:");
        nombreCliente = teclado.next();
        
        System.out.println("Por favor ingrese su edad:");
        edadCliente = teclado.nextInt();
        
        //Ingreso del tipo de pan que desea
        System.out.println("Por favor elija el tipo de pan que desea para el sanduche:\n"
                + "ingrese 1 si desea pan tradicional\n"
                + "ingrese 2 si desea pan con orÃ©gano\n");
        opcionTipoPan = teclado.nextInt();
        
        //Condicion para el almacenamiento del tipo de pan 
        if(opcionTipoPan < 3){
          if(opcionTipoPan == 1){
           tipoPan = "tradicional";
          }
          else{
            tipoPan = "Oregano";
          }
        }
        else
        {
            
            System.out.println("Lo sentimos la opcion seleccionada no esta en el menu\n"
                    + "debe de ingresar de nuevo todos los ingredientes\n"
                    + "RECOMENDACION: Sea mas cuidadoso al momento de seleccionar los ingredientes");
            //SoweiFood.main(args);
        }
        
        //Ingreso del tipo de carne que desea 
        System.out.println("Por favor elija el tipo de carne que desea para el sanduche:\n"
                + "ingrese 1 si desea jamÃ³n\n"
                + "ingrese 2 si desea pollo\n"
                + "ingrese 3 si desea pavo");
        opcionTipoCarne = teclado.nextInt();
        
         //Condicion para el almacenamiento del tipo de carne
        if(opcionTipoCarne < 4){
          if(opcionTipoCarne == 1){
            tipoCarne = "JamÃ³n";
          }
          else if(opcionTipoCarne == 2){
            tipoCarne = "Pollo";
          }
          else
          {
            tipoCarne = "Pavo";
          }
        }
        else
        {
            
            System.out.println("Lo sentimos la opcion seleccionada no esta en el menu\n"
                    + "debe de ingresar de nuevo todos los ingredientes\n"
                    + "RECOMENDACION: Sea mas cuidadoso al momento de seleccionar los ingredientes");
            //SoweiFood.main(args);
        }
        
        //Ingreso del acompañante que desea
        System.out.println("Por favor elija el tipo de carne que desea para el sanduche:\n"
                + "ingrese 1 si desea Queso\n"
                + "ingrese 2 si desea Mayonesa\n"
                + "ingrese 3 si desea Verdura");
        opcionTipoCarne = teclado.nextInt();
        
        //Condicion para el almacenamiento del acompañante
        if(opcionTipoAcompanante < 4){
          if(opcionTipoAcompanante == 1){
            acompanante = "Queso";
          }
          else if(opcionTipoAcompanante == 2){
            acompanante = "Mayonesa";
          }
          else
          {
            acompanante = "Verdura";
          }
        }
        else
        {
            
            System.out.println("Lo sentimos la opcion seleccionada no esta en el menu\n"
                    + "debe de ingresar de nuevo todos los ingredientes\n"
                    + "RECOMENDACION: Sea mas cuidadoso al momento de seleccionar los ingredientes");
            //SoweiFood.main(args);
        }
        
        //Calculo del precio dependiendo del tipo de opciones seleccionadas
        if (tipoPan.equals("tradicional") && tipoCarne.equals("JamÃ³n") && acompanante.equals("Queso"))
        {
            precioSanduche = 8550;
            //Condicion para aplicar el descuento en caso de qe sea mayor de 65
            if(edadCliente >= 65)
            {
                descuento = 8550 * 0.02;
                totalSanduche = 8550 - descuento;
            }
            else
            {
                totalSanduche = 8500;
            }
        }
        else if(tipoPan.equals("tradicional") && tipoCarne.equals("Pavo") && acompanante.equals("Mayonesa"))
        {
            precioSanduche = 11000;
            if(edadCliente >= 65)
            {
                descuento = 11000 * 0.02;
                
                totalSanduche = 11000 - descuento;
            }
            else
            {
                totalSanduche = 11000;
            }
        }
        else
        {
            precioSanduche = 10800;
            if(edadCliente >= 65)
            {
                descuento = 10800 * 0.02;
                totalSanduche = 10800 - descuento;
            }
            else
            {
                totalSanduche = 10800;
            }
        }
        
        
        //Generacion de factura
        System.out.println("===========================================================\n"
                +" "
                + "                                         Numero de factura:"+(1 + (int)(Math.random() * ((9 - 1) + 1))+"\n")
                +"                      SOWEI MEDELLIN                               \n"
                +" "
                +"PEDIDO CLIENTE:"+nombreCliente+"\n"
                +" "+tipoPan+"   "+tipoCarne+"    "+acompanante+"                  $"+precioSanduche+"\n"
                +"                                 Descuento(2%):   $"+descuento+"\n"
                +" \n"
                +" \n"
                +" \n"
                +"TOTAL A PAGAR....................................: $"+totalSanduche+"\n");
        
        
    }
    
}
