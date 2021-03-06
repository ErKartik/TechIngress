package pojos;
// Generated Jan 21, 2018 12:34:14 AM by Hibernate Tools 5.2.3.Final

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Discussionforum generated by hbm2java
 */
@Entity
@Table(name = "discussionforum", catalog = "techingress")
public class Discussionforum implements java.io.Serializable {

	private int forumId;
	private Users users;
	private String name;
	private String category;
	private Date createDate;
	private Integer qnaId;
	private Set<Users> userses = new HashSet<Users>(0);
	private Set<Qna> qnas = new HashSet<Qna>(0);

	public Discussionforum() {
	}

	public Discussionforum(int forumId) {
		this.forumId = forumId;
	}

	public Discussionforum(int forumId, Users users, String name, String category, Date createDate, Integer qnaId,
			Set<Users> userses, Set<Qna> qnas) {
		this.forumId = forumId;
		this.users = users;
		this.name = name;
		this.category = category;
		this.createDate = createDate;
		this.qnaId = qnaId;
		this.userses = userses;
		this.qnas = qnas;
	}

	@Id

	@Column(name = "ForumId", unique = true, nullable = false)
	public int getForumId() {
		return this.forumId;
	}

	public void setForumId(int forumId) {
		this.forumId = forumId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	@Column(name = "Name", length = 20)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "category", length = 20)
	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "createDate", length = 10)
	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Column(name = "QNA_id")
	public Integer getQnaId() {
		return this.qnaId;
	}

	public void setQnaId(Integer qnaId) {
		this.qnaId = qnaId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "discussionforum")
	public Set<Users> getUserses() {
		return this.userses;
	}

	public void setUserses(Set<Users> userses) {
		this.userses = userses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "discussionforum")
	public Set<Qna> getQnas() {
		return this.qnas;
	}

	public void setQnas(Set<Qna> qnas) {
		this.qnas = qnas;
	}

}
