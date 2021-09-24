import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import wisoft.mymap.MyLinearMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author downey
 */
public class MyLinearMapTest {

	protected Map<String, Integer> map;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	public void setUp() throws Exception {
		map = new MyLinearMap<String, Integer>();
		map.put("One", 1);
		map.put("Two", 2);
		map.put("Three", 3);
		map.put(null, 0);
	}

	/**
	 * Test method for {@link MyLinearMap#clear()}.
	 */
	@Test
	public void testClear() {
		map.clear();
		assertEquals(map.size(), 0);
	}

	/**
	 * Test method for {@link MyLinearMap#containsKey(java.lang.Object)}.
	 */
	@Test
	public void testContainsKey() {
		assertEquals(map.containsKey("Three"), true);
		assertEquals(map.containsKey(null), true);
		assertEquals(map.containsKey("Four"), false);
	}

	/**
	 * Test method for {@link MyLinearMap#containsValue(java.lang.Object)}.
	 */
	@Test
	public void testContainsValue() {
		assertEquals(map.containsValue(3), true);
		assertEquals(map.containsValue(0), true);
		assertEquals(map.containsValue(4), false);
	}

	/**
	 * Test method for {@link MyLinearMap#get(java.lang.Object)}.
	 */
	@Test
	public void testGet() {
		assertEquals(map.get("Three"), 3);
		assertEquals(map.get(null), 0);
		assertEquals(map.get("Four"), null);
	}

	/**
	 * Test method for {@link MyLinearMap#isEmpty()}.
	 */
	@Test
	public void testIsEmpty() {
		assertEquals(map.isEmpty(), false);
		map.clear();
		assertEquals(map.isEmpty(), true);
	}

	/**
	 * Test method for {@link MyLinearMap#keySet()}.
	 */
	@Test
	public void testKeySet() {
		Set<String> keySet = map.keySet();
		assertEquals(keySet.size(), 4);
		assertEquals(keySet.contains("Three"), true);
		assertEquals(keySet.contains(null), true);
		assertEquals(keySet.contains("Four"), false);
	}

	/**
	 * Test method for {@link MyLinearMap#put(java.lang.Object, java.lang.Object)}.
	 */
	@Test
	public void testPut() {
		map.put("One", 11);
		assertEquals(map.size(), 4);
		assertEquals(map.get("One"), 11);
		
		map.put("Five", 5);
		assertEquals(map.size(), 5);
		assertEquals(map.get("Five"), 5);
	}

	/**
	 * Test method for {@link MyLinearMap#putAll(java.util.Map)}.
	 */
	@Test
	public void testPutAll() {
		Map<String, Integer> m = new HashMap<String, Integer>();
		m.put("Six", 6);
		m.put("Seven", 7);
		m.put("Eight", 8);
		map.putAll(m);
		assertEquals(map.size(), 7);
	}

	/**
	 * Test method for {@link MyLinearMap#remove(java.lang.Object)}.
	 */
	@Test
	public void testRemove() {
		map.remove("One");
		assertEquals(map.size(), 3);
		assertEquals(map.get("One"), null);
	}

	/**
	 * Test method for {@link MyLinearMap#size()}.
	 */
	@Test
	public void testSize() {
		assertEquals(map.size(), 4);
	}

	/**
	 * Test method for {@link MyLinearMap#values()}.
	 */
	@Test
	public void testValues() {
		Collection<Integer> keySet = map.values();
		assertEquals(keySet.size(), 4);
		assertEquals(keySet.contains(3), true);
		assertEquals(keySet.contains(0), true);
		assertEquals(keySet.contains(4), false);
	}
}
