<%@ page import="com.hy.book.domain.ShoppingCart" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/common/common.jsp" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Title</title>
    <script type="text/javascript" src="/WEB-INF/script/jquery-1.7.2.min.js"></script>
</head>
<body>
<center>
    <%
        //String s = (String) request.getAttribute("bookTitle");
        //String ss = request.getParameter("bookTitle");
        ShoppingCart shoppingCart = (ShoppingCart) session.getAttribute("ShoppingCart");
        int num = 0;
        if (shoppingCart == null) {
            System.out.println("shopping=null");
        } else {
            num = shoppingCart.getBookNumber();
        }
        System.out.println("num=" + num);
        //System.out.println(s);
        //System.out.println(ss);
    %>
    <c:if test="${param.bookTitle !=null}">
        你已经将${param.bookTitle}放入购物车。
    </c:if>
    <br><br>
    <c:if test="${!empty sessionScope.ShoppingCart.books}">
        你的购物车里有${sessionScope.ShoppingCart.bookNumber} 本书,<a href="bookServlet?method=forwardPage&pageNo=${page.pageNo}&page=cart">查看购物车</a>
    </c:if>

    <form action="bookServlet?method=getbooks">
        <input type="text" size="1" name="minPrice"/>
        <input type="text" size="1" name="maxPrice"/>
        <input type="submit" name="submit"/>
    </form>

    <table cellpadding="10">
        <c:forEach items="${page.list}" var="book">
            <tr>
                <td>
                    <a href="bookServlet?method=getBookDetails&pageNo=${page.pageNo}&bookId=${book.id}"> ${book.title}</a>
                    <br>
                        ${book.author}
                        ${book.price}
                </td>

                <td>
                    <a href="bookServlet?method=addToCart&pageNo=${page.pageNo}&bookId=${book.id}&bookTitle=${book.title}">加入购物车</a>
                </td>
            </tr>
        </c:forEach>
    </table>

    一共${page.totalPageNumber}页
    &nbsp;&nbsp;
    当前${page.pageNo}页
    &nbsp;&nbsp;

    <c:if test="${page.hasPrev}">
        <a href="bookServlet?method=getBooks&pageNo=1">首页</a>
        &nbsp;&nbsp;
        <a href="bookServlet?method=getBooks&pageNo=${page.prevPage}">下一页</a>
    </c:if>


    <c:if test="${page.hasNext}">
        <a href="bookServlet?method=getBooks&pageNo=${page.totalPageNumber}">末页</a>
        &nbsp;&nbsp;
        <a href="bookServlet?method=getBooks&pageNo=${page.nextPage}">下一页</a>
    </c:if>

    转到<input id="pageNo" type="text" size="1">页
</center>


</body>
</html>