package dev.pablo.model;
// Java Program to Illustrate Creation of Simple POJO Class

import java.time.LocalDate;

// Importing required classes
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "movies")

// POJO class
public class Movie {

	@Id
        @SequenceGenerator(name="SequenceGenerator", allocationSize = 1, initialValue = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SequenceGenerator")
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "rate")
	private float rate;

	@Column(name = "language")
	private String language;

	@Column(name = "note")
	private String note;

	@Column(name = "type")
	private String type;

	@Column(name = "watchDate")
	private LocalDate watchDate;

	public Movie() {
	}

	public Movie(String name, float rate, String language, String note, String type, LocalDate watchDate) {
		this.name = name;
		this.rate = rate;
		this.language = language;
		this.note = note;
		this.type = type;
		this.watchDate = watchDate;
	}

	public Movie(int id, String name, float rate, String language, String note, String type, LocalDate watchDate) {
		this.id = id;
		this.name = name;
		this.rate = rate;
		this.language = language;
		this.note = note;
		this.type = type;
		this.watchDate = watchDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getRate() {
		return rate;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public LocalDate getWatchDate() {
		return watchDate;
	}

	public void setWatchDate(LocalDate watchDate) {
		this.watchDate = watchDate;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", rate=" + rate + ", language=" + language + ", note=" + note
				+ ", type=" + type + ", watchDate=" + watchDate + "]";
	}

}
