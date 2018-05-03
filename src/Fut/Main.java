package Fut;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] tomb=new int[5];
		Scanner beolvas=new Scanner(System.in);
			
			for(int i=0; i<tomb.length; i++)
			{

				System.out.print("Kerem az " + (i + 1) + ". egesz szamot!\nszam:");
			
			
			boolean rosszBeolvasas = true;
	
			do{
				try{
					tomb[i]=beolvas.nextInt();
					rosszBeolvasas=false;
				} catch (InputMismatchException kivetel) {
					System.out.println("Nem egesz szam lett megadva a nextInt-nel!");
					System.out.println("Kerem adja meg ujbol!\nszam:");
				} catch (Exception e) {
					System.out.println("Nem egesz szam lett megadva a nextInt-nel!");
				} finally {
					beolvas.nextLine();
				}				
			} while (rosszBeolvasas);			

	
	}
			beolvas.close();

			System.out.println("\nA beolvasott szamok:");
			
			for (int i : tomb) {
				System.out.println(i);
	}

	}}
