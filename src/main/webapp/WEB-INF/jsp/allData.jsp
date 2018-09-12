<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/4/6
  Time: 16:57
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String appPath = request.getContextPath(); %>
<html>
<head>
    <title>Paper列表</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    车间环境监测管理系统：
                </h1>
            </div>
        </div>
    </div>

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>数据列表 —— 显示所有数据</small>
                </h1>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-md-4 column">
            <a class="btn btn-primary" href="#">刷新</a>
        </div>
    </div>
    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>数据编号</th>
                    <th>温度</th>
                    <th>湿度</th>
                    <th>光照</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="sensor" items="${requestScope.get('list')}" varStatus="status">
                    <tr>
                        <td>${sensor.dId}</td>
                        <td>${sensor.temperature}</td>
                        <td>${sensor.humidity}</td>
                        <td>${sensor.illumination}</td>
                        <td>

                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>