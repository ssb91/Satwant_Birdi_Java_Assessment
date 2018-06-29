import java.util.ArrayList;
import java.util.Scanner;

public class SwampMain {

	
	public static void main(String[] args) {
		
//plantlife coordinates
		
		Coords p1 = new Coords(4, 5);
		Coords p2 = new Coords(9, 10);
		Coords p3 = new Coords(9, 19);
		Coords p4 = new Coords(3, 31);

//navigator coordinates		
		
		int a = 3; int b = 4;
				
		Coords N = new Coords(a, b);
				
//treasure coordinates
				
		int x = 60; int y = 93;

		Coords T = new Coords(x, y);

//plantlist
				
		ArrayList plantlist = new ArrayList();
		plantlist.add(p1);
		plantlist.add(p2);
		plantlist.add(p3);
		plantlist.add(p4);
		
//ask to view list of plants

		
		Scanner sc1 = new Scanner(System.in);	    
	    System.out.println("View list of plant locations?");	    
	    String viewplants;
	    viewplants = sc1.next();
	    
	    if (viewplants.equalsIgnoreCase("yes") || viewplants.equalsIgnoreCase("y")) {
	    	for (int i=0; i < plantlist.size(); i++) {
	    		System.out.println(plantlist.get(i));
	    		}
	    	}
	    else {}

//ask to view coordinate path

	    
		Scanner sc2 = new Scanner(System.in);	    
	    System.out.println("View coordinates of a path to treasure?");	    
	    String viewcoords;
	    viewcoords = sc2.next();
	    
	    if (viewcoords.equalsIgnoreCase("yes") || viewcoords.equalsIgnoreCase("y")) {

//trace through coordinates, for each step check if it equals a plant coordinate, if yes step back
	    	

//	    	int p = 1; use for increments or decrements in loop

//			if (x > 0 && y > 0) {p = 1; }
//			else {p = -1; }

	    	
	    	for (int i=a; i <= x; i++) {
			for (int j=b; j <= y; j++) {									
				
				Coords M = new Coords(i,j);
				
				for (int k = 0; k <plantlist.size(); k++) {
				
					if (M != plantlist.get(k)) { 

					i = i + 1;
					j = j + 1;

					}
					
					else { 

					i = i - 1;
					j = j + 1;
					}
					
					}
									
				System.out.println(M);
				System.out.println("Steps travelled:" + "(" + i + ", " + j + ")");
				System.out.println("Distance to treasure from current location:" + "(" + (x-i) + ", " + (y-j) + ")");
	
			}
	
			}
					    		
		}

	    else {}
	    

//ask to view treasure coordinates

		Scanner sc3 = new Scanner(System.in);	    
	    System.out.println("View coordinates of treasure?");	    
	    String viewtreasure;
	    viewtreasure = sc3.next();
	    
	    if (viewtreasure.equalsIgnoreCase("yes") || viewtreasure.equalsIgnoreCase("y")) {
	    	System.out.println(T);
	    }
	    else {}
	    
	    }
	    
	}
