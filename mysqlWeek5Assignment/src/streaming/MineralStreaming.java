package streaming;

import java.util.List;
import java.util.stream.Collectors;
import week5Assignment.DRGMineral;

public class MineralStreaming {

	public static void main(String[] args) {
		
		// getting the static list
		List<DRGMineral> minerals = DRGMineral.getMinerals();
		
		// creating stream from list
		// mapping
		// sorting
		// collecting with Collectors.joining
		String sortedMins = minerals.stream()
			.map(DRGMineral::toString)
			.sorted()
			.collect(Collectors.joining(", "));
		// printing string
		System.out.println(sortedMins);
	}
}
