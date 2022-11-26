
package ejemplopoo;


public class Auto {
    //Atributos
    int id;
    String patente;
    int can_puertas;
    String color;
    boolean caja_manual;
    
    //Contructores

    public Auto() {
    }

    public Auto(int id, String patente, int can_puertas, String color, boolean caja_manual) {
        this.id = id;
        this.patente = patente;
        this.can_puertas = can_puertas;
        this.color = color;
        this.caja_manual = caja_manual;
    }
    
    
    
    
    
    
    
    //Metodos
    public void encender(){
        System.out.println("Estoy encendiendo ");
    } 
    public void apagar(){
        System.out.println("Estoy apagando ");
    } 
    public void acelerar(double km){
        System.out.println("Estoy acelerando " + km + "kms");
    } 
    public void frenar(double km){
        System.out.println("Estoy frenando " + km + "kms");
    }
}
