import play.*;
import java.math.BigDecimal;
import java.util.*;

import com.avaje.ebean.*;

import models.*;

public class Global extends GlobalSettings {

	public void onStart(Application app) {
	System.out.println("Starting...");
	
	// Remove comment to put a default first blog
	Blog blog = new Blog();
	blog.header = "BlogHeader #1";
	blog.text="Default";
	blog.save();
	
	
	}
	
	public void onStop(Application app) {
		Blog.deleter();			
	}
	
}
