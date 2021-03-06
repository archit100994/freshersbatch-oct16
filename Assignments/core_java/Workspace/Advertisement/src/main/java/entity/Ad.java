package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Ad")
public class Ad 
{
	@Id
	@Column(name="psotId")
		private String postId;
	
	@Column(name="status")
		private String status;
	
	@Column(name="title")
		private String title;
	
	@Column(name="name")
		private String name;
	
	@Column(name="category")
		private String category;
	
	@Column(name="description")
		private String description;
	
	@Column(name="photocount")
		private int photocount;
	
	@Column(name="photo1")
		private String photo1;
	
	@Column(name="photo2")
		private String photo2;
	
	public Ad(String postId, String status, String title, String name, String category, String description, int photocount, String photo1,
			String photo2)
	{
		this.postId = postId;
		this.status= status;
		this.title = title;
		this.name = name;
		this.category = category;
		this.description = description;
		this.photocount = photocount;
		this.photo1 = photo1;
		this.photo2 = photo2;
	}
	public Ad() {
	}
	public String getPostId() {
		return postId;
	}
	public void setPostId(String postId) {
		this.postId = postId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public int getPhotocount() {
		return photocount;
	}
	public void setPhotocount(int photocount) {
		this.photocount = photocount;
	}
	public String getPhoto1() {
		return photo1;
	}
	public void setPhoto1(String photo1) {
		this.photo1 = photo1;
	}
	public String getPhoto2() {
		return photo2;
	}
	public void setPhoto2(String photo2) {
		this.photo2 = photo2;
	}
	@Override
	public String toString() {
		return "Ad [postId=" + postId + ", status=" + status + ", title=" + title + ", name=" + name + ", category="
				+ category + ", description=" + description + ", photocount=" + photocount + ", photo1=" + photo1
				+ ", photo2=" + photo2 + "]";
	}
}
