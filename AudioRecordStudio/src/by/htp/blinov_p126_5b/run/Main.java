package by.htp.blinov_p126_5b.run;
import by.htp.blinov_p126_5b.*;

public class Main {

	public static void main(String[] args) {
		
		Model model = new Model();
		
		ViewConsole view = new ViewConsole();
		
		Controller controller = new Controller();
		
		model.setView(view);
		view.setModel(model);
		controller.setModel(model);
		controller.startInput();
		//view.showDiscInfo();
	}

}
