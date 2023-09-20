
package calculadora;

public class Calculos {
    
    int x = 0, y = 0;
    
    public void setNumeros(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public int Suma(){
        return x + y;
    }
    
    public int Resta(){
        return x - y;
    }
    
    public int Multipliacion(){
        return x * y;
    }
    
    public int Division(){
        return x / y;
    }
}
