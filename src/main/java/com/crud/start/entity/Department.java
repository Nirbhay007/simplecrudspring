package com.crud.start.entity;

// Importing required classes
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

		@Entity
		@Data
		@NoArgsConstructor
		@AllArgsConstructor
		@Builder

		// Class
		public class Department {

			@Id
			@GeneratedValue(strategy = GenerationType.AUTO)
			private Long departmentId;
			private String departmentName;
			private String departmentAddress;
			private String departmentCode;
			public String getDepartmentName() {
				// TODO Auto-generated method stub
				return departmentName;
			}
			public String getDepartmentAddress() {
				// TODO Auto-generated method stub
				return departmentAddress;
			}
			public void setDepartmentName(String departmentName2) {
				// TODO Auto-generated method stub
				departmentName = departmentName2;
			}
			public void setDepartmentAddress(String departmentAddress2) {
				// TODO Auto-generated method stub
				departmentAddress = departmentAddress2;
				
			}
			public String getDepartmentCode() {
				// TODO Auto-generated method stub
				return departmentCode;
			}
			public void setDepartmentCode(String departmentCode2) {
				// TODO Auto-generated method stub
				departmentCode = departmentCode2;
				
			}
		}

	


