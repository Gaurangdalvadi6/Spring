package SpringCore;

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
        ApplicationContext con = new ClassPathXmlApplicationContext("SpringCore/springcore.xml");
        User u1 =(User)con.getBean("u1");
        System.out.println(u1);
        User u2 =(User)con.getBean("u2");
        System.out.println(u2);
        User u3 =(User)con.getBean("u3");
        System.out.println(u3);
    }
}
