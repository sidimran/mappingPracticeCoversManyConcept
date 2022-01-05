package com.mapping.practice.mappingpractice.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class Vehicle {

	@Id
	@GeneratedValue
	@Column(name = "vehicleId")
	private int vehicleId;
	private String vehicleName;
	
	

	@ManyToOne()
	@JoinColumn(name="useId", referencedColumnName ="useId" )
	
	@JoinTable(name = "vehicle_Table_userDetail_table",
	
	joinColumns = @JoinColumn(name = "vehicle_Id", referencedColumnName = "vehicleId"),
	inverseJoinColumns = @JoinColumn(name= "user_Id", referencedColumnName = "useId")
			)
	private UserDetails userDetails;
	
	

	
//	@OneToMany(cascade = CascadeType.ALL, mappedBy = "vehicle")
//	private List<UserDetails> vehicle = new ArrayList<UserDetails>();

}
