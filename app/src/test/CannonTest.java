package tdd1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
//import org.apache.log4j.Logger;

public class CannonTest {
	private Cannon cannon;
	//private static Logger logger;
	@Before
	public void setUp() throws Exception {
		this.cannon=new Cannon();
		//logger = Logger.getRootLogger();
	}

	@Test
	public void testCannonMultipleInstances() {
		Cannon cannon2=new Cannon();
		assertEquals(cannon, cannon2);
		//ogger.info("got singleton..");
	}
	@Test
	public void testCannonIDValid(){
		assertNotNull((Object) cannon.getID());
	}

}
