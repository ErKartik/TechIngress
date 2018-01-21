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
 * Users generated by hbm2java
 */
@Entity
@Table(name = "users", catalog = "techingress")
public class Users implements java.io.Serializable {

	private int userId;
	private Blogs blogs;
	private Content content;
	private Discussionforum discussionforum;
	private Usergroup usergroup;
	private String userName;
	private String email;
	private String city;
	private String education;
	private String collegeName;
	private String collegeCity;
	private String collegeState;
	private Set<Blogs> blogses = new HashSet<Blogs>(0);
	private Set<Content> contents = new HashSet<Content>(0);
	private Set<Usergroup> usergroups = new HashSet<Usergroup>(0);
	private Set<Qna> qnas = new HashSet<Qna>(0);
	private Set<Discussionforum> discussionforums = new HashSet<Discussionforum>(0);

	public Users() {
	}

	public Users(int userId) {
		this.userId = userId;
	}

	public Users(int userId, Blogs blogs, Content content, Discussionforum discussionforum, Usergroup usergroup,
			String userName, String email, String city, String education, String collegeName, String collegeCity,
			String collegeState, Set<Blogs> blogses, Set<Content> contents, Set<Usergroup> usergroups, Set<Qna> qnas,
			Set<Discussionforum> discussionforums) {
		this.userId = userId;
		this.blogs = blogs;
		this.content = content;
		this.discussionforum = discussionforum;
		this.usergroup = usergroup;
		this.userName = userName;
		this.email = email;
		this.city = city;
		this.education = education;
		this.collegeName = collegeName;
		this.collegeCity = collegeCity;
		this.collegeState = collegeState;
		this.blogses = blogses;
		this.contents = contents;
		this.usergroups = usergroups;
		this.qnas = qnas;
		this.discussionforums = discussionforums;
	}

	@Id

	@Column(name = "user_id", unique = true, nullable = false)
	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "blogid")
	public Blogs getBlogs() {
		return this.blogs;
	}

	public void setBlogs(Blogs blogs) {
		this.blogs = blogs;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cid")
	public Content getContent() {
		return this.content;
	}

	public void setContent(Content content) {
		this.content = content;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ForumId")
	public Discussionforum getDiscussionforum() {
		return this.discussionforum;
	}

	public void setDiscussionforum(Discussionforum discussionforum) {
		this.discussionforum = discussionforum;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "group_id")
	public Usergroup getUsergroup() {
		return this.usergroup;
	}

	public void setUsergroup(Usergroup usergroup) {
		this.usergroup = usergroup;
	}

	@Column(name = "user_Name", length = 20)
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name = "email", length = 20)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "city", length = 20)
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "education", length = 20)
	public String getEducation() {
		return this.education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	@Column(name = "college_Name", length = 20)
	public String getCollegeName() {
		return this.collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	@Column(name = "college_city", length = 20)
	public String getCollegeCity() {
		return this.collegeCity;
	}

	public void setCollegeCity(String collegeCity) {
		this.collegeCity = collegeCity;
	}

	@Column(name = "college_state", length = 20)
	public String getCollegeState() {
		return this.collegeState;
	}

	public void setCollegeState(String collegeState) {
		this.collegeState = collegeState;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "users")
	public Set<Blogs> getBlogses() {
		return this.blogses;
	}

	public void setBlogses(Set<Blogs> blogses) {
		this.blogses = blogses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "users")
	public Set<Content> getContents() {
		return this.contents;
	}

	public void setContents(Set<Content> contents) {
		this.contents = contents;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "users")
	public Set<Usergroup> getUsergroups() {
		return this.usergroups;
	}

	public void setUsergroups(Set<Usergroup> usergroups) {
		this.usergroups = usergroups;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "users")
	public Set<Qna> getQnas() {
		return this.qnas;
	}

	public void setQnas(Set<Qna> qnas) {
		this.qnas = qnas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "users")
	public Set<Discussionforum> getDiscussionforums() {
		return this.discussionforums;
	}

	public void setDiscussionforums(Set<Discussionforum> discussionforums) {
		this.discussionforums = discussionforums;
	}

}
