from unittest import TestCase
from htmlcss.views import custHome
from htmlcss.views import custReg
from htmlcss.views import custSamp
from htmlcss.views import custAbout
from htmlcss.views import custWhy
from htmlcss.views import custCont
class Test(TestCase):

    def test_cust_home(self):
        request = custHome('customerHomepage.html')
        self.assertEqual(request, 'custHome')
    def test_cust_reg(self):
        request = custReg('customerRegistration.html')
        self.assertEqual(request)
    def test_cust_samp(self):
        request = custSamp('customersamplepage.html')
        self.assertEqual(request)
    def test_cust_about(self):
        request = custAbout('CustAbout.html')
        self.assertEqual(request)
    def test_cust_why(self):
        request = custWhy('CustWhy.html')
        self.assertEqual(request)
    def test_cust_cont(self):
        request = custCont('CustContact.html')
        self.assertEqualcustCont(request)

if __name__ == '__main__':
    unittest.main()
