package com.javalec.ex;

public class Vehicle {
		  String type = "4W";
		  int maxSpeed = 100;
		  
		  public Vehicle() {
			// TODO Auto-generated constructor stub
		}
		  
		  Vehicle(String type, int maxSpeed) {
		    this.type = type;
		    this.maxSpeed = maxSpeed;
		  }
		}

		class Car extends Vehicle {
		  String trans;
		  
		  Car(String trans) { // line n1
			super();
		    this.trans = trans;
		  }
		  
		  Car(String type, int maxSpeed, String trans) {
		    super(type, maxSpeed);
		    this.trans = trans; // line n2
		  }
		
}
