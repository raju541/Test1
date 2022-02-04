package com.cts.test;

public class CustomeException extends Exception{
	
		private String msg;
		public CustomeException() {	}
		public CustomeException(String msg) {
			this.msg=msg;
			System.out.println(msg);
		}
		
		public String getMsg() {
			return msg;
		}

		public void setMsg(String msg) {
			this.msg = msg;
		}

		public static void main(String[] args) throws CustomeException{
		// TODO Auto-generated method stub
		try {
			String s="abc123";
			int i=Integer.parseInt(s);
			System.out.println(i);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		throw new CustomeException("Input must be an Integer");
	}

}
