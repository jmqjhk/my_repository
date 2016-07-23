<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="common/easyUI.jsp"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>主界面</title>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
<meta http-equiv="Cache-Control" content="no-store" />
<meta http-equiv="Pragma" content="no-cache" />
<meta http-equiv="Expires" content="0" />
</head>

<script type="text/javascript" charset="utf-8">
	//增加tab页
	function addNewTab(node) {
		var url = "<%=contentPath%>/page/common/unsupport.jsp";
		if (node.id=="queryTable") {
			url = "<%=contentPath%>/page/subpage/queryTable.jsp";
		}
		<%-- 
		else if (node.id=="otherOpt") {
			url = "<%=contentPath%>/page/subpage/modifyConfig.jsp";
		}
		 --%>
		$('#myTabs').tabs('add', {
			title : node.text,
			id : node.id + 'Tab',
			closable : true,
			fit : true,
			href : url
		});
	}
	
	//初始化Tree控件，增加onclick事件
	function initTreeControl() {
		$('#treeList').tree({
			onClick : function(node) {
				if (node.text != "主菜单") {
					if ($('#myTabs').tabs('exists', node.text)) {
						$('#myTabs').tabs('select', node.text);
					} else {
						addNewTab(node);
					}
				}
			}
		});
	}

	//启动运行
	$(function() {
		initTreeControl();
	})
</script>

<body class="easyui-layout">
	<div data-options="region:'west',title:'菜单',split:false" style="width: 200px;">
		<div class="easyui-accordion" data-options="fit:true,border:false">
			<div title="查找" style="padding: 10px;" data-options="iconCls:'icon-search'">
				<ul id="treeList" class="easyui-tree">
					<li id="queryTable">表查询操作</li>
					<li id="otherOpt">其他操作</li>
				</ul>
			</div>
			<div title="其他" style="padding: 10px;"></div>
		</div>
	</div>
	<div data-options="region:'center',title:'主窗口'" style="padding: 5px; background: #eee;">
		<div id="myTabs" class="easyui-tabs" data-options="fit:true">
			<div id="mainTab" title="主页" style="fit: true" ></div>
		</div>
	</div>
</body>
</html>