package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class ManipulateLinkedList {
	static LinkedList list ;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		//importing from file
		System.out.println("Name of the file you have data :  ?");
		String fileName=sc.nextLine();
		try {
			
			
			File file = new File(fileName+".txt");
			//File file = new File("numbers.txt");
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line;
			
			 int firstValue=0;
			while ((line = bufferedReader.readLine()) != null) {
				if(firstValue==0) {
					list= new LinkedList(line);
					firstValue++;
				}else {
					
					String value = line;
					//System.out.println(value);
					list.append(value);
				}
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		ask(sc,list);
		 
	}
	public static void ask(Scanner sc,LinkedList list) {

		//for second question requirement
		System.out.println(" 1: List to display");
		System.out.println(" 2: Request the length");
		System.out.println(" 3: Delete any value");
		System.out.println(" 4: Number of Duplicates value");
		System.out.println(" 5: Section you want to see length");
		System.out.println(" 6: Enter for sections of names length to display:");
		System.out.println(" 7: Enter for sections of names to display");
		
		int number = sc.nextInt();
		 loop(number,sc,list);
		
	}
	
	
	//for program to stay alive
	public  static  void loop(int number,Scanner sc,LinkedList list) {
		switch(number) {
		case 1:System.out.println(list.toString(LinkedList.length ));
		ask(sc,list);
		break;
		case 2:System.out.println(LinkedList.length);
		System.out.println();
		ask(sc,list);
		break;
		case 3:
			System.out.println("Enter the number you want to delete: ?");
			String a=sc.next();
			LinkedList.delete(a);
			System.out.println();
			ask(sc,list);
		break;
		case 4:
			System.out.println(LinkedList.NumberOfDuplicate());
			System.out.println();
			ask(sc,list);
		break;
		case 5:
			System.out.println("Enter section you want to see length:");
			String c= sc.next();
			// for How many people have a name that starts with “B”)
			System.out.println(c.charAt(0));
			System.out.println("number of times "+c+" was repeated is "+LinkedList.returnSectionLength((int)c.charAt(0)-97));
			System.out.println();
			ask(sc,list);
		break;
		case 6:
			System.out.println("Enter for sections of names length to display: ");
			LinkedList.sectionsLength();
			System.out.println();
			ask(sc,list);
		break;
		case 7:
			System.out.println("Enter for sections of names to display: ");
			//LinkedList.sectionsLength();
			String e= sc.next();
			// for How many people have a name that starts with “B”)
			LinkedList.sectionsLength(e.charAt(0));
			System.out.println();
			ask(sc,list);
		break;
		}
	}

}
