$(function() {
	init();
});

function init() {
	// 查询按钮绑定click事件
	searchBtnInit();
	// dp表data grid初始化
	dpDataGridInit();
}

function dpDataGridInit() {
	// dataGrid title 内容
	var dataGridName = "dp_grid";
	var colField = [ 'id', 'version', 'serialNumber', 'pppUsername', 'rgMode',
			'broadBandStatus', 'iptvStatus', 'voipStatus', 'wifiStatus',
			'broadBandPorts', 'iptvPorts', 'voipPorts', 'areaCode',
			'subAreaCode', 'contantName', 'address', 'phoneNumber',
			'serviceSet', 'rgType', 'psdRetryTimes', 'logicId',
			'authenticationCode', 'customerId', 'insertTime', 'updateTime',
			'userType', 'idNumber', 'email', 'lineInfo', 'cardNo',
			'cardEncryptCode', 'oldSerialNumber', 'oldPppUsername',
			'oldLogicId', 'wifiPorts', 'ssid_Inuse', 'gateStatus', 'gatePorts',
			'deviceinfoId' ];

	// dataGrid列名初始化
	dataGridInit(dataGridName, colField, colField);
}

function dataGridInit(gridName, colTitle, colField) {
	// 填入column内容
	var gridColumn = new Array();
	for ( var i in colTitle) {
		var column = new Object();
		column.field = colField[i];
		column.title = colTitle[i];
		column.width = 100;
		gridColumn[i] = column;
	}

	$('#' + gridName).datagrid({
		columns : [ gridColumn ]
	});
}

function searchBtnInit() {
	$('#searchBtn').bind(
			'click',
			function() {
				// 要发送的数据
				var jsondata = "{'uname':'" + $('#pppUsername').val()
						+ "','loid':'" + $('#logicId').val() + "','sn':'"
						+ $('#serialNumber').val() + "'}";

				// 发送请求
				$.ajax({
					url : 'QueryTable.do',
					type : 'post',
					dataType : 'json',
					contentType : 'application/json;charset=UTF-8',
					data : jsondata,
					success : function(data, textStatus) {
						//$("p").append(JSON.stringify(data));
						$('#dp_grid').datagrid({
							data : data
						});
					},
					error : function(XMLHttpRequest, textStatus, errorThrown) {
						alert('error:' + errorThrown);
					},
					complete : function(XMLHttpRequest, textStatus) {
						// alert('complete');
					}
				});
			});
}
