package com.company;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.IncrementarPuertas();

        System.out.println(miCoche.puertas);
    }

  }

     class Coche {
        public int puertas=2;

        public void IncrementarPuertas(){
            this.puertas++;
        }

    }
