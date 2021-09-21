package com.locale;

import java.util.Locale;

public class LocaleRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String keyword = "rowKey";
		String rowKey = "-rowKey";
		
		System.out.println(rowKey.toLowerCase(Locale.ROOT));
		System.out.println(keyword.toLowerCase(Locale.ROOT));
		
		boolean tw = rowKey.toLowerCase(Locale.ROOT).endsWith("-"+ keyword.toLowerCase(Locale.ROOT));
		System.out.println(tw);
	}

}
