package by.htp.taskLibrary.run;
import by.htp.taskLibrary.mvc.*;

public class Main {

	public static void main(String[] args) {
		Model model = new Model();
		View view = new View();
		Controller controller = new Controller();
		
		model.setDefaultLibrary();
		
		model.setView(view);
		view.setModel(model);
		controller.setModel(model);
		
		controller.startCommandReading();
		//model.booksToConsole();

	}

}
