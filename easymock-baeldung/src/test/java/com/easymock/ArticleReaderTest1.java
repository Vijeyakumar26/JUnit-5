package com.easymock;

import static org.junit.jupiter.api.Assertions.*;

import org.easymock.EasyMock;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArticleReaderTest1 {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	public void whenReadNext_thenNextArticleRead(){
	    ArticleReader mockArticleReader = EasyMock.mock(ArticleReader.class);
	    BaeldungReader baeldungReader = new BaeldungReader(mockArticleReader);

	    EasyMock.expect(mockArticleReader.next()).andReturn(null);
	    EasyMock.replay(mockArticleReader);

	    baeldungReader.readNext();

	    EasyMock.verify(mockArticleReader);
	}

}
