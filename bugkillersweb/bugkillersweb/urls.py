from django.conf.urls import patterns, include, url

from django.contrib import admin
import settings

admin.autodiscover()

urlpatterns = patterns('',
                       # Examples:
                       # url(r'^$', 'bugkillersweb.views.home', name='home'),
                       # url(r'^blog/', include('blog.urls')),
                       url(r'^jstest/', include('jstest.urls')),
                       url(r'^bugkillers/', include('bugkillers.urls')),
                       url(r'^admin/', include(admin.site.urls)),
                       url(r'^static/(?P<path>.*)', 'django.views.static.serve',
                           {'document_root': settings.STATIC_URL}),
                       )
