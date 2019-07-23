package samplehello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
      obj.setMessage("I'm object A");
      obj.getMessage();
      HelloWorld obj1 = (HelloWorld) context.getBean("helloWorld");
      obj1.getMessage();
   }
}
