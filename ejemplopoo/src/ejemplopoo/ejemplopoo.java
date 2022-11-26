package ejemplopoo;


public class ejemplopoo {

    
    public static void main(String[] args) {
     
        Auto auto1 = new Auto();
        Auto auto2 = new Auto(1, "AA111JO", 5, "rojo", true);  
        
       auto2.encender();
       auto2.acelerar(60);
       auto2.frenar(30);
       auto2.apagar();
    }
    
}
