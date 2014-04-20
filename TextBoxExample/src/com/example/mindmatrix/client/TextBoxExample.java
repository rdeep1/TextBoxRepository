package com.example.mindmatrix.client;

import com.example.mindmatrix.shared.FieldVerifier;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyPressEvent;
import com.google.gwt.event.dom.client.KeyPressHandler;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class TextBoxExample implements EntryPoint {

	@Override  
	public void onModuleLoad() 
	{
	 //make three Lables as FirstName, MiddleName LastName 
		Label fname = new Label("First Name");
		fname.setStyleName("gwt-Label");
		Label mname = new Label("Middle Name ");
		fname.setStyleName("gwt-Label");
		Label lname = new Label("Last Name ");
		fname.setStyleName("gwt-Label");
		
		// Make 3 text boxes. 
	    final TextBox tb1 = new TextBox();
	    tb1.setStyleName("gwt-Button");
        final TextBox tb2 = new TextBox();
        tb2.setStyleName("gwt-Button");
        final TextBox tb3 = new TextBox();
        tb3.setStyleName("gwt-Button");
        final TextBox tb4 = new TextBox();
        tb4.setStyleName("gwt-Button");
        
     // add button to change font to big when clicked.
        Button Btn1 = new Button("CONCAT");
        Btn1.addClickHandler(new ClickHandler() {
           public void onClick(ClickEvent event) {
            String value1 =  tb1.getText();
            String value2 =  tb2.getText();
            String value3 =  tb3.getText();
            String value4= value1+value2+value3;
            tb4.setText(value4);
           }
        });


	    /*// Let's make an 80x50 text area to go along with the other two.
	    TextArea ta = new TextArea();
	    ta.setCharacterWidth(80);
	    ta.setVisibleLines(50);*/

	    // Add them to the root panel.
	    Panel panel = new HorizontalPanel();
	    Panel panel1 = new VerticalPanel();
	    panel.add(fname);
	    panel.add(fname);
	    panel.add(mname);
	    panel.add(lname);
	    panel.add(tb1);
	    panel.add(tb2);
	    panel.add(tb3);
	    panel1.add(Btn1);
	    panel.add(tb4);
	    RootPanel.get().add(panel);
	    RootPanel.get().add(panel1);
	  }
	}
