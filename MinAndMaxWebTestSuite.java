package pset6;

import static org.junit.Assert.*;

import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.junit.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MinAndMaxWebTestSuite {
	static WebDriver wd;
	
	@BeforeClass
    public static void setupClass()
    {
    	 wd = new FirefoxDriver();
    	 wd.get("file:///home/sabee/minandmax.html"); //minandmax.html
    }
	
	@AfterClass
	public static void tearDownClass()
	{
		wd.quit();
	}
	
	@After
	public void empty()
	{
        WebElement we = wd.findElement(By.id("x"));
        we.clear(); // enter 0 for x
        we = wd.findElement(By.id("y"));
        we.clear(); // enter 0 for y
        we = wd.findElement(By.id("z"));
        we.clear(); // enter 0 for z
        we = wd.findElement(By.id("computeButton"));
        
      
	}
@Test public void t0() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("infinity");
we = wd.findElement(By.id("y"));
we.sendKeys("infinity");
we = wd.findElement(By.id("z"));
we.sendKeys("infinity");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t1() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("infinity");
we = wd.findElement(By.id("y"));
we.sendKeys("infinity");
we = wd.findElement(By.id("z"));
we.sendKeys("infinity");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t2() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("infinity");
we = wd.findElement(By.id("y"));
we.sendKeys("infinity");
we = wd.findElement(By.id("z"));
we.sendKeys("-3");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t3() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("infinity");
we = wd.findElement(By.id("y"));
we.sendKeys("infinity");
we = wd.findElement(By.id("z"));
we.sendKeys("-3");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t4() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("infinity");
we = wd.findElement(By.id("y"));
we.sendKeys("infinity");
we = wd.findElement(By.id("z"));
we.sendKeys("0");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t5() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("infinity");
we = wd.findElement(By.id("y"));
we.sendKeys("infinity");
we = wd.findElement(By.id("z"));
we.sendKeys("0");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t6() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("infinity");
we = wd.findElement(By.id("y"));
we.sendKeys("infinity");
we = wd.findElement(By.id("z"));
we.sendKeys("7");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t7() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("infinity");
we = wd.findElement(By.id("y"));
we.sendKeys("infinity");
we = wd.findElement(By.id("z"));
we.sendKeys("7");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t8() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("infinity");
we = wd.findElement(By.id("y"));
we.sendKeys("-3");
we = wd.findElement(By.id("z"));
we.sendKeys("infinity");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t9() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("infinity");
we = wd.findElement(By.id("y"));
we.sendKeys("-3");
we = wd.findElement(By.id("z"));
we.sendKeys("infinity");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t10() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("infinity");
we = wd.findElement(By.id("y"));
we.sendKeys("-3");
we = wd.findElement(By.id("z"));
we.sendKeys("-3");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t11() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("infinity");
we = wd.findElement(By.id("y"));
we.sendKeys("-3");
we = wd.findElement(By.id("z"));
we.sendKeys("-3");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t12() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("infinity");
we = wd.findElement(By.id("y"));
we.sendKeys("-3");
we = wd.findElement(By.id("z"));
we.sendKeys("0");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t13() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("infinity");
we = wd.findElement(By.id("y"));
we.sendKeys("-3");
we = wd.findElement(By.id("z"));
we.sendKeys("0");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t14() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("infinity");
we = wd.findElement(By.id("y"));
we.sendKeys("-3");
we = wd.findElement(By.id("z"));
we.sendKeys("7");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t15() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("infinity");
we = wd.findElement(By.id("y"));
we.sendKeys("-3");
we = wd.findElement(By.id("z"));
we.sendKeys("7");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t16() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("infinity");
we = wd.findElement(By.id("y"));
we.sendKeys("0");
we = wd.findElement(By.id("z"));
we.sendKeys("infinity");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t17() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("infinity");
we = wd.findElement(By.id("y"));
we.sendKeys("0");
we = wd.findElement(By.id("z"));
we.sendKeys("infinity");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t18() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("infinity");
we = wd.findElement(By.id("y"));
we.sendKeys("0");
we = wd.findElement(By.id("z"));
we.sendKeys("-3");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t19() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("infinity");
we = wd.findElement(By.id("y"));
we.sendKeys("0");
we = wd.findElement(By.id("z"));
we.sendKeys("-3");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t20() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("infinity");
we = wd.findElement(By.id("y"));
we.sendKeys("0");
we = wd.findElement(By.id("z"));
we.sendKeys("0");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t21() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("infinity");
we = wd.findElement(By.id("y"));
we.sendKeys("0");
we = wd.findElement(By.id("z"));
we.sendKeys("0");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t22() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("infinity");
we = wd.findElement(By.id("y"));
we.sendKeys("0");
we = wd.findElement(By.id("z"));
we.sendKeys("7");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t23() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("infinity");
we = wd.findElement(By.id("y"));
we.sendKeys("0");
we = wd.findElement(By.id("z"));
we.sendKeys("7");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t24() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("infinity");
we = wd.findElement(By.id("y"));
we.sendKeys("7");
we = wd.findElement(By.id("z"));
we.sendKeys("infinity");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t25() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("infinity");
we = wd.findElement(By.id("y"));
we.sendKeys("7");
we = wd.findElement(By.id("z"));
we.sendKeys("infinity");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t26() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("infinity");
we = wd.findElement(By.id("y"));
we.sendKeys("7");
we = wd.findElement(By.id("z"));
we.sendKeys("-3");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t27() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("infinity");
we = wd.findElement(By.id("y"));
we.sendKeys("7");
we = wd.findElement(By.id("z"));
we.sendKeys("-3");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t28() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("infinity");
we = wd.findElement(By.id("y"));
we.sendKeys("7");
we = wd.findElement(By.id("z"));
we.sendKeys("0");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t29() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("infinity");
we = wd.findElement(By.id("y"));
we.sendKeys("7");
we = wd.findElement(By.id("z"));
we.sendKeys("0");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t30() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("infinity");
we = wd.findElement(By.id("y"));
we.sendKeys("7");
we = wd.findElement(By.id("z"));
we.sendKeys("7");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t31() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("infinity");
we = wd.findElement(By.id("y"));
we.sendKeys("7");
we = wd.findElement(By.id("z"));
we.sendKeys("7");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t32() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("-3");
we = wd.findElement(By.id("y"));
we.sendKeys("infinity");
we = wd.findElement(By.id("z"));
we.sendKeys("infinity");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t33() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("-3");
we = wd.findElement(By.id("y"));
we.sendKeys("infinity");
we = wd.findElement(By.id("z"));
we.sendKeys("infinity");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t34() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("-3");
we = wd.findElement(By.id("y"));
we.sendKeys("infinity");
we = wd.findElement(By.id("z"));
we.sendKeys("-3");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t35() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("-3");
we = wd.findElement(By.id("y"));
we.sendKeys("infinity");
we = wd.findElement(By.id("z"));
we.sendKeys("-3");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t36() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("-3");
we = wd.findElement(By.id("y"));
we.sendKeys("infinity");
we = wd.findElement(By.id("z"));
we.sendKeys("0");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t37() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("-3");
we = wd.findElement(By.id("y"));
we.sendKeys("infinity");
we = wd.findElement(By.id("z"));
we.sendKeys("0");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t38() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("-3");
we = wd.findElement(By.id("y"));
we.sendKeys("infinity");
we = wd.findElement(By.id("z"));
we.sendKeys("7");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t39() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("-3");
we = wd.findElement(By.id("y"));
we.sendKeys("infinity");
we = wd.findElement(By.id("z"));
we.sendKeys("7");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t40() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("-3");
we = wd.findElement(By.id("y"));
we.sendKeys("-3");
we = wd.findElement(By.id("z"));
we.sendKeys("infinity");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t41() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("-3");
we = wd.findElement(By.id("y"));
we.sendKeys("-3");
we = wd.findElement(By.id("z"));
we.sendKeys("infinity");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t42() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("-3");
we = wd.findElement(By.id("y"));
we.sendKeys("-3");
we = wd.findElement(By.id("z"));
we.sendKeys("-3");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("min(-3, -3, -3) = -3", output);
}

@Test public void t43() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("-3");
we = wd.findElement(By.id("y"));
we.sendKeys("-3");
we = wd.findElement(By.id("z"));
we.sendKeys("-3");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("max(-3, -3, -3) = -3", output);
}

@Test public void t44() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("-3");
we = wd.findElement(By.id("y"));
we.sendKeys("-3");
we = wd.findElement(By.id("z"));
we.sendKeys("0");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("min(-3, -3, 0) = -3", output);
}

@Test public void t45() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("-3");
we = wd.findElement(By.id("y"));
we.sendKeys("-3");
we = wd.findElement(By.id("z"));
we.sendKeys("0");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("max(-3, -3, 0) = 0", output);
}

@Test public void t46() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("-3");
we = wd.findElement(By.id("y"));
we.sendKeys("-3");
we = wd.findElement(By.id("z"));
we.sendKeys("7");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("min(-3, -3, 7) = -3", output);
}

@Test public void t47() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("-3");
we = wd.findElement(By.id("y"));
we.sendKeys("-3");
we = wd.findElement(By.id("z"));
we.sendKeys("7");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("max(-3, -3, 7) = 7", output);
}

@Test public void t48() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("-3");
we = wd.findElement(By.id("y"));
we.sendKeys("0");
we = wd.findElement(By.id("z"));
we.sendKeys("infinity");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t49() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("-3");
we = wd.findElement(By.id("y"));
we.sendKeys("0");
we = wd.findElement(By.id("z"));
we.sendKeys("infinity");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t50() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("-3");
we = wd.findElement(By.id("y"));
we.sendKeys("0");
we = wd.findElement(By.id("z"));
we.sendKeys("-3");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("min(-3, 0, -3) = -3", output);
}

@Test public void t51() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("-3");
we = wd.findElement(By.id("y"));
we.sendKeys("0");
we = wd.findElement(By.id("z"));
we.sendKeys("-3");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("max(-3, 0, -3) = 0", output);
}

@Test public void t52() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("-3");
we = wd.findElement(By.id("y"));
we.sendKeys("0");
we = wd.findElement(By.id("z"));
we.sendKeys("0");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("min(-3, 0, 0) = -3", output);
}

@Test public void t53() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("-3");
we = wd.findElement(By.id("y"));
we.sendKeys("0");
we = wd.findElement(By.id("z"));
we.sendKeys("0");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("max(-3, 0, 0) = 0", output);
}

@Test public void t54() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("-3");
we = wd.findElement(By.id("y"));
we.sendKeys("0");
we = wd.findElement(By.id("z"));
we.sendKeys("7");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("min(-3, 0, 7) = -3", output);
}

@Test public void t55() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("-3");
we = wd.findElement(By.id("y"));
we.sendKeys("0");
we = wd.findElement(By.id("z"));
we.sendKeys("7");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("max(-3, 0, 7) = 7", output);
}

@Test public void t56() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("-3");
we = wd.findElement(By.id("y"));
we.sendKeys("7");
we = wd.findElement(By.id("z"));
we.sendKeys("infinity");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t57() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("-3");
we = wd.findElement(By.id("y"));
we.sendKeys("7");
we = wd.findElement(By.id("z"));
we.sendKeys("infinity");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t58() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("-3");
we = wd.findElement(By.id("y"));
we.sendKeys("7");
we = wd.findElement(By.id("z"));
we.sendKeys("-3");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("min(-3, 7, -3) = -3", output);
}

@Test public void t59() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("-3");
we = wd.findElement(By.id("y"));
we.sendKeys("7");
we = wd.findElement(By.id("z"));
we.sendKeys("-3");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("max(-3, 7, -3) = 7", output);
}

@Test public void t60() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("-3");
we = wd.findElement(By.id("y"));
we.sendKeys("7");
we = wd.findElement(By.id("z"));
we.sendKeys("0");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("min(-3, 7, 0) = -3", output);
}

@Test public void t61() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("-3");
we = wd.findElement(By.id("y"));
we.sendKeys("7");
we = wd.findElement(By.id("z"));
we.sendKeys("0");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("max(-3, 7, 0) = 7", output);
}

@Test public void t62() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("-3");
we = wd.findElement(By.id("y"));
we.sendKeys("7");
we = wd.findElement(By.id("z"));
we.sendKeys("7");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("min(-3, 7, 7) = -3", output);
}

@Test public void t63() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("-3");
we = wd.findElement(By.id("y"));
we.sendKeys("7");
we = wd.findElement(By.id("z"));
we.sendKeys("7");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("max(-3, 7, 7) = 7", output);
}

@Test public void t64() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("0");
we = wd.findElement(By.id("y"));
we.sendKeys("infinity");
we = wd.findElement(By.id("z"));
we.sendKeys("infinity");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t65() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("0");
we = wd.findElement(By.id("y"));
we.sendKeys("infinity");
we = wd.findElement(By.id("z"));
we.sendKeys("infinity");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t66() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("0");
we = wd.findElement(By.id("y"));
we.sendKeys("infinity");
we = wd.findElement(By.id("z"));
we.sendKeys("-3");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t67() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("0");
we = wd.findElement(By.id("y"));
we.sendKeys("infinity");
we = wd.findElement(By.id("z"));
we.sendKeys("-3");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t68() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("0");
we = wd.findElement(By.id("y"));
we.sendKeys("infinity");
we = wd.findElement(By.id("z"));
we.sendKeys("0");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t69() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("0");
we = wd.findElement(By.id("y"));
we.sendKeys("infinity");
we = wd.findElement(By.id("z"));
we.sendKeys("0");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t70() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("0");
we = wd.findElement(By.id("y"));
we.sendKeys("infinity");
we = wd.findElement(By.id("z"));
we.sendKeys("7");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t71() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("0");
we = wd.findElement(By.id("y"));
we.sendKeys("infinity");
we = wd.findElement(By.id("z"));
we.sendKeys("7");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t72() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("0");
we = wd.findElement(By.id("y"));
we.sendKeys("-3");
we = wd.findElement(By.id("z"));
we.sendKeys("infinity");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t73() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("0");
we = wd.findElement(By.id("y"));
we.sendKeys("-3");
we = wd.findElement(By.id("z"));
we.sendKeys("infinity");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t74() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("0");
we = wd.findElement(By.id("y"));
we.sendKeys("-3");
we = wd.findElement(By.id("z"));
we.sendKeys("-3");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("min(0, -3, -3) = -3", output);
}

@Test public void t75() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("0");
we = wd.findElement(By.id("y"));
we.sendKeys("-3");
we = wd.findElement(By.id("z"));
we.sendKeys("-3");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("max(0, -3, -3) = 0", output);
}

@Test public void t76() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("0");
we = wd.findElement(By.id("y"));
we.sendKeys("-3");
we = wd.findElement(By.id("z"));
we.sendKeys("0");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("min(0, -3, 0) = -3", output);
}

@Test public void t77() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("0");
we = wd.findElement(By.id("y"));
we.sendKeys("-3");
we = wd.findElement(By.id("z"));
we.sendKeys("0");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("max(0, -3, 0) = 0", output);
}

@Test public void t78() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("0");
we = wd.findElement(By.id("y"));
we.sendKeys("-3");
we = wd.findElement(By.id("z"));
we.sendKeys("7");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("min(0, -3, 7) = -3", output);
}

@Test public void t79() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("0");
we = wd.findElement(By.id("y"));
we.sendKeys("-3");
we = wd.findElement(By.id("z"));
we.sendKeys("7");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("max(0, -3, 7) = 7", output);
}

@Test public void t80() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("0");
we = wd.findElement(By.id("y"));
we.sendKeys("0");
we = wd.findElement(By.id("z"));
we.sendKeys("infinity");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t81() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("0");
we = wd.findElement(By.id("y"));
we.sendKeys("0");
we = wd.findElement(By.id("z"));
we.sendKeys("infinity");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t82() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("0");
we = wd.findElement(By.id("y"));
we.sendKeys("0");
we = wd.findElement(By.id("z"));
we.sendKeys("-3");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("min(0, 0, -3) = -3", output);
}

@Test public void t83() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("0");
we = wd.findElement(By.id("y"));
we.sendKeys("0");
we = wd.findElement(By.id("z"));
we.sendKeys("-3");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("max(0, 0, -3) = 0", output);
}

@Test public void t84() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("0");
we = wd.findElement(By.id("y"));
we.sendKeys("0");
we = wd.findElement(By.id("z"));
we.sendKeys("0");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("min(0, 0, 0) = 0", output);
}

@Test public void t85() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("0");
we = wd.findElement(By.id("y"));
we.sendKeys("0");
we = wd.findElement(By.id("z"));
we.sendKeys("0");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("max(0, 0, 0) = 0", output);
}

@Test public void t86() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("0");
we = wd.findElement(By.id("y"));
we.sendKeys("0");
we = wd.findElement(By.id("z"));
we.sendKeys("7");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("min(0, 0, 7) = 0", output);
}

@Test public void t87() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("0");
we = wd.findElement(By.id("y"));
we.sendKeys("0");
we = wd.findElement(By.id("z"));
we.sendKeys("7");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("max(0, 0, 7) = 7", output);
}

@Test public void t88() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("0");
we = wd.findElement(By.id("y"));
we.sendKeys("7");
we = wd.findElement(By.id("z"));
we.sendKeys("infinity");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t89() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("0");
we = wd.findElement(By.id("y"));
we.sendKeys("7");
we = wd.findElement(By.id("z"));
we.sendKeys("infinity");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t90() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("0");
we = wd.findElement(By.id("y"));
we.sendKeys("7");
we = wd.findElement(By.id("z"));
we.sendKeys("-3");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("min(0, 7, -3) = -3", output);
}

@Test public void t91() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("0");
we = wd.findElement(By.id("y"));
we.sendKeys("7");
we = wd.findElement(By.id("z"));
we.sendKeys("-3");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("max(0, 7, -3) = 7", output);
}

@Test public void t92() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("0");
we = wd.findElement(By.id("y"));
we.sendKeys("7");
we = wd.findElement(By.id("z"));
we.sendKeys("0");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("min(0, 7, 0) = 0", output);
}

@Test public void t93() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("0");
we = wd.findElement(By.id("y"));
we.sendKeys("7");
we = wd.findElement(By.id("z"));
we.sendKeys("0");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("max(0, 7, 0) = 7", output);
}

@Test public void t94() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("0");
we = wd.findElement(By.id("y"));
we.sendKeys("7");
we = wd.findElement(By.id("z"));
we.sendKeys("7");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("min(0, 7, 7) = 0", output);
}

@Test public void t95() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("0");
we = wd.findElement(By.id("y"));
we.sendKeys("7");
we = wd.findElement(By.id("z"));
we.sendKeys("7");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("max(0, 7, 7) = 7", output);
}

@Test public void t96() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("7");
we = wd.findElement(By.id("y"));
we.sendKeys("infinity");
we = wd.findElement(By.id("z"));
we.sendKeys("infinity");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t97() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("7");
we = wd.findElement(By.id("y"));
we.sendKeys("infinity");
we = wd.findElement(By.id("z"));
we.sendKeys("infinity");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t98() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("7");
we = wd.findElement(By.id("y"));
we.sendKeys("infinity");
we = wd.findElement(By.id("z"));
we.sendKeys("-3");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t99() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("7");
we = wd.findElement(By.id("y"));
we.sendKeys("infinity");
we = wd.findElement(By.id("z"));
we.sendKeys("-3");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t100() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("7");
we = wd.findElement(By.id("y"));
we.sendKeys("infinity");
we = wd.findElement(By.id("z"));
we.sendKeys("0");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t101() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("7");
we = wd.findElement(By.id("y"));
we.sendKeys("infinity");
we = wd.findElement(By.id("z"));
we.sendKeys("0");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t102() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("7");
we = wd.findElement(By.id("y"));
we.sendKeys("infinity");
we = wd.findElement(By.id("z"));
we.sendKeys("7");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t103() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("7");
we = wd.findElement(By.id("y"));
we.sendKeys("infinity");
we = wd.findElement(By.id("z"));
we.sendKeys("7");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t104() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("7");
we = wd.findElement(By.id("y"));
we.sendKeys("-3");
we = wd.findElement(By.id("z"));
we.sendKeys("infinity");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t105() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("7");
we = wd.findElement(By.id("y"));
we.sendKeys("-3");
we = wd.findElement(By.id("z"));
we.sendKeys("infinity");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t106() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("7");
we = wd.findElement(By.id("y"));
we.sendKeys("-3");
we = wd.findElement(By.id("z"));
we.sendKeys("-3");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("min(7, -3, -3) = -3", output);
}

@Test public void t107() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("7");
we = wd.findElement(By.id("y"));
we.sendKeys("-3");
we = wd.findElement(By.id("z"));
we.sendKeys("-3");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("max(7, -3, -3) = 7", output);
}

@Test public void t108() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("7");
we = wd.findElement(By.id("y"));
we.sendKeys("-3");
we = wd.findElement(By.id("z"));
we.sendKeys("0");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("min(7, -3, 0) = -3", output);
}

@Test public void t109() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("7");
we = wd.findElement(By.id("y"));
we.sendKeys("-3");
we = wd.findElement(By.id("z"));
we.sendKeys("0");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("max(7, -3, 0) = 7", output);
}

@Test public void t110() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("7");
we = wd.findElement(By.id("y"));
we.sendKeys("-3");
we = wd.findElement(By.id("z"));
we.sendKeys("7");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("min(7, -3, 7) = -3", output);
}

@Test public void t111() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("7");
we = wd.findElement(By.id("y"));
we.sendKeys("-3");
we = wd.findElement(By.id("z"));
we.sendKeys("7");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("max(7, -3, 7) = 7", output);
}

@Test public void t112() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("7");
we = wd.findElement(By.id("y"));
we.sendKeys("0");
we = wd.findElement(By.id("z"));
we.sendKeys("infinity");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t113() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("7");
we = wd.findElement(By.id("y"));
we.sendKeys("0");
we = wd.findElement(By.id("z"));
we.sendKeys("infinity");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t114() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("7");
we = wd.findElement(By.id("y"));
we.sendKeys("0");
we = wd.findElement(By.id("z"));
we.sendKeys("-3");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("min(7, 0, -3) = -3", output);
}

@Test public void t115() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("7");
we = wd.findElement(By.id("y"));
we.sendKeys("0");
we = wd.findElement(By.id("z"));
we.sendKeys("-3");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("max(7, 0, -3) = 7", output);
}

@Test public void t116() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("7");
we = wd.findElement(By.id("y"));
we.sendKeys("0");
we = wd.findElement(By.id("z"));
we.sendKeys("0");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("min(7, 0, 0) = 0", output);
}

@Test public void t117() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("7");
we = wd.findElement(By.id("y"));
we.sendKeys("0");
we = wd.findElement(By.id("z"));
we.sendKeys("0");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("max(7, 0, 0) = 7", output);
}

@Test public void t118() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("7");
we = wd.findElement(By.id("y"));
we.sendKeys("0");
we = wd.findElement(By.id("z"));
we.sendKeys("7");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("min(7, 0, 7) = 0", output);
}

@Test public void t119() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("7");
we = wd.findElement(By.id("y"));
we.sendKeys("0");
we = wd.findElement(By.id("z"));
we.sendKeys("7");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("max(7, 0, 7) = 7", output);
}

@Test public void t120() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("7");
we = wd.findElement(By.id("y"));
we.sendKeys("7");
we = wd.findElement(By.id("z"));
we.sendKeys("infinity");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t121() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("7");
we = wd.findElement(By.id("y"));
we.sendKeys("7");
we = wd.findElement(By.id("z"));
we.sendKeys("infinity");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t122() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("7");
we = wd.findElement(By.id("y"));
we.sendKeys("7");
we = wd.findElement(By.id("z"));
we.sendKeys("-3");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("min(7, 7, -3) = -3", output);
}

@Test public void t123() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("7");
we = wd.findElement(By.id("y"));
we.sendKeys("7");
we = wd.findElement(By.id("z"));
we.sendKeys("-3");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("max(7, 7, -3) = 7", output);
}

@Test public void t124() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("7");
we = wd.findElement(By.id("y"));
we.sendKeys("7");
we = wd.findElement(By.id("z"));
we.sendKeys("0");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("min(7, 7, 0) = 0", output);
}

@Test public void t125() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("7");
we = wd.findElement(By.id("y"));
we.sendKeys("7");
we = wd.findElement(By.id("z"));
we.sendKeys("0");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("max(7, 7, 0) = 7", output);
}

@Test public void t126() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("7");
we = wd.findElement(By.id("y"));
we.sendKeys("7");
we = wd.findElement(By.id("z"));
we.sendKeys("7");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("min(7, 7, 7) = 7", output);
}

@Test public void t127() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("7");
we = wd.findElement(By.id("y"));
we.sendKeys("7");
we = wd.findElement(By.id("z"));
we.sendKeys("7");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("max(7, 7, 7) = 7", output);
}

@Test public void t128() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("infinity");
we = wd.findElement(By.id("y"));
we.sendKeys("infinity");
we = wd.findElement(By.id("z"));
we.sendKeys("infinity");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t129() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("infinity");
we = wd.findElement(By.id("y"));
we.sendKeys("infinity");
we = wd.findElement(By.id("z"));
we.sendKeys("infinity");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t130() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("infinity");
we = wd.findElement(By.id("y"));
we.sendKeys("infinity");
we = wd.findElement(By.id("z"));
we.sendKeys("-3");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t131() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("infinity");
we = wd.findElement(By.id("y"));
we.sendKeys("infinity");
we = wd.findElement(By.id("z"));
we.sendKeys("-3");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t132() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("infinity");
we = wd.findElement(By.id("y"));
we.sendKeys("infinity");
we = wd.findElement(By.id("z"));
we.sendKeys("0");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t133() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("infinity");
we = wd.findElement(By.id("y"));
we.sendKeys("infinity");
we = wd.findElement(By.id("z"));
we.sendKeys("0");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t134() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("infinity");
we = wd.findElement(By.id("y"));
we.sendKeys("infinity");
we = wd.findElement(By.id("z"));
we.sendKeys("7");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t135() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("infinity");
we = wd.findElement(By.id("y"));
we.sendKeys("infinity");
we = wd.findElement(By.id("z"));
we.sendKeys("7");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t136() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("infinity");
we = wd.findElement(By.id("y"));
we.sendKeys("-3");
we = wd.findElement(By.id("z"));
we.sendKeys("infinity");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t137() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("infinity");
we = wd.findElement(By.id("y"));
we.sendKeys("-3");
we = wd.findElement(By.id("z"));
we.sendKeys("infinity");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t138() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("infinity");
we = wd.findElement(By.id("y"));
we.sendKeys("-3");
we = wd.findElement(By.id("z"));
we.sendKeys("-3");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t139() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("infinity");
we = wd.findElement(By.id("y"));
we.sendKeys("-3");
we = wd.findElement(By.id("z"));
we.sendKeys("-3");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t140() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("infinity");
we = wd.findElement(By.id("y"));
we.sendKeys("-3");
we = wd.findElement(By.id("z"));
we.sendKeys("0");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t141() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("infinity");
we = wd.findElement(By.id("y"));
we.sendKeys("-3");
we = wd.findElement(By.id("z"));
we.sendKeys("0");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t142() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("infinity");
we = wd.findElement(By.id("y"));
we.sendKeys("-3");
we = wd.findElement(By.id("z"));
we.sendKeys("7");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t143() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("infinity");
we = wd.findElement(By.id("y"));
we.sendKeys("-3");
we = wd.findElement(By.id("z"));
we.sendKeys("7");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t144() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("infinity");
we = wd.findElement(By.id("y"));
we.sendKeys("0");
we = wd.findElement(By.id("z"));
we.sendKeys("infinity");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t145() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("infinity");
we = wd.findElement(By.id("y"));
we.sendKeys("0");
we = wd.findElement(By.id("z"));
we.sendKeys("infinity");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t146() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("infinity");
we = wd.findElement(By.id("y"));
we.sendKeys("0");
we = wd.findElement(By.id("z"));
we.sendKeys("-3");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t147() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("infinity");
we = wd.findElement(By.id("y"));
we.sendKeys("0");
we = wd.findElement(By.id("z"));
we.sendKeys("-3");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t148() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("infinity");
we = wd.findElement(By.id("y"));
we.sendKeys("0");
we = wd.findElement(By.id("z"));
we.sendKeys("0");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t149() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("infinity");
we = wd.findElement(By.id("y"));
we.sendKeys("0");
we = wd.findElement(By.id("z"));
we.sendKeys("0");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t150() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("infinity");
we = wd.findElement(By.id("y"));
we.sendKeys("0");
we = wd.findElement(By.id("z"));
we.sendKeys("7");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t151() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("infinity");
we = wd.findElement(By.id("y"));
we.sendKeys("0");
we = wd.findElement(By.id("z"));
we.sendKeys("7");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t152() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("infinity");
we = wd.findElement(By.id("y"));
we.sendKeys("7");
we = wd.findElement(By.id("z"));
we.sendKeys("infinity");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t153() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("infinity");
we = wd.findElement(By.id("y"));
we.sendKeys("7");
we = wd.findElement(By.id("z"));
we.sendKeys("infinity");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t154() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("infinity");
we = wd.findElement(By.id("y"));
we.sendKeys("7");
we = wd.findElement(By.id("z"));
we.sendKeys("-3");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t155() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("infinity");
we = wd.findElement(By.id("y"));
we.sendKeys("7");
we = wd.findElement(By.id("z"));
we.sendKeys("-3");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t156() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("infinity");
we = wd.findElement(By.id("y"));
we.sendKeys("7");
we = wd.findElement(By.id("z"));
we.sendKeys("0");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t157() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("infinity");
we = wd.findElement(By.id("y"));
we.sendKeys("7");
we = wd.findElement(By.id("z"));
we.sendKeys("0");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t158() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("infinity");
we = wd.findElement(By.id("y"));
we.sendKeys("7");
we = wd.findElement(By.id("z"));
we.sendKeys("7");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t159() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("infinity");
we = wd.findElement(By.id("y"));
we.sendKeys("7");
we = wd.findElement(By.id("z"));
we.sendKeys("7");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t160() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("-3");
we = wd.findElement(By.id("y"));
we.sendKeys("infinity");
we = wd.findElement(By.id("z"));
we.sendKeys("infinity");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t161() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("-3");
we = wd.findElement(By.id("y"));
we.sendKeys("infinity");
we = wd.findElement(By.id("z"));
we.sendKeys("infinity");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t162() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("-3");
we = wd.findElement(By.id("y"));
we.sendKeys("infinity");
we = wd.findElement(By.id("z"));
we.sendKeys("-3");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t163() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("-3");
we = wd.findElement(By.id("y"));
we.sendKeys("infinity");
we = wd.findElement(By.id("z"));
we.sendKeys("-3");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t164() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("-3");
we = wd.findElement(By.id("y"));
we.sendKeys("infinity");
we = wd.findElement(By.id("z"));
we.sendKeys("0");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t165() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("-3");
we = wd.findElement(By.id("y"));
we.sendKeys("infinity");
we = wd.findElement(By.id("z"));
we.sendKeys("0");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t166() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("-3");
we = wd.findElement(By.id("y"));
we.sendKeys("infinity");
we = wd.findElement(By.id("z"));
we.sendKeys("7");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t167() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("-3");
we = wd.findElement(By.id("y"));
we.sendKeys("infinity");
we = wd.findElement(By.id("z"));
we.sendKeys("7");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t168() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("-3");
we = wd.findElement(By.id("y"));
we.sendKeys("-3");
we = wd.findElement(By.id("z"));
we.sendKeys("infinity");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t169() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("-3");
we = wd.findElement(By.id("y"));
we.sendKeys("-3");
we = wd.findElement(By.id("z"));
we.sendKeys("infinity");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t170() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("-3");
we = wd.findElement(By.id("y"));
we.sendKeys("-3");
we = wd.findElement(By.id("z"));
we.sendKeys("-3");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("min(-3, -3, -3) = -3", output);
}

@Test public void t171() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("-3");
we = wd.findElement(By.id("y"));
we.sendKeys("-3");
we = wd.findElement(By.id("z"));
we.sendKeys("-3");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("max(-3, -3, -3) = -3", output);
}

@Test public void t172() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("-3");
we = wd.findElement(By.id("y"));
we.sendKeys("-3");
we = wd.findElement(By.id("z"));
we.sendKeys("0");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("min(-3, -3, 0) = -3", output);
}

@Test public void t173() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("-3");
we = wd.findElement(By.id("y"));
we.sendKeys("-3");
we = wd.findElement(By.id("z"));
we.sendKeys("0");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("max(-3, -3, 0) = 0", output);
}

@Test public void t174() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("-3");
we = wd.findElement(By.id("y"));
we.sendKeys("-3");
we = wd.findElement(By.id("z"));
we.sendKeys("7");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("min(-3, -3, 7) = -3", output);
}

@Test public void t175() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("-3");
we = wd.findElement(By.id("y"));
we.sendKeys("-3");
we = wd.findElement(By.id("z"));
we.sendKeys("7");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("max(-3, -3, 7) = 7", output);
}

@Test public void t176() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("-3");
we = wd.findElement(By.id("y"));
we.sendKeys("0");
we = wd.findElement(By.id("z"));
we.sendKeys("infinity");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t177() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("-3");
we = wd.findElement(By.id("y"));
we.sendKeys("0");
we = wd.findElement(By.id("z"));
we.sendKeys("infinity");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t178() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("-3");
we = wd.findElement(By.id("y"));
we.sendKeys("0");
we = wd.findElement(By.id("z"));
we.sendKeys("-3");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("min(-3, 0, -3) = -3", output);
}

@Test public void t179() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("-3");
we = wd.findElement(By.id("y"));
we.sendKeys("0");
we = wd.findElement(By.id("z"));
we.sendKeys("-3");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("max(-3, 0, -3) = 0", output);
}

@Test public void t180() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("-3");
we = wd.findElement(By.id("y"));
we.sendKeys("0");
we = wd.findElement(By.id("z"));
we.sendKeys("0");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("min(-3, 0, 0) = -3", output);
}

@Test public void t181() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("-3");
we = wd.findElement(By.id("y"));
we.sendKeys("0");
we = wd.findElement(By.id("z"));
we.sendKeys("0");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("max(-3, 0, 0) = 0", output);
}

@Test public void t182() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("-3");
we = wd.findElement(By.id("y"));
we.sendKeys("0");
we = wd.findElement(By.id("z"));
we.sendKeys("7");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("min(-3, 0, 7) = -3", output);
}

@Test public void t183() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("-3");
we = wd.findElement(By.id("y"));
we.sendKeys("0");
we = wd.findElement(By.id("z"));
we.sendKeys("7");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("max(-3, 0, 7) = 7", output);
}

@Test public void t184() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("-3");
we = wd.findElement(By.id("y"));
we.sendKeys("7");
we = wd.findElement(By.id("z"));
we.sendKeys("infinity");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t185() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("-3");
we = wd.findElement(By.id("y"));
we.sendKeys("7");
we = wd.findElement(By.id("z"));
we.sendKeys("infinity");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t186() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("-3");
we = wd.findElement(By.id("y"));
we.sendKeys("7");
we = wd.findElement(By.id("z"));
we.sendKeys("-3");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("min(-3, 7, -3) = -3", output);
}

@Test public void t187() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("-3");
we = wd.findElement(By.id("y"));
we.sendKeys("7");
we = wd.findElement(By.id("z"));
we.sendKeys("-3");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("max(-3, 7, -3) = 7", output);
}

@Test public void t188() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("-3");
we = wd.findElement(By.id("y"));
we.sendKeys("7");
we = wd.findElement(By.id("z"));
we.sendKeys("0");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("min(-3, 7, 0) = -3", output);
}

@Test public void t189() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("-3");
we = wd.findElement(By.id("y"));
we.sendKeys("7");
we = wd.findElement(By.id("z"));
we.sendKeys("0");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("max(-3, 7, 0) = 7", output);
}

@Test public void t190() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("-3");
we = wd.findElement(By.id("y"));
we.sendKeys("7");
we = wd.findElement(By.id("z"));
we.sendKeys("7");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("min(-3, 7, 7) = -3", output);
}

@Test public void t191() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("-3");
we = wd.findElement(By.id("y"));
we.sendKeys("7");
we = wd.findElement(By.id("z"));
we.sendKeys("7");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("max(-3, 7, 7) = 7", output);
}

@Test public void t192() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("0");
we = wd.findElement(By.id("y"));
we.sendKeys("infinity");
we = wd.findElement(By.id("z"));
we.sendKeys("infinity");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t193() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("0");
we = wd.findElement(By.id("y"));
we.sendKeys("infinity");
we = wd.findElement(By.id("z"));
we.sendKeys("infinity");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t194() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("0");
we = wd.findElement(By.id("y"));
we.sendKeys("infinity");
we = wd.findElement(By.id("z"));
we.sendKeys("-3");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t195() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("0");
we = wd.findElement(By.id("y"));
we.sendKeys("infinity");
we = wd.findElement(By.id("z"));
we.sendKeys("-3");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t196() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("0");
we = wd.findElement(By.id("y"));
we.sendKeys("infinity");
we = wd.findElement(By.id("z"));
we.sendKeys("0");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t197() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("0");
we = wd.findElement(By.id("y"));
we.sendKeys("infinity");
we = wd.findElement(By.id("z"));
we.sendKeys("0");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t198() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("0");
we = wd.findElement(By.id("y"));
we.sendKeys("infinity");
we = wd.findElement(By.id("z"));
we.sendKeys("7");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t199() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("0");
we = wd.findElement(By.id("y"));
we.sendKeys("infinity");
we = wd.findElement(By.id("z"));
we.sendKeys("7");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t200() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("0");
we = wd.findElement(By.id("y"));
we.sendKeys("-3");
we = wd.findElement(By.id("z"));
we.sendKeys("infinity");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t201() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("0");
we = wd.findElement(By.id("y"));
we.sendKeys("-3");
we = wd.findElement(By.id("z"));
we.sendKeys("infinity");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t202() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("0");
we = wd.findElement(By.id("y"));
we.sendKeys("-3");
we = wd.findElement(By.id("z"));
we.sendKeys("-3");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("min(0, -3, -3) = -3", output);
}

@Test public void t203() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("0");
we = wd.findElement(By.id("y"));
we.sendKeys("-3");
we = wd.findElement(By.id("z"));
we.sendKeys("-3");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("max(0, -3, -3) = 0", output);
}

@Test public void t204() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("0");
we = wd.findElement(By.id("y"));
we.sendKeys("-3");
we = wd.findElement(By.id("z"));
we.sendKeys("0");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("min(0, -3, 0) = -3", output);
}

@Test public void t205() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("0");
we = wd.findElement(By.id("y"));
we.sendKeys("-3");
we = wd.findElement(By.id("z"));
we.sendKeys("0");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("max(0, -3, 0) = 0", output);
}

@Test public void t206() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("0");
we = wd.findElement(By.id("y"));
we.sendKeys("-3");
we = wd.findElement(By.id("z"));
we.sendKeys("7");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("min(0, -3, 7) = -3", output);
}

@Test public void t207() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("0");
we = wd.findElement(By.id("y"));
we.sendKeys("-3");
we = wd.findElement(By.id("z"));
we.sendKeys("7");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("max(0, -3, 7) = 7", output);
}

@Test public void t208() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("0");
we = wd.findElement(By.id("y"));
we.sendKeys("0");
we = wd.findElement(By.id("z"));
we.sendKeys("infinity");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t209() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("0");
we = wd.findElement(By.id("y"));
we.sendKeys("0");
we = wd.findElement(By.id("z"));
we.sendKeys("infinity");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t210() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("0");
we = wd.findElement(By.id("y"));
we.sendKeys("0");
we = wd.findElement(By.id("z"));
we.sendKeys("-3");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("min(0, 0, -3) = -3", output);
}

@Test public void t211() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("0");
we = wd.findElement(By.id("y"));
we.sendKeys("0");
we = wd.findElement(By.id("z"));
we.sendKeys("-3");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("max(0, 0, -3) = 0", output);
}

@Test public void t212() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("0");
we = wd.findElement(By.id("y"));
we.sendKeys("0");
we = wd.findElement(By.id("z"));
we.sendKeys("0");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("min(0, 0, 0) = 0", output);
}

@Test public void t213() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("0");
we = wd.findElement(By.id("y"));
we.sendKeys("0");
we = wd.findElement(By.id("z"));
we.sendKeys("0");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("max(0, 0, 0) = 0", output);
}

@Test public void t214() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("0");
we = wd.findElement(By.id("y"));
we.sendKeys("0");
we = wd.findElement(By.id("z"));
we.sendKeys("7");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("min(0, 0, 7) = 0", output);
}

@Test public void t215() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("0");
we = wd.findElement(By.id("y"));
we.sendKeys("0");
we = wd.findElement(By.id("z"));
we.sendKeys("7");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("max(0, 0, 7) = 7", output);
}

@Test public void t216() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("0");
we = wd.findElement(By.id("y"));
we.sendKeys("7");
we = wd.findElement(By.id("z"));
we.sendKeys("infinity");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t217() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("0");
we = wd.findElement(By.id("y"));
we.sendKeys("7");
we = wd.findElement(By.id("z"));
we.sendKeys("infinity");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t218() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("0");
we = wd.findElement(By.id("y"));
we.sendKeys("7");
we = wd.findElement(By.id("z"));
we.sendKeys("-3");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("min(0, 7, -3) = -3", output);
}

@Test public void t219() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("0");
we = wd.findElement(By.id("y"));
we.sendKeys("7");
we = wd.findElement(By.id("z"));
we.sendKeys("-3");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("max(0, 7, -3) = 7", output);
}

@Test public void t220() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("0");
we = wd.findElement(By.id("y"));
we.sendKeys("7");
we = wd.findElement(By.id("z"));
we.sendKeys("0");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("min(0, 7, 0) = 0", output);
}

@Test public void t221() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("0");
we = wd.findElement(By.id("y"));
we.sendKeys("7");
we = wd.findElement(By.id("z"));
we.sendKeys("0");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("max(0, 7, 0) = 7", output);
}

@Test public void t222() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("0");
we = wd.findElement(By.id("y"));
we.sendKeys("7");
we = wd.findElement(By.id("z"));
we.sendKeys("7");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("min(0, 7, 7) = 0", output);
}

@Test public void t223() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("0");
we = wd.findElement(By.id("y"));
we.sendKeys("7");
we = wd.findElement(By.id("z"));
we.sendKeys("7");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("max(0, 7, 7) = 7", output);
}

@Test public void t224() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("7");
we = wd.findElement(By.id("y"));
we.sendKeys("infinity");
we = wd.findElement(By.id("z"));
we.sendKeys("infinity");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t225() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("7");
we = wd.findElement(By.id("y"));
we.sendKeys("infinity");
we = wd.findElement(By.id("z"));
we.sendKeys("infinity");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t226() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("7");
we = wd.findElement(By.id("y"));
we.sendKeys("infinity");
we = wd.findElement(By.id("z"));
we.sendKeys("-3");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t227() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("7");
we = wd.findElement(By.id("y"));
we.sendKeys("infinity");
we = wd.findElement(By.id("z"));
we.sendKeys("-3");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t228() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("7");
we = wd.findElement(By.id("y"));
we.sendKeys("infinity");
we = wd.findElement(By.id("z"));
we.sendKeys("0");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t229() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("7");
we = wd.findElement(By.id("y"));
we.sendKeys("infinity");
we = wd.findElement(By.id("z"));
we.sendKeys("0");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t230() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("7");
we = wd.findElement(By.id("y"));
we.sendKeys("infinity");
we = wd.findElement(By.id("z"));
we.sendKeys("7");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t231() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("7");
we = wd.findElement(By.id("y"));
we.sendKeys("infinity");
we = wd.findElement(By.id("z"));
we.sendKeys("7");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t232() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("7");
we = wd.findElement(By.id("y"));
we.sendKeys("-3");
we = wd.findElement(By.id("z"));
we.sendKeys("infinity");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t233() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("7");
we = wd.findElement(By.id("y"));
we.sendKeys("-3");
we = wd.findElement(By.id("z"));
we.sendKeys("infinity");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t234() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("7");
we = wd.findElement(By.id("y"));
we.sendKeys("-3");
we = wd.findElement(By.id("z"));
we.sendKeys("-3");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("min(7, -3, -3) = -3", output);
}

@Test public void t235() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("7");
we = wd.findElement(By.id("y"));
we.sendKeys("-3");
we = wd.findElement(By.id("z"));
we.sendKeys("-3");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("max(7, -3, -3) = 7", output);
}

@Test public void t236() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("7");
we = wd.findElement(By.id("y"));
we.sendKeys("-3");
we = wd.findElement(By.id("z"));
we.sendKeys("0");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("min(7, -3, 0) = -3", output);
}

@Test public void t237() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("7");
we = wd.findElement(By.id("y"));
we.sendKeys("-3");
we = wd.findElement(By.id("z"));
we.sendKeys("0");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("max(7, -3, 0) = 7", output);
}

@Test public void t238() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("7");
we = wd.findElement(By.id("y"));
we.sendKeys("-3");
we = wd.findElement(By.id("z"));
we.sendKeys("7");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("min(7, -3, 7) = -3", output);
}

@Test public void t239() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("7");
we = wd.findElement(By.id("y"));
we.sendKeys("-3");
we = wd.findElement(By.id("z"));
we.sendKeys("7");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("max(7, -3, 7) = 7", output);
}

@Test public void t240() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("7");
we = wd.findElement(By.id("y"));
we.sendKeys("0");
we = wd.findElement(By.id("z"));
we.sendKeys("infinity");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t241() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("7");
we = wd.findElement(By.id("y"));
we.sendKeys("0");
we = wd.findElement(By.id("z"));
we.sendKeys("infinity");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t242() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("7");
we = wd.findElement(By.id("y"));
we.sendKeys("0");
we = wd.findElement(By.id("z"));
we.sendKeys("-3");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("min(7, 0, -3) = -3", output);
}

@Test public void t243() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("7");
we = wd.findElement(By.id("y"));
we.sendKeys("0");
we = wd.findElement(By.id("z"));
we.sendKeys("-3");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("max(7, 0, -3) = 7", output);
}

@Test public void t244() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("7");
we = wd.findElement(By.id("y"));
we.sendKeys("0");
we = wd.findElement(By.id("z"));
we.sendKeys("0");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("min(7, 0, 0) = 0", output);
}

@Test public void t245() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("7");
we = wd.findElement(By.id("y"));
we.sendKeys("0");
we = wd.findElement(By.id("z"));
we.sendKeys("0");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("max(7, 0, 0) = 7", output);
}

@Test public void t246() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("7");
we = wd.findElement(By.id("y"));
we.sendKeys("0");
we = wd.findElement(By.id("z"));
we.sendKeys("7");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("min(7, 0, 7) = 0", output);
}

@Test public void t247() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("7");
we = wd.findElement(By.id("y"));
we.sendKeys("0");
we = wd.findElement(By.id("z"));
we.sendKeys("7");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("max(7, 0, 7) = 7", output);
}

@Test public void t248() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("7");
we = wd.findElement(By.id("y"));
we.sendKeys("7");
we = wd.findElement(By.id("z"));
we.sendKeys("infinity");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t249() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("7");
we = wd.findElement(By.id("y"));
we.sendKeys("7");
we = wd.findElement(By.id("z"));
we.sendKeys("infinity");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("Please enter integer values only!",output);

}

@Test public void t250() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("7");
we = wd.findElement(By.id("y"));
we.sendKeys("7");
we = wd.findElement(By.id("z"));
we.sendKeys("-3");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("min(7, 7, -3) = -3", output);
}

@Test public void t251() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("7");
we = wd.findElement(By.id("y"));
we.sendKeys("7");
we = wd.findElement(By.id("z"));
we.sendKeys("-3");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("max(7, 7, -3) = 7", output);
}

@Test public void t252() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("7");
we = wd.findElement(By.id("y"));
we.sendKeys("7");
we = wd.findElement(By.id("z"));
we.sendKeys("0");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("min(7, 7, 0) = 0", output);
}

@Test public void t253() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("7");
we = wd.findElement(By.id("y"));
we.sendKeys("7");
we = wd.findElement(By.id("z"));
we.sendKeys("0");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("max(7, 7, 0) = 7", output);
}

@Test public void t254() {
WebElement we = wd.findElement(By.id("min"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("7");
we = wd.findElement(By.id("y"));
we.sendKeys("7");
we = wd.findElement(By.id("z"));
we.sendKeys("7");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("min(7, 7, 7) = 7", output);
}

@Test public void t255() {
WebElement we = wd.findElement(By.id("max"));
we.click();
we = wd.findElement(By.id("x"));
we.sendKeys("7");
we = wd.findElement(By.id("y"));
we.sendKeys("7");
we = wd.findElement(By.id("z"));
we.sendKeys("7");
we = wd.findElement(By.id("computeButton"));
we.click();
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
assertEquals("max(7, 7, 7) = 7", output);
}

}


