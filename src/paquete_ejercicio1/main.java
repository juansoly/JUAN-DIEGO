package paquete_ejercicio1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Empleado Empleado1 =new Empleado("DIEGO",25,2500);
        Empleado Empleado2 = new Empleado("DANIEL",30,3200);
        Empleado Empleado3 =new Empleado("MARIA",28,2900);


        Empleado1.aumentarSalario();
        Empleado1.mostrarDatos();
        Empleado2.aumentarSalario();
        Empleado2.mostrarDatos();
        Empleado3.aumentarSalario();
        Empleado3.mostrarDatos();












    }
}
