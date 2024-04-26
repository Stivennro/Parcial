package parcial1_g;

import java.util.Scanner;


public class Parcial {
    private static boolean run = true;
    private static int opcion;

   
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        
        
        while(run) {
            
            System.out.println("****** CONCESIONARIO CAUCANA DE VEHÍCULOS S.A.********");
            System.out.println("******* REGISTRO DE VEHÍCULOS VENDIDOS********");
            System.out.println("1. Registro de automóviles");
            System.out.println("2. Registro de motos");
            System.out.println("3. Vendedor");
            System.out.println("4. Salir");
            
            opcion = scanner.nextInt();
            
            switch(opcion){
                case 1:
                    Sedan s = new Sedan(4, true, "Popayan-465", 2008, 56000000);
                    System.out.println("El carro sedan tiene un precio a partir de " + s.getPrecio() + 
                            " esta matriculado en " + s.getPlaca() +
                            " El modelo del carro es " + s.getModelo() + " " +
                            s.frenosABS() + 
                            " El tipo de motor es de " + s.getMotor());
                    break;
                 
                case 2:
                    Sport sM = new Sport("monocilindrico", "15.5", "7,1L", "Popayan-753", 2008, 155);
                    System.out.println(" Nmax es " + sM.getMotor() + 
                            " Con una Potencia de " +  sM.getPotencia() + 
                            " Una totalidad de galones en el tanque de " + sM.getTanque() + 
                            " Matricula da en " + sM.getPlaca() + 
                            " Modelo de " + sM.getModelo() + 
                            " Con un cilindraje de " + sM.getCilindraje() );
                    break;
                    
                case 3:
                    System.out.println(" Vendedores: Jhoseth Esteban Muñoz Martinez \n Stiven Rodriguez Miñoz ");
                    break;
                    
                case 4:
                    run = false;
                    break;
                   
            }
        }
    }
    
}
