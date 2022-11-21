package kr.kwangan2.jpatest.test;

import java.util.Arrays;
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
public class DynamicQueryTest {
   @Autowired
   private BoardRepository boardRepository;
	   
	   //@Test
	   public void testQueryAnnotation() {
		   List<Board> boardList = boardRepository.queryAnnotaitionTest2("제목10");
		   
		   log.info("검색 결과");
		   for (Board board : boardList) {
			   log.info("------->" + board.toString());
		   }
	   }
		   
	   //@Test
	   public void testQueryAnnotation2() {
		   List<Object[]> boardList = boardRepository.queryAnnotaitionTest3("제목10");
		   System.out.println("검색 결과");
		   for (Object[] row : boardList) {
			   System.out.println("----->" +Arrays.toString(row));
		   }
	   }
	   
	   //@Test
	   public void testQueryAnnotation4() {
		   List<Object[]> boardList = boardRepository.queryAnnotaitionTest4("제목10");
		   System.out.println("검색 결과4");
		   for (Object[] row : boardList) {
			   System.out.println("----->" +Arrays.toString(row));
		   }
	   }
	   
	   //@Test
	   public void testQueryAnnotation5() {
		   Pageable paging = PageRequest.of(0, 3, Sort.Direction.DESC, "seq");
				   List<Board> boardList = boardRepository.queryAnnotaitionTest5(paging);
		   for (Board board: boardList) {
			   System.out.println("----->" +board.toString());
		   }
	   }
}   // class