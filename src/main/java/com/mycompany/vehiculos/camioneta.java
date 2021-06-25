package com.mycompany.vehiculos;

import com.mycompany.interfaces.transPersona;

public class camioneta extends Vehiculo implements transPersona {

    public camioneta(String combustible, int Galones, int cantidadPasajeros, double velocidadMaxima,
            double aceleracionBase) {
        super(combustible, Galones, cantidadPasajeros, velocidadMaxima, aceleracionBase);
    }

    @Override
    public void acelerar() {
        System.out.println("La camioneta acelera ahora");

    }

    @Override
    public void apagar() {
        System.out.println("La camioneta se apaga ahora");

    }

    @Override
    public void avanzar() {
        System.out.println("La camioneta avanza ahora");

    }

    @Override
    public void encender() {
        System.out.println("La camioneta esta encendida");

    }

    @Override
    public void frenar() {
        System.out.println("La camioneta frena");

    }

    public void girarIizquierda() {
        System.out.println("La camioneta gira a la izquierda");

    }

    public void girarDerecha() {
        System.out.println("La camioneta gira a la derecha");
    }

    public void trasportarPersonas() {
        System.out.println("Transportando pasajeros");

    }

}
