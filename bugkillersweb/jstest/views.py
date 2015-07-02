from django.shortcuts import render, render_to_response

# Create your views here.
from rest_framework.decorators import api_view
from rest_framework.response import Response


def test(request):
    return render_to_response('jstest/test.html')


def testindex(request):
    return render_to_response('jstest/testindex.html')


@api_view(['GET'])
def getinfo(request):
    return Response(data={"data": "i am data"})
