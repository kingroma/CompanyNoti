<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" 		uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form"      uri="http://www.springframework.org/tags/form" %> 


<link href="<c:url value='/resources/vendor/datatables/dataTables.bootstrap4.min.css'/>" rel="stylesheet">

<form:form commandName="notiVO" name="frm1" id="frm1" method="POST" >
	<form:hidden path="notiId"/>

	<div class="d-sm-flex align-items-center justify-content-between mb-4">
		<h1 class="h3 mb-0 text-gray-800">Register</h1>
		<a href="javascript:insert()" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm">
			Submit
		</a>
	</div>
	<div class="card shadow mb-4">
	  	<div class="card-header py-3">
	    	<h6 class="m-0 font-weight-bold text-primary"></h6>
	  	</div>
	  	<div class="card-body">
	    	<div class="table-responsive">
	      		<table class="table table-bordered table-hover" id="dataTable" width="100%" cellspacing="0">
	      			<colgroup>
	      				<col width='15%'/>
	      				<col width='35%'/>
	      				<col width='15%'/>
	      				<col/>
	      			</colgroup>
	       			<thead>
	       				<tr>
	       					<th class='text-center' style='vertical-align:middle'>
      							<div>Title</div>
      						</th>
	       					<td colspan="3">
	       						<form:input path="notiTitle" cssClass="form-control"/>
	       					</td>
	       				</tr>
	       				<tr>
      						<th class='text-center' style='vertical-align:middle'>
      							<div>Nick Name</div>
      						</th>
	       					<td >
	       						<form:input path="notiNickName" cssClass="form-control"/>
	       					</td>
	       					<td colspan="2"> </td>
	       				</tr>
	       				<tr>
	       					<td colspan="4">
	       						<textarea rows="10" id="notiText" class="form-control"></textarea>
	       					</td>
	       				</tr>
	       			</thead>
	     		</table>
			</div>
		</div>
	</div>
</form:form>
<script src="<c:url value='/resources/vendor/datatables/jquery.dataTables.min.js'/>"></script>
<script src="<c:url value='/resources/vendor/datatables/dataTables.bootstrap4.min.js'/>"></script>

<script>
	$(document).ready(function() {
	  // $('#dataTable').DataTable();
		autosize(document.getElementById('notiText'));
	});
	
	function insert() {
		goAction("/noti/insert.do");	
	}
</script>

