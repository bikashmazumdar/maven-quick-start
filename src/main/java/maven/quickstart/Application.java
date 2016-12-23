package maven.quickstart;

import java.util.ArrayList;
import java.util.List;

public class Application {
	
	public void greet() {
		List<String> l = new ArrayList<>();
		
		l.add("add");
		
		for (String item : l) {
			
			System.out.println(item);
			
		}
	}
    
    public Application() {
        System.out.println ("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
    	Application app = new Application();
    	app.greet();
    }
}