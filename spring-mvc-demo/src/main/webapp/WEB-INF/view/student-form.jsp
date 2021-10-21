<%--
  Created by IntelliJ IDEA.
  User: developer
  Date: 16-10-2021
  Time: 07:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Student Registration Form</title>
</head>
<body>
<form:form action="processForm" modelAttribute="student">
    First Name : <form:input path="firstName"/>
    <br>
    <br>
    Last Name : <form:input path="lastName"/>
    <br>
    <br>
    Country :
    <form:select path="country">
        <form:options items="${student.countryOptions}"/>
    </form:select>
    <%--    TODO Use properties file to load country options
     https://www.udemy.com/course/spring-hibernate-tutorial/learn/lecture/5940154#overview--%>
    <form:radiobuttons items="${student.favoriteLanguageOptions}" path="favoriteLanguage"/>
    Preferred OS : <form:checkboxes path="operatingSystems"
                                    items="${student.operatingSystemOptions}"/>
    <input type="submit">
</form:form>
</body>
</html>