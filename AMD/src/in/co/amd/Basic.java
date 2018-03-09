package in.co.amd;

public class Basic implements Comparable<Basic> {

	private int empId;
	private String firstName;
	private String lastName;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public int compareTo(Basic b) {
		if (empId > b.empId) {
			return -1;
		} else if (empId < b.empId) {
			return +1;
		} else {
			return 0;
		}

	}

}