/**
 *  author Thong
 */
function getData(){
	
}
$.ajax({
		type: 'GET',
		dataType: "json", 
		url: "http://localhost:8080/open4um/thong",
		success : function (data){
      			//console.log(data);
				var str = "";
				str += "<table border='1' width='100%' action='upload'>"
                str += "<tr>"
                str += "<th>USER NAME</th>"
				str += "<th>Sub</th>"
                str += "<th>DATE</th>"
                str += "</tr>"
				$.each(data, function(key, value) {
				str += "<tr>";
				str += "<td>" + value.username + "</td>";
				str += "<td>" + value.content + "</td>";
				str += "<td>" + value.datemsg + "</td>";
				str += "</tr>";
								});
				str += "</table>"
			$("#listMessage").html(str);
 	}
});

