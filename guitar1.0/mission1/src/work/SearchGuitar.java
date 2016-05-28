package work;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jdbc.lianjie;

/**
 * Servlet implementation class SearchGuitar
 */
@WebServlet("/SearchGuitar")
public class SearchGuitar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchGuitar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		Connection conn = lianjie.getConnection();
		PreparedStatement pstmt = null;
		String model,builder,type,backwood,topwood;
		model=request.getParameter("model");
		builder=request.getParameter("builder");
		type=request.getParameter("type");
		backwood=request.getParameter("backwood");
		topwood=request.getParameter("topwood");
		List<Integer> result = new ArrayList<Integer>();
		StringBuffer sql = new StringBuffer();
		sql.append("select * from guitar where 1 = 1 ");
		if(!model.equals("")){
			sql.append(" and model= '"+model+ "' ");
		}
		if(type!=null){
			sql.append(" and type='"+type+"' ");
		}
		if(builder!=null){
			sql.append(" and builder= '"+builder+"' ");
		}
		if(backwood!=null){
			sql.append(" and backwood= '"+backwood+"' ");
		}
		if(topwood!=null){
			sql.append(" and topwood= '"+topwood+"' ");
		}
		
		sql.append(" order by id desc");
		
		
		try {
			pstmt = conn.prepareStatement(sql.toString());
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				result.add(rs.getInt("id"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("result", result);
		request.getRequestDispatcher("result.jsp").forward(request, response);
	}

}
