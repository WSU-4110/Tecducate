from django.test import TestCase, Client
from django.urls import reverse
import imp

class TestViews(TestCase):

    def setUp(self):
        self.client = Client()
        self.proPage = reverse('proPage')
        self.login = reverse('login')
        self.register = reverse('register')
        self.LeoReview = reverse('Leo')
        self.DomReview = reverse('Dom')
        self.ChipReview = reverse('Chip')


    def test_project_login_get(self):
        client = Client()

        response = client.get(self.login)

        self.assertEquals(response.status_code, 200)
        self.assertTemplateUsed(response, 'login.html')

    def test_project_profile_page_get(self):
        client = Client()

        response = client.get(self.proPage)

        self.assertEquals(response.status_code, 200)
        self.assertTemplateUsed(response, 'sampleUserProfile.html.html')

    def test_project_register_get(self):
        client = Client()

        response = client.get(self.register)

        self.assertEquals(response.status_code, 200)
        self.assertTemplateUsed(response, 'register.html')

    def test_project_Leo_get(self):
        client = Client()

        response = client.get(self.LeoReview)

        self.assertEquals(response.status_code, 200)
        self.assertTemplateUsed(response, 'LeosReview.html.html')

    def test_project_Chip_get(self):
        client = Client()

        response = client.get(self.ChipReview)

        self.assertEquals(response.status_code, 200)
        self.assertTemplateUsed(response, 'ChipotleReview.html')

    def test_project_Dom_get(self):
        client = Client()

        response = client.get(self.DomReview)

        self.assertEquals(response.status_code, 200)
        self.assertTemplateUsed(response, 'DominosReview.html')
