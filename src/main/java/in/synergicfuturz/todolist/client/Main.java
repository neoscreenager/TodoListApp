package in.synergicfuturz.todolist.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.vaadin.polymer.paper.widget.PaperDialog;
import com.vaadin.polymer.paper.widget.PaperDrawerPanel;
import com.vaadin.polymer.paper.widget.PaperInput;
import com.vaadin.polymer.paper.widget.PaperTextarea;

public class Main extends Composite {
    interface MainUiBinder extends UiBinder<HTMLPanel, Main> {
    }

    @UiField PaperDrawerPanel drawerPanel;
    @UiField HTMLPanel content;

    @UiField PaperDialog addItemDialog;
    @UiField PaperInput titleInput;
    @UiField PaperTextarea descriptionInput;
    
    private static MainUiBinder ourUiBinder = GWT.create(MainUiBinder.class);

    public Main() {
      initWidget(ourUiBinder.createAndBindUi(this));
    }
    
    @UiHandler("addButton")
    protected void onAddButtonClick(ClickEvent e) {
      addItemDialog.open();
    }

  }
