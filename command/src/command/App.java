package command;

public class App {
    
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(1, 200);
        Depositar opDepositar = new Depositar(cuenta, 100);
        Retirar opRetirar = new Retirar(cuenta, 50);
        
        Invoker ivk = new Invoker();
        ivk.recibirOperacion(opDepositar);
        ivk.recibirOperacion(opRetirar);
        
        ivk.realizarOperaciones();       
    }
}
