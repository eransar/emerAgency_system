package Entities;

import javafx.beans.property.SimpleStringProperty;

import java.util.ArrayList;

public class Department extends AEntity {
    SimpleStringProperty name;


    public Department(String name){
        super();
        this.name =new SimpleStringProperty(name);

    }
    public Department(){};


    @Override
    public ArrayList<String> getFieldsValue() {
        ArrayList<String> result = new ArrayList<String>();
        result.add(this.name.getValue());
        return result;
    }

    public Department(ArrayList<String> LoginArray){
        super();
        this.name=new SimpleStringProperty(LoginArray.get(0));
    }




    @Override
    public String GetTableName() {
        return "department";
    }

    @Override
    public String getPrimaryKeyValue() {
        return this.name.getValue();
    }

    @Override
    public String getPrimaryKeyName() {
        return "name";
    }


}
