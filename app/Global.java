import play.*;
import java.math.BigDecimal;
import java.util.*;

import com.avaje.ebean.*;

import models.*;

public class Global extends GlobalSettings {

	public void onStart(Application app) {
	System.out.println("Starting...");
	
	addDefault();
	
	}
	
	public void onStop(Application app) {
		Blog.deleter();			
	}
	
	
	public void addDefault()
	{
		Blog blog = new Blog();
		blog.header = "Blog No 0";
		blog.text=" Hello World. Testing the blog app. It Works!";
		blog.save();

	}
}
