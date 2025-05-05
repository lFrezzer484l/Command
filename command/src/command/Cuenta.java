package command;


public class Cuenta {
    private int id;
    private double saldo;
    
    public Cuenta(int id, double saldo){
        this.id = id;
        this.saldo = saldo;
    }
    
    public void retirar(double monto){
        this.saldo = this.saldo - monto;
        System.out.println("[ Comando Retirar ] Cuenta: | " + id + " | Saldo : " + this.saldo);
    }
    public void despositar(double monto){
        this.saldo = this.saldo + monto;
        System.out.println("[ Comando Depositar ] Cuenta: | " + id + "| Saldo :" + this.saldo);
    }
}
