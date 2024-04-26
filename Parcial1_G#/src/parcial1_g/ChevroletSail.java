package parcial1_g;


public class ChevroletSail extends Sedan {
    
    private String tanque;
    private boolean seguro;
    private double limite = 50000000;

    public ChevroletSail(String tanque, boolean seguro, double motor, boolean frenos, String placa, int modelo, double precio) {
        super(motor, frenos, placa, modelo, precio);
        this.tanque = tanque;
        this.seguro = seguro;
    }

    public boolean seguro(){
        if(seguro){
            System.out.println("El automóvil tiene Seguro");
            return true;
        } else {
            System.out.println("El automóvil NO tiene Seguro");
            return false;
        }   
    }
    
    public double precioSeguro() {
        if(precio > 50000000) {
            limite = ((50000000) * 0.10);
            System.out.println("El precio del seguro es ");
            return limite;
        } else {
            System.out.println("""
                               \u201cNo hay valor del seguro puesto que el valor del
                               autom\u00f3vil es menor a 50.000.000\u201d """);
        }
        return 0;   
    }
    
     
}
