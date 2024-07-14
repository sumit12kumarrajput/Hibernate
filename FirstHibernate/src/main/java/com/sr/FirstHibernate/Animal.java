package com.sr.FirstHibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "animal2")
public class Animal {
@Id
private int weight;
private String color;

private String name;


public int getWeight() {
	return weight;
}
public void setWeight(int weight) {
	this.weight = weight;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}
