package week3.day2;

public class LoginPage extends BasePage {
	//Override
	public void performCommonTasks() {
		
		System.out.println("performCommonTasks in override class");

	}
	
	public static void main(String[] args) {
		System.out.println("override");
		LoginPage l=new LoginPage();
		l.performCommonTasks();//override of subclass
		l.findElement();
		l.clickElement();
		l.enterText();
		
		
		//SuperClass Object
		System.out.println("Super class Object");
		BasePage b=new BasePage();
		b.findElement();
		b.clickElement();
		b.enterText();
		b.performCommonTasks();//Super class
		
	}
	

}
