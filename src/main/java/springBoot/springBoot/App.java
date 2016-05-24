package springBoot.springBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Hello world!
 *
 */
@Controller
@EnableAutoConfiguration
public class App 
{
	@RequestMapping("/sayHello")
	@ResponseBody
	public String sayHello(){
		return "hello Spring boot!!!";
	}
    public static void main( String[] args )
    {
     SpringApplication.run(App.class, args);
    }
}
