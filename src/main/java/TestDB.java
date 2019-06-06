import Entities.Department;
import Entities.User;
import Model.Database;

import java.util.ArrayList;
import java.util.List;

public class TestDB {
    public static void main(String[] args) {
        Database database = new Database();
//        database.connect();
        database.Insert(new Department("police"));
        database.Insert(new Department("fire department"));
        database.Insert(new Department("MDA"));


        
        int i =5;

//        database.update(u);
    }






}
