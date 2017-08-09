<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2017/8/8
  Time: 15:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/common/common.jsp" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
    <c:if test="${param.title!=null}">
        你已经将${param.title}放入购物车。
    </c:if>

    <c:if test="${!empty sessionScope.shopppingcart.books}">
        你的购物车里有${sessionScope.shoppingcart.bookNumber} 本书,<a href="bookServlet?method=forwardPage&pageNo=${bookPage.pageNo}">查看购物车</a>
    </c:if>


    <form action="bookServlet?method=getbooks">
        <input type="text" size="1" name="minPrice"/>
        <input type="text" size="1" name="maxPrice"/>
        <input type="submit" name="submit"/>
    </form>

    <table cellpadding="10">
        <c:forEach items="${bookPage.list}" var="book">
            <tr>
                <td>
                    <a href="bookServlet?method=getBookDetails&pageNo=${pageNo}&bookId=${book.id}"> ${book.title}</a>
                    <br>
                        ${book.author}
                        ${book.price}
                </td>

                <td>
                    <a href="bookServlet?method=addToCart?pageNo=${pageNo}&bookId=${book.id}">加入购物车</a>
                </td>
            </tr>
        </c:forEach>
    </table>

    一共${bookPage.totalItemNumber}页
    &nbsp;&nbsp;
    当前${bookPage.pageNo}页
    &nbsp;&nbsp;

    <c:if test="${bookPage.isHasPrev}">
        <a href="bookServlet?method=getbooks&pageNo=1">首页</a>
        &nbsp;&nbsp;
        <a href="bookServlet?method=getbooks&pageNo=${bookPage.getPrevPage}">下一页</a>
    </c:if>


    <c:if test="${bookPage.isHasNext}">
        <a href="bookServlet?method=getbooks&pageNo=${bookPage.getTotalPageNumber()}">末页</a>
        &nbsp;&nbsp;
        <a href="bookServlet?method=getbooks&pageNo=${bookPage.getNextPage}">下一页</a>
    </c:if>

    转到<input id="pageNo" type="text" size="1">页
</center>
</body>
</html>
