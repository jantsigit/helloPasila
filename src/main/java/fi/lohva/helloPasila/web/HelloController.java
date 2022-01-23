package fi.lohva.helloPasila.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	@RequestMapping("alku")
	@ResponseBody
	public String sayHello() {
		return "Hei";
	}
	
	@RequestMapping("moi")
	@ResponseBody
	public String sayHelloToSomeone(@RequestParam(name="nimi", required=false, defaultValue = "Muumi") String etunimi, 
			@RequestParam(name="ika") String age) {
		return "Hei " + etunimi + " " + age + " Vuotta!";
}
	@RequestMapping("index")
	@ResponseBody
	public String showIndex(@RequestParam(defaultValue="This is the main page") String sivu) {
		return sivu;
	}
	
	@RequestMapping("contact")
	@ResponseBody
	public String showContact(@RequestParam(defaultValue="This is the contact page") String contact) {
		return contact;
	}
	
	@RequestMapping("hello")
	@ResponseBody
	public String requestParameters(@RequestParam(defaultValue="USA") String location, @RequestParam(defaultValue="Jaska")String name) {
		return "Welcome to the " + location + " " + name + "!";
	}

}
