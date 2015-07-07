<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>resetful test</title>
    <script type="text/javascript" src="js/jquery-1.11.1.min.js"></script>
    <script type="text/javascript">
        function getUser() {
            $.ajax({
                url : "user/1",
                type : 'GET',
                dataType : 'json',
                contentType : 'application/json',
                success : successFunc,
                error : errorFunc
            });
        }
        function getUserList() {
            $.ajax({
                url : "user",
                data : JSON.stringify({'username':'user'}),
                type : 'PATCH',
                dataType : 'json',
                contentType : 'application/json',
                success : successFunc,
                error : errorFunc
            });
        }

        function addUser() {
            $.ajax({
                url : "user",
                data : JSON.stringify({'userId':1, 'email':'user1@xxx.com', 'telephone':'1234567', 'username':'user1', 'password':'123456', 'sex':'男'	}),
                type : 'POST',
                dataType : 'json',
                contentType : 'application/json',
                success : successFunc,
                error : errorFunc
            });
        }
        function updateUser() {
            $.ajax({
                url : "user",
                data : JSON.stringify({'userId':1, 'email':'user1@xxx.com', 'telephone':'1234567', 'username':'user1_newName', 'password':'123456', 'sex':'男'	}),
                type : 'PUT',
                async : true,
                dataType : 'json',
                contentType : 'application/json',
                success : successFunc,
                error : errorFunc
            });
        }
        function deleteUser() {
            $.ajax({
                url : "user/1",
                type : 'DELETE',
                dataType : 'json',
                contentType : 'application/json',
                success : successFunc,
                error : errorFunc
            });
        }
        function successFunc(data) {
            $("#msg").text(JSON.stringify(data))
        }

        function errorFunc(data) {
            $("#msg").text(JSON.stringify(data))
        }

    </script>
</head>
<body>
<input type="button" onclick="getUser();" value="get user"><br>
<input type="button" onclick="getUserList();" value="get user list"><br>
<input type="button" onclick="addUser();" value="add user"><br>
<input type="button" onclick="updateUser();" value="update user"><br>
<input type="button" onclick="deleteUser();" value="delete user"><br>
<div id="msg"></div>
</body>
</html>