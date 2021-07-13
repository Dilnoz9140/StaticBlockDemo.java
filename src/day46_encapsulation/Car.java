package day46_encapsulation;

import java.time.Year;

public class Car {
    // encapsulated/hidden instance variables
     private String model;
     private int year;
     private int mileage;

     // setter method for model
    public void setModel(String carModel){
        model=carModel;
    }
    //getter method for model
    public String getModel() {
        return model;
    }
        //setter for year
        public void setYear (int year){
           this.year = year;

        }
       // getter for year
    public int getYear(){
        return year;
    }
    public void setMileage(int mileage){
        this.mileage=mileage;
    }
    public int getMileage(){
        return mileage;//this.mileage also work fine
    }
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                '}';
    }
}
