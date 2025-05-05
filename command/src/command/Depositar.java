package command;

public class Depositar implements operaciones {
    
    private Cuenta cuenta;
    private double monto;
    
    public Depositar (Cuenta cuenta, double monto){
        this.cuenta = cuenta;
        this.monto = monto;
    }
    
    public void execute(){
        this.cuenta.despositar(this.monto);
    }
}
