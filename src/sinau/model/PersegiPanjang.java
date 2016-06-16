package sinau.model;

public class PersegiPanjang implements BangunDatar {
	private double panjang;
	private double lebar;

	public double getPanjang() {
		return panjang;
	}
	public void setPanjang(double panjang) {
		this.panjang = panjang;
	}
	public double getLebar() {
		return lebar;
	}
	public void setLebar(double lebar) {
		this.lebar = lebar;
	}

	@Override
	public double hitungLuas() {
		// TODO Auto-generated method stub
		return (this.panjang * this.lebar);
	}

	@Override
	public double hitungKeliling() {
		// TODO Auto-generated method stub
		return ((2 * this.panjang) + (2 * this.lebar));
	}
}
