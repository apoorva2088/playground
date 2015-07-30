<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    
    <style type="text/css">
    
    body {
      color:#000000;
      background-color:orange;
      background-image:url('Background Image');
      background-repeat:no-repeat;
	  
    }
    a  { color:#0000FF; }<input type="radio" name="" value="">
    a:visited { color:#800080; }
    a:hover { color:#008000; }
    a:active { color:#FF0000; }
 
    </style>
    
  </head>
  <body>
  <s:form action="SummaryPage" method="post">
  
  <h1 style="text-align:center">OnesiesForm</h1>

 
FullName : <input type="text" name="fullname" value="">  Date : <input type="text" name="date" value=""><br />
<h4>Note to teacher from parents  : </h4><textarea name="note" rows="" cols=""></textarea> <br />
<h3>Today I was : </h3>
Happy :<input type="checkbox" name="" value=""> Energetic: <input type="checkbox" name="" value=""> Cuddly: <input type="checkbox" name="" value=""> 
Time I went to bed : <input type="text" name="" value=""> <br />
<br />
Quiet: <input type="checkbox" name="" value=""> Irritable : <input type="checkbox" name="" value=""> Aggresive: <input type="checkbox" name="" value=""> 
 Time I woke up : <input type="text" name="" value="">
<br /> 
Tired : <input type="checkbox" name="" value=""> Emotional : <input type="checkbox" name="" value=""> Playful : <input type="checkbox" name="" value="">
<br />
<h3>at Nap time :</h3>                                                   

I Slept from <input type="text" name="sleptfrom" value=""> to <input type="text" name="sleepto" value="">
<br />
<br />I rested quietly : <input type="text" name="" value="">
<br />
<br /> I was restless : <input type="text" name="" value="">
<h3> I need :</h3>
Diapers : <input type="text" name="" value=""><br />
<br />
Wipes : <input type="text" name="" value=""><br />
<br />
Change of clothes : <input type="text" name="" value=""><br />
<br />
Others : <input type="text" name="" value=""><br />
<br />
<h3> Snack Time :</h3>
A.M snack time : <input type="text" name="" value="">  We ate : <input type="text" name="" value=""> <br />
<br />
P.M snack time : <input type="text" name="" value=""> We ate : <input type="text" name="" value=""> <br />
<br />

<div style=" text-align: left; text-indent: 0px; padding: 0px 0px 0px 0px;
 margin: 0px 0px 0px 0px;"><table width="0" border="1" cellpadding="2" 
 cellspacing="2" style="border-color: #000000; 
 border-style: solid; background-color: ;">
<tr valign="top">
<style>
table, th, td {
    border: 1px solid black;
    border-collapse: collapse;
}
th, td {
    padding: 5px;
}
</style>
<table style="width:80%">
  <tr>
    <th>at lunch today I ate</th>
    <th>all</th> 
    <th>most</th>
	<th>some</th>
	<th>none</th>
  </tr>
<td width="213" style=""><input type="text" name="" value=""><br />
</td>
<td width="65" style=""><input type="text" name="" value=""><br />
</td>
<td width="71" style=""><input type="text" name="" value=""><br />
</td>
<td width="80" style=""><input type="text" name="" value=""><br />
</td>
<td width="64" style=""><input type="text" name="" value=""><br />
</td>
</tr>
<td width="213" style=""><input type="text" name="" value=""><br />
</td>
<td width="65" style=""><input type="text" name="" value=""><br />
</td>
<td width="71" style=""><input type="text" name="" value=""><br />
</td>
<td width="80" style=""><input type="text" name="" value=""><br />
</td>
<td width="64" style=""><input type="text" name="" value=""><br />
</td>
</tr>
<td width="213" style=""><input type="text" name="" value=""><br />
</td>
<td width="65" style=""><input type="text" name="" value=""><br />
</td>
<td width="71" style=""><input type="text" name="" value=""><br />
</td>
<td width="80" style=""><input type="text" name="" value=""><br />
</td>
<td width="64" style=""><input type="text" name="" value=""><br />
</td>
</tr>
<tr valign="top">
<td width="213" style=""><input type="text" name="" value=""><br />
</td>
<td width="65" style=""><input type="text" name="" value=""><br />
</td>
<td width="71" style=""><input type="text" name="" value=""><br />
</td>
<td width="80" style=""><input type="text" name="" value=""><br />
</td>
<td width="64" style=""><input type="text" name="" value=""><br />
</td>
</tr>
<td width="213" style=""><input type="text" name="" value=""><br />
</td>
<td width="65" style=""><input type="text" name="" value=""><br />
</td>
<td width="71" style=""><input type="text" name="" value=""><br />
</td>
<td width="80" style=""><input type="text" name="" value=""><br />
</td>
<td width="64" style=""><input type="text" name="" value=""><br />
</td>
</tr>
<tr valign="top">
<td width="213" style="border-color : #000000 #000000 #000000 #000000; border-style: solid;"><br />
</td>
<td width="65" style="border-color : #000000 #000000 #000000 #000000; border-style: solid;"><br />
</td>
<td width="71" style="border-color : #000000 #000000 #000000 #000000; border-style: solid;"><br />
</td>
<td width="80" style="border-color : #000000 #000000 #000000 #000000; border-style: solid;"><br />
</td>
<td width="64" style="border-color : #000000 #000000 #000000 #000000; border-style: solid;"><br />
</td>
</tr>
</table>
</div>


<h3> Diaper Changes </h3>
<h5>Time: <input type="text" name="" value="">  Wet - Dry - BM </h5>
<h5>Time: <input type="text" name="" value="">  Wet - Dry - BM </h5>
<h5>Time: <input type="text" name="" value="">  Wet - Dry - BM </h5>
<h5>Time: <input type="text" name="" value="">  Wet - Dry - BM </h5>
<h5>Time: <input type="text" name="" value="">  Wet - Dry - BM </h5>
<h5>BM: Bowel Movement</h5>
<h3> Comments </h3> 
<textarea name="" rows="" cols=""></textarea>

</br>
</br>
   
<input type="submit" value="submit"/>	

</tr></table></div></s:form>

  </body>
</html>