package command;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
    
    private List<operaciones> operaciones = new ArrayList<>();
    
    public void recibirOperacion (operaciones Operaciones){
        this.operaciones.add(Operaciones);
    }
    
    public void realizarOperaciones(){
        this.operaciones.forEach(x -> x.execute());
        this.operaciones.clear();
    }

    
}
