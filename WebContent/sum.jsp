<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
<head>
<title>输入操作数</title>

<script>
	function changetext(id) {
		id.innerHTML = "谢谢!";
	}
</script>
</head>

<body>
	求代数和
	<br />
	<s:form action="mystruts/sum.action">
		<s:textfield name="operand1" label=" 操作数1" />
		<s:textfield name="operand2" label=" 操作数2" />
		<s:submit value="代数和" />
	</s:form>

	<h1 onclick="changetext(this)">请点击该文本</h1>

</body>
</html>