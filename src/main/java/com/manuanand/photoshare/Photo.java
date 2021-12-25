package com.manuanand.photoshare;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Photo {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	private String url;

	private String title;

	private String description;

	private String commaSeparatedTags;
	
	private Date uploadDate;
	
	private int numRatings;
	
	private double rating;

	// Derived Fields
	private Integer uploadedUserId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCommaSeparatedTags() {
		return commaSeparatedTags;
	}

	public void setCommaSeparatedTags(String commaSeparatedTags) {
		this.commaSeparatedTags = commaSeparatedTags;
	}

	public Integer getUploadedUserId() {
		return uploadedUserId;
	}

	public void setUploadedUserId(Integer uploadedUserId) {
		this.uploadedUserId = uploadedUserId;
	}
	
	public Date getUploadDate() {
		return uploadDate;
	}

	public void setUploadDate(Date uploadDate) {
		this.uploadDate = uploadDate;
	}

	public int getNumRatings() {
		return numRatings;
	}

	public void setNumRatings(int numRatings) {
		this.numRatings = numRatings;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}
	
}