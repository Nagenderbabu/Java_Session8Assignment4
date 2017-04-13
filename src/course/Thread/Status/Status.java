package course.Thread.Status;




public class Status extends Thread  {
  
	
	// declaring variable thread name
     String thread_name;
     boolean alive=true;
     
// constructor with parameter
  
     @SuppressWarnings("static-access")
public Status(String thread_name) throws InterruptedException {
	super();
	// starting thread 
	this.start();
	this.thread_name=thread_name;
// setting thread name
	this.currentThread().setName(thread_name);
	// displays thread name
	System.out.println("my created thread"+this.currentThread());
	
	// condition for new state of thread
	while(this.getState().NEW != null ){
		  System.out.println("main thread will be alive till child thread is live");
        break;
  	 }
	
	// condition for runnable state of thread
	while(this.getState().RUNNABLE != null ){
		  System.out.println("main thread will be alive till child thread is live");
		 this.sleep(100);
   		 break;
   	 }
	
	// condition for blocked state of thread
   	while(this.getState().BLOCKED != null ){
    break;       
   	}
   	
   	// condition for terminated state of thread
   	while(this.getState().TERMINATED != null ){
  		 System.out.println("my thread's run is over ");
   	  
   	System.out.println("main thread's run is over");
   	break;
   	}
   }

   // overriding run method
//	@Override
	
	// Entry for thread execution
	public void run(){

		// condition to print count from 1 to 10
		for(int i=1;i<=10;i++){
			int count=i;
		System.out.println("printing the count "+count);
		}
		

}
	
}
	
		

