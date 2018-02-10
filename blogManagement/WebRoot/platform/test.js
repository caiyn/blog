function test(){
	alert(222)
	$.ajax({
		url: 'test!test',
		type : 'post',
	    dataType : 'json',
	    success : function(){
			alert(111)
	    }
	})
}