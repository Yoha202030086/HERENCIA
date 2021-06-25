package com.mycompany.vehiculos;

import com.mycompany.interfaces.triAceleracion;
import com.mycompany.interfaces.turbo;

public class carrera extends Vehiculo implements turbo, triAceleracion {

    public carrera(String combustible, int Galones, int Pasajeros, double velocidadMax,
            double aceleracionBase) {
        super(combustible, Galones, Pasajeros, velocidadMax, aceleracionBase);
    }

    @Override
    public void acelerar() {
        System.out.println("El auto de carrera acelera ahora");
    }

    @Override
    public void apagar() {
        System.out.println("El auto de carrera se apaga ahora");

    }

    @Override
    public void avanzar() {
        System.out.println("El auto de carrera avanza ahora");

    }

    @Override
    public void encender() {
        System.out.println("El auto de carrera esta encendida");

    }

    @Override
    public void frenar() {
        System.out.println("El auto de carrera frena");

    }

    public void girarIizquierda() {
        System.out.println("El auto de carrera gira a la izquierda");

    }

    public void girarDerecha(){
        System.out.println("El auto de carrera gira a la derecha");
    }

    public void turboProceso() {
        System.out.println(" **turbo en proceso** ");
    }

    public void triplicacionAceleracion() {
        System.out.println(" **Triplicacion aceleracion** ");
    
    }

}
