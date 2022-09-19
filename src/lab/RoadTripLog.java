package lab;

public class RoadTripLog {

	private String TripName;
	private double TotalDistance;
	private double TotalFuel;
	private double MPG;
	
	public RoadTripLog(String TripName) {
		this.TripName = TripName;
	}
	
	
	
	public double addDistance(double moreDistance) {
		this.TotalDistance += moreDistance;
		return this.TotalDistance;
	}
	public double addFuel(double moreFuel) {
		TotalFuel += moreFuel;
		return moreFuel;
	}
	public double getTotalDistance() {
		return TotalDistance; 
	}
	public double getTotalFuel() {
		return TotalFuel;
	}
	public double getMPG() {
		return MPG;
	}
	
}
