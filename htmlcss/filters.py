import django_filters
from .models import Restaurant

class RestaurantFilter(django_filters.FilterSet):
    class Meta:
        model = Restaurant
        fields = ['businessName']