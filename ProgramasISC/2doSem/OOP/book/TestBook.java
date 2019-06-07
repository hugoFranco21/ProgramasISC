/*Name: Hugo David Franco Avila
Date: Feb - 27 - 2018
This class will test the book class and its respective subclasses*/

public class TestBook{
	public static void main(String[] args){
	
		//Constructors
		Dictionary larousse = new Dictionary();
		Encyclopaedia disney =  new Encyclopaedia();
		
		larousse.setPages(800);
		larousse.setDefinitions(5000);
		
		disney.setPages(100);
		disney.setBranches(10);
		disney.setField("Pixar movies");
		
		System.out.println("Larousse dictionary:\n" + "Over " + larousse.getPages() + " pages and " + larousse.getDefinitions() + " definitions!\n\n");
		System.out.println("Disney's " + disney.getField() + " encyclopaedia:\n" + disney.getBranches() + " branches spanned over " + disney.getPages() + " pages!\n");
		
		
		
	
	}
}