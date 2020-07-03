import java.io.*;
import java.util.*;
class SerializeDeserialize
{
	private String in, out;
	private ArrayList<String> words = null;
	public SerializeDeserialize(String input, String output)
	{
		this.in = input;
		this.out = output;
	}
	void readInput() throws Exception
	{
		// filepointer chaliye read input
		words = new ArrayList<String>();
		File fp = new File(in);
		BufferedReader br = new BufferedReader(new FileReader(fp));
		String st; 
		  while ((st = br.readLine()) != null) 
			//System.out.println(st); 
			words.add(st);
		for(String w : words){
			System.out.println(w);
		}
	}
	public static void main(String[] args)
	{
			String task = args[0];
			String input_filename = "", serialized_filen = "";
			if (task.equals("create"))
			{
				input_filename = args[1];
				serialized_filen = args[2];				
			}
			else if (task.equals("load"))
			{
				serialized_filen = args[1];
			}
			System.out.println(task);
			System.out.println(input_filename);
			System.out.println(serialized_filen);
			
			SerializeDeserialize cd = new SerializeDeserialize(input_filename, serialized_filen);
			try{
				cd.readInput();
			}catch(Exception e){
				e.printStackTrace();
			}
	}
}