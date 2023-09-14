from django.urls import reverse,resolve
from django.test import TestCase
from htmlcss.views import (index,about,cont,wh)

class Test(TestCase):

    def test_customer_Homepage(self):
        request = index('index.html')
        self.assertEqual(request, 'index')

    def test_about_Us(self):
        request = about('aboutus.html')
        self.assertEqual(request)

    def test_contact_Us(self):
        request = cont('contact.html')
        self.assertEqual(request)

    def test_(self):
        request = wh('why.html')
        self.assertEqual(request)

if __name__ == '__main__':
    unittest.main()