

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainClass 
{
   public static void main(String args[])
   {
	      ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
	      DemoBean obj = (DemoBean) context.getBean("demoBean");
	      obj.createTable();
	      obj.setName("jkjk");
	      obj.insertRow();
   }
}
