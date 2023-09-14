
from django.shortcuts import render, redirect
from django.views.generic import TemplateView

from .models import Customer, Restaurant, ContactUs, Meal
from django.contrib.auth import authenticate, login
from django.contrib.auth.decorators import login_required
from .forms import UserRegisterForm
from django.contrib import messages
from .decorators import unauthenticated_user, allowed_users, restaurant_user
from django.contrib.auth import get_user_model
import pytest
from django.contrib.auth.models import Group, User
from .forms import UserRegisterForm, CustomerRegisterForm
from .filters import RestaurantFilter



def index(request):
    return render(request, 'index.html')

def search(request):

    restaurants = Restaurant.objects.filter()

    myFilter = RestaurantFilter(request.GET)
    restaurants = myFilter.qs

    context = {'myFilter': myFilter, 'restaurants': restaurants}
    return render(request, 'searchbar.html', context)


def about(request):
    return render(request, 'aboutus.html')

def cont(request):
    return render(request, 'contact.html')

def custHome(request):
    return render(request, 'CustomerHomepage.html')

def custReg(request):
    return render(request, 'customerRegistration.html')

def custSamp(request):
    return render(request, 'customersamplepage.html')

def restHome(request):
    return render(request, 'RestaurantHomepage.html')

def restInp(request):
    return render(request, 'RestaurantInput.html')

def restReg(request):
    return render(request, 'RestaurantRegistration.html')

def sendMes(request):
    return render(request, 'SendMessage.html')

def wh(request):
    return render(request, 'why.html')

def logI(request):
    return render(request, 'login.html')

def actionC(request):
    fname = request.POST.get("first-name")
    lname = request.POST.get("last-name")
    idd = request.POST.get("id")
    ema = request.POST.get("email")
    pas = request.POST.get("psw")

    o_ref = Customer(firstName=fname, lastName=lname, idNum=idd, email=ema, password=pas)
    o_ref.save()

    return render(request, "UploadProfileCust.html")

@login_required
@allowed_users(allowed_roles=['customer'])
def proPage(request):

    return render(request, "sampleUserProfile.html")

def actionR(request):
    nam = request.POST.get("business-name")
    ad = request.POST.get("address")
    ei = request.POST.get("id")
    emai = request.POST.get("email")
    passs = request.POST.get("psw")

    h_ref = Restaurant(name=nam, email=emai, password=passs, idNum=ei)
    h_ref.save()

    return render(request, "HeaderNLogoRest.html")

def actionCH(request):
    addr = request.POST.get("location")
    Customer.custAddress = addr

    return render(request, "customersamplepage.html")

def actionRH(request):
    addre = request.POST.get("location")
    Restaurant.busAddress = addre

    return render(request, "RestaurantInput.html")

def restSamp(request):
    return render(request, "Restaurantsamplepage.html")

def actionL(request):
    e = request.POST.get("email")
    p = request.POST.get("psw")

    return render(request, "login.html")

def custAbout(request):
    return render(request, "CustAbout.html")

def custWhy(request):
    return render(request, "CustWhy.html")

def custCont(request):
    return render(request, "CustContact.html")

def error404(request, exception):
    return render(request,'404.html')

def contactPage(request):
    na = request.POST.get("name")
    em = request.POST.get("email")
    ph = request.POST.get("phone")
    ph = request.POST.get("phone")
    mee = request.POST.get("message")

    u = ContactUs(nameC=na, emailC=em, phoneC=ph, messageC=mee)
    u.save()

    return render(request, "SendMessage.html")

def pastRec(request):
    return render(request, "PastReceipt.html")

def actionRI(request):
    d = request.POST.get("dish")
    di = request.POST.get("dishnum")
    dis = request.POST.get("dishes")


    return render(request, "AddRemoveMenu.html")

def head(request):
    p = request.POST.get("restLogo")
    return render(request, "RestaurantHomepage.html")

def regRec(request):
    return render(request, "receiptSample.html")


def customerRegister(request):

    form = UserRegisterForm()
    if request.method == 'POST':
        form = UserRegisterForm(request.POST)
        if form.is_valid():
            user = form.save()
            username = form.cleaned_data.get('username')

            group = Group.objects.get(name='customer')
            user.groups.add(group)

            messages.success(request, f'Account created! You are now able to log in!')
            return redirect('index')

    context = {'form': form}
    return render(request, 'customerRegistration.html', context)

def restaurantRegister(request):

    form = UserRegisterForm()
    if request.method == 'POST':
        form = UserRegisterForm(request.POST)
        if form.is_valid():
            user = form.save()
            username = form.cleaned_data.get('username')

            group = Group.objects.get(name='restaurant')
            user.groups.add(group)

            messages.success(request, f'Account created! You are now able to log in!')
            return redirect('index')

    context = {'form': form}
    return render(request, 'RestaurantRegistration.html', context)



def ChipReview(request):
    return render(request, "ChipotleReview.html")



def DomReview(request):
    return render(request, "DominosReview.html")


def LeoReview(request):
    return render(request, "LeosReview.html")

def Thankyou_Reserver(request):
    return render(request, 'ThankYou_Reserver.html')

def CustomerDemoReserve(request):
    return render(request, 'CustomerDemoReservePage.html')

def NoResult(request):
    return render(request, 'NoResult.html')

def Timer(request):
    return render(request, 'TimerSampleCode.html')


def RestaurantProfile(request, pk=None):
    if pk:
        restaurant = Restaurant.objects.get(pk=pk)
        meals = Meal.objects.get(pk=pk)
    else:
        user = request.User

    args = {'restaurant': restaurant, 'meal': meals}
    return render(request, 'restaurantProfile.html', args)

def OlivePage(request):
    return render(request, 'oliveGardenPage.html')

