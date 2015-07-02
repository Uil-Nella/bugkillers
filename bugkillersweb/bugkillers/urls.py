from django.conf.urls import patterns, include, url

from django.contrib import admin
from bugkillers.views import *

admin.autodiscover()

urlpatterns = patterns('',
                       # Examples:
                       url(r'^testform/$', testform),
                       url(r'^head/$', head),
                       url(r'^footer/$', footer),
                       url(r'^login/$', login),
                       url(r'^register/$', register),
                       url(r'^index/$', index),
                       url(r'^questiondetail/$', questiondetail),
                       url(r'^questionlist/$', questionlist),
                       # url(r'^blog/', include('blog.urls')),

                       )
