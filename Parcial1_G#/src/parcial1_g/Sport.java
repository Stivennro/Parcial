
package parcial1_g;


public class Sport extends Moto {
    private String Motor, potencia, tanque;

    public Sport(String Motor, String potencia, String tanque, String placa, int modelo, int cilindraje) {
        super(placa, modelo, cilindraje);
        this.Motor = Motor;
        this.potencia = potencia;
        this.tanque = tanque;
    }

    public String getMotor() {
        return Motor;
    }

    public String getPotencia() {
        return potencia;
    }

    public String getTanque() {
        return tanque;
    }
    
    public String motorGarantia(){
       switch(Motor){
           case "4T" -> {
               return ("La garantía de la moto es por 2 años");
            }
           case "monocilindrico" -> {
               return ("La garantía de la moto es por 1 año");
            }
       }
        return null;
    }   
}
