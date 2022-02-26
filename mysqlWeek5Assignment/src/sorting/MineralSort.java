package sorting;

import java.util.List;
import week5Assignment.DRGMineral;

public class MineralSort {
	
	// getting the static list
	List<DRGMineral> minerals = DRGMineral.getMinerals();
	
	// method to sort objects with lambda
	// takes two parameters, returns int
	public void sortWithLambda() {
		minerals.sort((DRGMineral m1, DRGMineral m2) -> m1.getMineral().compareTo(m2.getMineral()));
		System.out.println("Sorted List using Lambda: " + minerals);
	}
	
	// method to sort objects with method reference
	public void sortWithMR() {
		minerals.sort(DRGMineral::compare);
		System.out.println("Sorted List using MR: " + minerals);
	}
	
	// main method to call sort methods
	public static void main(String[] args) {
		new MineralSort().sortWithLambda();
		new MineralSort().sortWithMR();
	}
}
