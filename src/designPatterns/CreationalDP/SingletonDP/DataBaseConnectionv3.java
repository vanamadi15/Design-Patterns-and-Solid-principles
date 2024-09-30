package designPatterns.CreationalDP.SingletonDP;


public class DataBaseConnectionv3 {
    private static DataBaseConnectionv3 dbc = null;
    private String url;
    private int portNo;
    private String username;
    private String password;

    public DataBaseConnectionv3(){
        System.out.println("hello");
    }
    // Not very optimal, lazy solution
//    public static synchronized DataBaseConnectionv3 getInstance(){
//        if (dbc == null){
//            dbc = new DataBaseConnectionv3();
//        }
//        return dbc;
//    }

    //Double check solution
    // This won't work, The null check must be done twice
//    public static DataBaseConnectionv3 getInstance(){
//        if (dbc == null){
//            synchronized (DataBaseConnectionv3.class){
//                dbc = new DataBaseConnectionv3();
//            }
//        }
//
//        return dbc;
//    }

    //final draft
    // Double check locking

    public static DataBaseConnectionv3 getInstance(){
        if (dbc == null){
            synchronized (DataBaseConnectionv3.class){
                if(dbc == null){
                    dbc = new DataBaseConnectionv3();
                }
            }
        }

        return dbc;
    }
}

