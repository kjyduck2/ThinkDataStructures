/**
 * 
 */

import org.junit.jupiter.api.BeforeEach;
import wisoft.mymap.MyFixedHashMap;

/**
 * @author downey
 *
 */
public class MyFixedHashMapTest extends MyLinearMapTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	public void setUp() throws Exception {
		map = new MyFixedHashMap<String, Integer>();
		map.put("One", 1);
		map.put("Two", 2);
		map.put("Three", 3);
		map.put(null, 0);
	}
}
