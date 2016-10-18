abstract class Persistence
{
	abstract void persist();
}

class PersistenceFactory
{
	public static Persistence getPersistence()
	{
		return new FilePersistence();
	}
}

class FilePersistence extends  Persistence
{
		void persist()
		{
			System.out.println("File");
		}
}

class DatabasePersistence extends  Persistence
{
		void persist()
		{
			System.out.println("database");
		}
}

public class Client
{
	public static void main(String args[])
	{
		Persistence p =PersistenceFactory.getPersistence();
		p.persist();
	}
}