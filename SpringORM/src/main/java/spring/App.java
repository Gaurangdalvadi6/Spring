package spring;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext con = new ClassPathXmlApplicationContext("spring/config.xml");
        User u1 = new User(10,"python",97256654);
        UserDao dao = (UserDao)con.getBean("dao");
        dao.insertUser(u1);
        
        List<User> list = dao.getAllUser();
        System.out.println(list);
        System.out.println("data inserted");
    }
}
