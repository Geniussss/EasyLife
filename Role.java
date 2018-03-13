package com.jay.ca.easylife.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ROLE")
public class Role {
		
		
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name = "ROLE_ID")
		private int roleid;
		@Column(name = "ROLE")
		private String role;
		
		public int getRoleid() {
			return roleid;
		}
		public void setRoleid(int roleid) {
			this.roleid = roleid;
		}
		public String getRole() {
			return role;
		}
		public void setRole(String role) {
			this.role = role;
		}
		
}
