package com.akjava.gwt.html5.client.file.webkit;

import com.google.gwt.core.client.JavaScriptObject;

public class Item extends JavaScriptObject{
	protected Item(){}
	public  final native WebkitEntry webkitGetAsEntry()/*-{
    return this.webkitGetAsEntry();
  	}-*/;
	
}
