package topic7;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CSVLoaderTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test 
	public void testUsers() throws Exception 
	{ 
		CSVLoader loader = new CSVLoader(); 
		List <User> users = loader.loadUsers("./data/users5.dat"); 
		assertEquals(users.size(),5);
	} 
	
	@Test (expected=Exception.class)
	public void testUsersNoFile() throws Exception 
	{ 
		CSVLoader loader = new CSVLoader(); 
		List <User> users = loader.loadUsers("./data/usersNotHere.dat"); 
		assertEquals(users.size(),5);
	} 

}
