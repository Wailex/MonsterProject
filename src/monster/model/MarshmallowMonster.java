package monster.model;

public class MarshmallowMonster 

{
     private String name;
     private double antennaCount;
     private int eyeCount;
     private boolean hasBellyButton;
     private int armCount;
     private int noseCount;
     public MarshmallowMonster()
     {
    	 this.name = "no name here";
    	 this.antennaCount = -23423.121235;
    	 this.eyeCount = -2345678;
    	 this.hasBellyButton = false;
    	 this.armCount = -32436;
    	 this.noseCount = -7765;
    			
    	  }
     
     public MarshmallowMonster(String name, double antennaCount, int eyeCount, boolean hasBellyButton, int armCount, int noseCount)
     {
    	 this.name = name;
    	 this.antennaCount = antennaCount;
    	 this.eyeCount = eyeCount;
    	 this.hasBellyButton = hasBellyButton;
    	 this.armCount = armCount;
    	 this.noseCount = noseCount;
    	 /*name bb steve, 
    	  * 2 anntenas 
    	  * 2 eyes 
    	  * no belly button 
    	  * 2 arms 
    	  * 2 legs  */
    	 
     }
     
     public String  toString()
     {
    	 String description  = "Name is"+this.name;
    	 
    	 return description;
     }
     
}
