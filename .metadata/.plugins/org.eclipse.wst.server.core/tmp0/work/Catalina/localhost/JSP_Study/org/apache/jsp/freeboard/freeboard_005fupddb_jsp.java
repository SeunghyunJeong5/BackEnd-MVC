/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.76
 * Generated at: 2023-07-07 06:43:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.freeboard;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.sql.*;

public final class freeboard_005fupddb_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
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
      out.write(' ');
      out.write('\n');
 request.setCharacterEncoding("UTF-8"); 
      out.write('\n');
      out.write('\n');

	int id = Integer.parseInt(request.getParameter("id"));
	String p = request.getParameter("page"); 
	
	//폼에서 수정되어 넘어오는 변수의 값을 재 할당 
	
	String na = request.getParameter("name"); 
	String em = request.getParameter("email"); 
	String sub = request.getParameter("subject"); 
	String cont = request.getParameter("content"); 
	String pw = request.getParameter("password"); 
	
	//out.println (id + "<p/>"); 
	//out.println (p + "<p/>"); 
	
	//if (true) return; 


      out.write("\n");
      out.write("    \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>글 수정된 내용을 DB에 저장하는 페이지</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("[ <A href = \"freeboard_list03.jsp?go=");
      out.print( p );
      out.write("\" > 게시판 목록으로 </A>]\n");
      out.write("\n");

	String sql = null; 
	PreparedStatement pstmt = null; 
	ResultSet rs = null; 
	
	try {
	
	// DB에서 해당 id에 대한 password를 가저와서 폼에서 전송된 password와 확인 
	sql = "select * from freeboard where id = ?"; 
	pstmt = conn.prepareStatement(sql); 
	pstmt.setInt(1, id); 
	rs = pstmt.executeQuery(); 
	
	//rs 는 DB에서 password 필드의 값을 가져와서 폼에서 넘겨받은 password와 비교후 같으면 update
	if (!(rs.next())){ //rs의 값이 존재 하지 않을때
		out.println ( "DB에 해당 내용이 존재하지 않습니다"); 
	}else { //rs의 값이 존재 할때 
		String pwd = rs.getString("password"); 
			//pwd : DB의 password
			//pw : Form에서 넘겨받은 password 
			/*
			out.println ("<p/>" +  pwd + "<p/>"); 
			out.println (pw + "<p/>"); 
			out.println (pwd.equals(pw));       두값이 같으면 true , 다르면 false 
		
			if (true) return; 
			*/
			if (pwd.equals(pw)){
				//update 진행 
				sql = "update freeboard set name=?, email=?,"; 
				sql += "subject=?, content=? where id =?"; 
				pstmt = conn.prepareStatement(sql); 
				pstmt.setString(1, na); 
				pstmt.setString(2, em); 
				pstmt.setString(3, sub); 
				pstmt.setString(4, cont); 
				pstmt.setInt(5, id); 
				
				pstmt.executeUpdate(); 
				
				out.println ("<p/> 내용이 잘 수정 되었습니다."); 
				
			} else {
				//패스워드가 다릅니다 출력 
				out.println ("패스워드가 일치 하지 않습니다."); 
			}
	}
	
	} catch (Exception e){
		out.println ("DB 저장시 오류가 발생되었습니다. "); 
		e.printStackTrace(); 
		
	} finally {
		if (conn != null) conn.close(); 
		if (pstmt != null) pstmt.close();
		if (rs != null) rs.close();
	}
	



      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
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
