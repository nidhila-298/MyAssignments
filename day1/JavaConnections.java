package week4.day1;

public class JavaConnections extends MySqlConnection {
	 @Override
	    public void connect() {
	        System.out.println("Connected to MySQL Database successfully.");
	    }

	    @Override
	    public void disconnect() {
	        System.out.println("Disconnected from MySQL Database.");
	    }

	    @Override
	    public void executeUpdate() {
	        System.out.println("Executing update query");
	    }


	@Override
	public void executeQuery() {
		 System.out.println("Executing select query");		
	}
public static void main(String[] args) {

	JavaConnections db = new JavaConnections();
    db.connect();
    db.executeQuery();
    db.executeUpdate();
    db.disconnect();
		
	}


	

}
