import Entities.User;
import Model.Database;

import java.util.ArrayList;
import java.util.List;

public class TestDB {
    public static void main(String[] args) {
        Database database = new Database();
        database.connect();



        database.delete(new User("ido"));
        int i =5;

//        database.update(u);
    }






}
