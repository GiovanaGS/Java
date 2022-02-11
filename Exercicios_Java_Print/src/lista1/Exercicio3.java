package lista1;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        int seg, min, hora, tempo;
        Scanner id = new Scanner (System.in);

        System.out.println("Escreva os segundos do evento: ");
        tempo=id.nextInt();

        hora = tempo/3600;
        min = (tempo-(3600))/60;
       
        seg =  (tempo-(3600))%60;

        System.out.println("\nO tempo é " +hora+ "horas \nminutos" +min+ "e" + seg + "segundos");
                        }
}


