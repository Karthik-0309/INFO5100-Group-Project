/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Business;

import model.CustomerManagement.CustomerProfile;
import model.MarketingManagement.MarketingPersonProfile;
import model.OrderManagement.Order;
import model.OrderManagement.OrderItem;
import model.Personnel.*;
import model.ProductManagement.Product;
import model.ProductManagement.ProductCatalog;
import model.SalesManagement.SalesPersonProfile;
import model.Supplier.Supplier;
import model.UserAccountManagement.UserAccount;

/**
 * @author kal bugrara
 */
public class ConfigureABusiness {

    public static Business initialize() {
        Business business = new Business("Shoes");

        //Supplier 1 - Nike
        Supplier supplier1 = business.getSupplierDirectory().newSupplier("Nike");
        ProductCatalog productCatalog1 = supplier1.getProductCatalog();
        //newProduct(String n, int fp, int cp, int tp)
        Product product1 = productCatalog1.newProduct("Air  1", 990, 2900, 1950);
        Product product2 = productCatalog1.newProduct("Air  2", 1900, 2800, 1850);
        Product product3 = productCatalog1.newProduct("Air  3", 870, 1700, 1700);
        Product product4 = productCatalog1.newProduct("Air  4", 850, 1900, 1375);
        Product product5 = productCatalog1.newProduct("Air  5", 760, 1800, 1325);
        Product product6 = productCatalog1.newProduct("Air  6", 790, 1790, 1290);
        Product product7 = productCatalog1.newProduct("Air  7", 740, 1640, 1350);
        Product product8 = productCatalog1.newProduct("Air  8", 720, 1650, 1185);
        Product product9 = productCatalog1.newProduct("Air  9", 650, 1500, 1000);
        Product product10 = productCatalog1.newProduct("Air  10", 610, 1450, 1030);
        business.getSupplierPerformanceReport(String.valueOf(supplier1));

        //Supplier 2 - Adidas
        Supplier supplier2 = business.getSupplierDirectory().newSupplier("Adidas");
        ProductCatalog productCatalog2 = supplier2.getProductCatalog();
        Product product11 = productCatalog2.newProduct("forums 12", 1200, 2500, 1850);
        Product product12 = productCatalog2.newProduct("forums 11", 960, 2400, 1725);
        Product product13 = productCatalog2.newProduct("forums X", 860, 2300, 1625);
        Product product14 = productCatalog2.newProduct("forums 8", 810, 2200, 1550);
        Product product15 = productCatalog2.newProduct("forums 7", 760, 2100, 1475);
        Product product16 = productCatalog2.newProduct("forums 6", 720, 1900, 1400);
        Product product17 = productCatalog2.newProduct("forums 5", 610, 1900, 1300);
        Product product18 = productCatalog2.newProduct("forums 4", 560, 1800, 1225);
        Product product19 = productCatalog2.newProduct("forums 3", 510, 1700, 1150);
        Product product20 = productCatalog2.newProduct("forums 2", 490, 1650, 1115);
        business.getSupplierPerformanceReport(String.valueOf(supplier2));

        //Supplier 3 - Puma
        Supplier supplier3 = business.getSupplierDirectory().newSupplier("Puma");
        ProductCatalog productCatalog3 = supplier3.getProductCatalog();
        Product product21 = productCatalog3.newProduct("ferarri edition", 1100, 2100, 1600);
        Product product22 = productCatalog3.newProduct("merc edition", 960, 1990, 1550);
        Product product23 = productCatalog3.newProduct("ferrari edition 3", 970, 1950, 1485);
        Product product24 = productCatalog3.newProduct("red bull edition 2", 930, 1950, 1440);
        Product product25 = productCatalog3.newProduct("merc ediction 1", 890, 1900, 1395);
        Product product26 = productCatalog3.newProduct("ferrari edition 6P", 750, 1850, 1345);
        Product product27 = productCatalog3.newProduct("merc edition 5X", 790, 1800, 1295);
        Product product28 = productCatalog3.newProduct("red bull edition 5", 750, 1750, 1250);
        Product product29 = productCatalog3.newProduct("Kl rahul collection", 800, 1700, 1200);
        Product product30 = productCatalog3.newProduct("Virat kohli collection", 680, 1650, 1165);
        business.getSupplierPerformanceReport(String.valueOf(supplier3));

        //Supplier 4 - skechers
        Supplier supplier4 = business.getSupplierDirectory().newSupplier("Skechers");
        ProductCatalog productCatalog4 = supplier4.getProductCatalog();
        Product product31 = productCatalog4.newProduct("skechers premium", 1100, 2100, 1600);
        Product product32 = productCatalog4.newProduct("skechers max", 970, 1970, 1470);
        Product product33 = productCatalog4.newProduct("skechers 7", 895, 1990, 1395);
        Product product34 = productCatalog4.newProduct("skechers 6", 893, 1890, 1390);
        Product product35 = productCatalog4.newProduct("skechers 5", 890, 1900, 1395);
        Product product36 = productCatalog4.newProduct("skechers 4", 840, 1850, 1345);
        Product product37 = productCatalog4.newProduct("skechers 3", 790, 1800, 1295);
        Product product38 = productCatalog4.newProduct("skechers 2", 660, 1660, 1160);
        Product product39 = productCatalog4.newProduct("skechers 1", 610, 1700, 1200);
        Product product40 = productCatalog4.newProduct("skechers 0", 590, 1650, 1165);
        business.getSupplierPerformanceReport(String.valueOf(supplier4));

        //Supplier 5 - New balance
        Supplier supplier5 = business.getSupplierDirectory().newSupplier("New balance");
        ProductCatalog productCatalog5 = supplier5.getProductCatalog();
        Product product41 = productCatalog5.newProduct("New Balance 11", 1100, 2100, 1600);
        Product product42 = productCatalog5.newProduct("New Balance 10", 960, 1960, 1460);
        Product product43 = productCatalog5.newProduct("New Balance 9", 885, 1950, 1395);
        Product product44 = productCatalog5.newProduct("New Balance 8", 843, 1860, 1350);
        Product product45 = productCatalog5.newProduct("New Balance 7", 795, 1805, 1300);
        Product product46 = productCatalog5.newProduct("New Balance 6", 750, 1760, 1235);
        Product product47 = productCatalog5.newProduct("New Balance 5", 700, 1710, 1200);
        Product product48 = productCatalog5.newProduct("New Balance 4", 660, 1700, 1200);
        Product product49 = productCatalog5.newProduct("New Balance 3", 610, 1610, 1110);
        Product product50 = productCatalog5.newProduct("New Balance 2", 590, 1560, 1075);
        business.getSupplierPerformanceReport(String.valueOf(supplier5));


        //TOdo: Add more suppliers and products later
        //Customer 1 - AKshay
        Person person1 = new Person("AKshay");
        CustomerProfile customer1 = business.getCustomerDirectory().newCustomerProfile(person1);

        //Customer 2 - Guna
        Person person2 = new Person("Guna");
        CustomerProfile customer2 = business.getCustomerDirectory().newCustomerProfile(person2);

        //Customer 3 - Karthik
        Person person3 = new Person("Karthik");
        CustomerProfile customer3 = business.getCustomerDirectory().newCustomerProfile(person3);

        //Customer 4 - RAJU
        Person person4 = new Person("Raju");
        CustomerProfile customer4 = business.getCustomerDirectory().newCustomerProfile(person4);

        //Customer 5 - Yatheesh
        Person person5 = new Person("Yatheesh");
        CustomerProfile customer5 = business.getCustomerDirectory().newCustomerProfile(person5);

        //Customer 6 - Rahul
        Person person6 = new Person("Rahul");
        CustomerProfile customer6 = business.getCustomerDirectory().newCustomerProfile(person6);

        //Customer 7 - Amogh
        Person person7 = new Person("Amogh");
        CustomerProfile customer7 = business.getCustomerDirectory().newCustomerProfile(person7);

        //Customer 8 - Ankita
        Person person8 = new Person("Ankita");
        CustomerProfile customer8 = business.getCustomerDirectory().newCustomerProfile(person8);

        //Customer 9 - Gagana
        Person person9 = new Person("Gagana");
        CustomerProfile customer9 = business.getCustomerDirectory().newCustomerProfile(person9);

        //Customer 10 - Vikram
        Person person10 = new Person("Vikram");
        CustomerProfile customer10 = business.getCustomerDirectory().newCustomerProfile(person10);

        //SalesPerson 1 - Darren
        Person person11 = new Person("Darren");
        SalesPersonProfile salesPerson1 = business.getSalesPersonDirectory().newSalesPersonProfile(person11);
        UserAccount userAccount1 = business.getUserAccountDirectory().newUserAccount(salesPerson1, "Darren", "darren");

        //SalesPerson 2 - Dale
        Person person12 = new Person("Dale");
        SalesPersonProfile salesPerson2 = business.getSalesPersonDirectory().newSalesPersonProfile(person12);
        UserAccount userAccount2 = business.getUserAccountDirectory().newUserAccount(salesPerson2, "Dale", "dale");

        //SalesPerson 3 - Messi
        Person person13 = new Person("Messi");
        SalesPersonProfile salesPerson3 = business.getSalesPersonDirectory().newSalesPersonProfile(person13);
        UserAccount userAccount3 = business.getUserAccountDirectory().newUserAccount(salesPerson3, "Messi", "messi");

        //MarketingPerson 1 - Pep
        Person person14 = new Person("Pep");
        MarketingPersonProfile marketingPerson1 = business.getMarketingPersonDirectory().newMarketingPersonProfile(person14);
        UserAccount userAccount4 = business.getUserAccountDirectory().newUserAccount(marketingPerson1, "Pep", "pep");

        //MarketingPerson 2 - Yamal
        Person person15 = new Person("Yamal");
        MarketingPersonProfile marketingPerson2 = business.getMarketingPersonDirectory().newMarketingPersonProfile(person15);
        UserAccount userAccount5 = business.getUserAccountDirectory().newUserAccount(marketingPerson2, "Yamal", "yamal");

        //Order 1
        Order order1 = business.getMasterOrderList().newOrder(customer1, salesPerson1);
        OrderItem orderItem1 = order1.newOrderItem(product1, 2550, 1); // Above target
        OrderItem orderItem2 = order1.newOrderItem(product11, 2700, 1); // Above target
        OrderItem orderItem3 = order1.newOrderItem(product21, 1300, 1); // Below target

//Order 2
        Order order2 = business.getMasterOrderList().newOrder(customer2, salesPerson2);
        OrderItem orderItem4 = order2.newOrderItem(product1, 2000, 1); // Above target
        OrderItem orderItem5 = order2.newOrderItem(product12, 3175, 1); // Above target
        OrderItem orderItem6 = order2.newOrderItem(product22, 1450, 1); // Below target

//Order 3
        Order order3 = business.getMasterOrderList().newOrder(customer3, salesPerson3);
        OrderItem orderItem7 = order3.newOrderItem(product1, 2100, 1); // Above target
        OrderItem orderItem8 = order3.newOrderItem(product13, 3009, 1); // Above target
        OrderItem orderItem9 = order3.newOrderItem(product23, 1300, 1); // Below target

//Order 4
        Order order4 = business.getMasterOrderList().newOrder(customer4, salesPerson1);
        OrderItem orderItem10 = order4.newOrderItem(product1, 2400, 1); // Above target
        OrderItem orderItem11 = order4.newOrderItem(product14, 3060, 1); // Above target
        OrderItem orderItem12 = order4.newOrderItem(product24, 1375, 1); // Below target

//Order 5
        Order order5 = business.getMasterOrderList().newOrder(customer5, salesPerson2);
        OrderItem orderItem13 = order5.newOrderItem(product1, 2300, 1); // Above target
        OrderItem orderItem14 = order5.newOrderItem(product15, 2170, 1); // Above target
        OrderItem orderItem15 = order5.newOrderItem(product25, 1250, 1); // Below target

//Order 6
        Order order6 = business.getMasterOrderList().newOrder(customer6, salesPerson3);
        OrderItem orderItem16 = order6.newOrderItem(product1, 2340, 1); // Above target
        OrderItem orderItem17 = order6.newOrderItem(product16, 2100, 1); // Above target
        OrderItem orderItem18 = order6.newOrderItem(product26, 1150, 1); // Below target

//Order 7
        Order order7 = business.getMasterOrderList().newOrder(customer7, salesPerson1);
        OrderItem orderItem19 = order7.newOrderItem(product1, 2100, 1); // Above target
        OrderItem orderItem20 = order7.newOrderItem(product17, 2150, 1); // Above target
        OrderItem orderItem21 = order7.newOrderItem(product27, 1250, 1); // Below target

//Order 8
        Order order8 = business.getMasterOrderList().newOrder(customer8, salesPerson2);
        OrderItem orderItem22 = order8.newOrderItem(product1, 2370, 1); // Above target
        OrderItem orderItem23 = order8.newOrderItem(product18, 2950, 1); // Above target
        OrderItem orderItem24 = order8.newOrderItem(product28, 1100, 1); // Below target

//Order 9
        Order order9 = business.getMasterOrderList().newOrder(customer9, salesPerson3);
        OrderItem orderItem25 = order9.newOrderItem(product1, 2220, 1); // Above target
        OrderItem orderItem26 = order9.newOrderItem(product19, 2600, 1); // Above target
        OrderItem orderItem27 = order9.newOrderItem(product29, 1150, 1); // Below target

//Order 10
        Order order10 = business.getMasterOrderList().newOrder(customer10, salesPerson1);
        OrderItem orderItem28 = order10.newOrderItem(product1, 2490, 1); // Above target
        OrderItem orderItem29 = order10.newOrderItem(product20, 2400, 1); // Above target
        OrderItem orderItem30 = order10.newOrderItem(product30, 1150, 1); // Below target

//  10 more orders
        Order order11 = business.getMasterOrderList().newOrder(customer1, salesPerson2);
        OrderItem orderItem31 = order11.newOrderItem(product31, 2550, 1); // Above target
        OrderItem orderItem32 = order11.newOrderItem(product41, 2100, 1); // Above target
        OrderItem orderItem33 = order11.newOrderItem(product1, 1300, 1); // Below target

        Order order12 = business.getMasterOrderList().newOrder(customer2, salesPerson3);
        OrderItem orderItem34 = order12.newOrderItem(product32, 2900, 1); // Above target
        OrderItem orderItem35 = order12.newOrderItem(product42, 2975, 1); // Above target
        OrderItem orderItem36 = order12.newOrderItem(product2, 1450, 1); // Below target

        Order order13 = business.getMasterOrderList().newOrder(customer3, salesPerson1);
        OrderItem orderItem37 = order13.newOrderItem(product33, 2300, 1); // Above target
        OrderItem orderItem38 = order13.newOrderItem(product43, 2900, 1); // Above target
        OrderItem orderItem39 = order13.newOrderItem(product3, 1500, 1); // Below target

        Order order14 = business.getMasterOrderList().newOrder(customer4, salesPerson2);
        OrderItem orderItem40 = order14.newOrderItem(product34, 2000, 1); // Above target
        OrderItem orderItem41 = order14.newOrderItem(product44, 2960, 1); // Above target
        OrderItem orderItem42 = order14.newOrderItem(product4, 1275, 1); // Below target

        Order order15 = business.getMasterOrderList().newOrder(customer5, salesPerson3);
        OrderItem orderItem43 = order15.newOrderItem(product35, 2400, 1); // Above target
        OrderItem orderItem44 = order15.newOrderItem(product45, 2870, 1); // Above target
        OrderItem orderItem45 = order15.newOrderItem(product5, 1250, 1); // Below target

        Order order16 = business.getMasterOrderList().newOrder(customer6, salesPerson1);
        OrderItem orderItem46 = order16.newOrderItem(product36, 2375, 1); // Above target
        OrderItem orderItem47 = order16.newOrderItem(product46, 2100, 1); // Above target
        OrderItem orderItem48 = order16.newOrderItem(product6, 1150, 1); // Below target

        Order order17 = business.getMasterOrderList().newOrder(customer7, salesPerson2);
        OrderItem orderItem49 = order17.newOrderItem(product37, 2650, 1); // Above target
        OrderItem orderItem50 = order17.newOrderItem(product47, 2150, 1); // Above target
        OrderItem orderItem51 = order17.newOrderItem(product7, 1250, 1); // Below target

        Order order18 = business.getMasterOrderList().newOrder(customer8, salesPerson3);
        OrderItem orderItem52 = order18.newOrderItem(product38, 2250, 1); // Above target
        OrderItem orderItem53 = order18.newOrderItem(product48, 2950, 1); // Above target
        OrderItem orderItem54 = order18.newOrderItem(product8, 1100, 1); // Below target

        Order order19 = business.getMasterOrderList().newOrder(customer9, salesPerson1);
        OrderItem orderItem55 = order19.newOrderItem(product39, 2000, 1); // Above target
        OrderItem orderItem56 = order19.newOrderItem(product49, 2600, 1); // Above target
        OrderItem orderItem57 = order19.newOrderItem(product9, 900, 1); // Below target

        Order order20 = business.getMasterOrderList().newOrder(customer10, salesPerson2);
        OrderItem orderItem58 = order20.newOrderItem(product40, 2010, 1); // Above target
        OrderItem orderItem59 = order20.newOrderItem(product50, 2400, 1); // Above target
        OrderItem orderItem60 = order20.newOrderItem(product10, 950, 1); // Below target
        

        return business;
    }
}
