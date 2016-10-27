package oct20;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


class App
{
	int data;
	long timestamp;
	

//	public App(int val){
//		this.data = val;
//	}
	
	 static class Cache
	 {
		
		static HashMap<Long, App> hm = new HashMap<Long,App>();
		static Long key =1l;
		
		
		public static void createBackup(App a)
		{
			a.timestamp = new Date().getTime();
			hm.put(key, a);
			key++;
		}
		
		public static Integer restorebackup(Long key)
		{
			Integer result=0;
			Set set = hm.entrySet();
		      Iterator iterator = set.iterator();
		      while(iterator.hasNext())
		      {
		         Map.Entry mentry = (Map.Entry)iterator.next();
		         if( mentry.getKey() == key)
		         {
		        	 App a = (App)mentry.getValue();
		         result = (Integer) a.data;
		         break;
		         }
		      }
		      return result;
		}
		
	}
	
	public void putData(int data)
	{
		this.data = data;
		Cache.createBackup(this);
	}
	
	public void getData(Long key)
	{
		System.out.println(Cache.restorebackup(key));
		
	}
	
	
}
public class CacheMain
{

	public static void main(String[] args)
	{
		App aa = new App();
		aa.putData(7);
		aa.getData(1l);
		//System.out.println(aa.getData());
	}


}
