package com.easymock;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;

public class EasyMockMethodExample {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		ArrayList<Integer> mockList = EasyMock.mock(ArrayList.class);
		EasyMock.expect(mockList.add(10)).andReturn(true);
		EasyMock.expect(mockList.add(20)).andReturn(true);
		EasyMock.expect(mockList.size()).andReturn(2);
		EasyMock.expect(mockList.get(0)).andReturn(10);
		EasyMock.replay(mockList);

		mockList.add(10);
		mockList.add(20);
//		below will throw exception because it's not mocked
		mockList.add(30);

		assertTrue(mockList.get(0) == 10);

		assertEquals(mockList.size(), 2);

	}
}
