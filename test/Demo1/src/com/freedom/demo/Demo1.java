package com.freedom.demo;

import java.io.IOException;

public class Demo1 {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		
		//关机
		//Runtime.getRuntime().exec("shurdown -s -t 10000");
		
		//取消关机
		Runtime.getRuntime().exec("shurdown -a");
	}

}
