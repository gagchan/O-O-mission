<%@page import="java.util.Iterator"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="jdbc.lianjie" %>
<%@ page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>结果</title>
</head>
<body>
<h3>搜索结果如下：</h3>

<table style="text-align:center">
		<thead>
			<tr >
				<th style="background-color:#444;width:100px;"><h5 ><strong><font style="color:#ddd" >guitarID</font></strong></h5></th>
				<th style="background-color:#444;width:100px;"><h5 ><strong><font style="color:#ddd" >guitar弦数</font></strong></h5></th>
				<th style="background-color:#444;width:100px;"><h5 ><strong><font style="color:#ddd">guitar价格</font></strong></h5></th>
				<th style="background-color:#444;width:100px;"><h5 ><strong><font style="color:#ddd">guitar制造商</font></strong></h5></th>
				<th style="background-color:#444;width:100px;"><h5 ><strong><font style="color:#ddd">guitar模型</font></strong></h5></th>
				<th style="background-color:#444;width:100px;"><h5 ><strong><font style="color:#ddd">guitar种类</font></strong></h5></th>
				<th style="background-color:#444;width:100px;"><h5 ><strong><font style="color:#ddd">guitar后木</font></strong></h5></th>
				<th style="background-color:#444;width:100px;"><h5 ><strong><font style="color:#ddd">guitar上木</font></strong></h5></th>
			</tr>
		</thead>
		<tbody>
	<% 
		List<Integer> result = new ArrayList<Integer>(); 
		result = (ArrayList<Integer>)request.getAttribute("result");
		if(result.size()>0){
		Iterator<Integer> rs = result.iterator();
		Connection conn = lianjie.getConnection();
		PreparedStatement pstmt = null;
		String sql = "select * from guitar where id =?";
		try {
			while(rs.hasNext()){
				int i = rs.next();
// 				System.out.print("!!"+i);
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, i);
				ResultSet r = pstmt.executeQuery();
		 %>
		 <tr  >

		 <td >
		 <%=r.getInt("id") %>
		 </td>
		 
		 <td>
		 <%=r.getString("serialNumber") %>
		 </td>
		 
		 <td>
		 <%=r.getDouble("price") %>
		 </td>
		 
		 <td>
		 <%=r.getString("builder") %>
		 </td>
		 
		 <td>
		 <%=r.getString("model") %>
		 </td>
		 
		 <td>
		 <%=r.getString("type") %>
		 </td>
		 
		 <td>
		 <%=r.getString("backwood") %>
		 </td>
		 
		 <td>
		 <%=r.getString("topwood") %>
		 </td>
		 <td>
		 </td>
		 </tr>
		
		 <%
			}
		%>
		 共搜出<%=result.size() %>把符合的吉他。
		 <%
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}else{
		%>
		抱歉！ 并没有符合的吉他。
		<% 	
		}
	%>
	</tbody>
</table>

<a href="index.jsp" style="display:inline-block;margin-top:20px;">重新搜索</a>
</body>
</html>