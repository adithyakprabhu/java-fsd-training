<%@ include file="/init.jsp" %>
<portlet:defineObjects/>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<portlet:renderURL var="openPortletURL" copyCurrentRenderParameters="true"></portlet:renderURL>

<h1>This page Contains</h1>
<a href="${openPortletURL}">Render url created by liferay</a>