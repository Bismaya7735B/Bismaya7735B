package myFirstAssignment;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
@Override
	public String toString() {
		return "Employee [eid=" + eid + ", eName=" + eName + ", eAge=" + eAge + ", eSalary=" + eSalary + ", eAddress="
				+ eAddress + "]";
	}
@Id
private int eid; 
private String eName; 
private int eAge; 
private double eSalary;
private String eAddress;
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String geteName() {
	return eName;
}
public void seteName(String eName) {
	this.eName = eName;
}
public int geteAge() {
	return eAge;
}
public void seteAge(int eAge) {
	this.eAge = eAge;
}
public double geteSalary() {
	return eSalary;
}
public void seteSalary(double eSalary) {
	this.eSalary = eSalary;
}
public String geteAddress() {
	return eAddress;
}
public void seteAddress(String eAddress) {
	this.eAddress = eAddress;
}

}
