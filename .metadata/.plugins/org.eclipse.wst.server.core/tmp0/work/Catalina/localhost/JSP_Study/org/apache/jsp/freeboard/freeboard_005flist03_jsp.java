/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.76
 * Generated at: 2023-07-07 07:46:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.freeboard;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;
import java.sql.*;

public final class freeboard_005flist03_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/freeboard/conn_oracle.jsp", Long.valueOf(1688711640311L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("    \n");
      out.write(" <!--  페이징 처리 부분 추가된 freeboard_list03.jsp -->   \n");
      out.write("    \n");
      out.write("\n");
      out.write("<!-- 클래스 import, DB Connection 객체 -->\n");
      out.write(" \n");
      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>Oracle DB Connection</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("	");

		//변수 초기화     //JSP 블락내에서 주석 
		Connection conn = null;      
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:XE"; 
			
		try {
			Class.forName(driver); 	//오라클 드라이버를 로드함 
			conn = DriverManager.getConnection (url, "C##HR2", "1234"); 

		}catch (Exception e) {
			e.printStackTrace(); 
		}

	
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("\n");
      out.write("<HTML>\n");
      out.write("<HEAD><TITLE>게시판</TITLE>\n");
      out.write("<link href=\"freeboard.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("<SCRIPT language=\"javascript\">\n");
      out.write(" function check(){\n");
      out.write("  with(document.msgsearch){\n");
      out.write("   if(sval.value.length == 0){\n");
      out.write("    alert(\"검색어를 입력해 주세요!!\");\n");
      out.write("    sval.focus();\n");
      out.write("    return false;\n");
      out.write("   }	\n");
      out.write("   document.msgsearch.submit();\n");
      out.write("  }\n");
      out.write(" }\n");
      out.write(" function rimgchg(p1,p2) {\n");
      out.write("  if (p2==1) \n");
      out.write("   document.images[p1].src= \"image/open.gif\";\n");
      out.write("  else\n");
      out.write("   document.images[p1].src= \"image/arrow.gif\";\n");
      out.write("  }\n");
      out.write("\n");
      out.write(" function imgchg(p1,p2) {\n");
      out.write("  if (p2==1) \n");
      out.write("   document.images[p1].src= \"image/open.gif\";\n");
      out.write("  else\n");
      out.write("   document.images[p1].src= \"image/close.gif\";\n");
      out.write(" }\n");
      out.write("</SCRIPT>\n");
      out.write("</HEAD>\n");
      out.write("<BODY>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<P>\n");
      out.write("<P align=center><FONT color=#0000ff face=굴림 size=3><STRONG>자유 게시판</STRONG></FONT></P> \n");
      out.write("<P>\n");
      out.write("<CENTER>\n");
      out.write(" <TABLE border=0 width=600 cellpadding=4 cellspacing=0>\n");
      out.write("  <tr align=\"center\"> \n");
      out.write("   <td colspan=\"5\" height=\"1\" bgcolor=\"#1F4F8F\"></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr align=\"center\" bgcolor=\"#87E8FF\"> \n");
      out.write("   <td width=\"42\" bgcolor=\"#DFEDFF\"><font size=\"2\">번호</font></td>\n");
      out.write("   <td width=\"340\" bgcolor=\"#DFEDFF\"><font size=\"2\">제목</font></td>\n");
      out.write("   <td width=\"84\" bgcolor=\"#DFEDFF\"><font size=\"2\">등록자</font></td>\n");
      out.write("   <td width=\"78\" bgcolor=\"#DFEDFF\"><font size=\"2\">날짜</font></td>\n");
      out.write("   <td width=\"49\" bgcolor=\"#DFEDFF\"><font size=\"2\">조회</font></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr align=\"center\"> \n");
      out.write("   <td colspan=\"5\" bgcolor=\"#1F4F8F\" height=\"1\"></td>\n");
      out.write("  </tr>\n");
      out.write("\n");
      out.write("<!-- JSP 코드 블락  : DB의 레코드를 가져와서 루프 : 시작 -->\n");
      out.write("	");

	
 	/* DB에서 값을 가져와서 Vector 켈렉션에 저장후 페이징 처리 */
 	
 	//Vector 변수 선언 
 	Vector name = new Vector(); 	//name 컬럼의 모든값을 저장하는 vector 
 	Vector inputdate = new Vector(); 
 	Vector email = new Vector();
 	Vector subject = new Vector();
 	Vector readcount = new Vector();
 	Vector step = new Vector();
 	Vector keyid = new Vector();		//DB의 id컬럼의 값을 저장하는 vector
	
	
	// 페이징을 처리할 변수 선언  <<<시작>>> 
	
	int where = 1; 			//현재 위치한 페이징 변수 
	
	//  where = Integer.parseInt(request.getParameter("where"));  
		
	int totalgroup = 0 ; 		//출력할 페이징의 총 그룹수  
	int maxpages = 10; 			//하단의 페이지 출력 부분에서 출력할 최대 페이지 갯수 
	int startpage = 1; 
	int endpage = startpage + maxpages -1 ; 
	int wheregroup = 1; 		//현재 위치한 페이징 그룹 
	
	//go  : get 방식으로 해당 페이지 번호로 이동 하도록 설정하는 변수 
		//freeboard_list03.jsp?go=3 
	//gogroup  : get 방식으로 해당 페이지 그룹으로 이동 하도록 
		//freeboard_list03.jsp?go=3&gogroup=2    
	
	//go 변수 를 넘겨 받아서 wheregroup, startpage, endpage 정보를 알아낼 수 있다. 
		//코드 블락
	if (request.getParameter("go") != null ){   // freeboard_list03.jsp?go=3
		where = Integer.parseInt(request.getParameter("go"));  // go 변수의 값을 where변수에 할당
		wheregroup = (where - 1) / maxpages + 1 ;  //현재 내가 속한 그룹을 알수 있다.
		startpage = (wheregroup - 1) * maxpages +1 ; 
		endpage = startpage + maxpages -1 ; 
	
		
	//gogroup 변수를 넘겨 받아서 startpage, endpage, where 의 정보를 알아낼 수 있다. 
		//코드 블락 
	}else if (request.getParameter("gogroup") != null){  //freeboard_list03.jsp?gogroup= 
		wheregroup = Integer.parseInt(request.getParameter("gogroup"));  //현재내가 위치한 그룹
		startpage = (wheregroup - 1) * maxpages +1 ; 
		where = startpage; 
		endpage = startpage + maxpages -1;  
	}
	
	int nextgroup = wheregroup +1 ; 
	int priorgroup = wheregroup -1 ; 
	
	int nextpage = where + 1 ;    // where : 현재 내가 위치한 페이지
	int priorpage = where -1 ; 
	int startrow = 0; 			//하나의 page에서 레코드 시작 번호 
	int endrow = 0; 			//하나의 page에서 레코드 마지막 번호 
	int maxrow = 20; 			//한페이지 내에 출력할 행의 갯수 (row, 행,레코드 갯수)
	int totalrows = 0; 			// DB에서 select 한 총 레코드 갯수 
	int totalpages = 0 ; 		// 총 페이지 갯수 
	
	// <<<페이징 처리할 변수 선언 끝>>>
	
	
	int id = 0 ; 	// DB의  id 컬럼의 값을 가져오는 변수 
	String em = null ; 	//DB에서 mail 주소를 가져와서 처리하는 변수 
		
		//SQL 쿼리를 보낼 객체 변수 선언 
		String sql = null; 
		Statement stmt = null; 
		ResultSet rs = null ; 
		
		//리스트 페이지에서 답변글 처리의 출력을 하기 위한 쿼리 
		sql = "select * from freeboard order by " ; 
		sql += "masterid desc, replaynum , step, id"; 
		
		
		stmt = conn.createStatement(); 
		rs = stmt.executeQuery(sql); 
		
		//rs의 값을 Vector에 저장 : 페이징 처리하기 위함. 
		
		if (!(rs.next())){	// rs의 값이 존재하지 않을때 
			out.println ("게시판에 올라온 글이 없습니다"); 
		}else {		// rs의 값이 존재 할때( 게시판의 글이 존재할때 )
			do {
			
			//정수 형으로 변환 필요: id , readcount, step 컬럼은 DB에서 값을 가져와서 정수형으로 변환 
			keyid.addElement(new Integer(rs.getString("id"))); 	
			name.addElement(rs.getString("name")); 
			email.addElement(rs.getString("email")); 
			String idate = rs.getString("inputdate").substring(0,8); 
			inputdate.addElement(idate); 
			subject.addElement(rs.getString("subject")); 
			readcount.addElement(new Integer(rs.getString("readcount"))); 
			step.addElement(new Integer(rs.getString("step"))); 
				
			} while  (rs.next()); 	
		}
		
		totalrows = name.size(); 		//DB에서 가져온 총 레코드 갯수 
		totalpages = (totalrows-1) / maxrow + 1; 	// 전체 페이지 갯수 출력 
		startrow = (where - 1) * maxrow ; 		//해당 페이지에서 Vector의 방번호 : 시작
		endrow = startrow + maxrow - 1 ; 		//해당 페이지에서 Vector의 방번호 : 마지막
		
		totalgroup = (totalpages -1) / maxpages + 1 ; 
			// 전체 페이지 그룹, 하단에 출력할 페이지 갯수(5개)의 그룹핑   
		
		
		//endrow 가 totalrows보다 크면 totalrows -1로 처리해야함.
		if ( endrow >= totalrows) {
			endrow = totalrows -1 ; 
		}
		if (endpage > totalpages){
			endpage = totalpages; 
		}
		
		
		
		// 페이징 변수 출력 
		/*
		out.println ( "<p/> 총 레코드 갯수 (totalrows : ) : " + totalrows + "<p/>" ); 
		out.println ( "<p/> 전체 페이지 수 (totalpage : ) : " + totalpages + "<p/>" ); 
		out.println ( "<p/> 시작 row 갯수 (startrow : ) : " + startrow + "<p/>" ); 
		out.println ( "<p/> 마지막 row 갯수 (endrow : ) : " + endrow + "<p/>" ); 
		*/
		  	// 프로그램 멈춤 
		
		

		
		//if (true) return;
		
		
	//행당 페이지를 처리하면서 해당 페이지에 대한 내용을 출력 (rs의 값을 vector에 저장했으므로 for )
	for ( int j = startrow ; j <= endrow ; j++){
	
	
	
      out.write("\n");
      out.write("\n");
      out.write("  <tr>\n");
      out.write("  	<td> ");
      out.print( keyid.elementAt(j) );
      out.write(" </td>\n");
      out.write("  	<td><a href=\"freeboard_read.jsp?id=");
      out.print( keyid.elementAt(j) );
      out.write("&page=");
      out.print( where );
      out.write("\"> \n");
      out.write("  			");
      out.print( subject.elementAt(j) );
      out.write("  </a> </td>\n");
      out.write("  	<td> ");
      out.print( name.elementAt(j) );
      out.write("</td>\n");
      out.write("  	<td> ");
      out.print( inputdate.elementAt(j) );
      out.write("</td>\n");
      out.write("  	<td> ");
      out.print( readcount.elementAt(j) );
      out.write("</td>\n");
      out.write("  </tr>\n");
      out.write("  \n");
      out.write("  ");

	}
  
  
      out.write("\n");
      out.write("  \n");
      out.write("  \n");
      out.write("<!-- JSP 코드 블락  : DB의 레코드를 가져와서 루프 : 끝  -->\n");
      out.write("\n");
      out.write(" </TABLE>\n");
      out.write(" \n");
      out.write(" <!--  페이징 출력 부분 : [처음][이전] 1 2 3 4 5 [다음][마지막] -->\n");
      out.write(" \n");
      out.write(" ");


	//  [처음][이전]
	if (wheregroup > 1){ 	//현재 나의 그룹이 1 이상일때 처음
		out.println ("[<a href='freeboard_list03.jsp?gogroup=1'>처음</a>]");
		out.println ("[<a href='freeboard_list03.jsp?gogroup="+priorgroup +"'>이전</a>]");
	}else {			// 현재 나의 페이지 그룹이 1일때는 
		out.println ("[처음]"); 
		out.println ("[이전]"); 
	}

	//페이징 갯수를 출력 : 1 2 3 4 5 
	
	if (name.size() != 0 ) {		//name.size() : 총 레코드의 갯수 가 0이 아니라면  
		for ( int jj = startpage; jj <= endpage ; jj++){
			if (jj == where) {		//jj 가 자신의 페이지 번호라면 링크 없이 출력
				out.println ("["+jj+"]"); 
			}else {		//jj가 현재 자신의 페이지 번호가 아니라면 링크를 걸어서 출력
				out.println ("[<a href=freeboard_list03.jsp?go="+ jj + ">" +jj+ "</a>]");
			}
		}
	}
	
	// [다음][마지막]
	if (wheregroup < totalgroup ) {  //링크를 처리
		out.println ("[<A href=freeboard_list03.jsp?gogroup="+ nextgroup + ">다음</A>]"); 
		out.println ("[<A href=freeboard_list03.jsp?gogroup="+ totalgroup + ">마지막]</A>"); 
	}else {  // 마지막 페이지에 왔을때 링크를 해지 
		out.println ("[다음]"); 
		out.println ("[마지막]"); 
	}
	
	out.println("전체 글수 : " + totalrows); 
	
 
      out.write("\n");
      out.write(" \n");
      out.write("\n");
      out.write("<FORM method=\"post\" name=\"msgsearch\" action=\"freeboard_search.jsp\">\n");
      out.write("<TABLE border=0 width=600 cellpadding=0 cellspacing=0>\n");
      out.write(" <TR>\n");
      out.write("  <TD align=right width=\"241\"> \n");
      out.write("   <SELECT name=stype >\n");
      out.write("    <OPTION value=1 >이름 </OPTION>\n");
      out.write("    <OPTION value=2 >제목	 </OPTION>\n");
      out.write("    <OPTION value=3 >내용 </OPTION>\n");
      out.write("    <OPTION value=4 >이름+제목 </OPTION>\n");
      out.write("    <OPTION value=5 >이름+내용 </OPTION>\n");
      out.write("    <OPTION value=6 >제목+내용 </OPTION>\n");
      out.write("    <OPTION value=7 >이름+제목+내용 </OPTION>\n");
      out.write("   </SELECT>\n");
      out.write("  </TD>\n");
      out.write("  <TD width=\"127\" align=\"center\">\n");
      out.write("   <INPUT type=text size=\"17\" name=\"sval\" >\n");
      out.write("  </TD>\n");
      out.write("  <TD width=\"115\">&nbsp;<a href=\"#\" onClick=\"check();\"><img src=\"image/serach.gif\" border=\"0\" align='absmiddle'></A></TD>\n");
      out.write("  <TD align=right valign=bottom width=\"117\"><A href=\"freeboard_write.jsp\"><img src=\"image/write.gif\" border=\"0\"></TD>\n");
      out.write(" </TR>\n");
      out.write("</TABLE>\n");
      out.write("</FORM>\n");
      out.write("\n");
      out.write("\n");
      out.write("</BODY>\n");
      out.write("</HTML>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
