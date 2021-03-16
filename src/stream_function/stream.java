package stream_function;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List; 



public class stream {
	public static void main(String[] args)throws IOException, InterruptedException {
		  {
					  
			  ArrayList<String> capteurs = new ArrayList<String>();
			  capteurs.add("Ph1");
			  capteurs.add("Ph2");
			  capteurs.add("Ir1");
			  capteurs.add("Fo1");
			  capteurs.add("Fo2");
			  capteurs.add("Di3");
			  capteurs.add("Di4");
			  capteurs.add("Ph3");
			  capteurs.add("Ph4");
			  capteurs.add("Ph5");
			  capteurs.add("Ph6");
			  capteurs.add("Co1");
			  capteurs.add("Co2");
			  capteurs.add("Co3");
			  capteurs.add("So1");
			  capteurs.add("So2");
			  capteurs.add("Di1");
			  capteurs.add("Di2");
			  capteurs.add("Te1");
			  capteurs.add("Fo3");
			  try {
				  int i =  0;
				   String a ;
					List<String> allLines = Files.readAllLines(Paths.get("/home/youldouz/eclipse-workspace/readdataset/House A/DAY_1.txt"));
			  			for (String line : allLines)
			  		{
			  				Thread.sleep(1000);
			  				i++;
			  				String[] chaine = line.split(" ");
			  							  				
			  				for (int j=0; j<20;j++) { 
			  					
			  					 a = chaine[j];			  			  				
					    		 if (a.equals("1"))
					    		 {					    			 	
					    			System.out.println(capteurs.get(j)+"-->"+(j+1));	 
					    		 }					    		 			    	 
			  				} 
			  				System.out.println("fin de la ligne "+i);
			  			}
			  			//System.out.println(i);
			  		} catch (IOException e) {
			  			e.printStackTrace();
			  		}
			  	}

			  }
	

}
