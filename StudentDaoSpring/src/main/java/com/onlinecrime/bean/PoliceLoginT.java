package com.onlinecrime.bean;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;


public class PoliceLoginT {

		@Email(message = "Please Enter Valid Email")
		@NotEmpty(message = "Email is mandatory")
		private String username;
		
		@NotEmpty(message = "Password is mandatory")
		private String password;
		
		
		public PoliceLoginT() {
			
		}
		
		
		public PoliceLoginT(String username, String password) {
			super();
			this.username = username;
			this.password = password;
		}
		


		@Override
		public String toString() {
			return "PoliceLogin [username=" + username + ", password=" + password + "]";
		}


		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}




}
