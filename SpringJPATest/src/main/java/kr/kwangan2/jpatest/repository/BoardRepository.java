package kr.kwangan2.jpatest.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import kr.kwangan2.jpatest.entity.Board;

public interface BoardRepository extends CrudRepository<Board, Long> {

//	List<Board> findByTitle(String searchKeyword);
//	                        
//	Page<Board> findByTitleContaining(String searchkeyword, Pageable paging);
	
//	@Query( " select b from Board b where b.title like %?1% order by b.seq desc ")
//	List<Board> queryAnnotaitionTest1(String serachkeyword);
	
//	@Query("SELECT b FROM Board b WHERE b.title like %?1% ORDER BY b.seq DESC")
//	List<Board> queryAnnotaitionTest1(@Param("searchkeyword") String searchkeyword);
	
//	@Query("SELECT b FROM Board b " + "WHERE b.title like %:searchkeyword% " + "ORDER BY b.seq DESC")
//	List<Board> queryAnnotaitionTest2(@Param("searchkeyword") String searchkeyword);
//	
//	@Query( " select b.seq, b.title, b.writer, b.createDate "
//			+ "from Board b "
//			+ "where b.title like %?1% "
//			+ "order by b.seq desc")
//	List<Object[]> queryAnnotaitionTest3(@Param("searchkeyword") String searchkeyword);
//	
//	@Query( value = " select seq, title, writer, createdate "
//			+ "from board where title '%'||?1||'%' "
//			+ "order by seq desc", nativeQuery = true)
//	List<Object[]> queryAnnotaitionTest4(String searchkeyword);
//	
//	@Query( "select b from Board b order by b.seq desc")
//	List<Board> queryAnnotaitionTest5(Pageable paging);
	
	
}
