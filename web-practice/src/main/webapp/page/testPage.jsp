<%@ page
	language="java"
	contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="common/easyUI.jsp"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<title>测试界面</title>
<meta
	http-equiv="Content-Type"
	content="text/html;charset=UTF-8">
<meta
	http-equiv="Cache-Control"
	content="no-store" />
<meta
	http-equiv="Pragma"
	content="no-cache" />
<meta
	http-equiv="Expires"
	content="0" />
</head>

<body class="easyui-layout">
	<div
		class="easyui-panel"
		style="width: 100%; padding: 20px 20px;">
		<h1>this is a test page</h1>
		<h2>loid:${requestScope.loid}</h2>
		<h2>username:${requestScope.username}</h2>
		<h2>sn:${requestScope.sn}</h2>
	</div>
</body>
</html>