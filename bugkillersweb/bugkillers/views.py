# coding=utf-8
from django.shortcuts import render, render_to_response

from rest_framework.decorators import api_view
from rest_framework.response import Response



# 表单提交测试
@api_view(['POST'])
def testform(request):
    return Response(data={
        "ret": True,
        "code": 0,
        "msg": "注册成功",
        "t": {
            "id": 0,
            "userName": "xx",
            "nickName": "xx",
            "password": "xx",
            "email": "xx",
            "headPic": ""
        }
    })


# 头部
def head(request):
    return render_to_response('directives/head.html')


# 底部
def footer(request):
    return render_to_response('directives/footer.html')


# 登录
def login(request):
    return render_to_response('bugkillers/login.html')


# 注册
def register(request):
    return render_to_response('bugkillers/register.html')


# 提问
def ask(request):
    return render_to_response('bugkillers/ask.html')


# 首页
def index(request):
    return render_to_response('bugkillers/index.html')


# 问题列表
def questionlist(request):
    return render_to_response('bugkillers/questionlist.html')


# 问题详情
def questiondetail(request):
    return render_to_response('bugkillers/questiondetail.html')
