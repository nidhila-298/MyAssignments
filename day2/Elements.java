package week3.day2;

public class Elements extends Button {

	public static void main(String[] args) {

		// Button
		System.out.println("-------Button-------");
		Button button = new Button();
		button.click();
		button.submit();

		// TextField
		System.out.println("-------TextField-------");
		TextField textField = new TextField();
		textField.setText("Hello World");
		textField.getText();

		// CheckBoxButton
		System.out.println("-------CheckBoxButton-------");
		CheckBoxButton checkBox = new CheckBoxButton();
		checkBox.click();
		checkBox.submit();
		checkBox.clickCheckButton();

		// RadioButton
		System.out.println("-------RadioButton-------");
		RadioButton radio = new RadioButton();
		radio.click();
		radio.submit();
		radio.selectRadioButton();

		// Execution class
		System.out.println("-------Execution-------");
		Elements element = new Elements();
		element.click();
		element.submit();
		System.out.println("Elements class executed successfully.");
	}

}
