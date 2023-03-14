package Logica;

import java.util.Scanner;

public class Principal {
public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa una cadena de texto: ");
        String mensaje = sc.nextLine();
       
       
        
        String mensajeEncriptado = encriptar(mensaje);
        System.out.println("Mensaje encriptado: " + mensajeEncriptado);

        String mensajeDesencriptado = desencriptar(mensajeEncriptado);
        System.out.println("Mensaje desencriptado: " + mensajeDesencriptado);
    }

    public static String encriptar(String mensaje) {
       
    	char array[]=mensaje.toCharArray();

        for (int i = 0; i < array.length; i++) {
            array[i]=(char)(array[i]+(char)5);
        }
        String mensajeEncriptado=String.valueOf(array);
        return mensajeEncriptado;
    }

    public static String desencriptar(String mensajeEncriptado) {
    	char array[]=mensajeEncriptado.toCharArray();

        for (int i = 0; i < array.length; i++) {
        	 array[i]=(char)(array[i]-(char)5);
        }
        String mensajeDesencriptado=String.valueOf(array);
        return mensajeDesencriptado;
    }

}
