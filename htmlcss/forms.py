from django import forms
from django.contrib.auth.forms import UserCreationForm
from django.contrib.auth.models import User
from .models import Customer, Restaurant
from django.contrib.auth.models import Group


class UserRegisterForm(UserCreationForm):
    email = forms.EmailField()

    class Meta:
        model = User
        fields = ['username', 'email', 'password1', 'password2']


class CustomerRegisterForm(UserCreationForm):
    firstName = forms.CharField(max_length=30)
    lastName = forms.CharField(max_length=30)
    customerAddress = forms.CharField(max_length=90)


    class Meta:
        model = Customer
        fields = ['firstName', 'lastName', 'customerAddress']

class RestaurantRegisterForm(UserCreationForm):
    businessName = forms.CharField(max_length=30)
    businessAddress = forms.CharField(max_length=30)


    class Meta:
        model = Customer
        fields = ['businessName', 'businessAddress']

