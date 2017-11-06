<!DOCTYPE html>
<html>
<head>
    <title>goeasy</title>
</head>
<body>

<%--<script type="text/javascript" src="goeasy.js"></script>--%>
<script type="text/javascript" src="https://cdn-hangzhou.goeasy.io/goeasy.js"></script>
<script type="text/javascript">

    var goEasy = new GoEasy({appkey: 'BS-970f409c26d34cf6ab1d7f51faeff341'});

    goEasy.subscribe({
        channel: '系统通知',
        onMessage: function (message) {
            alert('收到：' + message.content);
        }
    });

    goEasy.subscribe({
        channel: 'chat',
        onMessage: function (message) {
            alert('收到：' + message.content);
        }
    });

    var pi = 3.14;
    var name = "Bill Gates";
    var answer = 'Yes I am!';
    document.write(pi + "<br>");
    document.write(name + "<br>");
    document.write(answer + "<br>");

</script>


</body>
</html>