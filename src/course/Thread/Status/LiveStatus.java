package course.Thread.Status;


@SuppressWarnings("unused")
public class LiveStatus {


	static boolean runnable=true;
	public LiveStatus(){
	
     }
	public static void main(String[] args) throws InterruptedException {
		
		// creating Status object 
		Status s=new Status("my extended thread");
   	    
		// creating thread and passing status object reference to  thread object
		Thread t1=new Thread(s); 
   	  
  
	}
}

	
	
	  


