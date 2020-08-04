package org.example;

import org.openqa.selenium.By;

public class Books extends Utils {

    LoadProp loadProp = new LoadProp();

    private By clicksortbydroplist = By.id("products-orderby");
    private By sortBydropList = By.cssSelector("select[id='products-orderby'] option:nth-child(2)");
    private By display = By.id("products-pagesize");
    private By selectfromdropdownlist=By.cssSelector("div [id='products-pagesize'] option:nth-child(1)");
    private By addToCart=By.cssSelector("div [class='buttons'] input:nth-child(1)");
    private By shoppingcart=By.cssSelector("a[href='/cart'] ");
    private By agree=By.id("termsofservice");
    private By checkout=By.id("checkout");
    private By checkoutguest=By.cssSelector("input[class='button-1 checkout-as-guest-button']");
    private By firstname=By.id("BillingNewAddress_FirstName");
    private By lastname=By.id("BillingNewAddress_LastName");
    private By email=By.id("BillingNewAddress_Email");

    private By company=By.id("BillingNewAddress_Company");

    private By country=By.id("BillingNewAddress_CountryId");

    private By india=By.cssSelector("select[id='BillingNewAddress_CountryId'] option:nth-child(101)");
    private By city=By.id("BillingNewAddress_City");
    private By address1=By.id("BillingNewAddress_Address1");
    private By address2=By.id("BillingNewAddress_Address2");


    private By zipcode=By.id("BillingNewAddress_ZipPostalCode");
    private By phonenumber=By.id("BillingNewAddress_PhoneNumber");
    private By faxnumber=By.id("BillingNewAddress_FaxNumber");
    private By Continue = By.cssSelector("div[id='billing-buttons-container'] input");

    private By secondday=By.cssSelector("#shippingoption_2']");
            //"input[value='2nd Day Air___Shipping.FixedByWeightByTotal']");

    private By continue2=By.cssSelector("input[class='button-1 shipping-method-next-step-button']");
    private By creditcard=By.id("paymentmethod_1");
    private By continue3=By.cssSelector("input[class='button-1 payment-method-next-step-button']");
    private By selectcardtype=By.id("CreditCardType");
    private By visa=By.cssSelector("select[id='CreditCardType'] option:nth-child(1)");
    private By cardholdername=By.id("CardholderName");
    private By cardnumber=By.id("CardNumber");
    private By clickdate=By.id("ExpireMonth");
    private By selectdate=By.cssSelector("select[id='ExpireMonth'] option:nth-child(4)");
    private By clickyear=By.id("ExpireYear");
    private By selectyear=By.cssSelector("select[id='ExpireYear'] option:nth-child(4)");
    private By css=By.id("CardCode");
    private By continue4=By.cssSelector("input[class='button-1 payment-info-next-step-button']");
    private By confirm=By.cssSelector("input[class='button-1 confirm-order-next-step-button']");


    public void Clikbydroplist (){
        ClickOnElement(clicksortbydroplist);
    }
    public void SortByDroplist(){
        ClickOnElement(sortBydropList);
    }
    public void Display(){
        ClickOnElement(display);
    }
    public void Dropdownlist(){
        ClickOnElement(selectfromdropdownlist);
    }
    public void AddtoCart (){
        waitForElementToBevisible(addToCart,20);
        ClickOnElement(addToCart);
    }
    public void BookShopingCart(){
        waitForElementToBevisible(shoppingcart,20);
        ClickOnElement(shoppingcart);
    }
    public void Agree(){
        waitForElementToBevisible(agree,20);
       ClickOnElement(agree);
    }
    public void Checkout(){
        waitForElementToBevisible(checkout,20);
        ClickOnElement(checkout);
    }
    public void CheckoutGuest(){
        waitForElementToBevisible(checkoutguest,20);
        ClickOnElement(checkoutguest);
    }
    public void FirstName(){
        waitForElementToBevisible(firstname,20);
        enterText(firstname,"ila");
    }
    public void LastName (){

        enterText(lastname,"Desai");
    }
    public void Emiladdrs (){
        enterText(email,"abcdef@mail.com");
    }

    public void Company(){

        enterText(company,"Dndpvtltd");
    }
    public void Addcountry() {
        ClickOnElement(country);
        ClickOnElement(india);
        enterText(city, "Surat");
        enterText(address1, "6 goodstonecort");
        enterText(address2, "moorelane");
        enterText(zipcode, "123456");
        enterText(zipcode, "123456");
        enterText(phonenumber, "9898253656");
        enterText(faxnumber, "123456789");
        ClickOnElement(Continue);
    }
        public void SecondDay(){
            waitForElementToBevisible(secondday,20);
            ClickOnElement(secondday);
        }
        public void Continue2(){
            ClickOnElement(continue2);
        }
        public void TypeCreditCard(){
            waitForElementToBevisible(creditcard,20);
            ClickOnElement(creditcard);
        }
        public void continue3(){
            ClickOnElement(continue3);
        }
        public void SelectCardType(){
            waitForElementToBevisible(selectcardtype,20);
            ClickOnElement(selectcardtype);
        }
        public void VisaCard(){
            ClickOnElement(visa);
        }
        public void CardHolderName(){
            enterText(cardholdername,"miss v m");
        }
        public void CardNumber(){
            waitForElementToBevisible(cardnumber,20);
            enterText(cardnumber,"4263982640269299");
        }
        public void DateAndmonth(){
            waitForElementToBevisible(clickdate,20);
            ClickOnElement(clickdate);
            waitForElementToBevisible(clickdate,20);
            ClickOnElement(selectdate);
        }
        public void ExpireYear(){
            ClickOnElement(clickyear);
            waitForElementToBevisible(selectyear,20);
            ClickOnElement(selectyear);
        }
        public void CardCode(){
            enterText(css,"837");
        }
        public void Continue4(){
            ClickOnElement(continue4);
        }
        public void Confirm(){
            waitForElementToBevisible(confirm,20);
            ClickOnElement(confirm);
        }






    }

















