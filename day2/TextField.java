package week3.day2;
//subclass
public class TextField extends WebElement {
	
	
	public String getText() 
	{
		String text = "Sample Text";
        System.out.println("Getting text:"+text);
        return text;
    }
	
}
