package designPatterns.CreationalDP.SingletonDP;

/*

EAGER initialization
 */

public class DataBaseConnectionv2 {
    private static DataBaseConnectionv2 dbc = new DataBaseConnectionv2();
    private String url;
    private int portNo;
    private String username;
    private String password;

    public DataBaseConnectionv2(){
        System.out.println("hello");
    }

    public static DataBaseConnectionv2 getInstance(){

        return dbc;
    }
}