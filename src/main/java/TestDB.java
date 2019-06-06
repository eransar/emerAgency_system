import Entities.User;
import Model.Database;

public class TestDB {
    public static void main(String[] args) {
        Database database = new Database();
        database.connect();

        User u = new User("dana","police","0","active","0","dana@police.co.il","danadana");
        database.Insert(u);
    }






}
