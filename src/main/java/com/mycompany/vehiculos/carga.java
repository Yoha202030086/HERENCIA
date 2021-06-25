package com.mycompany.vehiculos;

import com.mycompany.interfaces.transMaterial;

public class carga extends Vehiculo implements transMaterial{

    public carga(String combustible, int Galones, int Pasajeros, double velocidadMax,
            double aceleracionBase) {
        super(combustible, Galones, Pasajeros, velocidadMax, aceleracionBase);
    }

    @Override
    public void acelerar() {
        System.out.println("El vehiculo de carga acelera ahora");
        
    }

    @Override
    public void apagar() {
        System.out.println("El Vehiculo de carga se apaga ahora");
        
    }

    @Override
    public void avanzar() {
        System.out.println("El Vehiculo de carga avanza ahora");
        
    }

    @Override
    public void encender() {
        System.out.println("El Vehiculo de carga esta encendida");
        
    }

    @Override
    public void frenar() {
        System.out.println("El Vehiculo de carga frena");
        
    }

    public void girarIizquierda() {
        System.out.println("El Vehiculo de carga gira a la izquierda");
    }

    public void girarDerecha(){
        System.out.println("El Vehiculo de carga gira a la derecha");
    }

    public void transportarMaterial() {
        System.out.println("Transportando material");
    }  

}
