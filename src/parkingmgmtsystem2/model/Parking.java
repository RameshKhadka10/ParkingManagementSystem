/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkingmgmtsystem2.model;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author dell
 */
public class Parking {
    private int token;
    private String vehicle_type;
    private long mobile;
    private String vehicle_no;
    private LocalTime startDate;
    private LocalTime exitDate;
    private long amount;
    private long parkingDuration;
    String tokenValue;
    private LocalDate parkingDate;

    public Parking() {
    }

    public Parking(int token, String vehicle_type, long mobile, String vehicle_no, LocalTime startDate, LocalTime exitDate, long amount, long parkingDuration, String tokenValue, LocalDate parkingDate) {
        this.token = token;
        this.vehicle_type = vehicle_type;
        this.mobile = mobile;
        this.vehicle_no = vehicle_no;
        this.startDate = startDate;
        this.exitDate = exitDate;
        this.amount = amount;
        this.parkingDuration = parkingDuration;
        this.tokenValue = tokenValue;
        this.parkingDate = parkingDate;
    }


  

    public int getToken() {
        return token;
    }

    public void setToken(int token) {
        this.token = token;
    }

    public String getVehicle_type() {
        return vehicle_type;
    }

    public void setVehicle_type(String vehicle_type) {
        this.vehicle_type = vehicle_type;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public String getVehicle_no() {
        return vehicle_no;
    }

    public void setVehicle_no(String vehicle_no) {
        this.vehicle_no = vehicle_no;
    }

    public LocalTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalTime startDate) {
        this.startDate = startDate;
    }

    public LocalTime getExitDate() {
        return exitDate;
    }

    public void setExitDate(LocalTime exitDate) {
        this.exitDate = exitDate;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public long getParkingDuration() {
        return parkingDuration;
    }

    public void setParkingDuration(long parkingDuration) {
        this.parkingDuration = parkingDuration;
    }

    public String getTokenValue() {
        return tokenValue;
    }

    public void setTokenValue(String tokenValue) {
        this.tokenValue = tokenValue;
    }

    public LocalDate getParkingDate() {
        return parkingDate;
    }

    public void setParkingDate(LocalDate parkingDate) {
        this.parkingDate = parkingDate;
    }
    
    
   

    @Override
    public String toString() {
        return "" + "token = " + token +"\n"+ 
                "vehicle type = " + vehicle_type + "\n"+
                "mobile = " + mobile + "\n"+
                "vehicle number = " + vehicle_no + "\n"+
                " Date = " + parkingDate + "\n"+
                "Entry time = " + startDate + "\n"+
                "exit time = " + exitDate + "\n"+
                "parking duration = "+ parkingDuration +" minutes" +"\n" +
                "fee = " + amount +" rupess";
    }
    
    
    



   
  
    
    
}
 