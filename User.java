package com.example1.userservice.Entity;
 
import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "micro_users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

	@Autowired
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long userId;
	
	private String name;
	private String email;
	private String about;
//	public void setUserId(String randomUserId) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	
	// TODO Auto-generated method stub
		
	}
	

