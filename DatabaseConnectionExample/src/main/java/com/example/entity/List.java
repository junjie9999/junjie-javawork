package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="AccountList")
	public class List {
		private long id;
	    private String name;
	    private String field;
	    @Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    @Column(name="id")
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		@Column(name="FullName", nullable=false, unique=true)
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		@Column(name="field")
		public String getField() {
			return field;
		}
		public void setField(String field) {
			this.field = field;
		
		}
		public List(long id, String name, String field) {
			super();
			this.id = id;
			this.name = name;
			this.field = field;
		}
		public List() {
			super();
		}

	    
		

	}





