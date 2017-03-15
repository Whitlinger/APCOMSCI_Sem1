import java.util.ArrayList;
public class Satellite
{
   public static void main(String[]args)
   {
       ArrayList<Location> locate = new ArrayList<>();
       double[] honLoc = {5, 6};
       locate.add(new Honda(honLoc));
       locate.add(new Toyota("8, 9"));
       locate.add(new GMC(3, 8));
	  
       double[] home = {0, 0};

       String printout = "\n\n" +
               "==========================\n";

       for (Location l : locate)
       {
		   double one = Math.random()*100 + 1;
		   double two = Math.random()*100 + 1;
		   
		   Car object = (Car)l; 
		   object.move(one, two);
		   
		   printout += "After " + l.getID() + " Moved (" + String.format("%.2f, %.2f", one, two) + ")";
		   
		   printout += "\nNew Location: (" + getLocation(l.getLoc()) + ")\n\n";
       }
	   
	   System.out.println(printout); 
	   


       printout = "==========================" +
                   "\nDistance from home...";


       for (Location l : locate)
       {
           printout += "\n\tDistance for " + l.getID() + ": (" + getDistance(l.getLoc(), home)+ ")";
		   
       }
	   
	   System.out.println(printout); 
   }


   public static String getDistance(double[] car, double[] home)
   {
       double blah = Math.sqrt((Math.pow(car[0] - home[0], 2)+ Math.pow(car[1] - home[1], 2)));
	   return String.format("%.2f", blah); 
   }


   public static String getLocation(double[] loc)
   {
       return String.format("%.2f, %.2f", loc[0], loc[1]); 
   }
  
}
