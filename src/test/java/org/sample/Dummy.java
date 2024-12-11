package org.sample;

import org.base.BaseClass;

public class Dummy  extends BaseClass{
public static void main(String[] args) {
	BaseClass b=new BaseClass();
	b.browserLaunch("Chrome");
	b.launchUrl("https://adactinhotelapp.com/");
	String urlTitle = b.urlTitle();
	System.out.println(urlTitle);
}
}
