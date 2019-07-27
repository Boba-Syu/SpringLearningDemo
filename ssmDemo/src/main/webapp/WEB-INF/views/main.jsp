<%--
  Created by IntelliJ IDEA.
  User: 小米
  Date: 2019/7/23
  Time: 17:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
    <script>
        function ready() {
            table_load();
        }

        function table_load() {
            $.ajax({
                type: 'post',
                url: 'selectAll',
                timeout: 1000,
                dataType: 'json',
                success: function (data) {
                    var str = '';
                    for (var i = 0; i < data.length; i++) {
                        str += '<tr>'
                            + '<td>' + data[i].uid + '</td>'
                            + '<td>' + data[i].uname + '</td>'
                            + '<td>' + data[i].pwd + '</td>';
                    }
                    $(tableBody).html(str);
                },
                error: function () {
                    window.alert("加载失败");
                }
            })
        }
    </script>
</head>
<body onload="ready()">
<div>
    <table border="1">
        <thead>
        <th>ID</th>
        <th>姓名</th>
        <th>密码</th>
        </thead>
        <tbody id="tableBody"></tbody>
    </table>
</div>
</body>
</html>
