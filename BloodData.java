package package1;

class BloodData {
	private String bloodType;
	private String rhFactor;
	
	public BloodData() {
		this.bloodType = "O";
		this.rhFactor = "+";
	}
	
	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}
	
	public void setRhFactor(String rhFactor) {
		this.rhFactor = rhFactor;
	}
	
	public String getBloodType() {
		return bloodType;
	}
	
	public String getRhFactor() {
		return rhFactor;
	}
}
