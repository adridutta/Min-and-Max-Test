package pset6;

import static org.junit.Assert.*;

import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.junit.*;
import org.openqa.selenium.firefox.FirefoxDriver;





// QUESTION 2.1
// If min.html is replaced with minandmax.html then 27 tests fail. The failures are due to faulty tests 
// because the tests only looks for minimum values of the input, but the maxandmin.html can do either
// based on which radio button is selected.



public class MinWebTestSuite {
	static WebDriver wd;
	
	@BeforeClass
    public static void setupClass()
    {
    	 wd = new FirefoxDriver();
    	 wd.get("file:C:\\Users\\Adri\\Desktop\\Software Testing\\pset6\\min.html\\");
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
WebElement we = wd.findElement(By.id("x"));
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
WebElement we = wd.findElement(By.id("x"));
we.sendKeys("infinity");
we = wd.findElement(By.id("y"));
we.sendKeys("infinity");
we = wd.findElement(By.id("z"));
we.sendKeys("infinity");
we = wd.findElement(By.id("computeButton"));
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
}

@Test public void t2() {
WebElement we = wd.findElement(By.id("x"));
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
WebElement we = wd.findElement(By.id("x"));
we.sendKeys("infinity");
we = wd.findElement(By.id("y"));
we.sendKeys("infinity");
we = wd.findElement(By.id("z"));
we.sendKeys("-3");
we = wd.findElement(By.id("computeButton"));
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
}

@Test public void t4() {
WebElement we = wd.findElement(By.id("x"));
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
WebElement we = wd.findElement(By.id("x"));
we.sendKeys("infinity");
we = wd.findElement(By.id("y"));
we.sendKeys("infinity");
we = wd.findElement(By.id("z"));
we.sendKeys("0");
we = wd.findElement(By.id("computeButton"));
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
}

@Test public void t6() {
WebElement we = wd.findElement(By.id("x"));
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
WebElement we = wd.findElement(By.id("x"));
we.sendKeys("infinity");
we = wd.findElement(By.id("y"));
we.sendKeys("infinity");
we = wd.findElement(By.id("z"));
we.sendKeys("7");
we = wd.findElement(By.id("computeButton"));
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
}

@Test public void t8() {
WebElement we = wd.findElement(By.id("x"));
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
WebElement we = wd.findElement(By.id("x"));
we.sendKeys("infinity");
we = wd.findElement(By.id("y"));
we.sendKeys("-3");
we = wd.findElement(By.id("z"));
we.sendKeys("infinity");
we = wd.findElement(By.id("computeButton"));
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
}

@Test public void t10() {
WebElement we = wd.findElement(By.id("x"));
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
WebElement we = wd.findElement(By.id("x"));
we.sendKeys("infinity");
we = wd.findElement(By.id("y"));
we.sendKeys("-3");
we = wd.findElement(By.id("z"));
we.sendKeys("-3");
we = wd.findElement(By.id("computeButton"));
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
}

@Test public void t12() {
WebElement we = wd.findElement(By.id("x"));
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
WebElement we = wd.findElement(By.id("x"));
we.sendKeys("infinity");
we = wd.findElement(By.id("y"));
we.sendKeys("-3");
we = wd.findElement(By.id("z"));
we.sendKeys("0");
we = wd.findElement(By.id("computeButton"));
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
}

@Test public void t14() {
WebElement we = wd.findElement(By.id("x"));
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
WebElement we = wd.findElement(By.id("x"));
we.sendKeys("infinity");
we = wd.findElement(By.id("y"));
we.sendKeys("-3");
we = wd.findElement(By.id("z"));
we.sendKeys("7");
we = wd.findElement(By.id("computeButton"));
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
}

@Test public void t16() {
WebElement we = wd.findElement(By.id("x"));
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
WebElement we = wd.findElement(By.id("x"));
we.sendKeys("infinity");
we = wd.findElement(By.id("y"));
we.sendKeys("0");
we = wd.findElement(By.id("z"));
we.sendKeys("infinity");
we = wd.findElement(By.id("computeButton"));
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
}

@Test public void t18() {
WebElement we = wd.findElement(By.id("x"));
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
WebElement we = wd.findElement(By.id("x"));
we.sendKeys("infinity");
we = wd.findElement(By.id("y"));
we.sendKeys("0");
we = wd.findElement(By.id("z"));
we.sendKeys("-3");
we = wd.findElement(By.id("computeButton"));
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
}

@Test public void t20() {
WebElement we = wd.findElement(By.id("x"));
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
WebElement we = wd.findElement(By.id("x"));
we.sendKeys("infinity");
we = wd.findElement(By.id("y"));
we.sendKeys("0");
we = wd.findElement(By.id("z"));
we.sendKeys("0");
we = wd.findElement(By.id("computeButton"));
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
}

@Test public void t22() {
WebElement we = wd.findElement(By.id("x"));
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
WebElement we = wd.findElement(By.id("x"));
we.sendKeys("infinity");
we = wd.findElement(By.id("y"));
we.sendKeys("0");
we = wd.findElement(By.id("z"));
we.sendKeys("7");
we = wd.findElement(By.id("computeButton"));
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
}

@Test public void t24() {
WebElement we = wd.findElement(By.id("x"));
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
WebElement we = wd.findElement(By.id("x"));
we.sendKeys("infinity");
we = wd.findElement(By.id("y"));
we.sendKeys("7");
we = wd.findElement(By.id("z"));
we.sendKeys("infinity");
we = wd.findElement(By.id("computeButton"));
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
}

@Test public void t26() {
WebElement we = wd.findElement(By.id("x"));
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
WebElement we = wd.findElement(By.id("x"));
we.sendKeys("infinity");
we = wd.findElement(By.id("y"));
we.sendKeys("7");
we = wd.findElement(By.id("z"));
we.sendKeys("-3");
we = wd.findElement(By.id("computeButton"));
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
}

@Test public void t28() {
WebElement we = wd.findElement(By.id("x"));
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
WebElement we = wd.findElement(By.id("x"));
we.sendKeys("infinity");
we = wd.findElement(By.id("y"));
we.sendKeys("7");
we = wd.findElement(By.id("z"));
we.sendKeys("0");
we = wd.findElement(By.id("computeButton"));
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
}

@Test public void t30() {
WebElement we = wd.findElement(By.id("x"));
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
WebElement we = wd.findElement(By.id("x"));
we.sendKeys("infinity");
we = wd.findElement(By.id("y"));
we.sendKeys("7");
we = wd.findElement(By.id("z"));
we.sendKeys("7");
we = wd.findElement(By.id("computeButton"));
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
}

@Test public void t32() {
WebElement we = wd.findElement(By.id("x"));
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
WebElement we = wd.findElement(By.id("x"));
we.sendKeys("-3");
we = wd.findElement(By.id("y"));
we.sendKeys("infinity");
we = wd.findElement(By.id("z"));
we.sendKeys("infinity");
we = wd.findElement(By.id("computeButton"));
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
}

@Test public void t34() {
WebElement we = wd.findElement(By.id("x"));
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
WebElement we = wd.findElement(By.id("x"));
we.sendKeys("-3");
we = wd.findElement(By.id("y"));
we.sendKeys("infinity");
we = wd.findElement(By.id("z"));
we.sendKeys("-3");
we = wd.findElement(By.id("computeButton"));
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
}

@Test public void t36() {
WebElement we = wd.findElement(By.id("x"));
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
WebElement we = wd.findElement(By.id("x"));
we.sendKeys("-3");
we = wd.findElement(By.id("y"));
we.sendKeys("infinity");
we = wd.findElement(By.id("z"));
we.sendKeys("0");
we = wd.findElement(By.id("computeButton"));
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
}

@Test public void t38() {
WebElement we = wd.findElement(By.id("x"));
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
WebElement we = wd.findElement(By.id("x"));
we.sendKeys("-3");
we = wd.findElement(By.id("y"));
we.sendKeys("infinity");
we = wd.findElement(By.id("z"));
we.sendKeys("7");
we = wd.findElement(By.id("computeButton"));
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
}

@Test public void t40() {
WebElement we = wd.findElement(By.id("x"));
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
WebElement we = wd.findElement(By.id("x"));
we.sendKeys("-3");
we = wd.findElement(By.id("y"));
we.sendKeys("-3");
we = wd.findElement(By.id("z"));
we.sendKeys("infinity");
we = wd.findElement(By.id("computeButton"));
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
}

@Test public void t42() {
WebElement we = wd.findElement(By.id("x"));
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
WebElement we = wd.findElement(By.id("x"));
we.sendKeys("-3");
we = wd.findElement(By.id("y"));
we.sendKeys("-3");
we = wd.findElement(By.id("z"));
we.sendKeys("-3");
we = wd.findElement(By.id("computeButton"));
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
}

@Test public void t44() {
WebElement we = wd.findElement(By.id("x"));
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
WebElement we = wd.findElement(By.id("x"));
we.sendKeys("-3");
we = wd.findElement(By.id("y"));
we.sendKeys("-3");
we = wd.findElement(By.id("z"));
we.sendKeys("0");
we = wd.findElement(By.id("computeButton"));
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
}

@Test public void t46() {
WebElement we = wd.findElement(By.id("x"));
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
WebElement we = wd.findElement(By.id("x"));
we.sendKeys("-3");
we = wd.findElement(By.id("y"));
we.sendKeys("-3");
we = wd.findElement(By.id("z"));
we.sendKeys("7");
we = wd.findElement(By.id("computeButton"));
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
}

@Test public void t48() {
WebElement we = wd.findElement(By.id("x"));
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
WebElement we = wd.findElement(By.id("x"));
we.sendKeys("-3");
we = wd.findElement(By.id("y"));
we.sendKeys("0");
we = wd.findElement(By.id("z"));
we.sendKeys("infinity");
we = wd.findElement(By.id("computeButton"));
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
}

@Test public void t50() {
WebElement we = wd.findElement(By.id("x"));
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
WebElement we = wd.findElement(By.id("x"));
we.sendKeys("-3");
we = wd.findElement(By.id("y"));
we.sendKeys("0");
we = wd.findElement(By.id("z"));
we.sendKeys("-3");
we = wd.findElement(By.id("computeButton"));
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
}

@Test public void t52() {
WebElement we = wd.findElement(By.id("x"));
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
WebElement we = wd.findElement(By.id("x"));
we.sendKeys("-3");
we = wd.findElement(By.id("y"));
we.sendKeys("0");
we = wd.findElement(By.id("z"));
we.sendKeys("0");
we = wd.findElement(By.id("computeButton"));
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
}

@Test public void t54() {
WebElement we = wd.findElement(By.id("x"));
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
WebElement we = wd.findElement(By.id("x"));
we.sendKeys("-3");
we = wd.findElement(By.id("y"));
we.sendKeys("0");
we = wd.findElement(By.id("z"));
we.sendKeys("7");
we = wd.findElement(By.id("computeButton"));
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
}

@Test public void t56() {
WebElement we = wd.findElement(By.id("x"));
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
WebElement we = wd.findElement(By.id("x"));
we.sendKeys("-3");
we = wd.findElement(By.id("y"));
we.sendKeys("7");
we = wd.findElement(By.id("z"));
we.sendKeys("infinity");
we = wd.findElement(By.id("computeButton"));
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
}

@Test public void t58() {
WebElement we = wd.findElement(By.id("x"));
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
WebElement we = wd.findElement(By.id("x"));
we.sendKeys("-3");
we = wd.findElement(By.id("y"));
we.sendKeys("7");
we = wd.findElement(By.id("z"));
we.sendKeys("-3");
we = wd.findElement(By.id("computeButton"));
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
}

@Test public void t60() {
WebElement we = wd.findElement(By.id("x"));
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
WebElement we = wd.findElement(By.id("x"));
we.sendKeys("-3");
we = wd.findElement(By.id("y"));
we.sendKeys("7");
we = wd.findElement(By.id("z"));
we.sendKeys("0");
we = wd.findElement(By.id("computeButton"));
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
}

@Test public void t62() {
WebElement we = wd.findElement(By.id("x"));
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
WebElement we = wd.findElement(By.id("x"));
we.sendKeys("-3");
we = wd.findElement(By.id("y"));
we.sendKeys("7");
we = wd.findElement(By.id("z"));
we.sendKeys("7");
we = wd.findElement(By.id("computeButton"));
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
}

@Test public void t64() {
WebElement we = wd.findElement(By.id("x"));
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
WebElement we = wd.findElement(By.id("x"));
we.sendKeys("0");
we = wd.findElement(By.id("y"));
we.sendKeys("infinity");
we = wd.findElement(By.id("z"));
we.sendKeys("infinity");
we = wd.findElement(By.id("computeButton"));
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
}

@Test public void t66() {
WebElement we = wd.findElement(By.id("x"));
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
WebElement we = wd.findElement(By.id("x"));
we.sendKeys("0");
we = wd.findElement(By.id("y"));
we.sendKeys("infinity");
we = wd.findElement(By.id("z"));
we.sendKeys("-3");
we = wd.findElement(By.id("computeButton"));
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
}

@Test public void t68() {
WebElement we = wd.findElement(By.id("x"));
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
WebElement we = wd.findElement(By.id("x"));
we.sendKeys("0");
we = wd.findElement(By.id("y"));
we.sendKeys("infinity");
we = wd.findElement(By.id("z"));
we.sendKeys("0");
we = wd.findElement(By.id("computeButton"));
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
}

@Test public void t70() {
WebElement we = wd.findElement(By.id("x"));
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
WebElement we = wd.findElement(By.id("x"));
we.sendKeys("0");
we = wd.findElement(By.id("y"));
we.sendKeys("infinity");
we = wd.findElement(By.id("z"));
we.sendKeys("7");
we = wd.findElement(By.id("computeButton"));
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
}

@Test public void t72() {
WebElement we = wd.findElement(By.id("x"));
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
WebElement we = wd.findElement(By.id("x"));
we.sendKeys("0");
we = wd.findElement(By.id("y"));
we.sendKeys("-3");
we = wd.findElement(By.id("z"));
we.sendKeys("infinity");
we = wd.findElement(By.id("computeButton"));
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
}

@Test public void t74() {
WebElement we = wd.findElement(By.id("x"));
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
WebElement we = wd.findElement(By.id("x"));
we.sendKeys("0");
we = wd.findElement(By.id("y"));
we.sendKeys("-3");
we = wd.findElement(By.id("z"));
we.sendKeys("-3");
we = wd.findElement(By.id("computeButton"));
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
}

@Test public void t76() {
WebElement we = wd.findElement(By.id("x"));
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
WebElement we = wd.findElement(By.id("x"));
we.sendKeys("0");
we = wd.findElement(By.id("y"));
we.sendKeys("-3");
we = wd.findElement(By.id("z"));
we.sendKeys("0");
we = wd.findElement(By.id("computeButton"));
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
}

@Test public void t78() {
WebElement we = wd.findElement(By.id("x"));
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
WebElement we = wd.findElement(By.id("x"));
we.sendKeys("0");
we = wd.findElement(By.id("y"));
we.sendKeys("-3");
we = wd.findElement(By.id("z"));
we.sendKeys("7");
we = wd.findElement(By.id("computeButton"));
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
}

@Test public void t80() {
WebElement we = wd.findElement(By.id("x"));
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
WebElement we = wd.findElement(By.id("x"));
we.sendKeys("0");
we = wd.findElement(By.id("y"));
we.sendKeys("0");
we = wd.findElement(By.id("z"));
we.sendKeys("infinity");
we = wd.findElement(By.id("computeButton"));
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
}

@Test public void t82() {
WebElement we = wd.findElement(By.id("x"));
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
WebElement we = wd.findElement(By.id("x"));
we.sendKeys("0");
we = wd.findElement(By.id("y"));
we.sendKeys("0");
we = wd.findElement(By.id("z"));
we.sendKeys("-3");
we = wd.findElement(By.id("computeButton"));
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
}

@Test public void t84() {
WebElement we = wd.findElement(By.id("x"));
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
WebElement we = wd.findElement(By.id("x"));
we.sendKeys("0");
we = wd.findElement(By.id("y"));
we.sendKeys("0");
we = wd.findElement(By.id("z"));
we.sendKeys("0");
we = wd.findElement(By.id("computeButton"));
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
}

@Test public void t86() {
WebElement we = wd.findElement(By.id("x"));
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
WebElement we = wd.findElement(By.id("x"));
we.sendKeys("0");
we = wd.findElement(By.id("y"));
we.sendKeys("0");
we = wd.findElement(By.id("z"));
we.sendKeys("7");
we = wd.findElement(By.id("computeButton"));
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
}

@Test public void t88() {
WebElement we = wd.findElement(By.id("x"));
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
WebElement we = wd.findElement(By.id("x"));
we.sendKeys("0");
we = wd.findElement(By.id("y"));
we.sendKeys("7");
we = wd.findElement(By.id("z"));
we.sendKeys("infinity");
we = wd.findElement(By.id("computeButton"));
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
}

@Test public void t90() {
WebElement we = wd.findElement(By.id("x"));
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
WebElement we = wd.findElement(By.id("x"));
we.sendKeys("0");
we = wd.findElement(By.id("y"));
we.sendKeys("7");
we = wd.findElement(By.id("z"));
we.sendKeys("-3");
we = wd.findElement(By.id("computeButton"));
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
}

@Test public void t92() {
WebElement we = wd.findElement(By.id("x"));
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
WebElement we = wd.findElement(By.id("x"));
we.sendKeys("0");
we = wd.findElement(By.id("y"));
we.sendKeys("7");
we = wd.findElement(By.id("z"));
we.sendKeys("0");
we = wd.findElement(By.id("computeButton"));
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
}

@Test public void t94() {
WebElement we = wd.findElement(By.id("x"));
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
WebElement we = wd.findElement(By.id("x"));
we.sendKeys("0");
we = wd.findElement(By.id("y"));
we.sendKeys("7");
we = wd.findElement(By.id("z"));
we.sendKeys("7");
we = wd.findElement(By.id("computeButton"));
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
}

@Test public void t96() {
WebElement we = wd.findElement(By.id("x"));
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
WebElement we = wd.findElement(By.id("x"));
we.sendKeys("7");
we = wd.findElement(By.id("y"));
we.sendKeys("infinity");
we = wd.findElement(By.id("z"));
we.sendKeys("infinity");
we = wd.findElement(By.id("computeButton"));
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
}

@Test public void t98() {
WebElement we = wd.findElement(By.id("x"));
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
WebElement we = wd.findElement(By.id("x"));
we.sendKeys("7");
we = wd.findElement(By.id("y"));
we.sendKeys("infinity");
we = wd.findElement(By.id("z"));
we.sendKeys("-3");
we = wd.findElement(By.id("computeButton"));
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
}

@Test public void t100() {
WebElement we = wd.findElement(By.id("x"));
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
WebElement we = wd.findElement(By.id("x"));
we.sendKeys("7");
we = wd.findElement(By.id("y"));
we.sendKeys("infinity");
we = wd.findElement(By.id("z"));
we.sendKeys("0");
we = wd.findElement(By.id("computeButton"));
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
}

@Test public void t102() {
WebElement we = wd.findElement(By.id("x"));
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
WebElement we = wd.findElement(By.id("x"));
we.sendKeys("7");
we = wd.findElement(By.id("y"));
we.sendKeys("infinity");
we = wd.findElement(By.id("z"));
we.sendKeys("7");
we = wd.findElement(By.id("computeButton"));
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
}

@Test public void t104() {
WebElement we = wd.findElement(By.id("x"));
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
WebElement we = wd.findElement(By.id("x"));
we.sendKeys("7");
we = wd.findElement(By.id("y"));
we.sendKeys("-3");
we = wd.findElement(By.id("z"));
we.sendKeys("infinity");
we = wd.findElement(By.id("computeButton"));
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
}

@Test public void t106() {
WebElement we = wd.findElement(By.id("x"));
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
WebElement we = wd.findElement(By.id("x"));
we.sendKeys("7");
we = wd.findElement(By.id("y"));
we.sendKeys("-3");
we = wd.findElement(By.id("z"));
we.sendKeys("-3");
we = wd.findElement(By.id("computeButton"));
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
}

@Test public void t108() {
WebElement we = wd.findElement(By.id("x"));
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
WebElement we = wd.findElement(By.id("x"));
we.sendKeys("7");
we = wd.findElement(By.id("y"));
we.sendKeys("-3");
we = wd.findElement(By.id("z"));
we.sendKeys("0");
we = wd.findElement(By.id("computeButton"));
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
}

@Test public void t110() {
WebElement we = wd.findElement(By.id("x"));
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
WebElement we = wd.findElement(By.id("x"));
we.sendKeys("7");
we = wd.findElement(By.id("y"));
we.sendKeys("-3");
we = wd.findElement(By.id("z"));
we.sendKeys("7");
we = wd.findElement(By.id("computeButton"));
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
}

@Test public void t112() {
WebElement we = wd.findElement(By.id("x"));
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
WebElement we = wd.findElement(By.id("x"));
we.sendKeys("7");
we = wd.findElement(By.id("y"));
we.sendKeys("0");
we = wd.findElement(By.id("z"));
we.sendKeys("infinity");
we = wd.findElement(By.id("computeButton"));
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
}

@Test public void t114() {
WebElement we = wd.findElement(By.id("x"));
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
WebElement we = wd.findElement(By.id("x"));
we.sendKeys("7");
we = wd.findElement(By.id("y"));
we.sendKeys("0");
we = wd.findElement(By.id("z"));
we.sendKeys("-3");
we = wd.findElement(By.id("computeButton"));
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
}

@Test public void t116() {
WebElement we = wd.findElement(By.id("x"));
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
WebElement we = wd.findElement(By.id("x"));
we.sendKeys("7");
we = wd.findElement(By.id("y"));
we.sendKeys("0");
we = wd.findElement(By.id("z"));
we.sendKeys("0");
we = wd.findElement(By.id("computeButton"));
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
}

@Test public void t118() {
WebElement we = wd.findElement(By.id("x"));
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
WebElement we = wd.findElement(By.id("x"));
we.sendKeys("7");
we = wd.findElement(By.id("y"));
we.sendKeys("0");
we = wd.findElement(By.id("z"));
we.sendKeys("7");
we = wd.findElement(By.id("computeButton"));
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
}

@Test public void t120() {
WebElement we = wd.findElement(By.id("x"));
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
WebElement we = wd.findElement(By.id("x"));
we.sendKeys("7");
we = wd.findElement(By.id("y"));
we.sendKeys("7");
we = wd.findElement(By.id("z"));
we.sendKeys("infinity");
we = wd.findElement(By.id("computeButton"));
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
}

@Test public void t122() {
WebElement we = wd.findElement(By.id("x"));
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
WebElement we = wd.findElement(By.id("x"));
we.sendKeys("7");
we = wd.findElement(By.id("y"));
we.sendKeys("7");
we = wd.findElement(By.id("z"));
we.sendKeys("-3");
we = wd.findElement(By.id("computeButton"));
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
}

@Test public void t124() {
WebElement we = wd.findElement(By.id("x"));
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
WebElement we = wd.findElement(By.id("x"));
we.sendKeys("7");
we = wd.findElement(By.id("y"));
we.sendKeys("7");
we = wd.findElement(By.id("z"));
we.sendKeys("0");
we = wd.findElement(By.id("computeButton"));
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
}

@Test public void t126() {
WebElement we = wd.findElement(By.id("x"));
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
WebElement we = wd.findElement(By.id("x"));
we.sendKeys("7");
we = wd.findElement(By.id("y"));
we.sendKeys("7");
we = wd.findElement(By.id("z"));
we.sendKeys("7");
we = wd.findElement(By.id("computeButton"));
WebElement result = wd.findElement(By.id("result"));
String output = result.getText();
}

}

