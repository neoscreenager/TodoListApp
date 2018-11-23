package in.synergicfuturz.todolist.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

public class TodoListApp implements EntryPoint {
  public void onModuleLoad() {
    // Use Widget API to Create a <paper-button>
    /*PaperButton button = new PaperButton("Press me!");
    button.setRaised(true);
    RootPanel.get().add(button);*/
	  RootPanel.get().add(new Main());
  }
}

