<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

		<h1>Add New Student</h1>
       <form:form method="post" action="save">  
      	<table >  
         <tr>  
          <td>Name : </td> 
          <td><form:input path="name"  /></td>
         </tr>  
         <tr>  
           <tr>  
          <td>Age : </td> 
          <td><form:input path="age"  /></td>
         </tr> 
         <tr> 
          <td>Place :</td>  
          <td><form:input path="place" /></td>
         </tr> 
         <tr>  
          <td>Marks :</td>  
          <td><form:input path="marks" /></td>
         </tr> 
         
         <tr>  
          <td> </td>  
          <td><input type="submit" value="Save" /></td>  
         </tr>  
        </table>  
       </form:form>  
