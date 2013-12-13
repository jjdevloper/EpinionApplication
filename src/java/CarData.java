/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jacques
 */
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ComponentSystemEvent;

@ManagedBean(name = "carData", eager = true)
@SessionScoped
public class CarData implements Serializable {

   private static final long serialVersionUID = 1L;

   public List<Car> getCars(){
      ResultSet rs = null;
      PreparedStatement pst = null;
      Connection con = getConnection();
      String stm = "Select * from cars";
      List<Car> cars = new ArrayList<Car>();
      try {   
         pst = con.prepareStatement(stm);
         pst.execute();
         rs = pst.getResultSet();

         while(rs.next()){
            Car car = new Car(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getBoolean(5));
           
            cars.add(car);				
         }
      } catch (SQLException e) {
         e.printStackTrace();
      }
      return cars;
   }

   public Connection getConnection(){
      Connection con = null;

      String url = "jdbc:mysql://localhost:3306/testdb";
      String user = "root";
      String password = "";
      try {
         con = DriverManager.getConnection(url, user, password);
         System.out.println("Connection completed.");
      } catch (SQLException ex) {
         System.out.println(ex.getMessage());
      }
      finally{
      }
      return con;
   }
}
