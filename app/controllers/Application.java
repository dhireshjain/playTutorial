package controllers;

import play.*;
import play.data.*;
import play.mvc.*;
import java.util.*;
import views.html.*;
import models.*;
import play.mvc.Http.Context;
import play.api.mvc.DiscardingCookie;

import com.avaje.ebean.*;

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
    
    public static class Signup {

    public String username;
    public String password;

    }

    public static Result index() {
    
    	    	
    	List<Blog> blogs = Blog.getAllBlogs();
    	
    	List<Users> users = Users.getAllUsers();
    	
	
       	return ok(views.html.index.render(blogs,form(logInCredentials.class),users));	
       	
    }
    
    @Security.Authenticated(Secure.class)
     public static Result loggedIn() {
    
    	
    	List<Blog> blogs = Blog.getAllBlogs();
    	
       	return ok(views.html.loggedIn.render(blogs));	
       	
    }
    
     public static Result check() {
   	try{
    		Form<logInCredentials> form = form(logInCredentials.class).bindFromRequest();
    		
    		logInCredentials logging =  form.get();
    		
    		Users user = Users.find.where().eq("username", logging.username).findUnique();
    		   		
    		if(user != null && user.password.compareTo(logging.password) == 0)
    		{	    	session("username", logging.username);
    					
    			return redirect(controllers.routes.Application.loggedIn());
    		}
   	   }
   	catch(Exception e)
   	{
   	}	   
       return redirect(controllers.routes.Application.index());
       	
    }
	@Security.Authenticated(Secure.class)
	public static Result add() {
    		
    	return ok(
            views.html.add.render(form(Adder.class))	// Submitting a form
        );
    	
    }
    
    @Security.Authenticated(Secure.class)
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
		blog.time = new time().getTime();
		blog.author = request().username();
		blog.save();
            
             return redirect(controllers.routes.Application.loggedIn());
         }
    }
    
    public static Result signup() {
        return ok(
            views.html.signup.render(form(Signup.class))
        );
    }
    
    public static Result authenticate() {
    Form<Signup> signupForm = form(Signup.class).bindFromRequest();
    Users user = new Users();
    user.username = signupForm.get().username;
    user.password = signupForm.get().password;
    user.save();
    session().clear();
    flash("success", "Profile Created!");
   return redirect(controllers.routes.Application.index());
}
    
    public static Result logOut()
    {
	 session().clear();
   	 return redirect(controllers.routes.Application.index());
    }
    
}
