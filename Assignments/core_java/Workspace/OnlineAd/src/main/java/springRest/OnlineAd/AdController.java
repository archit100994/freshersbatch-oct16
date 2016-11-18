package springRest.OnlineAd;


import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/OnlineAd")
public class AdController
{

	@RequestMapping(value="/Hello", method=RequestMethod.GET)
	public String sayHello()
	{
		return "Hello";
	}
	
	//LOGIN ---1
	@RequestMapping(value="/login", method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public String loginAuthenticate(@RequestBody User u)
	{
		if(u.getUsername().equals(u.getPassword()))
		{
			return "Login Successful !!!!"; 
		}
		else
			return "!!!!!***  Login UNSUCCESSFUL ***!!!!!";
	}
	
	//Logout ---2
	@RequestMapping(value="/logout", method=RequestMethod.DELETE)
	public String loginDeAuthenticate(@RequestParam(value="auth_token", defaultValue="Annd") String auth_token)
	{
		if(auth_token.equals("Anand"))
			return "You have been Logged Out";
		else
			return "Logout failed";
	}
	
	//Categories ---3
	@RequestMapping(value="/categories", method=RequestMethod.GET)
	public String categories()
	{
		return "All Categories";
	}
	
	//Action ---4
	@RequestMapping(value="/actions", method=RequestMethod.GET)
	public String actions(@RequestParam(value="auth_token", defaultValue="Anad") String auth_token)
	{
		if(auth_token.equals("Anand"))
			return "All posiible action";
		else
			return "Cannot display all possible actions, authentication token didn't match";
	}
	
	//postAd ---5
	@RequestMapping(headers= {"auth_token"}, value="/postAd", method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public String postAd(@RequestBody Ad ad, @RequestHeader String auth_token)
	{
		if(!auth_token.isEmpty())
		{
			Ad a1= ad;
			a1.setPostId("archit1");
			return auth_token;
		}
		else
			return "auth_token empty";
		
	}
	//postAd ---6
	@RequestMapping(headers= {"auth_token"}, value="/postAd", method=RequestMethod.PUT, consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public String postAdPut(@RequestBody Ad ad, @RequestHeader String auth_token)
	{
		if(!auth_token.isEmpty())
		{
			Ad a1= ad;
			return auth_token + "POSTED";
		}
		else
			return "auth_token empty";
		
	}
	
	//posts ---7
	@RequestMapping(value="/posts", method=RequestMethod.GET)
	public String posts(@RequestParam(value="auth_token", defaultValue="Anand") String auth_token)
	{
		List<Ad> list = new ArrayList<Ad>();
		list.add(new Ad("a122", "Open", "laptop sale", "Anand Kulkarni", "Hardware", "intel core 3", 2, "binaryFile", "binaryFile"));
		list.add(new Ad("a222", "Open", "mobile sale", "Archit Jain", "Hardware", "intel core 7", 2, "binaryFile", "binaryFile"));
		list.add(new Ad("a322", "close", "bag sale", "Ayushi Jain", "Hardware", "intel core 7 6th Gen", 2, "binaryFile", "binaryFile"));
		list.add(new Ad("a422", "Open", "moniter sale", "Shrey", "Hardware", "intel pentium 4", 2, "binaryFile", "binaryFile"));
		if(auth_token.equals("Anand"))
		{
			for(Ad li : list)
			{
				System.out.println(li);
			}
				
			return "All posiible action";
		}
		else
			return "Cannot display all possible actions, authentication token didn't match";
	}
	
	//post ---8
	@RequestMapping(value="/post/{postId}", method=RequestMethod.GET)
	public String post(@PathVariable(value="postId") String postId, @RequestParam(value="auth_token", defaultValue="Anand") String auth_token)
	{
		List<Ad> list = new ArrayList<Ad>();
		list.add(new Ad("a122", "Open", "laptop sale", "Anand Kulkarni", "Hardware", "intel core 3", 2, "binaryFile", "binaryFile"));
		list.add(new Ad("a222", "Open", "mobile sale", "Archit Jain", "Hardware", "intel core 7", 2, "binaryFile", "binaryFile"));
		list.add(new Ad("a322", "close", "bag sale", "Ayushi Jain", "Hardware", "intel core 7 6th Gen", 2, "binaryFile", "binaryFile"));
		list.add(new Ad("a422", "Open", "moniter sale", "Shrey", "Hardware", "intel pentium 4", 2, "binaryFile", "binaryFile"));
		if(auth_token.equals("Anand"))
		{
			for(Ad li : list)
			{
				if(li.getPostId().equals(postId))
					System.out.println(li);
			}
				
			return "All posiible action";
		}
		else
			return "Cannot display all possible actions, authentication token didn't match";
	}

	//post ---9
	@RequestMapping(value="/post/{postId}", method=RequestMethod.DELETE)
	public String postDelete(@PathVariable(value="postId") String postId, @RequestParam(value="auth_token", defaultValue="Anand") String auth_token)
	{
		List<Ad> list = new ArrayList<Ad>();
		list.add(new Ad("a122", "Open", "laptop sale", "Anand Kulkarni", "Hardware", "intel core 3", 2, "binaryFile", "binaryFile"));
		list.add(new Ad("a222", "Open", "mobile sale", "Archit Jain", "Hardware", "intel core 7", 2, "binaryFile", "binaryFile"));
		list.add(new Ad("a322", "close", "bag sale", "Ayushi Jain", "Hardware", "intel core 7 6th Gen", 2, "binaryFile", "binaryFile"));
		list.add(new Ad("a422", "Open", "moniter sale", "Shrey", "Hardware", "intel pentium 4", 2, "binaryFile", "binaryFile"));
		if(auth_token.equals("Anand"))
		{
			for(Ad li : list)
			{
				if(li.getPostId().equals(postId))
					System.out.println(li);
			}
			return "All posiible action";
		}
		else
			return "Cannot display all possible actions, authentication token didn't match";
	}
	
	//post ---12
		@RequestMapping(value="/posts/search", method=RequestMethod.PUT, headers= {"criteria"})
		public String postsSearch(@RequestHeader String crietria)
		{
			String criteria1=crietria;
			List<Ad> list = new ArrayList<Ad>();
			list.add(new Ad("a122", "Open", "laptop sale", "Anand Kulkarni", "Hardware", "intel core 3", 2, "binaryFile", "binaryFile"));
			list.add(new Ad("a222", "Open", "mobile sale", "Archit Jain", "Hardware", "intel core 7", 2, "binaryFile", "binaryFile"));
			list.add(new Ad("a322", "close", "bag sale", "Ayushi Jain", "Hardware", "intel core 7 6th Gen", 2, "binaryFile", "binaryFile"));
			list.add(new Ad("a422", "Open", "moniter sale", "Shrey", "Hardware", "intel pentium 4", 2, "binaryFile", "binaryFile"));
			if(criteria1.equals("postId"))
			{
				for(Ad li : list)
				{
					System.out.println(li.getPostId());
					//return li.getPostId();
				}
			}
			else if(criteria1.equals("status"))
			{
				for(Ad li : list)
				{
					System.out.println(li.getStatus());
					//return li.getStatus();
				}
			}
			else if(criteria1.equals("category"))
			{
				for(Ad li : list)
				{
					System.out.println(li.getCategory());
					//return li.getCategory();
				}
			}
			return "Done";
		}
	
}
