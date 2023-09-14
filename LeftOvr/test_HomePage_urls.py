from django.urls import reverse,resolve
from django.test import TestCase
from htmlcss.views import (index,about,
                           cont,wh)



class Test_HomePage(TestCase):
    print("running test - index")
    def test_Home_page_status_code(self):
        response = self.client.get(reverse('index'))
        self.assertEqual(response.status_code, 200)

    def test_homePage_correct_Template(self):
        response = self.client.get(reverse('index'))
        self.assertEqual(response.status_code, 200)
        self.assertTemplateUsed(response, 'index.html')

    print("running test - about")
    def test_aboutPage_correct_Template(self):
        response = self.client.get(reverse('about'))
        self.assertEqual(response.status_code, 200)

    def test_about_correct_Template(self):
        response = self.client.get(reverse('about'))
        self.assertEqual(response.status_code, 200)
        self.assertTemplateUsed(response, 'aboutus.html')

    print("running test - cont")

    def test_contact_correct_Template(self):
        response = self.client.get(reverse('cont'))
        self.assertEqual(response.status_code, 200)

    def test_contact_correct_Template(self):
        response = self.client.get(reverse('cont'))
        self.assertEqual(response.status_code, 200)
        self.assertTemplateUsed(response, 'contact.html')

    print("running test - why")
    def test_why_correct_Template(self):
        response = self.client.get(reverse('wh'))
        self.assertEqual(response.status_code, 200)

    def test_why_correct_Template(self):
        response = self.client.get(reverse('why'))
        self.assertEqual(response.status_code, 200)
        self.assertTemplateUsed(response, 'why.html')

class TestCase_HomePageURLs(TestCase):
    print("running url test - index, about, wh")
    def test_index_is_resolved(self):
        url= reverse('index')
        print (resolve(url))
        self.assertIn('<title>Home</title>', index)
        self.assertEquals(resolve(url).func, index)
    def test_about_is_resolved(self):
        url = reverse('about')
        print(resolve(url))
        self.assertEquals(resolve(url).func, about)
    def test_wh_is_resolved(self):
        url = reverse('why')
        print(resolve(url))
        self.assertEquals(resolve(url).func, wh)
    print("running url test - cont")
    def test_cont_is_resolved(self):
        url = reverse('cont')
        print(resolve(url))
        self.assertEquals(resolve(url).func, cont)

