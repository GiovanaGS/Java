package lista3;

import java.util.Random;
import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Random gerador = new Random();
		Scanner ler = new Scanner(System.in);
		int N1[][] = new int[4][6];
		int N2[][] = new int[4][6];
		int M1[][] = new int[4][6];
		int M2[][] = new int[4][6];
		int i, j;
		
		for (i = 0; i < 4; i++) 
		{
			for (j = 0; j < 6; j++) 
			{
				N1[i][j] = gerador.nextInt(20) + 1;
				
			}
		}
		for (i = 0; i < 4; i++) 
		{
			for (j = 0; j < 6; j++) 
			{
				N2[i][j] = gerador.nextInt(20) + 1;
				
			}
		}
		for (i = 0; i < 4; i++) 
		{
			for (j = 0; j < 6; j++) 
			{
				M1[i][j] = N1[i][j] + N2[i][j];
			}
		}
		for (i = 0; i < 4; i++) 
		{
			for (j = 0; j < 6; j++) 
			{
				M2[i][j] = N1[i][j] - N2[i][j];
			}
		}
		for (i = 0; i < 4; i++) 
		{
			for (j = 0; j < 6; j++) 
			{
				System.out.println("Mostrando N1: " + N1[i][j]);
			}
		}
		System.out.println("\n");
		for (i = 0; i < 4; i++) 
		{
			for (j = 0; j < 6; j++) 
			{
				System.out.println("Mostrando N2: " + N2[i][j]);
				
			}
		}
		System.out.println("\n");
		for (i = 0; i < 4; i++) 
		{
			for (j = 0; j < 6; j++) 
			{
				System.out.println("Mostrando M1: " + M1[i][j]);
				
			}
		}
		System.out.println("\n");
		for (i = 0; i < 4; i++) 
		{
			for (j = 0; j < 6; j++) 
			{
				System.out.println("Mostrando M2: " + M2[i][j]);
				
			}
		}

	}
}