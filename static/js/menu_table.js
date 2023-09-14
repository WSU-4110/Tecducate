function edit_row(no)
{
 document.getElementById("edit_button"+no).style.display="none";
 document.getElementById("save_button"+no).style.display="block";

 var item=document.getElementById("item_row"+no);
 var condition=document.getElementById("condition_row"+no);
 var amount=document.getElementById("amount_row"+no);

 var item_data=item.innerHTML;
 var condition_data=condition.innerHTML;
 var amount_data=amount.innerHTML;

 item.innerHTML="<input type='text' id='item_text"+no+"' value='"+item_data+"'>";
 condition.innerHTML="<input type='text' id='condition_text"+no+"' value='"+condition_data+"'>";
 amount.innerHTML="<input type='text' id='amount_text"+no+"' value='"+amount_data+"'>";
}

function save_row(no)
{
 var item_val=document.getElementById("item_text"+no).value;
 var condition_val=document.getElementById("condition_text"+no).value;
 var amount_val=document.getElementById("amount_text"+no).value;

 document.getElementById("item_row"+no).innerHTML=item_val;
 document.getElementById("condition_row"+no).innerHTML=condition_val;
 document.getElementById("amount_row"+no).innerHTML=amount_val;

 document.getElementById("edit_button"+no).style.display="block";
 document.getElementById("save_button"+no).style.display="none";
}

function delete_row(no)
{
 document.getElementById("row"+no+"").outerHTML="";
}

function add_row()
{
 var new_item=document.getElementById("new_item").value;
 var new_condition=document.getElementById("new_condition").value;
 var new_amount=document.getElementById("new_amount").value;

 var table=document.getElementById("data_table");
 var table_len=(table.rows.length)-1;
 var row = table.insertRow(table_len).outerHTML="<tr id='row"+table_len+"'><td id='item_row"+table_len+"'>"+new_item+"</td><td id='condition_row"+table_len+"'>"+new_condition+"</td><td id='amount_row"+table_len+"'>"+new_amount+"</td><td><input type='button' id='edit_button"+table_len+"' value='Edit' class='edit' onclick='edit_row("+table_len+")'> <input type='button' id='save_button"+table_len+"' value='Save' class='save' onclick='save_row("+table_len+")'> <input type='button' value='Delete' class='delete' onclick='delete_row("+table_len+")'></td></tr>";

 document.getElementById("new_item").value="";
 document.getElementById("new_condition").value="";
 document.getElementById("new_amount").value="";
}