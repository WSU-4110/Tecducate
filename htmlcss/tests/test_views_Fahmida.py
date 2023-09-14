from django.urls import reverse,resolve
from django.test import TestCase, Client

class Test(TestCase):

    def test_Homepage(self):
        client = Client()
        self.client = Client()
        self.index = reverse('index')
        response = client.get(self.index)
        self.assertTemplateUsed(response, 'index.html')

    def test_about_Us(self):
        client = Client()
        self.client = Client()
        self.about = reverse('about')
        response = client.get(self.about)
        self.assertTemplateUsed(response, 'aboutus.html')

    def test_contact_Us(self):
        client = Client()
        self.client = Client()
        self.cont = reverse('cont')
        response = client.get(self.cont)
        self.assertTemplateUsed(response, 'contact.html')

    def test_why(self):
        client = Client()
        self.client = Client()
        self.why = reverse('why')
        response = client.get(self.why)
        self.assertTemplateUsed(response, 'why.html')
