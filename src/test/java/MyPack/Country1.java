package MyPack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Country1 {
	@Test
	  public void hk() {
		  String name = "Hong Kong";
		  Assert.assertEquals(name, "Hong Kong");
		  System.out.println("The Given Country is Correct as : " +name);
	  }
	  
	  @Test
	  public void to() {
		  String name = "Togo";
		  Assert.assertEquals(name, "Togo");
		  System.out.println("The Given Country is Correct as : " +name);
	  }
	  
	  @Test
	  public void nor() {
		  String name = "Norway";
		  Assert.assertEquals(name, "Norway");
		  System.out.println("The Given Country is Correct as : " +name);
	  }
	  
	  @Test
	  public void ire() {
		  String name = "Ireland";
		  Assert.assertEquals(name, "Ireland");
		  System.out.println("The Given Country is Correct as : " +name);
	  }
	  
	  @Test
	  public void den() {
		  String name = "Denmark";
		  Assert.assertEquals(name, "Denmark");
		  System.out.println("The Given Country is Correct as : " +name);
	  }
	  
	  @Test
	  public void fin() {
		  String name = "Finland";
		  Assert.assertEquals(name, "Finland");
		  System.out.println("The Given Country is Correct as : " +name);
	  }
	  
	  @Test
	  public void lib() {
		  String name = "Liberia";
		  Assert.assertEquals(name, "Liberia");
		  System.out.println("The Given Country is Correct as : " +name);
	  }
	  
	  @Test
	  public void net() {
		  String name = "Netherlands";
		  Assert.assertEquals(name, "Netherlands");
		  System.out.println("The Given Country is Correct as : " +name);
	  }
	  
	  @Test
	  public void mal() {
		  String name = "Malaysia";
		  Assert.assertEquals(name, "Malaysia");
		  System.out.println("The Given Country is Correct as : " +name);
	  }
	  
	  @Test
	  public void ken() {
		  String name = "Kenya";
		  Assert.assertEquals(name, "Kenya");
		  System.out.println("The Given Country is Correct as : " +name);
	  }
}
