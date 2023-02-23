package workspace;

public class sim1 {

	public static void main(String[] args)
	{
		

      String name = "Nitin";
      String rname ="";
      
      for(int i=name.length()-1; i>=0; i--)
      {
    	  char a = name.charAt(i);
    	  
    	 rname = rname+a;
    	 
      }
      System.out.println(rname);

	}

}
