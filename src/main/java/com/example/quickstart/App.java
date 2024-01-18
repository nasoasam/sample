package com.example.quickstart;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {String password = "aaa";
    	MessageDigest md = null;
		try {
			md = MessageDigest.getInstance("SHA-256");
		} catch (NoSuchAlgorithmException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
    	byte[] resultBytes = null;
		try {
			resultBytes = md.digest(password.getBytes("UTF-8"));
		} catch (UnsupportedEncodingException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

    	MessageDigest md2 = null;
		try {
			md = MessageDigest.getInstance("SHA-256");
		} catch (NoSuchAlgorithmException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
    	byte[] resultBytes2 = null;
		try {
			resultBytes2 = md2.digest(password.getBytes("UTF-8"));
		} catch (UnsupportedEncodingException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		
    	StringBuilder stringBuilder = new StringBuilder();
    	for(byte b :resultBytes) {
    	    stringBuilder.append( Integer.toHexString( b & 0xFF ) );
    	}

        System.out.println( "Hello World!!" );
         int a;
         String s;
        System.out.println( "Hello Wor" + "ld!!!" + b() );
        System.out.println( "Hello World!!!" );
         a = 2;
         a++;
         a += a(a);
        System.out.println( "Hello World!!" );
        System.out.println( "Hello World!!" );
        System.out.println( "Hello World!!" );
        System.out.println( "Hello World!!" );
        System.out.println( "Hello World!!" );
        System.out.println( "Hello World!!" );
        System.out.println( "Hello World!!" );
    }
    public static int a(int ab) {
    	ab = 1;
    	return ab;
    }
    public static Boolean b() {
    	return null;
    }
    
}
