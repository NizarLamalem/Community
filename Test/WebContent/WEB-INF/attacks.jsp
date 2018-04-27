<%@page import="java.util.LinkedList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<% 
LinkedList<String> list = (LinkedList)request.getAttribute("attacks") ;
for(String attack : list){
	out.println("<li>".concat(attack).concat("</li><br>"));
}
%>