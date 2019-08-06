package MozzartSrbija;
import org.testng.annotations.Test;

import MozzartSrbija.ProveraBalansa;
import MozzartSrbija.Podaci_Baza;

public class balans {
	public Integer web;
	
	@Test(dependsOnMethods = {})
	public static void balans1() {
//ProveraBalansa pb = new ProveraBalansa();
//Integer web = pb.web_balans;
//System.out.println(web);

Podaci_Baza pb1 = new Podaci_Baza();
Integer baza = pb1.balance_after1;
System.out.println("Baza iz balansa je: " + baza);
}
}

