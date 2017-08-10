<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/common/common.jsp" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
    <div id="bookNumber">共有${sessionScope.ShoppingCart.bookNumber}本书</div>
    <table>
        <tr>
            <td>title</td>
            <td>quantity</td>
            <td>price</td>
            <td>&nbsp;&nbsp;</td>
        </tr>

        <c:forEach items="${sessionScope.ShoppingCart.items }"  var="item">
            <tr>
                <td>${item.book.title}</td>
                <td>${item.quantity}</td>
                <td>${item.book.price}</td>
                <td><a href="bookServlet?method=remove&bookId=${item.book.id}&pageNo=${pageNo}">删除</a></td>
            </tr>
        </c:forEach>


        <tr>
            <td>总金额：￥ ${sessionScope.ShoppingCart.totalMoney}</td>
        </tr>

        <tr>
            <td>
                <a href="bookServlet?method=getBooks&pageNo=${param.pageNo}">继续购物</a>
            </td>

            <td>
                <a href="bookServlet?method=clearCart">清空购物车</a>
            </td>

            <td>
                <a href="bookServlet?method=cash">结账</a>
            </td>

        </tr>
    </table>
</center>
</body>
</html>
