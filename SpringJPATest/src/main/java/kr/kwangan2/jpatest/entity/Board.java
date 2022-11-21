package kr.kwangan2.jpatest.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity 
@Data
@NoArgsConstructor
@ToString(exclude = "member")
public class Board {
	
	
	public Board(String title, Member member, String content, Date createDate, Long cnt) {
		this.member= member;
		this.title = title;
//		this.writer = writer;
		this.content = content;
		this.createDate = createDate;
		this.cnt = cnt;
	}
	
	@Id
	@GeneratedValue
	private Long seq;
	private String title;
//	private String writer;
	private String content;
	@Temporal(value = TemporalType.TIMESTAMP)
	private Date createDate;
	private Long cnt;
	
	@ManyToOne
	@JoinColumn(name="MEMBER_ID", nullable = false) //inner join 관계 생성
	private Member member;
	
	public void setMember(Member member) {
		this.member=member;
		member.getBoardList().add(this);
	}
	
}//class
