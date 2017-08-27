package base;

public class DefaultMethods {
	
	public static void testdefaultMethods(){
	     IInterfaceImpl iinterfaceImpl=new IInterfaceImpl();   
	     iinterfaceImpl.log();
	     iinterfaceImpl.method1();
	     iinterfaceImpl.method2();   
	       
	     IInterface1.print("Test");  
	}

	    public interface IInterface1{
	        void method1();
	        
	        static void print(String str){
	            System.out.println("IInterface1 print(String str):"+str);
	        }
	        
	        default void log(){
	            System.out.println("IInterface1 log");
	        }
	    }

	    public interface IInterface2{
	        void method2();
	        
	        default void log(){
	            System.out.println("IInterface2 log");
	        }
	    }
	    
	    public class IInterfaceImpl implements IInterface1,IInterface2{
	        
	        @Override
	        public void log(){
	            System.out.println("IInterfaceImpl log");
	        }
	        
	        @Override
	        public void method1(){
	            System.out.println("IInterfaceImpl method1");
	        }
	        
	        @Override
	        public void method2(){
	            System.out.println("IInterfaceImpl method2");
	        }
	        
	    }
	    
}
