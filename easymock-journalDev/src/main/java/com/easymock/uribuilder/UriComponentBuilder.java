package com.easymock.uribuilder;

import org.springframework.web.util.UriComponentsBuilder;

public class UriComponentBuilder {
	
	public static boolean handleScheduler(String rowkey,String process) {
		
		String url = UriComponentsBuilder.fromPath("/syslogReporting/handleScheduler")
						.queryParam("rowkey", rowkey).queryParam("process", process).build().toUriString();
		System.out.println(url);
		return false;
		
	}
	public static void main(String[] args) {
		UriComponentBuilder.handleScheduler("rowkey-rowkey-rowkey", "hold");
	}

}
