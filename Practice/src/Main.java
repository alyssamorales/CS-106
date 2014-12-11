import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner (new File("src/Grades"));
		ArrayList<String> list = new ArrayList <String>();
		while (input.hasNext()){
			String name = input.next();
			String grade = input.next();
			if (!list.contains(name)){
				list.add(name);
				list.add(grade);
				list.remove("Alex");
				list.remove("2.6");
			}
		}System.out.println(list);
		{
			int sum = 0;
			for (int i = 0; i < list.size(); i++) {
				String s = list.get(i);
				sum += s.length();
			} System.out.println("Total letters and numbers: " + sum);
		}

	}
	public static void removeNames (ArrayList<String> list) { 
		Iterator<String> i = list.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}


	}}

