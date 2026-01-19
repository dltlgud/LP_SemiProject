<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% String ctxPath = request.getContextPath(); %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8" />
  <link rel="stylesheet" href="<%= ctxPath%>/css/common/header.css">
  <script src="https://code.jquery.com/jquery-3.7.1.min.js"></script>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.7.1/css/all.min.css">
</head>
<body>
  <div class="bg-art" aria-hidden="true"></div>
  <div class="wrap">
   <header class="topbar" style="border-bottom: 2px solid #d32f2f;"> <div class="logo">
       <a href="<%= ctxPath%>/index.lp"><img src="<%= ctxPath%>/images/logo.png" alt="HOME"></a>
       <span style="font-weight:bold; color:#d32f2f; margin-left:10px;">ADMIN</span> </div>

     <nav class="navlinks">
       <a href="<%= ctxPath%>/index.lp">HOME</a> |
       <a href="<%= ctxPath %>/login/logout.lp">LOGOUT</a> |
       <a href="<%= ctxPath%>/admin/admin_member.lp">ADMINPAGE</a>
     </nav>

     <button class="nav-toggle" type="button"><i class="fa-solid fa-bars"></i></button>
     
     <nav class="navlinks-mobile">
        <a href="<%= ctxPath%>/index.lp">HOME</a>
        <a href="<%= ctxPath %>/login/logout.lp">LOGOUT</a>
        <a href="<%= ctxPath%>/admin/admin_member.lp">ADMINPAGE</a>
     </nav>
   </header>