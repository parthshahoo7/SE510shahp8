package SE510shahp8.homework1.problem2;

public class RestrictiveClass {
	static int instanceId=-1;
	   static RestrictiveClass  array[] = new RestrictiveClass[5];

	   public static RestrictiveClass requestInstance()
	   {
		   instanceId++;
		   //RestrictiveClass r=new RestrictiveClass();
		   //if(instanceId>=5)
		   //{
			 //  System.out.println("Sorry You can't create instance.");
			  // return null;
		   //}
		   array[instanceId]=new RestrictiveClass();			   
		   return array[instanceId];
	   }
	   public static void releaseInstance(RestrictiveClass instance)
	   {
		   array[instanceId]=null;
		   instanceId--;
	   }
	   public int getInstanceId()
	   {
		   return instanceId;
	   }
}