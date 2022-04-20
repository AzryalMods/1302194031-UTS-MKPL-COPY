package lib;

public class SpouseData extends Employee{
    private String spouseName;
	private String spouseIdNumber;

    public void setSpouse(String spouseName) {
		this.spouseName = spouseName;
	}

    public void setSpouseId(String spouseIdNumber) {
        this.spouseIdNumber = idNumber;
    }

    public String getSpouseName() {
        return spouseName;
    }

    public String getSpouseIdNumber() {
        return spouseIdNumber;
    }
}
