// TODO: README.md 파일에 안내된 가이드에 따라 자바스크립트 코드를 작성해주세요

var gCallback = function(){};

function reqListener () {
	//console.log(this.responseText);
	var result = JSON.parse(this.responseText);
	toIdPostArray(result);
}

function get(url, callback) {
	gCallback = callback;
	
	var oReq = new XMLHttpRequest();
	oReq.addEventListener("load", reqListener);
	oReq.open("GET", url);
	oReq.send();
}

function toIdPostArray(org) {
	var result = [];

	org.forEach(function(target){ 
		
		var user = result.find(function(o) {
			return o.userId == target.userId;
		});
		
		if( null == user ) {
			user = {
				userId: target.userId,
				postTitles: []
			};
			result.push( user );
		}
		
		user.postTitles.push({
			title: target.title,
		 });
	});

	console.log(result);
	gCallback(JSON.stringify(result));
}