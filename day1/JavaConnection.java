package week4.day1;

public class JavaConnection implements DatabaseConnection{
	@Override
	public void connect() {
		System.out.println("connected successfully!");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnected successfully!");		
	}

	@Override
	public void executeUpdate() {
		System.out.println("execteUpdate successfully!");		
	}
	
	public static void main(String[] args) {
		JavaConnection jc=new JavaConnection();
		jc.connect();
		jc.disconnect();
		jc.executeUpdate();
	}

}
