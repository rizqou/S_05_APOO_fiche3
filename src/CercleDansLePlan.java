public class CercleDansLePlan {
	private double rayon;
	private Point centre;
	CercleDansLePlan(double rayon, Point centre) {
		this.rayon = rayon;
		this.centre = centre;
	}
	public double getRayon() {
		return rayon;
	}
	public Point getCentre() {
		return centre;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}
	public void setCentre(Point centre) {
		this.centre = centre;
	}
	public String toString() {
		return "Rayon: " + rayon + " Centre: " + centre;
	}
}
