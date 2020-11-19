package springFormTag;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.servlet.DispatcherServlet;
//import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import model.User;

@Controller
public class ControllerDemo 
{
	//InternalResourceViewResolver obj=
	//DispatcherServlet obj=
	@RequestMapping("/home")
	public String view(Model m)
	{
		m.addAttribute("bean", new User());
		return "home";
	}
	/*@RequestMapping("/login")
	public String login(HttpServletRequest request,Model m)
	{
		String uname=request.getParameter("t1");
		String pass=request.getParameter("t2");
		String str="user name is  :"+uname +"password is :"+pass;
		m.addAttribute("msg", str);
		return "display";
	}*/
	//work with annotation .....
	/*@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(@RequestParam("uname")String user,@RequestParam("password")String pass,Model m)
	{
		//String uname=request.getParameter("t1");
		//String pass=request.getParameter("t2");
		String str="user name is  :"+user +"password is :"+pass;
		m.addAttribute("msg", str);
		return "display"; 	
	}*/  // .....or.....
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(@Valid@ModelAttribute("bean")User u,BindingResult br) //@Valid and BindingResult use for validation
	{
		//String uname=request.getParameter("t1");
		//String pass=request.getParameter("t2");
		//String str="user name is  :"+user +"password is :"+pass;
		//m.addAttribute("msg", str); 
		
		if(br.hasErrors())
		{
			return "home";
		}
		else
		{
			return "display"; 	
		}
		
	}
	
}
