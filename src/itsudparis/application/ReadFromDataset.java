package itsudparis.application;
import java.io.IOException;

	import java.nio.file.Files;
	import java.nio.file.Paths;
	import java.util.ArrayList;
	import java.util.List; 



	public class ReadFromDataset {
		
		public static String [][] tableau ;
		public static void main(String[] args)throws IOException, InterruptedException {
			  {
						  
				 
				  try {
					  int z =  0;
					   String a ;
						List<String> allLines = Files.readAllLines(Paths.get("Data/DAY_1.txt"));
				  		for (String line : allLines){
				  				Thread.sleep(1000);
				  				String[] chaine = line.split(" ");
				  							  				
				  				for (int j=0; j<20;j++) { 
				  					
				  					 a = chaine[j];	
				  					 
				  					 tableau[j][z] = a;			    		 			    	 
				  				}
				  				z += 1;
				  			}
				  			//System.out.println(i);
				  		} catch (IOException e) {
				  			e.printStackTrace();
				  		}
				  	}

				  }
		
	}

