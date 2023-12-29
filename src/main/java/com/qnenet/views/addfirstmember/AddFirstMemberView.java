package com.qnenet.views.addfirstmember;

import com.qnenet.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.H6;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("AddFirstMember")
@Route(value = "AddFirstMember", layout = MainLayout.class)
@Uses(Icon.class)
public class AddFirstMemberView extends Composite<VerticalLayout> {

    public AddFirstMemberView() {
        H3 h3 = new H3();
        EmailField emailField = new EmailField();
        H6 h6 = new H6();
        Button buttonPrimary = new Button();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        getContent().setJustifyContentMode(JustifyContentMode.CENTER);
        getContent().setAlignItems(Alignment.CENTER);
        h3.setText("Enter Your Main Email");
        h3.setWidth("max-content");
        emailField.setLabel("Member Email");
        emailField.setWidth("200px");
        h6.setText("then");
        h6.setWidth("max-content");
        buttonPrimary.setText("Verify Email");
        buttonPrimary.setWidth("min-content");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        getContent().add(h3);
        getContent().add(emailField);
        getContent().add(h6);
        getContent().add(buttonPrimary);
    }
}
