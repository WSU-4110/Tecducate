from unittest import TestCase
from django.test import Client, TestCase
from django.urls import reverse


class Test(TestCase):

    def test_cust_home(self):
        client = Client()
        self.client = Client()
        self.custHome = reverse('custHome')
        response = client.get(self.custHome)
        self.assertTemplateUsed(response, 'CustomerHomepage.html')
    def test_cust_reg(self):
        client = Client()
        self.client = Client()
        self.custReg = reverse('custReg')
        response = client.get(self.custReg)
        self.assertTemplateUsed(response, 'customerRegistration.html')
    def test_cust_samp(self):
        client = Client()
        self.client = Client()
        self.custSamp = reverse('custSamp')
        response = client.get(self.custSamp)
        self.assertTemplateUsed(response, 'customersamplepage.html')
    def test_cust_about(self):
        client = Client()
        self.client = Client()
        self.custAbout = reverse('custAbout')
        response = client.get(self.custAbout)
        self.assertTemplateUsed(response, 'CustAbout.html')
    def test_cust_why(self):
        client = Client()
        self.client = Client()
        self.custWhy = reverse('custWhy')
        response = client.get(self.custWhy)
        self.assertTemplateUsed(response, 'Custwhy.html')
    def test_cust_cont(self):
        client = Client()
        self.client = Client()
        self.custCont = reverse('custCont')
        response = client.get(self.custCont)
        self.assertTemplateUsed(response, 'CustContact.html')
