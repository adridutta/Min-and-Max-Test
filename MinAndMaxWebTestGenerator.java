package pset6;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MinAndMaxWebTestGenerator {
	private int testCounter = 0;
    private int xCounter = 0; // 0 for infinity, 1 for negative ,2 for 0, 3 for positive
    private int yCounter = 0;
    private int zCounter = 0;
    private int clickCounter = 0; // 0 for click, 1 for no click
    private int output=0;
    private int maxMinCounter = 0;   // 0 is min 1 is max
    private int[] domain = new int[] {-3, 0, 7};
    
	public static void main(String[] a) {
        String suite = new MinAndMaxWebTestGenerator().createTestSuite();
        System.out.println(suite);
    }

    String createTestSuite() {
        StringBuilder sb = new StringBuilder();
        sb.append(packageDecl());
        sb.append("\n");
        sb.append(imports());
        sb.append("\n");
        sb.append(testsuite());
        return sb.toString();
    }

    String packageDecl() {
        return "package pset6;\n";
    }

    String imports() {
        return "import static org.junit.Assert.*;\n\n"
            + "import org.junit.Test;\n\n"
            + "import org.openqa.selenium.By;\n"
            + "import org.openqa.selenium.WebDriver;\n"
            + "import org.openqa.selenium.WebElement;\n"
            + "import org.junit.*;\n"
            + "import org.openqa.selenium.firefox.FirefoxDriver;\n";
    }

    String testsuite() {
        StringBuilder sb = new StringBuilder();
        sb.append("public class MinAndMaxWebTestSuite {\n");
        sb.append("	static WebDriver wd;\n" + 
        		"	\n" + 
        		"	@BeforeClass\n" + 
        		"    public static void setupClass()\n" + 
        		"    {\n" + 
        		"    	 wd = new FirefoxDriver();\n" + 
        		"    	 wd.get(\"file:///home/sabee/minandmax.html\");\n" + 
        		"    }\n" + 
        		"	\n" + 
        		"	@AfterClass\n" + 
        		"	public static void tearDownClass()\n" + 
        		"	{\n" + 
        		"		wd.quit();\n" + 
        		"	}\n" + 
        		"	\n" + 
        		"	@After\n" + 
        		"	public void empty()\n" + 
        		"	{\n" + 
        		"        WebElement we = wd.findElement(By.id(\"x\"));\n" + 
        		"        we.clear(); // enter 0 for x\n" + 
        		"        we = wd.findElement(By.id(\"y\"));\n" + 
        		"        we.clear(); // enter 0 for y\n" + 
        		"        we = wd.findElement(By.id(\"z\"));\n" + 
        		"        we.clear(); // enter 0 for z\n" + 
        		"        we = wd.findElement(By.id(\"computeButton\"));\n" + 
        		"        \n" + 
        		"      \n" + 
        		"	}\n");
        
        outputUpdate();
        while (testCounter < 256)
        {
        	sb.append("@Test public void t" + testCounter + "() {\n");
        	
        	if (maxMinCounter == 0)                //check if we are using max or min
        	{
        		sb.append("WebElement we = wd.findElement(By.id(\"min\"));\n");
        		sb.append("we.click();\n");
        	}
        	else
        	{
        		sb.append("WebElement we = wd.findElement(By.id(\"max\"));\n");
        		sb.append("we.click();\n");
        	}
        	
        	sb.append("we = wd.findElement(By.id(\"x\"));\n");
        	if (xCounter ==0)
        		sb.append("we.sendKeys("+ "\"" + "infinity" + "\"" + ");\n");
        	else if (xCounter == 1)
        		sb.append("we.sendKeys("+ "\"" + "-3" + "\"" + ");\n");
        	else if (xCounter == 2)
        		sb.append("we.sendKeys("+ "\"" + "0" + "\"" + ");\n");
        	else if (xCounter == 3)
        		sb.append("we.sendKeys("+ "\"" + "7" + "\"" + ");\n");
        	
        	sb.append("we = wd.findElement(By.id(\"y\"));\n");
        	if (yCounter ==0)
        		sb.append("we.sendKeys("+ "\"" + "infinity" + "\"" + ");\n");
        	else if (yCounter == 1)
        		sb.append("we.sendKeys("+ "\"" + "-3" + "\"" + ");\n");
        	else if (yCounter == 2)
        		sb.append("we.sendKeys("+ "\"" + "0" + "\"" + ");\n");
        	else if (yCounter == 3)
        		sb.append("we.sendKeys("+ "\"" + "7" + "\"" + ");\n");
        	
        	sb.append("we = wd.findElement(By.id(\"z\"));\n");
        	if (zCounter ==0)
        		sb.append("we.sendKeys("+ "\"" + "infinity" + "\"" + ");\n");
        	else if (zCounter == 1)
        		sb.append("we.sendKeys("+ "\"" + "-3" + "\"" + ");\n");
        	else if (zCounter == 2)
        		sb.append("we.sendKeys("+ "\"" + "0" + "\"" + ");\n");
        	else if (zCounter == 3)
        		sb.append("we.sendKeys("+ "\"" + "7" + "\"" + ");\n");
        	sb.append("we = wd.findElement(By.id(\"computeButton\"));\n");
        	
        	if (clickCounter == 0)
        	{
        		sb.append("we.click();\n");
        	}
        	
        	sb.append("WebElement result = wd.findElement(By.id(\"result\"));\n");
        	sb.append("String output = result.getText();\n");
        	
        	
        	
        	if (maxMinCounter == 0) {               // we are looking at min
	        	if (clickCounter == 0)
	        	{
	        		if (output == -100)        // we have invalid input
	        			sb.append("assertEquals(\"Please enter integer values only!\"," + "output" + ");\n\n");
	        		else
	        		{
	        			sb.append("assertEquals(\"min(" + domain[xCounter-1] + ", " + domain[yCounter-1] + ", " + domain[zCounter-1] + ") = " + output + "\"" + ", output);\n");
	        		}
	        	}
        	
        	}
        	
        	if (maxMinCounter == 1) {               // we are looking at max
	        	if (clickCounter == 0)
	        	{
	        		if (output == -100)        // we have invalid input
	        			sb.append("assertEquals(\"Please enter integer values only!\"," + "output" + ");\n\n");
	        		else
	        		{
	        			sb.append("assertEquals(\"max(" + domain[xCounter-1] + ", " + domain[yCounter-1] + ", " + domain[zCounter-1] + ") = " + output + "\"" + ", output);\n");
	        		}
	        	}
        	
        	}
        	
        	testCounter++;                                //update inputs
        	counterUpdate();
        	outputUpdate();
        	sb.append("}\n\n");
        }
        

        // your code goes here
        // ...

        sb.append("}\n");
        return sb.toString();
    }
    
    private void counterUpdate()
    {
    	
    	if (maxMinCounter == 1)
    	{
    		maxMinCounter = 0;
    		clickCounter++;
    	}
    	
    	else
    	{
    		maxMinCounter++;
    		return;
    	}
    	
    	if (clickCounter == 1)        // if clickCounter is maxed then reset click counter and update y
    	{
    		clickCounter = 0;
    		zCounter++;
    	}

    	if (zCounter > 3)
    	{
    		zCounter =0;
    		yCounter++;	
    	}
    	if (yCounter > 3)
    	{
    		yCounter = 0;
    		xCounter++;
    	}
    	if (xCounter > 3)
    	{
    		xCounter = 0;
    	}
    	 
    }
    
    
    private void outputUpdate()
    {
    	
    	if (maxMinCounter == 0) {                // do only if min
    	
	    	if (xCounter == 0 || yCounter == 0 || zCounter == 0) {        // if not integer then error
	    		output = -100;
	    		return;
	    	}
	    	
	    	int xVal = domain[xCounter-1];
	    	int yVal = domain[yCounter-1];
	    	int zVal = domain[zCounter-1];
	    	
	    	if (xVal <= yVal)             //check whichever is smallest
	    	{
	    		if (zVal< xVal) {
	    			output = zVal;
	    			return;
	    		}
	    		else {
	    			output = xVal;
	    			return;
	    		}
	    			
	    	}
	    		if(zVal <= yVal) {
	    			output = zVal;
	    			return;
	    		}
	    		output = yVal;
	    		return;
    	
    		
    }// end of min
    	else {                //max radio button selected
    		if (xCounter == 0 || yCounter == 0 || zCounter == 0) {        // if not integer then error
	    		output = -100;
	    		return;
	    	}
	    	
	    	int xVal = domain[xCounter-1];
	    	int yVal = domain[yCounter-1];
	    	int zVal = domain[zCounter-1];
	    	
	    	if (xVal >= yVal)             //check whichever is smallest
	    	{
	    		if (zVal >= xVal) {
	    			output = zVal;
	    			return;
	    		}
	    		else {
	    			output = xVal;
	    			return;
	    		}
	    			
	    	}
	    		if(zVal >= yVal) {
	    			output = zVal;
	    			return;
	    		}
	    		output = yVal;
	    		return;
    	}
    } 

    
}
