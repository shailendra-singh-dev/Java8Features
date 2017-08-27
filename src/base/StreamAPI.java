package base;

public class StreamAPI {

	public static void test() {
		StreamAPI streamAPI = new StreamAPI();
		streamAPI.testParallelStreamAPI();

	}

	// Sequencial Stream
	public void testStreamAPI(){
	        List<Integer> list=new ArrayList<Integer>();
	        for(int i=0;i<100;i++)
	           list.add(i); 
	       
	        Stream<Integer> stream = list.stream();
	        Stream<Integer> filteredStream = stream.filter(
	            p-> {
	                return p>10;
	            }
	        );
	        filteredStream.forEach(
	            p-> {
	                System.out.print(p+" ");
	              }
	        );
	        
	    }
	// Parallel Stream
	public void testParallelStreamAPI(){
	        List<Integer> list=new ArrayList<Integer>();
	        for(int i=0;i<100;i++)
	           list.add(i); 
	       
	        Stream<Integer> stream = list.parallelStream();
	        Stream<Integer> filteredStream = stream.filter(
	            p-> {
	                return p>10;
	            }
	        );
	        filteredStream.forEach(
	            p-> {
	                System.out.print(p+" ");
	              }
	        );
	        
	    }}
