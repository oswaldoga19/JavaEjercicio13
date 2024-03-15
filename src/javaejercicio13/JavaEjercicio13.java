/*
Un almacén efectúa una promoción en la cual se hace un descuento sobre el valor de la compra total, 
según el color de la bolita que el cliente saque al pagar en caja. Si la bolita es blanca no se le hará descuento alguno, 
si es verde se le hará un 10% de descuento, si es amarilla un 25%, si es azul un 50% y si es roja un 100%. Hacer un algoritmo 
para determinar la cantidad final que un cliente deberá pagar por su compra. Se sabe que sólo hay bolitas de los colores 
mencionados. Análisis Datos de entrada • Valor de la compra. • Color de la bolita; ésta almacenará un valor alfabético. Datos de 
salida • Valor a pagar teniendo en cuenta los posibles descuentos. Proceso Conocido el color de la bolita que le ha tocado al 
cliente se puede establecer si tiene o no descuento por el valor de la compra y el porcentaje que le corresponde. Si la bolita 
que saca es: Blanca, el descuento es del 0%; si es verde, el descuento es del 10%; si es amarilla, el descuento es del 25%; 
si es azul, el descuento es del 50%; si no es de ninguno de los colores anteriores, por defecto será roja al no haber más colores, 
por lo que no es necesario hacer la pregunta si el color de la bolita es roja, en cuyo caso el descuento es del 100%. Definición 
de variables VALCOMP: Valor de la compra. COLOR: Color de la bolita. VALPAG: Valor a pagar. PDES: Porcentaje de descuento.
 */
package javaejercicio13;

import java.util.Scanner;

public class JavaEjercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        // Entrada de datos
        System.out.println("Ingrese el valor de la compra:");
        double VALCOMP = scanner.nextDouble();

        System.out.println("Ingrese el color de la bolita: \nBLANCO, \nVERDE, \nAMARILLO, \nAZUL :");
        String COLOR = scanner.next().toUpperCase(); // se convertir a mayúsculas para evitar sensibilidad a mayúsculas y minúsculas

        // Cálculo del descuento y valor a pagar
        double PDES = 0;

        if (COLOR.equals("BLANCO")) {
            PDES = 0;
        } else if (COLOR.equals("VERDE")) {
            PDES = 10;
        } else if (COLOR.equals("AMARILLO")) {
            PDES = 25;
        } else if (COLOR.equals("AZUL")) {
            PDES = 50;
        } else {
            PDES = 100;
        }

        double VALPAG = VALCOMP - (PDES * VALCOMP / 100);

        // Mostrar resultado
        System.out.println("\nEL CLIENTE DEBE PAGAR: $" + VALPAG);
    }
    
}
