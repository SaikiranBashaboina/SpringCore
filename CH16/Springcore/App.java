package CH16.Springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	AbstractApplicationContext xml=new ClassPathXmlApplicationContext("config.xml");
		xml.registerShutdownHook();
		Office emp=xml.getBean("off",Office.class);
		System.out.println(emp);
		AbstractApplicationContext anno=new AnnotationConfigApplicationContext(Main.class);
		emp=anno.getBean("of1",Office.class);
		System.out.println(emp);
		
    }
}
