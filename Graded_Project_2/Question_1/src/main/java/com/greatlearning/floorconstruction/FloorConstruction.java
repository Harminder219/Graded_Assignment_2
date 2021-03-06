package com.greatlearning.floorconstruction;

import java.util.Stack;

public class FloorConstruction {

	private Stack<Integer> floorSizesStack = new Stack<>(); // stack that will hold floor sizes

	public FloorConstruction() {

		System.out.println("\nThe order of construction is as follows :");

	}

	public void constructFloor(int requiredFloorSize, int[] floorSizes)

	{

		for (int i = 0; i < floorSizes.length; i++) {

			int day = i + 1;

			System.out.println("\n\nDay: " + day);

			if (floorSizes[i] != requiredFloorSize) {

				// this code will run when requiredFloorSize is greater than floor size and in
				// this we will store all the floor sizes which are less then requiredFloorSize

				System.out.print(" ");

				floorSizesStack.push(floorSizes[i]);

			}

			else {

				// this block will run when requiredFloorSize is less than or
				// equal to floor size

				requiredFloorSize -= 1;

				System.out.print(floorSizes[i] + " ");

				while (!floorSizesStack.isEmpty() && requiredFloorSize == floorSizesStack.peek()) // this loop will run
				// till stack is
				// empty and
				// requiredFloorSize
				// is less than or
				// equal to stack
				// top

				{

					requiredFloorSize -= 1;

					System.out.print(floorSizesStack.pop() + " "); // pop element from stack and print

				}

			}

		}

	}

}
