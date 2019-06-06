package Entities;

import javafx.beans.property.SimpleStringProperty;

import java.util.ArrayList;

public class Event extends AEntity {
    private SimpleStringProperty name;
    private SimpleStringProperty publish_date;
    private SimpleStringProperty publisher;
    private SimpleStringProperty initial_update;
    private SimpleStringProperty description;
    private SimpleStringProperty status;
    private SimpleStringProperty department;
    private SimpleStringProperty manager;


    public Event(String name, String publish_date, String publisher, String initial_update , String description, String status, String department , String manager){
        this.name=new SimpleStringProperty(name);
        this.publish_date=new SimpleStringProperty(publish_date);
        this.publisher=new SimpleStringProperty(publisher);
        this.initial_update=new SimpleStringProperty(initial_update);
        this.description=new SimpleStringProperty(description);
        this.status=new SimpleStringProperty(status);
        this.department=new SimpleStringProperty(department);
        this.manager=new SimpleStringProperty(manager);
    }
    public Event(ArrayList<String> LoginArray){
        super();
        this.name=new SimpleStringProperty(LoginArray.get(0));
        this.publish_date=new SimpleStringProperty(LoginArray.get(1));
        this.publisher=new SimpleStringProperty(LoginArray.get(2));
        this.initial_update=new SimpleStringProperty(LoginArray.get(3));
        this.description=new SimpleStringProperty(LoginArray.get(4));
        this.status=new SimpleStringProperty(LoginArray.get(5));
        this.department=new SimpleStringProperty(LoginArray.get(6));
        this.manager=new SimpleStringProperty(LoginArray.get(7));
    }
    public Event(){}

    @Override
    public ArrayList<String> getFieldsValue() {
        ArrayList<String> result = new ArrayList<String>();
        result.add(name.getValue());
        result.add(this.publish_date.getValue());
        result.add(this.publisher.getValue());
        result.add(this.initial_update.getValue());
        result.add(this.description.getValue());
        result.add(this.status.getValue());
        result.add(this.department.getValue());
        result.add(this.manager.getValue());

        return result;
    }
    @Override
    public String GetTableName() {
        return "events";
    }

    @Override
    public String getPrimaryKeyValue() {
        return name.getValue();
    }

    @Override
    public String getPrimaryKeyName() {
        return "name";
    }
}
