package com.example.WebApp; 
import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.ResponseBody; 
@Controller

public class HomeController { 
	@RequestMapping("/") 
public @ResponseBody String greeting() { 
return "Hello, World!"; 
} 
@RequestMapping("/madan") 
public @ResponseBody String greetingMadan() { 
 return "Hello, Mádan!"; 
} 
@RequestMapping("/novoEndPoint") 
public @ResponseBody String greetingNovoEndPoint() { 
return "Hello, NovoEndPoint!";
}

@RequestMapping("/novoEndPointEclipse") 
public @ResponseBody String greetingNovoEndPointEclipse() { 
return "Hello, NovoEndPointEclipse!";
}

    @RequestMapping("/novoEndPointIntelliJ")
    public @ResponseBody String greetingNovoEndPointIntelliJ() {
        return "Hello, NovoEndPointIntelliJ!";
    }

    @RequestMapping("/main")
    public @ResponseBody String greetingMain() {
        return "Hello, Main!";
    }

    
    @RequestMapping("/hotfix")
    public @ResponseBody String greetingHotFix() {
        return "Hello, Hotfix!";
    }


} 