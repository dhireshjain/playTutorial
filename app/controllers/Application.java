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
       	return ok(views.html.index.render(blogs,true));	
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
        	System.out.println("ohoh");
            return redirect(controllers.routes.Application.index());
        } 
        else 
        {
            	Adder data = form.get();
           	Blog blog = new Blog();
		blog.header = "Blog Post";
		blog.text = data.text;
		blog.save();
            
             return redirect(controllers.routes.Application.index());
         }
    }
    
}
