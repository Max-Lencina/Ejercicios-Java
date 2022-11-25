
package ejemplopoo;


public class Auto {
    //Atributos
    int id;
    String patente;
    int can_puertas;
    String color;
    boolean caja_manual;
    
    //Metodos
    public void encender(){
        System.out.println("Estoy encendiendo");
    } 
    public void apagar(){
        System.out.println("Estoy apagando");
    } 
    public void acelerar(double km){
        System.out.println("Estoy acelerando" + km + "kms");
    } 
    public void frenar(double km){
        System.out.println("Estoy frenando" + km + "kms");
    }
}
