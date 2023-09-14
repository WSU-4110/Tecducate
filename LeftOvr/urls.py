"""LeftOvr URL Configuration

The `urlpatterns` list routes URLs to views. For more information please see:
    https://docs.djangoproject.com/en/3.1/topics/http/urls/
Examples:
Function views
    1. Add an import:  from my_app import views
    2. Add a URL to urlpatterns:  path('', views.home, name='home')
Class-based views
    1. Add an import:  from other_app.views import Home
    2. Add a URL to urlpatterns:  path('', Home.as_view(), name='home')
Including another URLconf
    1. Import the include() function: from django.urls import include, path
    2. Add a URL to urlpatterns:  path('blog/', include('blog.urls'))
"""
from django.contrib import admin
from django.urls import path, include
from htmlcss import views
from django.conf.urls import url
from django.contrib.auth import views as auth_views
from django.conf import settings
from django.conf.urls.static import static
from django.conf.urls import handler404


urlpatterns = [
    path('admin/', admin.site.urls),
    # url paths for index about and contact pages
    path('', views.index, name='index'),
    path('search/', views.search, name='search'),
    path('about', views.about, name='about'),
    path('cont', views.cont, name='cont'),
    path('wh/', views.wh, name='why'),
    path('custReg', views.custReg, name='custReg'),
    path('restReg', views.restReg, name='restReg'),


    path('custHome/', views.custHome, name='custHome'),
    # url path for customer registration (from button index)
    path('custReg/', views.custReg, name='custReg'),
    path('custSamp', views.custSamp, name='custSamp'),
    path('restHome', views.restHome, name='restHome'),
    path('restInp', views.restInp, name='restInp'),
    # url path for restaurant registration page
    path('restReg', views.restReg, name='restReg'),
    path('sendMes', views.sendMes, name='sendMes'),
    # url path for why
    path('wh', views.wh, name='why'),
    # path for login.html
    path('login/', auth_views.LoginView.as_view(template_name='login.html'), name='login'),
    path('logout/', auth_views.LogoutView.as_view(template_name='logout.html'), name='logout'),
    path('act/', views.actionR, name='actionR'),
    path('acti/', views.actionCH, name='actionCH'),
    path('new/', views.actionRH, name='actionRH'),

    path('restSamp', views.restSamp, name='restSamp'),
    path('new1/', views.actionRI, name='actionRI'),
    path('new2/', views.contactPage, name='contactPage'),
    path('actio/', views.actionL, name='actionL'),
    path('proPage/', views.proPage, name='proPage'),
    path('head/', views.head, name='head'),
    path('pastRec', views.pastRec, name='pastRec'),
    path('custAbout', views.custAbout, name='custAbout'),
    path('custCont', views.custCont, name='custCont'),
    path('custWhy', views.custWhy, name='custWhy'),
    path('regRec', views.regRec, name='regRec'),

    path('customer-register/', views.customerRegister, name='customer-register'),
    path('restaurant-register/', views.restaurantRegister, name='restaurant-register'),

    path('LeoReview/', views.LeoReview, name='Leo'),
    path('ChipReview/', views.ChipReview, name='Chip'),
    path('DomReview/', views.DomReview, name='Dom'),
    path('olivePage/', views.OlivePage, name='Olive'),

    path('customer-demo-reserve/', views.CustomerDemoReserve, name='customer-reserve'),
    path('no-result/', views.NoResult, name='no-result'),
    path('thank-you-resv/', views.Thankyou_Reserver, name='thank-you-reserve'),
    path('timer/', views.Timer, name='timer'),
    path('restaurant/(?P<pk>\d+)/', views.RestaurantProfile, name='restaurant-profile-with-pk'),




   path('password-reset/',
         auth_views.PasswordResetView.as_view
         (template_name='password_reset.html'),
         name='password_reset'),
    path('password-reset/done',
         auth_views.PasswordResetDoneView.as_view
         (template_name='password_reset_done.html'),
         name='password_reset_done'),
    path('password-reset-confirm/<uidb64>/<token>',
         auth_views.PasswordResetConfirmView.as_view
         (template_name='password_reset_confirm.html'),
         name='password_reset_confirm'),
    path('password-reset-complete/',
         auth_views.PasswordResetCompleteView.as_view
         (template_name='password_reset_complete.html'),
         name='password_reset_complete'),
]

handler404 = views.error404

if settings.DEBUG:

    urlpatterns += static(settings.MEDIA_URL, document_root=settings.MEDIA_ROOT)