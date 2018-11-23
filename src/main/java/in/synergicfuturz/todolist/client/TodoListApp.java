package in.synergicfuturz.todolist.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.vaadin.polymer.Polymer;
import com.vaadin.polymer.elemental.Function;

public class TodoListApp implements EntryPoint {
  public void onModuleLoad() {
    // Use Widget API to Create a <paper-button>
    /*PaperButton button = new PaperButton("Press me!");
    button.setRaised(true);
    RootPanel.get().add(button);*/
	// We have to load icon sets before run application
	    Polymer.importHref("iron-icons/iron-icons.html", new Function() {
	        public Object call(Object arg) {
	            // The app is executed when all imports succeed.
	            startApplication();
	            return null;
	        }
	    });
	  //RootPanel.get().add(new Main());
  }
  private void startApplication() {
	  //ssRootPanel.get().clear();
	  RootPanel.get().add(new Main());
  }
}

