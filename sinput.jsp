<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>    
<meta charset="UTF-8">
<title>ユーザー登録</title>
</head>
<body>
    <h1>ユーザー登録</h1>
    <form method="post" action="./registtest">
        ユーザー名<input type="text" name="name"><br>
        好きな食べ物<input type="text" name="food"><br>
        <input type="submit" value="登録" />
    </form>
</body>
</html>