<!-- <%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%> -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>데이터창고</title>
</head>
<body>
<%
  // 복약 정보
  int dataSize = 0;
  int dataLastNumber = 1;

	String[] uniqueNumList = new String[100];
  String[] seperateList = new String[100];
  String[] timeLineList = new String[100];

  uniqueNumList[dataSize] = "001";
  seperateList[dataSize] = "아침";
  timeLineList[dataSize] = "2024.06.11 09:12";

  dataSize += 1;
  
  dataLastNumber = 2;
%>
</body>
</html>