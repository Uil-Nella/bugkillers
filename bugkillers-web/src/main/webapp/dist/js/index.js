var hostServer = "192.168.1.103:9081"


$(document).ready(function () {
    $("#getlast").click(function(){
        $.ajax({
            type: "post",//使用get方法访问后台
            dataType: "json",//返回json格式的数据
            url: hostServer,//要访问的后台地址
            data: "/question/1",//要发送的数据
            complete:function () {
                alert(hostServer);
            },//AJAX请求完成时隐藏loading提示
            success:function (msg) {//msg为返回的数据，在这里做数据绑定
                alert(msg)
            }
        });
        $.get("192.168.1.103:9081/question/1", function(result){
            alert(result);
        });
    });


    $.ajax({
        type: "get",//使用get方法访问后台
        dataType: "json",//返回json格式的数据
        url: hostServer,//要访问的后台地址
        data: "",//要发送的数据
        complete:function () {
            $("#load").hide();
        },//AJAX请求完成时隐藏loading提示
        success:function (msg) {//msg为返回的数据，在这里做数据绑定
            alert(msg)
        }
    });

});
