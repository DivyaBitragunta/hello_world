package hello

import javax.security.auth.login.Configuration

import org.springframework.context.annotation.ComponentScan
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.ResponseBody; 
import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.RequestMethod

/**
 *
 * @author Divya
 *
 */
 
@Controller
@EnableAutoConfiguration
@ComponentScan
class HelloConfig {

@RequestMapping(value=Array("/"),method=Array(RequestMethod.GET))
@ResponseBody
def home(): String = "Hello World!This is Divya B"

}