/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkingmgmtsystem2.Dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import parkingmgmtsystem2.model.Parking;

/**
 *
 * @author dell
 */
public class ParkingDao {
private static final String DRIVER_CLASS="com.mysql.jdbc.Driver";
private static final String URL ="jdbc:mysql://localhost:3306/pms_db";
private static final String USER="root";
private static final String PASS="";

public static boolean addEntry(Parking p){
    boolean status = false;
    Connection conn = null;
    PreparedStatement ps = null;
    String sql = "insert into pms_tbl (vehicle_type,mobile,vehicle_no,start_date,token_value,parking_date,duration,amount) values(?,?,?,?,?,?,?,?)";
    try{
        Class.forName(DRIVER_CLASS);
        conn=DriverManager.getConnection(URL, USER, PASS);
        ps=conn.prepareStatement(sql);
        
        ps.setString(1, p.getVehicle_type());
        ps.setLong(2, p.getMobile());
        ps.setString(3,p.getVehicle_no());
        ps.setTime(4,Time.valueOf(p.getStartDate()));
        ps.setString(5,p.getTokenValue());
        ps.setDate(6,Date.valueOf(p.getParkingDate()));
        ps.setLong(7, p.getParkingDuration());
         ps.setLong(8, p.getAmount());
        
        if(ps.executeUpdate()==1){
            status=true;
        }
         
        
    }catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        
    }finally{
        try{
        if(conn!=null) conn.close();
        if(ps!=null) ps.close();
    }catch(SQLException ex){
        JOptionPane.showMessageDialog(null,ex);
    }
    }
    
    return status;
    
}

public static boolean updateParking(int token) {
         boolean status =false;
        Connection con=null;
        PreparedStatement ps=null;
        String sql="update pms_tbl set exit_date=?, token_value=? where token=?";
        
        try{
            Class.forName(DRIVER_CLASS);
            con=DriverManager.getConnection(URL, USER, PASS);
            
            ps=con.prepareStatement(sql);
            ps.setInt(3, token);
           ps.setTime(1,Time.valueOf(LocalTime.now()) );
           ps.setString(2, "expired");
        
            int i=ps.executeUpdate();
            if(i==1){
                status=true;
            }
               
            }
          
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
        }finally{
    try{
        if(con!=null) con.close();
        if(ps!=null) ps.close();
    }catch(SQLException ex){
        //System.out.println(ex);
        JOptionPane.showMessageDialog(null,ex);
    }
}
        return status;
        
       
    }

public static boolean updateAmt(int token,Parking p) {
         boolean status =false;
        Connection con=null;
        PreparedStatement ps=null;
        String sql="update pms_tbl set duration=?, amount=? where token=?";
        
        try{
            Class.forName(DRIVER_CLASS);
            con=DriverManager.getConnection(URL, USER, PASS);
            
            ps=con.prepareStatement(sql);
            ps.setInt(3, token);
           ps.setLong(1,p.getParkingDuration() );
           ps.setLong(2,p.getAmount());
        
            int i=ps.executeUpdate();
            if(i==1){
                status=true;
            }
               
            }
          
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
        }finally{
    try{
        if(con!=null) con.close();
        if(ps!=null) ps.close();
    }catch(SQLException ex){
        //System.out.println(ex);
        JOptionPane.showMessageDialog(null,ex);
    }
}
        return status;
        
       
    }

public static Parking selectAllParkingById(int token) {
         Parking p=null;
        Connection con=null;
        PreparedStatement ps=null;
        
        try{
            Class.forName(DRIVER_CLASS);
            con=DriverManager.getConnection(URL, USER, PASS);
            String sql="select * from pms_tbl where token=?";
            ps=con.prepareStatement(sql);
            ps.setInt(1, token);
            ResultSet rs=ps.executeQuery();
            
            if(rs.next()){
                p=new Parking();
                p.setToken(rs.getInt("token"));
                p.setVehicle_type(rs.getString("vehicle_type"));
                p.setVehicle_no(rs.getString("vehicle_no"));
                p.setStartDate(rs.getTime("start_date").toLocalTime());
                p.setExitDate(rs.getTime("exit_date").toLocalTime());
                p.setMobile(rs.getLong("mobile"));
                p.setTokenValue(rs.getString("token_value"));
                p.setParkingDate(rs.getDate("parking_date").toLocalDate());
                p.setAmount(rs.getLong("amount"));
                p.setParkingDuration(rs.getLong("duration"));
                
            }
            
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
            //System.out.println(ex);
        }
        finally{
    try{
        if(con!=null) con.close();
        if(ps!=null) ps.close();
    }catch(SQLException ex){
        System.out.println(ex);
    }
}
        return p;
        

    }

public static Parking selectToken(long mobile,String tkValue) {
         Parking p=null;
        Connection con=null;
        PreparedStatement ps=null;
        
        try{
            Class.forName(DRIVER_CLASS);
            con=DriverManager.getConnection(URL, USER, PASS);
            String sql="select token from pms_tbl where mobile=? AND token_value=?";
            ps=con.prepareStatement(sql);
            ps.setLong(1, mobile);
            ps.setString(2, tkValue);
            ResultSet rs=ps.executeQuery();
            
            if(rs.next()){
                p=new Parking();
                p.setToken(rs.getInt("token"));   
                
            }
            else{
                System.out.println("token not available please enter valid id");
            }   
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
            //System.out.println(ex);
        }
        finally{
    try{
        if(con!=null) con.close();
        if(ps!=null) ps.close();
    }catch(SQLException ex){
        System.out.println(ex);
    }
}
        return p;
    }

public static Parking selectTokenValueByToken(int token) {
         Parking p=null;
        Connection con=null;
        PreparedStatement ps=null;
        
        try{
            Class.forName(DRIVER_CLASS);
            con=DriverManager.getConnection(URL, USER, PASS);
            String sql="select token_value from pms_tbl where token=?";
            ps=con.prepareStatement(sql);
            ps.setInt(1, token);
            ResultSet rs=ps.executeQuery();
            
            if(rs.next()){
                p=new Parking();
                p.setTokenValue(rs.getString("token_value"));
                
            }else{
                p=new Parking();
                p.setTokenValue("null");
            }
            
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
            //System.out.println(ex);
        }
        finally{
    try{
        if(con!=null) con.close();
        if(ps!=null) ps.close();
    }catch(SQLException ex){
        System.out.println(ex);
    }
}
        return p;
        

    }


 public ArrayList<Parking> selectAllParking(){
        ArrayList<Parking> a1=new ArrayList();
        
        Connection con=null;
        PreparedStatement ps=null;
        
        try{
            Class.forName(DRIVER_CLASS);
            con=DriverManager.getConnection(URL, USER, PASS);
            String sql="select * from pms_tbl order by parking_date desc";
            ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
               Parking p=new Parking();
               p.setToken(rs.getInt("token"));
               p.setVehicle_type(rs.getString("vehicle_type"));
               p.setVehicle_no(rs.getString("Vehicle_no"));
               p.setStartDate(rs.getTime("start_date").toLocalTime());
               p.setExitDate(rs.getTime("exit_date").toLocalTime());
               p.setMobile(rs.getLong("mobile"));
               p.setTokenValue(rs.getString("token_value"));
               p.setParkingDate(rs.getDate("parking_date").toLocalDate());
               p.setAmount(rs.getLong("amount"));
               p.setParkingDuration(rs.getLong("duration"));
                
               a1.add(p);
                
            }
            
        }
        catch(Exception e){
            //JOptionPane.showMessageDialog(null, e);
            System.out.println(e);
        }
        finally{
    try{
        if(con!=null) con.close();
        if(ps!=null) ps.close();
    }catch(SQLException ex){
        System.out.println(ex);
    }
}
        return a1;
    }
 
 // select all parking information in a given range of date
 
public static ArrayList<Parking> getParkingInfoByDate(LocalDate date1,LocalDate date2) {
        ArrayList<Parking> p1=new ArrayList(); 
        Connection con=null;
        PreparedStatement ps=null;
        
        try{
            Class.forName(DRIVER_CLASS);
            con=DriverManager.getConnection(URL, USER, PASS);
            String sql="select * from pms_tbl where parking_date >= ? and parking_date < ?";
            ps=con.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(date1));
           ps.setDate(2, Date.valueOf(date2));
            ResultSet rs=ps.executeQuery();
            
             while(rs.next()){
               Parking p=new Parking();
                p.setToken(rs.getInt("token"));
                p.setVehicle_type(rs.getString("vehicle_type"));
                p.setVehicle_no(rs.getString("vehicle_no"));
                p.setStartDate(rs.getTime("start_date").toLocalTime());
                p.setExitDate(rs.getTime("exit_date").toLocalTime());
                p.setMobile(rs.getLong("mobile"));
                p.setTokenValue(rs.getString("token_value"));
                p.setParkingDate(rs.getDate("parking_date").toLocalDate());
                p.setAmount(rs.getLong("amount"));
                p.setParkingDuration(rs.getLong("duration"));
                
                p1.add(p);
                
            }
            
        }
        catch(Exception ex){
            //JOptionPane.showMessageDialog(null, ex);
            System.out.println(ex);
        }
        finally{
    try{
        if(con!=null) con.close();
        if(ps!=null) ps.close();
    }catch(SQLException ex){
        System.out.println(ex);
    }
}
        return p1;
    }
       
       
    
}
