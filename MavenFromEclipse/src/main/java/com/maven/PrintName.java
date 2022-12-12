package com.maven;

public class PrintName {
/* made a maven project from eclipse to run from cmd prompt and added the group id as package name in main/java as it was not made
 * In pom.xml added build tag,added exec plugin in it to run this java file from cmd prompt
 * added goal java in executions tag, nm of file and cmd line arguments in configuration of plugin.
 * gave cmd mvn clean, 
 * mvn exec:java from cmd prompt to run this file and print the two statements.
 * 
 */
	public static void main(String[] args) {
		System.out.println("Total number of arguments: "+args.length);
		System.out.println("My name is "+args[0]);
		System.out.println("My age is "+args[1]);
	}

}
