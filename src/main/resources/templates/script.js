function onformSubmit(){
    var formData=readformData();
    insertnewrecord(formData);
}


function readformData(){
    var formData={};
    formData["did"]=document.getElementById("did").value;
    formData["dname"]=document.getElementById("dnamr").value;
    formData["regdate"]=document.getElementById("regdate").value;
    formData["daddress"]=document.getElementById("daddress").value;
    formData["demail"]=document.getElementById("demail").value;
    formData["dtele"]=document.getElementById("dtele").value;
    formData["dqulification"]=document.getElementById("dqulification").value;
    return formData;
}
