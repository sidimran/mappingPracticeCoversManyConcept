package com.mapping.practice.mappingpractice.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user_detail")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class UserDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "useId")
	private int useId;

	// @Transient -- it will ignore the column
	@Column(name = "user_details")
	private String userName;

	@Embedded
	 private Address address; // for Embedded purpose value object in UserDetails
	// entity

	
	
	
//	@OneToOne
//	@JoinColumn(name = "fk_vehicleId")
//	private Vehicle vehicle;    // OneToOne mapping

//	@OneToMany(cascade = CascadeType.ALL, mappedBy = "userDetails")
//	private List<Vehicle> vehicle = new ArrayList<Vehicle>();   

	// Sample for joinTable
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "userDetails")
	private List<Vehicle> vehicle = new ArrayList<Vehicle>();

//	@ManyToOne()
//	@JoinColumn(name="vehicle_Id", referencedColumnName = "vehicleId")
//	private Vehicle vehicle;
//	

}
