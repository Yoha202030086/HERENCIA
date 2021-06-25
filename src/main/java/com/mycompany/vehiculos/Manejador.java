package com.mycompany.vehiculos;


public class Manejador {

    public Manejador(){

    }
   
    public void crearVehiculo(Vehiculo[] vehiculos){
        for(int i=0;i<vehiculos.length;i++){
            dado();
            if(dado()>=10 && dado()<30){
                vehiculos[i]=new camioneta("Diesel",dado(),60,dado(),dado());
            } else if(dado()>=30 && dado()<50){
                vehiculos[i]=new carga("Gasolina", dado(),4,dado(),dado());
            } else if(dado()>=50 && dado()<=70){
                vehiculos[i]=new carrera("Gasolina",dado(),2,200,100);
            }
        }
    }


    public void verVehiculo(Vehiculo[] vehiculos){
        
        for(int i=0;i<vehiculos.length;i++){
            if(vehiculos[i] instanceof camioneta){
               
                System.out.println("\nCAMIONETA");
                System.out.println(vehiculos[i].toString());
                ((camioneta)vehiculos[i]).trasportarPersonas();
            } else if(vehiculos[i] instanceof carrera){
               
                System.out.println("\nAUTO DE CARRERA");
                System.out.println(vehiculos[i].toString());
                ((carrera)vehiculos[i]).aplicarTurbo();
                ((carrera)vehiculos[i]).triplicarAceleracion();
            } else if(vehiculos[i] instanceof carga){
                
                System.out.println("\nVEHICULO DE CARGA");
                System.out.println(vehiculos[i].toString());
                ((carga)vehiculos[i]).transportarMaterial();
                
            }
        } 
       
    }

    public int dado(){
        int resultado=0;
        resultado=(int)(Math.random()*(70-10)+10);
        return resultado;
    }
}
