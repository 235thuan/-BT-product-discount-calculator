<%--
  Created by IntelliJ IDEA.
  User: thuan
  Date: 12/4/19
  Time: 11:55 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product Discount Calculator</title>
</head>
<body>
<h1>Product Discount Calculator</h1>
<form action="/discount" method="post">
    <div style="border: solid blue;width: 300px">
        <p>Product Description:
            <input type="text" name="des" placeholder="Product Description: "/></p>
        <p>List Price:
            <input type="text" name="listprice" value="0"/></p>
        <p>Discount percent
            <input type="text" name="rate" value="0"/> (%)</p>

        <p><input type="submit" id="submit" value="Calculator Discount: "/>
        </p>
    </div>
</form>
</body>
</html>
