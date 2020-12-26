package com.newjob.hibpack;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.cfg.AnnotationConfiguration;

/*
 * 
CREATE TABLE client (
	client_id INT NOT NULL,
	full_name VARCHAR(100) NOT NULL,
	first_name VARCHAR(50),
	last_name VARCHAR(50),
	birthday DATE,
	diagnose VARCHAR(20),
	location_id INT NOT NULL,
	client_id INT NOT NULL,
	full_name VARCHAR(20) NOT NULL,
	first_name VARCHAR(20),
	last_name VARCHAR(20),
	birthday DATE,
	diagnoze VARCHAR(20),
	PRIMARY KEY (client_id)
);
 */
@Entity
@Table(name="client")
public class Client  {

	
	@Id
	@GeneratedValue
	@Column(name="client_id")
	private long client_id;
	
	@Column(name = "full_name")
	private String full_name;
	
	@Column(name = "first_name")
	private String first_name;
	
	@Column(name = "last_name")
	private String last_name;
	
	@Column(name="birthday")
//	@Temporal(TemporalType.DATE)
	private Date birthday;
	
	@Column(name = "diagnoze")
	private String diagnoze;
	
	public Client() {
		
	}
	public Client(long id, String fullName, Date birth, String diag) {
		client_id =id;
		full_name = fullName;
		birthday= birth;
		diagnoze = diag;
	}
	
	public long getClient_id() {
		return client_id;
	}
	public void setClient_id(long client_id) {
		this.client_id = client_id;
	}
	public String getFull_name() {
		return full_name;
	}
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getDiagnoze() {
		return diagnoze;
	}
	public void setDiagnoze(String diagnoze) {
		this.diagnoze = diagnoze;
	}

}
