package com.mysite.products;

//싹다 import ==> *로 표기
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mysite.common.JDBCUtil;

public class ProductsDAO {
	
	
	
	//사용할 변수선언 : private
		//connection, preparedstatement, resultset ===> java.sql.*
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	//SQL 쿼리를 상수로 정의 후에 각각 필요한 메소드에서 사용
	private final String PRODUCTS_INSERT  = "insert into products(p_code,p_name,p_kind,p_price,p_quantity,p_content)values(?,?,?,?,?,?)";
	private final String PRODUCTS_UPDATE  = "update products set p_name = ?, p_content = ? where p_code = ?";
	private final String PRODUCTS_DELETE  = "delete products where p_code = ?";
	private final String PRODUCTS_GET 	  = "select*from products where p_code = ?";
	private final String PRODUCTS_LIST    = "select*from products order by p_code desc";
	
	
	
	//1. products 테이블에 값을 넣는 메소드 : insert
	//PRODUCTS_INSERT  = "insert into products(p_code,p_name,p_kind,p_price,p_content,p_content)values(?,?,?,?,?,?)";
	public void insertProducts (ProductsDTO dto) {
		System.out.println("======== insertProducts 기능 처리 ==========");
		
		try {
			conn = JDBCUtil.getConnection(); 	//conn 객체가 활성화 (Oracle/XE/HR2/1234) 이렇게 됨.
			
			
			// PreparedStatement 객체를 활성화
			pstmt = conn.prepareStatement(PRODUCTS_INSERT);	// pstmt 객체 활성화
			// ? 에 들어갈 변수의 값을 dto의 getter를 사용해서 값을 할당
			pstmt.setInt(1, dto.getP_code());
			pstmt.setString(2, dto.getP_name());
			pstmt.setString(3, dto.getP_kind());
			pstmt.setString(4, dto.getP_price());
			pstmt.setString(5, dto.getP_quantity());
			pstmt.setString(6, dto.getP_content());
			
			
			// PreparedStatement 객체를 실행 : DB에 값이 Insert 됨.
			pstmt.executeUpdate(); 	//insert/update/delete
			
			System.out.println(" Products 테이블에 값이 잘 insert되었습니다. ");
			
		} catch (Exception e){
			//e.printStackTrace();
			System.out.println(" Products 테이블에 값이 insert 실패했습니다. ");
		} finally {
			//사용한 객체를 제거
			JDBCUtil.close(pstmt, conn);
		}
	}
	
	/*
	//2. UPDATE
		//BOARD_UPDATE  = "update board set title = ?, content = ? where seq = ?";
	public void updateBoard(ProductsDTO dto) {
		System.out.println("updateBoard 메소드 호출");
		
		try {
			conn = JDBCUtil.getConnection();
			pstmt = conn.prepareStatement(BOARD_UPDATE);
			pstmt.setString(1, dto.getTitle());
			pstmt.setString(2, dto.getContent());
			pstmt.setInt(3, dto.getSeq());
			
			pstmt.executeUpdate();
			
			System.out.println("update 성공");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("update 실패");
		} finally {
			JDBCUtil.close(pstmt, conn);
		}
		
		
		
	}
	//test해보고 적용하기...
	
	
	
	
	
	//3. DELETE
		//"delete board where seq = ?";
	public void deleteBoard(ProductsDTO dto) {
			System.out.println("삭제 메소드 호출됨");
		try {
			conn = JDBCUtil.getConnection();
			pstmt = conn.prepareStatement(BOARD_DELETE);
			pstmt.setInt(1, dto.getSeq());
			
			pstmt.executeUpdate();		//insert, update, delete
			
			System.out.println("삭제 성공");
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("삭제 실패");
			
		} finally {
			JDBCUtil.close(pstmt, conn);
		}
		
	}
	//테스트를 하고 다음 과정 진행.
	
	
	
	
	
	
	
	
	//4. 상세페이지 (GET) : 레코드 1개(글 내용만 따로 보기위함) : 리턴 타입 BoardDTO
		//BOARD_GET = "select*from board where seq = ?";   
	public ProductsDTO getBoard(ProductsDTO dto) {			// 클라에서 요청한 dto
		ProductsDTO board = new ProductsDTO();				// rs에서 dto로 setter주입으로 레코드 값을 가져오는것(이것도 dto)
		
		addCNT(dto); 	//조회수 증가 메소드를 넣음.
		
		try {
			conn = JDBCUtil.getConnection();
			pstmt = conn.prepareStatement(BOARD_GET);
			pstmt.setInt(1, dto.getSeq());		// 클라가 seq번호로 요청을 하는것이므로 DTO로 요청을 하는데 ?에 DTO의 seq값을 get해서 넣는다는것.
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				board.setSeq(rs.getInt("SEQ"));	//db의 컬럼명 SEQ. BoardDTO에 setter 주입한것.
				board.setTitle(rs.getString("TITLE"));
				board.setWrite(rs.getString("WRITE"));
				board.setContent(rs.getString("CONTENT"));
				board.setRegdate(rs.getDate("REGDATE"));
				board.setCnt(rs.getInt("CNT"));
				
			}
			System.out.println("Board 테이블에서 상세 레코드가 잘 처리되었습니다.");
			
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("Board 테이블에서 상세 레코드가 잘 처리되었습니다.");

		}finally {
			JDBCUtil.close(rs, pstmt, conn);
		}
		
		return board;
	}
	//테스트를 한번 해보고 view페이지를 만들면되는데 그전에 controller한번 가서 설정해야함.
	
	
	
	//조회수 증가 메소드 : BOARD_ADD_CNT = "update board set cnt = (select cnt +1 from board where seq = ?) where seq = ?";
	public void addCNT(ProductsDTO dto) {
		try {
			conn = JDBCUtil.getConnection();
			pstmt = conn.prepareStatement(BOARD_ADD_CNT);
			pstmt.setInt(1, dto.getSeq());
			pstmt.setInt(2, dto.getSeq());
			
			pstmt.executeUpdate(); //insert, update, delete 일때 사용하는 메소드
			
			System.out.println("조회수 증가 성공");
			
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("조회수 증가 실패");
		} finally {
			JDBCUtil.close(pstmt, conn);
		}
	}
	
	*/
	
	
	
	
	
	
	
	//5. 리스트 페이지 (PRODUCTS_LIST) : 레코드 여러개
			//전체 레코드를 rs로 가져와서 한줄의 레코드를(한 column) setter로 DTO한개에 저장 ---> DTO여러개(products)를 arrayList에 add해서 저장...
			
			//PRODUCTS_LIST    = "select*from products order by p_code desc";
	public List<ProductsDTO> getProductsList(ProductsDTO dto){
		System.out.println("getProductsList 메소드 호출 - 게시판 리스트 페이지");
		
		//주의 : while 블락밖에서 선언해야한다.
		List<ProductsDTO> productsList = new ArrayList<ProductsDTO>();	// try 블락 밖에서 선언이 되어야함.
		
		try {
			conn = JDBCUtil.getConnection();
			pstmt = conn.prepareStatement(PRODUCTS_LIST);
			rs = pstmt.executeQuery();		// rs에는 select한 결과 레코드셋을 담고있다.
			
			//rs의 값을 끄집어내서 DTO에 저장
			while (rs.next()) {
				
				//주의 : while 블락내에서 DTO객체를 생성해야 board(DTO)의 힙주소가 새로 생성됨.(밖에서 생성하면 힙주소가 계속 동일하기 때문에 마지막 값만 적용됨.)
				ProductsDTO products = new ProductsDTO();		// DTO객체를 while 루프 내에서 생성해야됨.
				
				products.setP_code(rs.getInt("P_CODE"));
				products.setP_name(rs.getString("P_NAME"));
				products.setP_kind(rs.getString("P_KIND"));
				products.setP_price(rs.getString("P_PRICE"));
				products.setP_quantity(rs.getString("P_QUANTITY"));				
				products.setP_content(rs.getString("P_CONTENT"));
				products.setIndate(rs.getDate("INDATE"));
				
				
				//producstList에 DTO를 추가
				productsList.add(products);
			}
			
			System.out.println("productsList에 모든 레코드 추가 성공");
			
		}catch (Exception e){
			e.printStackTrace();
			System.out.println("productsList에 모든 레코드 추가 실패");
		}finally {
			//사용한 객체 모두 제거(close)
			JDBCUtil.close(rs, pstmt, conn);
		}
		
		return productsList;		//productsList : products 테이블의 각각의 레코드를 dto에 담아서 productsList에 저장됨.
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
