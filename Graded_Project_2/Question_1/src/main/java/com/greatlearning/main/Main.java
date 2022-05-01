package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.floorconstruction.FloorConstruction;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter the total number of floors in the building:");

		int totalfloor = sc.nextInt();

		int[] floorSizes = new int[totalfloor]; // floor_sizes array size is equal to total_floor

		for (int i = 0; i < floorSizes.length; i++) { // loop to input the floor size

			int day = i + 1;

			System.out.println("\nEnter the floor size on day :" + day);

			int size = sc.nextInt();

			if (size <= 0) {

				System.out.println("\nFloor size cannot be less than or equal to zero");

				i--;
			}

			else if (size > totalfloor) {

				System.out.println("\nFloor size cannot be greater than totalfloor");

				i--;
			}

			else {

				floorSizes[i] = size;

			}

		}

		FloorConstruction fConstruction = new FloorConstruction(); // create an object of FloorConstruction

		fConstruction.constructFloor(totalfloor, floorSizes); // access method constructFloor to find out the floor size
		// that can be constructed per day

		sc.close();
	}
}
