package week5Assignment;

import java.util.ArrayList;
import java.util.List;

public class DRGMineral {
	
	// instance variable
	private String mineral;

	
	// constructor
	public DRGMineral(String mineral) {
		this.mineral = mineral;
	}

	// getter + setter
	public String getMineral() {
		return mineral;
	}
	public void setMineral(String mineral) {
		this.mineral = mineral;
	}
	
	// toString method (same as getter, but overloaded toString())
	public String toString() {
		return mineral;
	}
	
	// static method compare
	public static int compare(DRGMineral m1, DRGMineral m2) {
		if (m1.mineral.compareTo(m2.mineral) > 0) {
			return 1;
		} else if (m1.mineral.compareTo(m2.mineral) < 0) {
			return -1;
		} else {
			return 0;
		}
	}
	
	// static list of objects
	public static List<DRGMineral> minerals = new ArrayList<>(List.of(
		new DRGMineral("nitra"),
		new DRGMineral("gold"),
		new DRGMineral("morkite"),
		new DRGMineral("enor pearl"),
		new DRGMineral("croppa"),
		new DRGMineral("bismor"),
		new DRGMineral("umanite"),
		new DRGMineral("jadiz"),
		new DRGMineral("hollomite"),
		new DRGMineral("magnite")
		)
	);
	
	// method to get list
	public static List<DRGMineral> getMinerals() {
		return minerals;
	}
}
