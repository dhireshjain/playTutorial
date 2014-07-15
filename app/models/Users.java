package models;
	
import java.util.*;
	
import javax.persistence.*;
	
import com.avaje.ebean.Ebean;
	
import play.db.ebean.*;
import play.data.validation.*;
	
@Entity	
public class Users extends Model {
	
	@Id
	public Long id;
	
	@Constraints.Required
	public String username;
	public String password;
	
	public static Model.Finder<Long, Users> find = new Model.Finder<Long, Users>(
			Long.class, Users.class);
	
	public static List<Users> getAllUsers() {
		List<Users> users = new ArrayList<Users>();
		users = Ebean.find(Users.class)
				.findList(); 
	
		return users; 
	}
	
	public static boolean duplicate(String user)
	{
		Users user2 = Ebean.find(Users.class).where().eq("username",user).findUnique();		
		
		try{		
			System.out.println(user2.username);
			return true;
		}
		catch(Exception e){
			return false;
		}
	
	}
			
	public static void deleter()
	{
		List<Users> users = new ArrayList<Users>();
		users = Ebean.find(Users.class)
				.findList(); 
		Iterator<Users> it = users.iterator();
		
		while(it.hasNext())
		{	long x = it.next().id;
			System.out.println(x);
			find.ref(x).delete();
		}		
	}
	
}	
