import org.kitodo.search.api.BaseSearchBean;

/**
 * Created by al-huber on 20.03.2017.
 */
public class User extends BaseSearchBean {

    int age;

    public User (int age){
        this.age = age;
    }

    public static String getTableName() {
        return "user";
    }
}
