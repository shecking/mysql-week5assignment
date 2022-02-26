package optional;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import week5Assignment.DRGMineral;

public class MineralOptional {
	
	// getting the static list
	static List<DRGMineral> minerals = DRGMineral.getMinerals();

	// main method
	public static void main(String[] args) {
		// method call(s?) here
	}
	
	// method A: a method that accepts Optional of object and returns unwrapped object
	// template directly from assignment:
	// public Cheese cheesyMethod(Optional<Cheese> optionalCheese) {...}
	public static DRGMineral findMineral(Optional<DRGMineral> optionalMineral) {
		// if present return unwrapped object
		// take input via a scanner or search list of mineral objects above?
		// where is the information coming from?
		if (optionalMineral.isPresent()) {
			// return unwrapped object
			return optionalMineral.get();
		// if not present throw Exception
		} else {
			throw new NoSuchElementException("mineral is not present");
		}
	}

	// method B (?)
	// what is the difference between method A and B? Why are two methods needed?
	public static void callingA(Optional<DRGMineral> optionalMineral) {
		// Call A with an object wrapped by an Optional
		// print the object
		// Also call A with empty Optional
		// print exception message
	}
}
