package parcial1_g;


public class Sedan extends Automovil{
    private double motor;
    private boolean frenos;

    public double getMotor() {
        return motor;
    }

    public boolean isFrenos() {
        return frenos;
    }
    
    
    public Sedan(double motor, boolean frenos, String placa, int modelo, double precio) {
        super(placa, modelo, precio);
        this.motor = motor;
        this.frenos = frenos;
    }
    
    public boolean frenosABS(){
        if(frenos){
            System.out.println("El automóvil tiene frenos ABS");
            return true;
        } else {
            System.out.println("El automóvil NO tiene frenos ABS");
            return false;
        }   
    }
    
}
