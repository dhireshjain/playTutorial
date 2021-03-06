package models;

import java.util.*;

import javax.persistence.*;

import com.avaje.ebean.Ebean;

import play.db.ebean.*;
import play.data.validation.*;

@Entity
public class Blog extends Model {
	@Id
	public Long id;

	@Constraints.Required
	public String header;

	@Constraints.Required
	@Column(columnDefinition="TEXT")
	public String text;

	public String time;		
	public String author;

	public static Model.Finder<Long, Blog> find = new Model.Finder<Long, Blog>(
			Long.class, Blog.class);

	//	Getting all blogs from blog table
	
	public static List<Blog> getAllBlogs() {
		List<Blog> blogs = new ArrayList<Blog>();
		blogs = Ebean.find(Blog.class)
				.findList(); 
		return blogs; 
	}
	
	public static void deleter()
	{
		List<Blog> blogs = new ArrayList<Blog>();
		blogs = Ebean.find(Blog.class)
				.findList(); 
		Iterator<Blog> it = blogs.iterator();
		
		while(it.hasNext())
		{	long x = it.next().id;
			System.out.println(x);
			find.ref(x).delete();
		}		
	}
}
