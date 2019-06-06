package Entities;

import javafx.beans.property.SimpleStringProperty;

import java.util.ArrayList;

public class User extends AEntity {
    private SimpleStringProperty name;
    private SimpleStringProperty department;
    private SimpleStringProperty rank;
    private SimpleStringProperty account_status;
    private SimpleStringProperty admin;
    private SimpleStringProperty email;
    private SimpleStringProperty password;



    public User(String name,String department,String rank, String account_status, String admin, String email, String password){
        super();
    this.name=new SimpleStringProperty(name);
    this.department =new SimpleStringProperty(department);
    this.rank=new SimpleStringProperty(rank);
    this.account_status =new SimpleStringProperty(account_status);
    this.admin =new SimpleStringProperty(admin);
    this.email=new SimpleStringProperty(email);
    this.password=new SimpleStringProperty(password);



    }
    public User(){}
    public User(String username){
        super();
        this.name=new SimpleStringProperty(username);
    }

    public User(ArrayList<String> LoginArray){
        super();
        this.name=new SimpleStringProperty(LoginArray.get(0));
        this.department=new SimpleStringProperty(LoginArray.get(1));
        this.rank =new SimpleStringProperty(LoginArray.get(2));
        this.account_status =new SimpleStringProperty(LoginArray.get(3));
        this.admin =new SimpleStringProperty(LoginArray.get(4));
        this.email=new SimpleStringProperty(LoginArray.get(5));
        this.password=new SimpleStringProperty(LoginArray.get(6));
    }

    @Override

    /*
    Returns the fields value in arraylist
     */
    public ArrayList<String> getFieldsValue(){
        ArrayList<String> result = new ArrayList<String>();
        result.add(this.name.getValue());
        result.add(this.department.getValue());
        result.add(this.rank.getValue());
        result.add(this.account_status.getValue());
        result.add(this.admin.getValue());
        result.add(this.email.getValue());
        result.add(this.password.getValue());

        return result;
    }


    @Override
    /*
    Returns DB name of the entity
     */
    public String GetTableName() {
        return "users";
    }

    @Override
    /*
    Returns primary key value of the user entity
     */
    public String getPrimaryKeyValue() {
        return name.getValue();
    }

    @Override
    /*
    Returns primary key name of the user entity
     */
    public String getPrimaryKeyName() { return "name"; }

    public String getName() {
        return name.get();
    }

    public SimpleStringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public String getDepartment() {
        return department.get();
    }

    public SimpleStringProperty departmentProperty() {
        return department;
    }

    public void setDepartment(String department) {
        this.department.set(department);
    }

    public String getRank() {
        return rank.get();
    }

    public SimpleStringProperty rankProperty() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank.set(rank);
    }

    public String getAccount_status() {
        return account_status.get();
    }

    public SimpleStringProperty account_statusProperty() {
        return account_status;
    }

    public void setAccount_status(String account_status) {
        this.account_status.set(account_status);
    }

    public String getAdmin() {
        return admin.get();
    }

    public SimpleStringProperty adminProperty() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin.set(admin);
    }

    public String getEmail() {
        return email.get();
    }

    public SimpleStringProperty emailProperty() {
        return email;
    }

    public void setEmail(String email) {
        this.email.set(email);
    }

    public String getPassword() {
        return password.get();
    }

    public SimpleStringProperty passwordProperty() {
        return password;
    }

    public void setPassword(String password) {
        this.password.set(password);
    }
}
