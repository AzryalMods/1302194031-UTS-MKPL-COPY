package lib;

public class ChildData {
    private String childNames;
	private String childIdNumbers;

    public ChildData(String childName, String childIdNumbers) {
        this.childName = childName;
        this.childIdNumbers = childIdNumbers;
    }

    public String getChildName() {
        return childName;
    }

    public void setChildName(String childName) {
        this.childName = childName;
    }

    public String getChildIdNumbers() {
        return childIdNumbers;
    }

    public void setChildIdNumbers(String childIdNumbers) {
        this.childIdNumbers = childIdNumbers;
    }
}
