package kr.kwangan2.jpatest.test;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import kr.kwangan2.jpatest.entity.Board;
import kr.kwangan2.jpatest.entity.Member;
import kr.kwangan2.jpatest.repository.BoardRepository;
import kr.kwangan2.jpatest.repository.MemberRepository;
import lombok.extern.log4j.Log4j2;

@RunWith(SpringRunner.class)
@SpringBootTest
@Log4j2
public class RelationMappingTest {

	@Autowired
	private BoardRepository boardrepo;
	
	@Autowired
	private MemberRepository memberrepo;
	
	//@Test
//	public void testManyToOneInsert() {
//		Member member1 = new Member("member1", "member111", "셀피", "User");
//		memberrepo.save(member1);
//		
//		Member member2 = new Member("member2", "member222", "나나", "Admin");
//		memberrepo.save(member2);
//		
//		for(int i = 1; i<=3; i++) {
//			Board board = new Board("셀피가 등록한 게시글"+i, member1, "셀피가 등록한 게시글내용"+i, new Date(), 0L);
//			boardrepo.save(board);
//		}
//		
//		for(int i = 1; i<=3; i++) {
//			Board board2 = new Board("나나가 등록한 게시글"+i, member2, "나나가 등록한 게시글내용"+i, new Date(), 0L);
//			boardrepo.save(board2);
//		}
//		
//	}
	
	//@Test
	public void testManyToOneSelect() {
		Board board = boardrepo.findById(3L).get();
		System.out.println("제목: " + board.getTitle());
		System.out.println("내용: " + board.getContent());
		System.out.println("작성자: " + board.getMember().getName());
		System.out.println("작성자 권한: " + board.getMember().getRole());
	}
	
	@Test
	public void testTwoWayMapping() {
		Member member = memberrepo.findById("member1").get();
		
		System.out.println(member.getName() + "가 저장한 게시글 목록");
		List<Board> list = member.getBoardList();
		for(Board board : list) {
			System.out.println(board.toString());
		}
	
	}
	
	//@Test
	public void testManyToOneInsert() {
		Member member1 = new Member("member1", "member111", "셀피", "User");
		//memberrepo.save(member1);
		
		Member member2 = new Member("member2", "member222", "나나", "Admin");
		//memberrepo.save(member2);
		
		for(int i = 1; i<=3; i++) {
			Board board = new Board("셀피가 등록한 게시글"+i, member1, "셀피가 등록한 게시글내용"+i, new Date(), 0L);
			//boardrepo.save(board);
		}
		memberrepo.save(member1);
		
		for(int i = 1; i<=3; i++) {
			Board board2 = new Board("나나가 등록한 게시글"+i, member2, "나나가 등록한 게시글내용"+i, new Date(), 0L);
			//boardrepo.save(board2);
		}
		memberrepo.save(member2);
		
	}
	
	@Test
	public void testCascadeDelete() {
		memberrepo.deleteById("member2");
	}
}
