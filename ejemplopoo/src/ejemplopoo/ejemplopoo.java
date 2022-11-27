package ejemplopoo;


public class ejemplopoo {

    
    public static void main(String[] args) {
     
        Vehiculo vehi = new Vehiculo (5687, 4,"Reault", "Indefinido");
        Auto auto1 = new Auto();
        Auto auto2 = new Auto(1, "AA111JO", 5, "rojo", true, 65324, 4, "wolkswagen", "gold tren");  
        Moto moto = new Moto(125, 15698, 2, "Yamaha", "ZR125");
        Camion camion = new Camion (6, true, 698745, 6, "Mercedes", "Un modelo"); 
        
      Vehiculo vector[] = new Vehiculo [4];
        vector[0]= vehi;
        vector[1]= moto;
        vector [2]= auto2;
        vector[3]= camion;
        
        for (int i=0; i<4; i++){
             System.out.println("Registro numero " + i + vector [i].getMarca());
        }
          
                
                
        /*
        System.out.println(auto2.toString());
        System.out.println(auto1.toString());*/
        
          
       /*auto2.encender();
       auto2.acelerar(60);
       auto2.frenar(30);
       auto2.apagar();*/
       
       /*System.out.println("El valor de la id es " + auto2.getId());
       auto2.setId(35000);
       System.out.println("El nuevo valor de la id es " + auto2.getId());*/
       
       /*System.out.println("El valor de la id es " + auto1.getId());
       System.out.println("El color es " + auto1.getColor());
       
       auto1.setId(1500);
       auto1.setPatente("AB569PO");
       auto1.setCan_puertas(3);
       auto1.setColor("amarillo");
       auto1.setCaja_manual(false);
       
       System.out.println("-------------------------------");
       
       
       System.out.println("El nuevo valor de la id es " + auto1.getId());
       System.out.println("El nuevo color es " + auto1.getColor());*/
       
       
       
    }
        
}
