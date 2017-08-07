package com.hy.book.filter;



import com.hy.book.db.JDBCUtils;
import com.hy.book.web.ConnectionContext;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Servlet Filter implementation class TranactionFilter
 */
public class TranactionFilter implements Filter {

    /**
     * Default constructor. 
     */
    public TranactionFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		Connection connection = null;
		
		try {
			
			//1. ��ȡ����
			connection = JDBCUtils.getConnection();
			
			//2. ��������
			connection.setAutoCommit(false);
			
			//3. ���� ThreadLocal �����Ӻ͵�ǰ�̰߳�
			ConnectionContext.getInstance().bind(connection);
			
			//4. ������ת��Ŀ�� Servlet
			chain.doFilter(request, response);
			
			//5. �ύ����
			connection.commit();
		} catch (Exception e) {
			e.printStackTrace();
			
			//6. �ع�����
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			
			HttpServletResponse resp = (HttpServletResponse) response;
			HttpServletRequest req = (HttpServletRequest) request;
			resp.sendRedirect(req.getContextPath() + "/error-1.jsp");
			
		} finally{
			//7. �����
			ConnectionContext.getInstance().remove();
			
			//8. �ر�����
			JDBCUtils.release(connection);
			
		}
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
