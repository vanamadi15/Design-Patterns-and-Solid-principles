package designPatterns.CreationalDP.SingletonDP;

public class Client {
    public static void main(String[] args) {
//        DatabaseConnectionV1 db1 = new DatabaseConnectionV1();
//        DatabaseConnectionV1 db2 = new DatabaseConnectionV1();

//        DataBaseConnectionv1 db1 = DataBaseConnectionv1.getInstance();
//        DataBaseConnectionv1 db2 = DataBaseConnectionv1.getInstance();


        DataBaseConnectionv3 db1Lazy = DataBaseConnectionv3.getInstance();
        DataBaseConnectionv3 db2Lazy = DataBaseConnectionv3.getInstance();

        System.out.println("Hello, World ");
    }
}
