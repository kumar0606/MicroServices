package com.encapsulations;

public class Student {
 private int id;
 private String name;
 private boolean attendance;
Student(int id){
	this.id=id;
}
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
public boolean isAttendance() {
	System.out.println("teacher setget the attendance");
	return attendance;
}
public void setAttendance(boolean attendance) {
	System.out.println("teacher get attendance");
	this.attendance = attendance;
}

}
