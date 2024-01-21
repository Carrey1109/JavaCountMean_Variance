package mis.oop;
import java.util.ArrayList;
import java.lang.Math;
public class Stat {
	
	ArrayList<Double> mynumber=new ArrayList<Double>();
	private double mean = 0;
	private int count=0;
	private double variance = 0;
    
    public Stat(Double...usernumber) {
	   for (var num:usernumber) {
		   mynumber.add(num);
		   this.count++;
	   }
    }
    public Stat(int...usernumber) {
 	   for (var num:usernumber) {
 		   mynumber.add(Double.valueOf(num));
 		   this.count++;
 	   }
     }
    
    public Stat(float...usernumber) {
  	   for (var num:usernumber) {
  		   mynumber.add(Double.valueOf(num));
  		   this.count++;
  	   }
      }
    
    public Double stat_mean()
    {
    	Double sum = Double.valueOf( 0.0 );
    	for( var num: mynumber ) {
    		sum += num;
    	}
    	this.mean = sum / count;
    	return mean;
    }
    
    public Double stat_variance()
    {
    	for( var num:mynumber )
    	{
    		this.variance += Math.pow( ( num - this.mean ), 2);
    	}
    	this.variance /= this.count;
    	return this.variance;
    }
    
    public Double stat_std()
    {
    	return Math.pow(this.variance, 0.5);
    }
}
