function insertnewrecord(data){
    var table=document.getElementById("doctorlist").getElementsByTagName("tbody")[0];
    var newrow=table.insertRow(table.lenght);
    cell1=newrow.insertCell(0);
    cell1.innerHTML=data.did;
    cell2=newrow.insertCell(1);
    cell2.innerHTML=data.dname;
    cell3=newrow.insertCell(2);
    cell3.innerHTML=data.regdate;
    cell4=newrow.insertCell(3);
    cell4.innerHTML=data.daddress;
    cell5=newrow.insertCell(4);
    cell5.innerHTML=data.demail;
    cell6=newrow.insertCell(5);
    cell6.innerHTML=data.dtele;
    cell7=newrow.insertCell(6);
    cell7.innerHTML=data.dqulification;
    cell8=newrow.insertCell(6);
    cell7.innerHTML='<a>Update </a> <a> Delete</a>;'
     


}