package in.synergicfuturz.todolist;

import in.synergicfuturz.todolist.client.TodoListAppTest;
import com.google.gwt.junit.tools.GWTTestSuite;
import junit.framework.Test;
import junit.framework.TestSuite;

public class TodoListAppSuite extends GWTTestSuite {
	public static Test suite() {
		TestSuite suite = new TestSuite("Tests for TodoListApp");
		suite.addTestSuite(TodoListAppTest.class);
		return suite;
	}
}
