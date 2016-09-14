package monster.controller;
import monster.model.MarshmallowMonster;
public class MonsterController 
{
	private MarshmallowMonster firstMonster;
	public MonsterController()
	{
		firstMonster = new MarshmallowMonster("BB Steve",2,2,false,2,2);
	}
	/*name bb steve, 
	  * 2 anntenas 
	  * 2 eyes 
	  * no belly button 
	  * 2 arms 
	  * 2 legs  */
	public void start()
	{
		System.out.println("Here is my monster:"+firstMonster);
		System.out.println("My monster has this many eyes:"+firstMonster.getEyeCount());
		if(firstMonster.getEyeCount()>3)
		{
			System.out.println("Thats a lot of eyes!!!!-Sacry");
		}
	}
	
}
