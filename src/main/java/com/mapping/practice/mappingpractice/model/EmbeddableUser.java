package com.mapping.practice.mappingpractice.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;
import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import lombok.Data;

@Entity
@Data
@Table(name = "Embeddable_User")
public class EmbeddableUser {

	@Id
	@GeneratedValue
	private int userId;
	private String userName;

//	@Embedded
//	@ElementCollection
//	private Set<EmbeddableAddress> embeddableAddress = new HashSet<>();

	// Sample for @CollectionId, this will create a collectionId
	@Embedded
	@ElementCollection
	@JoinTable(name="USER_ADDRESS",
	joinColumns = @JoinColumn(name="USER_ID")
			)
	@GenericGenerator(name="sequence_gen", strategy="sequence")
	@CollectionId(columns={@Column(name="Address_Id")}, generator = "sequence_gen", type = @Type(type = "long"))
	private Collection<EmbeddableAddress> embeddableAddress = new ArrayList();

}
