package Patterns.Command;


public class DatabaseRunner {
    public static void main(String[] args) {
        Database database=new Database();

        Developer dev=new Developer(
                new InsertCommand(database),
                new UpdateCommand(database),
                new SelectCommand(database),
                new DeleteCommand(database)
        );

        dev.insertRecord();
        dev.updateRecord();
        dev.selectRecord();
        dev.deleteRecord();
    }
}
