package Assignment1;

public interface PointCP6 {
	public double getX();
	public double getY();
	public double getRho();
	public double getTheta();
	public PointCP3 convertStorageToCartesian();
	public PointCP2 convertStorageToPolar();
	public double getDistance();
	//public PointCP2 rotatePoint(double rotation);
	public String toString();
	
}
