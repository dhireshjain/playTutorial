package controllers;

import play.*;
import play.data.*;
import play.mvc.*;
import java.util.*;
import views.html.*;
import models.*;

import static play.data.Form.*;
import play.data.validation.Constraints.*;

import views.html.*;


public class Application extends Controller {

	static int count = 0 ;

 public static class Adder {
        @Required 
        public String text;
       
    } 
    
     public static class logInCredentials {
        @Required 
        public String username;
	public String password;
    } 


    public static Result index() {
    
    	
    	List<Blog> blogs = Blog.getAllBlogs();
    	
       	return ok(views.html.index.render(blogs,form(logInCredentials.class)));	
       	
    }
    
     public static Result loggedIn() {
    
    	
    	List<Blog> blogs = Blog.getAllBlogs();
    	
       	return ok(views.html.loggedIn.render(blogs));	
       	
    }
    
    
     public static Result check() {
    	
    	try
    	{	
    		Form<logInCredentials> form = form(logInCredentials.class).bindFromRequest();
    		
    		logInCredentials logging =  form.get();
    		if(logging.username.compareTo("admin") == 0 && logging.password.compareTo("admin") == 0)
    		{	
    			session("email", form.get().username);
    			System.out.println(form.get().username+form.get().password);
    			return redirect(controllers.routes.Application.loggedIn());
    		}
   
    	}
    	catch(Exception e)
    	{	
    	 	
    	}
    	
  	
       return redirect(controllers.routes.Application.index());
       	
    }

	public static Result add() {
    	
    	return ok(
            views.html.add.render(form(Adder.class))	// Submitting a form
        );
    	
    }
    
     public static Result adding() {
     	
    	Form<Adder> form = form(Adder.class).bindFromRequest();
	
        if(form.hasErrors()) 
        { 	
            return redirect(controllers.routes.Application.loggedIn());
        } 
        else 
        {
        	count++;
            	Adder data = form.get();
           	Blog blog = new Blog();
		blog.header = "Blog Post "+count;
		blog.text = data.text;
		blog.save();
            
             return redirect(controllers.routes.Application.loggedIn());
         }
    }
    
    public static Result logOut()
    {

   	 return redirect(controllers.routes.Application.index());
    }
    
}
