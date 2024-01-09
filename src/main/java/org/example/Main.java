package org.example;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // ENTRADAS
        Scanner leerDato = new Scanner(System.in);
        String nombreCliente;
        String paisCliente;
        int anoNacimientoCliente;
        int mesNacimientoCliente;
        int diaNacimientoCliente;

        //pedimos los datos al usuario//
        System.out.print("ingrse su nombre: ");
        nombreCliente=leerDato.nextLine();

        System.out.print("ingrese el pais del que viene: ");
        paisCliente=leerDato.nextLine();

        System.out.print("ingrese el año de nacimiento: ");
        anoNacimientoCliente=leerDato.nextInt();

        System.out.print("ingrese el mes en que nacio:");
        mesNacimientoCliente=leerDato.nextInt();

        System.out.print("ingrese el dia en que nacio");
        diaNacimientoCliente=leerDato.nextInt();

        //procesado las entradas
        //restar el añp atual menos la fecha de nacimiento
        int edadCliente=2024-anoNacimientoCliente;

        System.out.println("su edad es: "+edadCliente);

        //2. decidir con base a la edad si el cliente es mayor de edad

        if(edadCliente>=18) {
            System.out.println("uste es mayor de edad");
        }
        else{
            System.out.println("usted es un niño, vayase a dormir");

        }
        System.out.println("MENU");
        System.out.println("1... botella de guaro antioqueño --- $150 COP");
        


        //menu de licores
        //botella de guaro--150
        //botella de don julio--600
        //botella de blue label--1500
        //botella de jagger--200










    }
}