package week3.day1;

public class ArrayComparsion {

	public static void main(String[] args) {
         //initialized Array
	    int a[]={3,2,11,4,6,7}; 
        int b[]={1,2,8,4,9,7}; 
        //loop
        for( int i=0;i<a.length;i++) {
            for( int j=0;j<b.length;j++) {
            	//compare a and b
            	if(a[i]==b[j]) {
            		System.out.println(a[i]);
            	}
            }
        }
	}
}
