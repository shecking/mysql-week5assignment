package optional;

import java.util.NoSuchElementException;
import java.util.Optional;
import week5Assignment.DRGMineral;

public class MineralOptional {
	
	// instance variable for exception message
	public static NoSuchElementException e = new NoSuchElementException("Mineral was not found");
	
	public static void main(String[] args) {
		// call method B
		callingFindMineral();
	}
	
	// method A
	// accept in an Optional object, return object if it exists
	private static DRGMineral findMineral(Optional<DRGMineral> optionalMin) {
		// throw a NSEE (**using orElseThrow**) with a message if no object
		// use lambda with no parameters
		// return type is DRGMineral
		return optionalMin.orElseThrow(() -> e);
	}
	
	// method B
	// two separate method calls of A
	// one with a new Optional object and one with empty optional
	private static void callingFindMineral() {
		// findMineral call #1
		DRGMineral fancyMineral = findMineral(Optional.of(new DRGMineral("red sugar")));
		// return not possible, creates unreachable code
		System.out.println(fancyMineral);
		
		// try catch using e and an empty optional
		try {
			// findMineral call #2
			findMineral(Optional.empty());
		} catch (NoSuchElementException e){
			System.out.println(e.getMessage());
		}
	}
}
