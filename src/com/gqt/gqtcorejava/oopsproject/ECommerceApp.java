//package com.gqt.gqtcorejava.oopsproject;
//
//import java.util.Scanner;
//
////---------------- PARENT CLASS ----------------
//class Product {
// String name;
// String company;
// int price;
//
// Product() { }
//
// void display() {
//     System.out.println("Product Name : " + name);
//     System.out.println("Company      : " + company);
//     System.out.println("Price        : ₹" + price);
//     System.out.println("---------------------------");
// }
//}
//
////---------------- CHILD CLASSES ----------------
//class Electronics extends Product {
// @Override
// void display() {
//     System.out.println("Category     : Electronics");
//     super.display();
// }
//}
//
//class Books extends Product {
// @Override
// void display() {
//     System.out.println("Category     : Books");
//     super.display();
// }
//}
//
//class Clothes extends Product {
// @Override
// void display() {
//     System.out.println("Category     : Clothes");
//     super.display();
// }
//}
//
//class Grocery extends Product {
// @Override
// void display() {
//     System.out.println("Category     : Grocery");
//     super.display();
// }
//}
//
//class Accessories extends Product {
// @Override
// void display() {
//     System.out.println("Category     : Accessories");
//     super.display();
// }
//}
//
////---------------- CART CLASS ----------------
//class Cart {
// Product[] items = new Product[500];
// int count = 0;
//
// void add(Product p) {
//     items[count++] = p;
//     System.out.println("Product added to cart\n");
// }
//
// void checkout() {
//     if (count == 0) {
//         System.out.println("Cart is empty");
//         return;
//     }
//
//     int total = 0;
//     System.out.println("\n===== CHECKOUT =====");
//
//     for (int i = 0; i < count; i++) {
//         items[i].display();
//         total += items[i].price;
//     }
//
//     System.out.println("Total Amount : ₹" + total);
//
//     Scanner sc = new Scanner(System.in);
//     System.out.println("\nPayment Method");
//     System.out.println("1. Net Banking");
//     System.out.println("2. UPI");
//     System.out.println("3. Debit Card");
//     sc.nextInt();
//
//     System.out.println("\nPurchased Successfully");
//     count = 0;
// }
//}
//
////---------------- MAIN APPLICATION ----------------
//public class ECommerceApp {
//
// static Scanner sc = new Scanner(System.in);
// static Cart cart = new Cart();
//
// // ------------- ELECTRONICS -------------
// static Electronics[] mobiles = new Electronics[10];
// static Electronics[] chargers = new Electronics[10];
// static Electronics[] laptops = new Electronics[10];
// static Electronics[] headphones = new Electronics[10];
//
// // ------------- BOOKS -------------
// static Books[] novels = new Books[10];
// static Books[] comics = new Books[10];
// static Books[] textbooks = new Books[10];
// static Books[] magazines = new Books[10];
//
// // ------------- CLOTHES -------------
// static Clothes[] shirts = new Clothes[10];
// static Clothes[] pants = new Clothes[10];
// static Clothes[] dresses = new Clothes[10];
// static Clothes[] jackets = new Clothes[10];
//
// // ------------- GROCERY -------------
// static Grocery[] fruits = new Grocery[10];
// static Grocery[] vegetables = new Grocery[10];
// static Grocery[] snacks = new Grocery[10];
// static Grocery[] beverages = new Grocery[10];
//
// // ------------- ACCESSORIES -------------
// static Accessories[] watches = new Accessories[10];
// static Accessories[] bags = new Accessories[10];
// static Accessories[] belts = new Accessories[10];
// static Accessories[] sunglasses = new Accessories[10];
//
// // ------------- LOAD ALL PRODUCTS -------------
// static void loadProducts() {
//     // Electronics
//     String[] mNames = {"Galaxy S21","iPhone 13","Redmi Note","Realme Pro","OnePlus Nord",
//                        "Pixel 6","Moto Edge","Vivo V25","Oppo Reno","Nokia G21"};
//     String[] mComp = {"Samsung","Apple","Xiaomi","Realme","OnePlus",
//                       "Google","Motorola","Vivo","Oppo","Nokia"};
//     int[] mPrice = {70000,80000,15000,18000,30000,60000,25000,22000,28000,17000};
//     for(int i=0;i<10;i++){
//         mobiles[i]=new Electronics(); mobiles[i].name=mNames[i]; mobiles[i].company=mComp[i]; mobiles[i].price=mPrice[i];
//         chargers[i]=new Electronics(); chargers[i].name="Charger "+(i+1); chargers[i].company="Brand "+(i+1); chargers[i].price=1000+i*200;
//         laptops[i]=new Electronics(); laptops[i].name="Laptop "+(i+1); laptops[i].company="Company "+(i+1); laptops[i].price=40000+i*5000;
//         headphones[i]=new Electronics(); headphones[i].name="Headphone "+(i+1); headphones[i].company="Brand "+(i+1); headphones[i].price=2000+i*500;
//     }
//
//     // Books
//     for(int i=0;i<10;i++){
//         novels[i]=new Books(); novels[i].name="Novel "+(i+1); novels[i].company="Author "+(i+1); novels[i].price=200+i*50;
//         comics[i]=new Books(); comics[i].name="Comic "+(i+1); comics[i].company="Publisher "+(i+1); comics[i].price=150+i*20;
//         textbooks[i]=new Books(); textbooks[i].name="Textbook "+(i+1); textbooks[i].company="Publisher "+(i+1); textbooks[i].price=400+i*100;
//         magazines[i]=new Books(); magazines[i].name="Magazine "+(i+1); magazines[i].company="Publisher "+(i+1); magazines[i].price=100+i*30;
//     }
//
//     // Clothes
//     for(int i=0;i<10;i++){
//         shirts[i]=new Clothes(); shirts[i].name="Shirt "+(i+1); shirts[i].company="Brand "+(i+1); shirts[i].price=800+i*50;
//         pants[i]=new Clothes(); pants[i].name="Pant "+(i+1); pants[i].company="Brand "+(i+1); pants[i].price=1200+i*70;
//         dresses[i]=new Clothes(); dresses[i].name="Dress "+(i+1); dresses[i].company="Brand "+(i+1); dresses[i].price=1500+i*100;
//         jackets[i]=new Clothes(); jackets[i].name="Jacket "+(i+1); jackets[i].company="Brand "+(i+1); jackets[i].price=2500+i*150;
//     }
//
//     // Grocery
//     for(int i=0;i<10;i++){
//         fruits[i]=new Grocery(); fruits[i].name="Fruit "+(i+1); fruits[i].company="Farm "+(i+1); fruits[i].price=50+i*10;
//         vegetables[i]=new Grocery(); vegetables[i].name="Vegetable "+(i+1); vegetables[i].company="Farm "+(i+1); vegetables[i].price=30+i*5;
//         snacks[i]=new Grocery(); snacks[i].name="Snack "+(i+1); snacks[i].company="Brand "+(i+1); snacks[i].price=20+i*5;
//         beverages[i]=new Grocery(); beverages[i].name="Beverage "+(i+1); beverages[i].company="Brand "+(i+1); beverages[i].price=40+i*10;
//     }
//
//     // Accessories
//     for(int i=0;i<10;i++){
//         watches[i]=new Accessories(); watches[i].name="Watch "+(i+1); watches[i].company="Brand "+(i+1); watches[i].price=2000+i*200;
//         bags[i]=new Accessories(); bags[i].name="Bag "+(i+1); bags[i].company="Brand "+(i+1); bags[i].price=1500+i*150;
//         belts[i]=new Accessories(); belts[i].name="Belt "+(i+1); belts[i].company="Brand "+(i+1); belts[i].price=500+i*50;
//         sunglasses[i]=new Accessories(); sunglasses[i].name="Sunglass "+(i+1); sunglasses[i].company="Brand "+(i+1); sunglasses[i].price=800+i*80;
//     }
// }
//
// // ---------- DISPLAY PRODUCTS ----------
// static void showProducts(Product[] products){
//     for(int i=0;i<products.length;i++){
//         System.out.println((i+1)+".");
//         products[i].display();
//     }
//     System.out.println("1. Add to Cart");
//     System.out.println("2. Buy Immediately");
//     int option=sc.nextInt();
//     System.out.print("Select product number: ");
//     int p=sc.nextInt()-1;
//     cart.add(products[p]);
//     if(option==2) cart.checkout();
// }
//
// // ---------- MAIN MENU ----------
// public static void main(String[] args){
//     loadProducts();
//     while(true){
//         System.out.println("\n===== E-COMMERCE WEBSITE =====");
//         System.out.println("1. Electronics");
//         System.out.println("2. Books");
//         System.out.println("3. Clothes");
//         System.out.println("4. Grocery");
//         System.out.println("5. Accessories");
//         System.out.println("6. Checkout");
//         System.out.println("7. Exit");
//
//         int choice=sc.nextInt();
//         switch(choice){
//             case 1:
//                 System.out.println("\n1. Mobiles\n2. Chargers\n3. Laptops\n4. Headphones");
//                 int e=sc.nextInt();
//                 if(e==1) showProducts(mobiles);
//                 else if(e==2) showProducts(chargers);
//                 else if(e==3) showProducts(laptops);
//                 else if(e==4) showProducts(headphones);
//                 break;
//
//             case 2:
//                 System.out.println("\n1. Novels\n2. Comics\n3. Textbooks\n4. Magazines");
//                 int b=sc.nextInt();
//                 if(b==1) showProducts(novels);
//                 else if(b==2) showProducts(comics);
//                 else if(b==3) showProducts(textbooks);
//                 else if(b==4) showProducts(magazines);
//                 break;
//
//             case 3:
//                 System.out.println("\n1. Shirts\n2. Pants\n3. Dresses\n4. Jackets");
//                 int c=sc.nextInt();
//                 if(c==1) showProducts(shirts);
//                 else if(c==2) showProducts(pants);
//                 else if(c==3) showProducts(dresses);
//                 else if(c==4) showProducts(jackets);
//                 break;
//
//             case 4:
//                 System.out.println("\n1. Fruits\n2. Vegetables\n3. Snacks\n4. Beverages");
//                 int g=sc.nextInt();
//                 if(g==1) showProducts(fruits);
//                 else if(g==2) showProducts(vegetables);
//                 else if(g==3) showProducts(snacks);
//                 else if(g==4) showProducts(beverages);
//                 break;
//
//             case 5:
//                 System.out.println("\n1. Watches\n2. Bags\n3. Belts\n4. Sunglasses");
//                 int a=sc.nextInt();
//                 if(a==1) showProducts(watches);
//                 else if(a==2) showProducts(bags);
//                 else if(a==3) showProducts(belts);
//                 else if(a==4) showProducts(sunglasses);
//                 break;
//
//             case 6:
//                 cart.checkout();
//                 break;
//
//             case 7:
//                 System.out.println("Thank you for shopping");
//                 System.exit(0);
//         }
//     }
// }
//}
