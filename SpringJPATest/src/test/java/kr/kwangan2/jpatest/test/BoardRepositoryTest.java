package kr.kwangan2.jpatest.test;

import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import kr.kwangan2.jpatest.entity.Board;
import kr.kwangan2.jpatest.repository.BoardRepository;
import lombok.extern.log4j.Log4j2;

@RunWith(SpringRunner.class)
@SpringBootTest
@Log4j2
public class BoardRepositoryTest {
   @Autowired
   private BoardRepository boardRepository;
   
//   @Test
//   public void repositoryTest() {
//      Board board = new Board("첫 번쨰 게시글", "tester", "잘 등록 되나요", new Date(), 0L);
//      
//      boardRepository.save(board);
//   }
   
//   //@Test
//   public void testGetBoard() {
//      Board board = boardRepository.findById(1L).get();
//      log.info(board);
//   }
   
//   //@Test
//   public void testUpdateBoard() {
//      log.info("게시글 조회");
//      Board board = boardRepository.findById(1L).get();
//      log.info(board);
//      
//      log.info("게시글 수정");
//      board.setTitle("수정된 게시글");
//      boardRepository.save(board);
//      
//      log.info("게시글 수정후");
//      board = boardRepository.findById(1L).get();
//      log.info(board);
//   }
   
//   @Test
//   public void testDeleteBoard() {
//      boardRepository.deleteById(1L);
//   }
   
   	@Test
//   	public void dataPrepare() {
//   		for(int i = 1; i <= 200; i++) {
//   			Board board = new Board("제목"+i, "작성자"+i, "내용"+i, new Date(), 0L);
//   			boardRepository.save(board);
//   		}
//   	}
   	
//   	@Test
   	public void testFindByTitle() {
   		List<Board> boardList = boardRepository.findByTitle("제목10");
   		for(Board board : boardList) {
   			System.out.println("====>" + board.toString());
   		}
   	}
   		
   	//@Test
//   	public void findByTitleContaining() {
//   		Pageable paging = PageRequest.of(0, 5, Sort.Direction.DESC, "seq");
//   		
//   		Page<Board> pageInfo = boardRepository.findByTitleContaining("제목", paging);
//   		
//   		System.out.println("페이지 사이즈: " + pageInfo.getSize());
//   		System.out.println("페이지 전체 수: " + pageInfo.getTotalPages());
//   		System.out.println("페이지 개수: " + pageInfo.getTotalElements());
//   		System.out.println("다음페이지: " + pageInfo.nextPageable());
//   		
//   		List<Board> boardList = pageInfo.getContent();
//   		
//   		for(Board board : boardList) {
//   			System.out.println("====>" + board.toString());
//   		}
//   	}
}   // class