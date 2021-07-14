package com.easymock;

import java.util.List;

public class BaeldungReader {

	private ArticleReader articleReader;
	private ArticleWriter articleWriter;

	// constructors

	public BaeldungReader(ArticleReader mockArticleReader) {
		// TODO Auto-generated constructor stub
	}

	public BaeldungArticle readNext(){
		return articleReader.next();
	}

	public List<BaeldungArticle> readTopic(String topic){
		return articleReader.ofTopic(topic);
	}

	public String write(String title, String content){
		return articleWriter.write(title, content);
	}
}
