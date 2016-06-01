<html>
<head>
<title>Registration details</title>
</head>
<body>
<center>

    <b>Username</b>
   <%= request.getParameter("uname")%><br>
    <b>email</b>
   <%= request.getParameter("umail")%><br>
    <b>password</b>
   <%= request.getParameter("upass")%>
</center>
</body>
</html>
