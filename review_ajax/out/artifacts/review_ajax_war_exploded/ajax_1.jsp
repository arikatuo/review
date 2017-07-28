<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2017/7/20
  Time: 8:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<script>
    function showtxt(s) {
        var xmlhttp;
        if(s.length==0){
            document.getElementById("txtHit").innerHTML="";
            return;
        }
        if(window.XMLHttpRequest){
            xmlhttp=new XMLHttpRequest();
        }else if(window.ActiveXObject){
            xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
        }

        xmlhttp.onreadystatechange=function () {
            if(xmlhttp.readyState==4&&xmlhttp.status==200){
                document.getElementById("txtHit").innerHTML=xmlhttp.responseText;
            }
        }

        xmlhttp.open("GET","/ajax_info.txt",true);

        xmlhttp.send();

    }
</script>


<input type="text" onkeyup="showtxt(this.value)">

<span id="txtHit" ></span>
</body>
</html>
