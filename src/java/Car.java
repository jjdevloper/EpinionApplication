/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jacques
 */
public class Car {
   
    public int Carid;
public String Model;
public String Color;
public int doors;
public Boolean convertible;
    
public Car()
{

}

public Car(int carid,String model,String col,int d,Boolean convert)
{
    this.Carid=carid;
    setModel(model);
    setConvertible(convert);
    setDoors(d);
    Color(col);
}

   public int getcarid() {
      return  Carid;
   }
   public void setCarid(int carid) {
      this.Carid = carid;
   }
   
   
   public String getColor() {
      return  Color ;
   }
   public void Color(String Color) {
      this.Color = Color;
   }
   
   public String getModel() {
      return  Model;
   }
   public void setModel(String model) {
      this.Model = model;
   }
   public int getdoors() {
      return  doors;
   }
   public void setDoors(int Doors) {
      this.doors = Doors;
   }
   public Boolean getConvertible() {
      return  convertible;
   }
   public void setConvertible(Boolean convert) {
      this.convertible = convert;
   }
   
}
  
