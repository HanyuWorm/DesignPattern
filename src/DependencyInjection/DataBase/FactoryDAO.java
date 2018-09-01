package DependencyInjection.DataBase;

public class FactoryDAO {
    public static AbstractDAO getDAO() {
        //Properties prop = new Properties();
        //InputStream input = null;
        String input = "1";
        // load a properties file
        //prop.load(input);
        // get the database value
        String database ="1";
        //prop.getProperty("database");
        if (database.equals("1")) {
            return new MySQLDAO();
        }
        if (database.equals("2")) {
            return new PostgreDAO();
        }
        if (database.equals("3")) {
            return new MSSQLDAO();
        }
        return null;
    }
}
