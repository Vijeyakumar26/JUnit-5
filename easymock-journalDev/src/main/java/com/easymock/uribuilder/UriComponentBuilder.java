package com.easymock.uribuilder;

import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

public class UriComponentBuilder {
	
	public static boolean handleScheduler(String rowkey,String process) {
		
		String url = UriComponentsBuilder.fromPath("/syslogReporting/handleScheduler")
						.queryParam("rowkey", rowkey)
						.queryParam("process", process)
						.build()
						.toUriString();
		System.out.println(url);
		return false;
		
	}
	private RestTemplate restTemplate;
	public  <T> T  postRequest(String requestUrl,String requestMethod,Map<String,String> queryParam,
			String requestBody, Class<T> returnType) {
				
		ResponseEntity<T> response = null;
		MultiValueMap<String, String> header = new LinkedMultiValueMap<>();
		header.add(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE);
		HttpEntity<String> request = new HttpEntity<String>(requestBody,header);
		response = restTemplate.exchange(requestUrl,HttpMethod.POST,request,returnType);
		
		return null;
		
	}
	public static void main(String[] args) {
		UriComponentBuilder.handleScheduler("rowkey-rowkey-rowkey", "hold");
		UriComponentBuilder uri = new UriComponentBuilder();
		uri.postRequest(null, null, null, null, null);
	}

}
