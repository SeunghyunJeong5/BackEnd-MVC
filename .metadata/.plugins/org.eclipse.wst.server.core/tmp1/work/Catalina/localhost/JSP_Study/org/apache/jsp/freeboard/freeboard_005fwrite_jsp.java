/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.76
 * Generated at: 2023-07-07 07:44:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.freeboard;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class freeboard_005fwrite_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
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
      out.write("\n");
      out.write("<HTML>                                         \n");
      out.write("    <HEAD>                                       \n");
      out.write("    <SCRIPT language=\"javascript\">                              \n");
      out.write("    function check(){                                         \n");
      out.write("     with(document.msgwrite){                      \n");
      out.write("      if(subject.value.length == 0){                  \n");
      out.write("       alert(\"제목을 입력해 주세요!!\");                       \n");
      out.write("       subject.focus();                           \n");
      out.write("       return false;                             \n");
      out.write("      }                                         \n");
      out.write("      if(name.value.length == 0){                   \n");
      out.write("       alert(\"이름을 입력해 주세요!!\");                  \n");
      out.write("       name.focus();                              \n");
      out.write("       return false;                                  \n");
      out.write("      }                                         \n");
      out.write("      if(password.value.length == 0){              \n");
      out.write("       alert(\"비밀번호를 입력해 주세요!!\");              \n");
      out.write("       password.focus();                            \n");
      out.write("       return false;                               \n");
      out.write("      }                                        \n");
      out.write("      if(content.value.length == 0){                    \n");
      out.write("       alert(\"내용을 입력해주세요!!\");                   \n");
      out.write("       content.focus();                         \n");
      out.write("       return false;                           \n");
      out.write("      }                                        \n");
      out.write("      document.msgwrite.submit();                       \n");
      out.write("     }                                          \n");
      out.write("    }                                            \n");
      out.write("    </SCRIPT>                                    \n");
      out.write("    <link href=\"filegb.css\" rel=\"stylesheet\" type=\"text/css\">   \n");
      out.write("    </HEAD>                                       \n");
      out.write("    <BODY>                                        \n");
      out.write("    <P>                                           \n");
      out.write("    <FORM name=\"msgwrite\" method=\"post\" action=\"freeboard_save03.jsp\">    \n");
      out.write("    <CENTER>                                      \n");
      out.write("    <table width=\"600\"cellspacing=\"0\" cellpadding=\"2\">           \n");
      out.write("     <tr>                                        \n");
      out.write("      <td colspan=\"2\" bgcolor=\"#1F4F8F\" height=\"1\"></td>  \n");
      out.write("     </tr>                                        \n");
      out.write("     <tr>                                        \n");
      out.write("      <td colspan=\"2\" bgcolor=\"#DFEDFF\" height=\"20\" class=\"notice\">&nbsp;&nbsp;<font size=\"2\">새글 쓰기</font></td> \n");
      out.write("     </tr>                                       \n");
      out.write("     <tr>                                       \n");
      out.write("      <td colspan=\"2\" bgcolor=\"#1F4F8F\" height=\"1\"></td>   \n");
      out.write("     </tr>                                     \n");
      out.write("     <tr>                                        \n");
      out.write("      <td width=\"124\" height=\"30\" align=\"center\" bgcolor=\"#f4f4f4\">이름</td>   \n");
      out.write("      <td width=\"494\"  style=\"padding:0 0 0 10\"><input type=text name=name class=\"input_style1\"></td>      \n");
      out.write("     </tr>                                      \n");
      out.write("     <tr>                                         \n");
      out.write("      <td width=\"124\" align=\"center\"  bgcolor=\"#f4f4f4\">E-mail</td>  \n");
      out.write("      <td width=\"494\" style=\"padding:0 0 0 10\" height=\"25\"><input type=text name=email class=\"input_style1\"></td>               \n");
      out.write("     </tr>                                       \n");
      out.write("     <tr>                                        \n");
      out.write("      <td width=\"124\" align=\"center\"  bgcolor=\"#f4f4f4\">제 목</td>   \n");
      out.write("      <td width=\"494\" style=\"padding:0 0 0 10\" height=\"25\"><input type=text name=subject size=\"60\" maxlength=\"60\" class=\"input_style2\"></td>                                      \n");
      out.write("     </tr>                                        \n");
      out.write("     <tr>                             \n");
      out.write("      <td width=\"124\" height=\"162\" align=\"center\" valign=\"top\" bgcolor=\"#f4f4f4\" style=\"padding-top:7px;\">내 용</td>\n");
      out.write("      <td width=\"494\" valign=\"top\"  style=\"padding:5 0 5 10\">    \n");
      out.write("       <textarea cols=\"65\" rows=\"10\" name=content maxlength=\"2000\" class=\"textarea_style1\"></textarea>     \n");
      out.write("      </td>                                     \n");
      out.write("     </tr>                                        \n");
      out.write("     <tr>                                        \n");
      out.write("      <td width=\"124\" align=\"center\"  bgcolor=\"#f4f4f4\">암 호</td>  \n");
      out.write("      <td width=\"494\" style=\"padding:0 0 0 10\" height=\"25\">                   \n");
      out.write("       <input type=password name=password class=\"style1\"><br>(비밀번호를 입력하면 수정 또는 삭제가 가능합니다.)\n");
      out.write("      </td>                                       \n");
      out.write("     </tr>                                       \n");
      out.write("     <tr>                                       \n");
      out.write("      <td colspan=\"2\" height=\"1\" class='button'></td>                                  \n");
      out.write("     </tr>                                       \n");
      out.write("     <tr>              \n");
      out.write("      <td colspan=\"2\" height=\"1\" bgcolor=\"#1F4F8F\"></td>     \n");
      out.write("     </tr>                                      \n");
      out.write("     <tr>                                         \n");
      out.write("      <td colspan=\"2\" height=\"10\"></td>                                    \n");
      out.write("     </tr>                                          \n");
      out.write("     <tr>                                          \n");
      out.write("      <td colspan=\"2\" align=\"right\">                    \n");
      out.write("       <table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">                      \n");
      out.write("        <tr>                     \n");
      out.write("         <td width=\"28%\">&nbsp;</td>               \n");
      out.write("         <td width=\"51%\">&nbsp;</td>                \n");
      out.write("         <td width=\"12%\"><a href=\"#\" onClick=\"history.go(-1)\"><img src=\"image/cancle.gif\" width=\"46\" height=\"20\" border=\"0\"></td>\n");
      out.write("         <td width=\"9%\"><a href=\"#\" onClick=\"check();\"><img src=\"image/ok.gif\" width=\"46\" height=\"20\" border=\"0\"></a></td>\n");
      out.write("        </tr>\n");
      out.write("       </table>\n");
      out.write("      </td>\n");
      out.write("     </tr>\n");
      out.write("    </table>                                       \n");
      out.write("    </CENTER>                                            \n");
      out.write("    </FORM>                                        \n");
      out.write("    </BODY>                                        \n");
      out.write("    </HTML>  ");
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
