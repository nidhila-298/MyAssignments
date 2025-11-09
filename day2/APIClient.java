package week3.day2;

public class APIClient {
	
	public void sendRequest(String endpoint) {
		
		System.out.println("Sending request to endpoint: " + endpoint);
		
	}
	
    public void sendRequest(String endpoint,String requestBody,boolean requestStatus) {
    	System.out.println("Sending request to endpoint: " + endpoint);
        System.out.println("Request Body: " + requestBody);
        if (requestStatus) {
            System.out.println("Request was successful!");
        } else {
            System.out.println("Request failed!");
        }
    }
        public static void main(String[] args) {
        	
        	 APIClient client = new APIClient();
        	 // Call 1 parameter
             client.sendRequest("https://api.example.com/users");

             System.out.println("-----------------------------");

             // Call 3 parameters
             client.sendRequest("https://api.example.com/login", "{'Nidhila', '1234' }", true);
	}
	

}
