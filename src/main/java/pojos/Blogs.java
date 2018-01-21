package pojos;
// Generated Jan 21, 2018 12:34:14 AM by Hibernate Tools 5.2.3.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Blogs generated by hbm2java
 */
@Entity
@Table(name = "blogs", catalog = "techingress")
public class Blogs implements java.io.Serializable {

	private int blogid;
	private Users users;
	private String blogName;
	private String status;
	private String category;
	private Integer likeCount;
	private String comments;
	private Set<Users> userses = new HashSet<Users>(0);

	public Blogs() {
	}

	public Blogs(int blogid) {
		this.blogid = blogid;
	}

	public Blogs(int blogid, Users users, String blogName, String status, String category, Integer likeCount,
			String comments, Set<Users> userses) {
		this.blogid = blogid;
		this.users = users;
		this.blogName = blogName;
		this.status = status;
		this.category = category;
		this.likeCount = likeCount;
		this.comments = comments;
		this.userses = userses;
	}

	@Id

	@Column(name = "blogid", unique = true, nullable = false)
	public int getBlogid() {
		return this.blogid;
	}

	public void setBlogid(int blogid) {
		this.blogid = blogid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	@Column(name = "blogName", length = 20)
	public String getBlogName() {
		return this.blogName;
	}

	public void setBlogName(String blogName) {
		this.blogName = blogName;
	}

	@Column(name = "status", length = 20)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "category", length = 20)
	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Column(name = "likeCount")
	public Integer getLikeCount() {
		return this.likeCount;
	}

	public void setLikeCount(Integer likeCount) {
		this.likeCount = likeCount;
	}

	@Column(name = "comments", length = 20)
	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "blogs")
	public Set<Users> getUserses() {
		return this.userses;
	}

	public void setUserses(Set<Users> userses) {
		this.userses = userses;
	}

}