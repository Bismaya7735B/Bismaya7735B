package usinghibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class student {
@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", age=" + age + ", mobile=" + mobile + "]";
	}
@Id
private int id;
private String name;
private int age;
private long mobile;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public long getMobile() {
	return mobile;
}
public void setMobile(long mobile) {
	this.mobile = mobile;
}
}
