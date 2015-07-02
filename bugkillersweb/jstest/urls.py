from django.conf.urls import patterns, include, url

from django.contrib import admin
from jstest.views import *

admin.autodiscover()

urlpatterns = patterns('',
                       # Examples:
                       url(r'^test/$', test),
                       url(r'^testindex/$', testindex),
                       url(r'^getinfo/$', getinfo),
                       # url(r'^blog/', include('blog.urls')),

                       )
