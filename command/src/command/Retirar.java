package command;

public class Retirar implements operaciones{
    private Cuenta cuenta;
    private double monto;
    
    public Retirar(Cuenta cuenta, double monto){
        this.cuenta = cuenta;
        this.monto = monto;
    }
    public void execute (){
        this.cuenta.retirar(this.monto);
    }    
}
