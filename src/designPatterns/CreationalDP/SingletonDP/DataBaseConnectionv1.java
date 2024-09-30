package designPatterns.CreationalDP.SingletonDP;
/*
Doesn't work in multithreaded environment
 */
public class DataBaseConnectionv1 {

    private static DataBaseConnectionv1 dbc = null;
    private String url;
    private int portNo;
    private String username;
    private String password;

    public DataBaseConnectionv1(){
        System.out.println("hello");
    }

    public static DataBaseConnectionv1 getInstance(){
        if(dbc == null){
            dbc = new DataBaseConnectionv1();
        }
        return dbc;
    }
}
