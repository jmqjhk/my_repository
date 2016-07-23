<%@ page
	language="java"
	contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../common/easyUI.jsp"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<title>主界面</title>
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
<p><b>Values: </b></p>
	<div
		class="easyui-panel"
		style="width: 100%; padding: 20px 20px;">
		<!-- 
		<div style="margin-bottom: 5px">
		 -->
		<form id="queryform" action="QueryTable.do" method="post">
			<label style="font-size: 15px;">逻辑ID</label>
			<input
				id="logicId"
				name="logicId"
				class="easyui-textbox"
				style="width: 200px; height: 30px"> 
			<label style="font-size: 15px;">宽带帐号</label> 
			<input
				id="pppUsername"
				name="pppUsername"
				class="easyui-textbox"
				style="width: 200px; height: 30px"> 
			<label style="font-size: 15px;">设备序列号</label> 
			<input
				id="serialNumber"
				name="serialNumber"
				class="easyui-textbox"
				style="width: 200px; height: 30px">
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<a
				id="searchBtn"
				class="easyui-linkbutton"
				data-options="iconCls:'icon-search'"
				style="width: 100px; height: 30px">Search</a>
		</form>
		<!-- 		
		</div>
		 -->
	</div>
	<div
		class="easyui-panel"
		style="width: 100%; height: 400px;">
		<table
			id="dp_grid"
			class="easyui-datagrid"
			style="width: 100%; height: 100%"
			title="device_preconfig"
			sortName="itemid"
			sortOrder="asc"
			rownumbers="true"
			pagination="true">
			<thead>
				<tr>
					<th
						field="itemid"
						width="80"
						sortable="true">columnA</th>
					<th
						field="productid"
						width="100"
						sortable="true">columnB</th>
				</tr>
			</thead>
		</table>
	</div>
	<script
		src="<%=contentPath%>/js/queryTable.js"
		type="text/javascript"></script>
</body>
</html>