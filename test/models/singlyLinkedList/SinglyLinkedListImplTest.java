package singlyLinkedList;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import models.SinglyLinkedListImpl;

public class SinglyLinkedListImplTest {
	
	private SinglyLinkedListImpl<Integer> linkedList;

	@Before
	public void setUp() throws Exception {
		
		linkedList = new SinglyLinkedListImpl<Integer>();
	}

	@Test
	public void testAdd() {
		linkedList.add(1);
	}
	
	@Test
	public void testAddAfter() {
		linkedList.add(1);
		linkedList.addAfter(2, 1);
	}
	
	@Test
	public void testDeleteFront() {
		linkedList.add(1);
		linkedList.add(2);
		linkedList.deleteFront();
	}
	
	@Test
	public void testDeleteAfter() {
		linkedList.add(1);
		linkedList.add(2);
		linkedList.deleteAfter(1);
	}
	
	@Test
	public void testTraverse() {
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.traverse();
	}
	
	@Test
	public void testMain() {
		
		String[] a = {"Hello", "World"};
		SinglyLinkedListImpl.main(a);
	}
	
	
	

}
