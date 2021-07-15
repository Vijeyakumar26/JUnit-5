package com.easymock.annotation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.easymock.EasyMock;
import org.easymock.EasyMockRunner;
import org.easymock.Mock;
import org.easymock.TestSubject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

@RunWith(EasyMockRunner.class)
public class AnnotationMocking {

	@BeforeEach
	void setUp() throws Exception {
	}
	
	@Mock StringUtils mockSU;
	@Mock IntegerUtils mockIU;

	@TestSubject MyUtils mu = new MyUtils(mockSU, mockIU);

	@Test
	public void test() {
		EasyMock.expect(mockIU.add(10, 10)).andReturn(20);
		EasyMock.expect(mockSU.convert(10)).andReturn("10");
		EasyMock.expect(mockSU.reverse("CAT")).andReturn("TAC");

		EasyMock.replay(mockSU, mockIU);

		assertEquals(20, mu.add(10, 10));
		assertEquals("10", mu.convert(10));
		assertEquals("TAC", mu.reverse("CAT"));
	}

}
