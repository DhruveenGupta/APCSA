//(c) A+ Computer Science
// www.apluscompsci.com
// Name - 
package unit07_2darrays.practice;


public class Thing
{
   private String type;
   private String name;
   private double size;
   
   public Thing( String t, String n, double s)
   {
      type = t;
      name = n;
      size = s;
   }
   
   public String getType()
   {
   	return type;
   }
   
   public double getSize()
   {
   	return size;
   }
   
   public String toString()
   {
   	return "" + type + " " + name + " " + String.format("%.2f",size) + " ";
   }	
	
}