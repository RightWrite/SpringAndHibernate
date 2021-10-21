<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Student Registration Form</title>
</head>
<body>
The student is confirmed : ${student.firstName} ${student.lastName}
<br>
<br>
Student is from : ${student.country}
<br>
<br>
Favorite Language : ${student.favoriteLanguage}<br>
<br>
Known Operating Systems: : ${student.operatingSystems}
</body>
</html>