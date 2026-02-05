package com.gqt.gqtcorejava.oopsproject;

import java.util.Scanner;
class Colors {

    
    public static final String RESET = "\u001B[0m";
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String BRIGHT_PURPLE = "\u001B[95m";
    public static final String MAGENTA = "\u001B[35m";
    public static final String CYAN    = "\u001B[36m";

}


class Product {
	int id;
	String name, brand, color;
	double price;

	Product(int id, String name, String brand, String color, double price) {
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.color = color;
		this.price = price;
	}

	void display() {
	    System.out.println(Colors.BLUE + "------------------------------------------" + Colors.RESET);

	    System.out.printf(Colors.BLUE + "| ID      : %-28d |" + Colors.RESET + "\n", id);
	    System.out.printf(Colors.BLUE + "| Name    : %-28s |" + Colors.RESET + "\n", name);
	    System.out.printf(Colors.BLUE + "| Brand   : %-28s |" + Colors.RESET + "\n", brand);
	    System.out.printf(Colors.BLUE + "| Color   : %-28s |" + Colors.RESET + "\n", color);
	    System.out.printf(Colors.BLUE + "| Price   : %-27.2f  |" + Colors.RESET + "\n", price);

	    System.out.println(Colors.BLUE + "------------------------------------------" + Colors.RESET);
	}

}

class Cart {
	Product[] items = new Product[200];
	int count = 0;

	void add(Product p) {
		items[count++] = p;
		System.out.println(Colors.GREEN+"\nAdded to Cart"+Colors.RESET);
	}

	double checkout() {
		if (count == 0) {
			System.out.println(Colors.RED+"\nCart is empty!"+Colors.RESET);
			return 0;
		}

		double total = 0;
		System.out.println(Colors.BRIGHT_PURPLE+"\n===== The Items You Added int The Cart ====="+Colors.RESET);
		for (int i = 0; i < count; i++) {
			items[i].display();
			total += items[i].price;
		}
		System.out.println(Colors.GREEN+"TOTAL AMOUNT: " + total);
		return total;
	}
}

class Payment {

    static void pay(double amount) {
        Scanner sc = new Scanner(System.in);
        
//        System.out.println(Colors.MAGENTA + "Choose Payment Method:" + Colors.RESET);
//        System.out.println(Colors.RED+"-----------------------------------"+Colors.RESET);
//        
//        System.out.println(Colors.RED + "1. UPI" + Colors.RESET);
//        System.out.println(Colors.RED + "2. Net Banking" + Colors.RESET);
//        System.out.println(Colors.RED + "3. Card" + Colors.RESET);
//        
//        System.out.println(Colors.RED+"-----------------------------------"+Colors.RESET);
        
        System.out.println(Colors.RED + 
			    "--------------------------------------------\n" +
			    "|      CHOOSE YOUR PAYMENT METHOD          |\n" +
			    "--------------------------------------------\n" +
			    "| 1. UPI                                   |\n" +
			    "| 2. NET BANKING                           |\n" +
			    "| 3. CARD                                  |\n" +
			    "--------------------------------------------" +
			Colors.RESET);
        System.out.println(Colors.MAGENTA+"Select Your Payment method :");
        sc.nextInt();

        System.out.println(Colors.GREEN + "\nPAYMENT SUCCESSFUL" + "\nAmount Paid : " + amount +Colors.RESET );
    }
}

class ProductHelper {
	static Scanner sc = new Scanner(System.in);

	static void showProducts(Product[] products, Cart cart) {
		for (int i = 0; i < products.length; i++) {
			products[i].display();
		}
		System.out.println("................");
		System.out.println(":"+Colors.GREEN+"1. Add to Cart"+Colors.RESET+":");
		System.out.println("................");
		
		System.out.println("............");
		System.out.println(":"+Colors.GREEN+"2. Buy Now"+Colors.RESET+":");
		System.out.println("............");
		

//		System.out.println("1. Add to Cart");
//		System.out.println("2. Buy Now");
		System.out.println(Colors.MAGENTA+"Enter Your Option :"+Colors.RESET);
		int option = sc.nextInt();

		System.out.print(Colors.MAGENTA+"Select Product ID: "+Colors.RESET);
		int id = sc.nextInt();

		if (option == 1)
			cart.add(products[id - 1]);
		else
			Payment.pay(products[id - 1].price);
	}
}

public class ECOMMERCE {

	static Scanner sc = new Scanner(System.in);
	static Cart cart = new Cart();

	static Product[] mobiles = { new Product(1, "Galaxy S23", "Samsung", "Black", 74999),
			new Product(2, "iPhone 15", "Apple", "Blue", 79999), new Product(3, "Pixel 8", "Google", "Grey", 69999),
			new Product(4, "OnePlus 12", "OnePlus", "Green", 65999),
			new Product(5, "Vivo X100", "Vivo", "Black", 55999),
			new Product(6, "Oppo Reno 11", "Oppo", "Silver", 42999),
			new Product(7, "Realme GT Neo", "Realme", "Yellow", 34999),
			new Product(8, "Motorola Edge", "Motorola", "Blue", 31999),
			new Product(9, "Nothing Phone 2", "Nothing", "White", 44999),
			new Product(10, "iQOO Neo 9", "iQOO", "Black", 37999) };

	static Product[] laptops = { new Product(1, "Inspiron 15", "Dell", "Silver", 55999),
			new Product(2, "Pavilion", "HP", "Grey", 58999), new Product(3, "MacBook Air", "Apple", "Gold", 99999),
			new Product(4, "ThinkPad", "Lenovo", "Black", 68999), new Product(5, "Vivobook", "Asus", "Blue", 52999),
			new Product(6, "Acer Aspire", "Acer", "Grey", 49999), new Product(7, "MSI Modern", "MSI", "Black", 64999),
			new Product(8, "Samsung Book", "Samsung", "Silver", 61999),
			new Product(9, "Surface Laptop", "Microsoft", "Platinum", 89999),
			new Product(10, "Honor MagicBook", "Honor", "Grey", 56999) };

	static Product[] tvs = { new Product(1, "Bravia 55\"", "Sony", "Black", 74999),
			new Product(2, "Crystal UHD", "Samsung", "Black", 65999), new Product(3, "OLED CX", "LG", "Black", 119999),
			new Product(4, "Android TV", "Mi", "Black", 39999),
			new Product(5, "4K Smart TV", "OnePlus", "Black", 54999),
			new Product(6, "LED TV", "Panasonic", "Black", 45999), new Product(7, "Smart TV", "TCL", "Black", 42999),
			new Product(8, "Vision Pro", "Vu", "Black", 34999), new Product(9, "Fire TV", "Amazon", "Black", 49999),
			new Product(10, "Ultra HD", "Hisense", "Black", 37999) };

	static Product[] audio = { new Product(1, "Soundbar", "JBL", "Black", 14999),
			new Product(2, "Home Theatre", "Sony", "Black", 29999),
			new Product(3, "Bluetooth Speaker", "Boat", "Red", 4999),
			new Product(4, "Wireless Earbuds", "Apple", "White", 19999),
			new Product(5, "Neckband", "OnePlus", "Black", 2999), new Product(6, "Headphones", "Bose", "Black", 24999),
			new Product(7, "Party Speaker", "JBL", "Black", 19999),
			new Product(8, "Soundbar", "Samsung", "Black", 17999),
			new Product(9, "Portable Speaker", "Anker", "Blue", 6999),
			new Product(10, "Studio Monitor", "Yamaha", "Black", 15999) };

	static Product[] programming = { new Product(1, "Effective Java", "Pearson", "N/A", 799),
			new Product(2, "Clean Code", "PH", "N/A", 899), new Product(3, "Java Complete Ref", "Oracle", "N/A", 699),
			new Product(4, "DSA Made Easy", "GFG", "N/A", 599), new Product(5, "Spring Boot", "Packt", "N/A", 749),
			new Product(6, "Python Crash", "NoStarch", "N/A", 650), new Product(7, "C Programming", "PHI", "N/A", 499),
			new Product(8, "JavaScript Guide", "OReilly", "N/A", 699), new Product(9, "SQL Bible", "Wiley", "N/A", 799),
			new Product(10, "Android Dev", "Pearson", "N/A", 699) };

	static Product[] fiction = { new Product(1, "Harry Potter", "Bloomsbury", "N/A", 499),
			new Product(2, "The Hobbit", "Harper", "N/A", 399), new Product(3, "The Alchemist", "Harper", "N/A", 299),
			new Product(4, "1984", "Penguin", "N/A", 349), new Product(5, "Dune", "Ace", "N/A", 549),
			new Product(6, "It Ends With Us", "Atria", "N/A", 399),
			new Product(7, "Sherlock Holmes", "Fingerprint", "N/A", 299),
			new Product(8, "Inferno", "Doubleday", "N/A", 499), new Product(9, "Dracula", "Penguin", "N/A", 279),
			new Product(10, "The Shining", "Anchor", "N/A", 459) };

	static Product[] selfHelp = { new Product(1, "Atomic Habits", "Penguin", "N/A", 399),
			new Product(2, "Think Fast Slow", "Penguin", "N/A", 499), new Product(3, "7 Habits", "Simon", "N/A", 449),
			new Product(4, "Power of Now", "NewWorld", "N/A", 349),
			new Product(5, "Rich Dad Poor Dad", "Plata", "N/A", 399), new Product(6, "Ikigai", "Penguin", "N/A", 299),
			new Product(7, "Mindset", "Ballantine", "N/A", 399),
			new Product(8, "Deep Work", "GrandCentral", "N/A", 449), new Product(9, "Grit", "Scribner", "N/A", 499),
			new Product(10, "Who Moved Cheese", "Putnam", "N/A", 279) };

	static Product[] academic = { new Product(1, "Engineering Math", "Pearson", "N/A", 699),
			new Product(2, "DBMS", "McGraw", "N/A", 599), new Product(3, "OS Concepts", "Wiley", "N/A", 749),
			new Product(4, "CN", "Pearson", "N/A", 699), new Product(5, "Compiler Design", "PHI", "N/A", 649),
			new Product(6, "AI Basics", "McGraw", "N/A", 799), new Product(7, "ML Guide", "OReilly", "N/A", 899),
			new Product(8, "Data Mining", "Pearson", "N/A", 749), new Product(9, "Software Engg", "PHI", "N/A", 699),
			new Product(10, "Cyber Security", "Wiley", "N/A", 799) };

	static Product[] menWear = { new Product(1, "Casual Shirt", "Allen Solly", "Blue", 1999),
			new Product(2, "Formal Shirt", "Van Heusen", "White", 2499),
			new Product(3, "T-Shirt", "Puma", "Black", 1299), new Product(4, "Jeans", "Levis", "Blue", 2999),
			new Product(5, "Kurta", "Manyavar", "Cream", 3499), new Product(6, "Hoodie", "HRX", "Grey", 2799),
			new Product(7, "Jacket", "Roadster", "Brown", 3999), new Product(8, "Blazer", "Raymond", "Navy", 5999),
			new Product(9, "Track Pant", "Adidas", "Black", 2199), new Product(10, "Sweatshirt", "Nike", "Red", 2599) };

	static Product[] womenWear = { new Product(1, "Saree", "Biba", "Red", 4999),
			new Product(2, "Kurti", "W", "Blue", 2499), new Product(3, "Top", "Zara", "Black", 1999),
			new Product(4, "Jeans", "Levis", "Blue", 2999), new Product(5, "Dress", "H&M", "Pink", 3499),
			new Product(6, "Skirt", "Forever21", "Grey", 2299), new Product(7, "Leggings", "Go Colors", "Black", 999),
			new Product(8, "Jacket", "Only", "Brown", 3799), new Product(9, "Sweater", "Marks", "Cream", 2899),
			new Product(10, "Palazzo", "Global Desi", "Maroon", 1999) };

	static Product[] footwear = { new Product(1, "Running Shoes", "Nike", "Black", 6999),
			new Product(2, "Sneakers", "Adidas", "White", 6499),
			new Product(3, "Formal Shoes", "Clarks", "Brown", 5999), new Product(4, "Loafers", "Woodland", "Tan", 4999),
			new Product(5, "Heels", "Catwalk", "Red", 3499), new Product(6, "Sandals", "Bata", "Black", 1999),
			new Product(7, "Flip Flops", "Puma", "Blue", 1299), new Product(8, "Boots", "Hush Puppies", "Brown", 7999),
			new Product(9, "Slippers", "Relaxo", "Grey", 999),
			new Product(10, "Sports Shoes", "Reebok", "Green", 5799) };

	static Product[] watches = { new Product(1, "Analog Watch", "Titan", "Silver", 7999),
			new Product(2, "Smart Watch", "Apple", "Black", 39999),
			new Product(3, "Digital Watch", "Casio", "Black", 4999),
			new Product(4, "Chronograph", "Fossil", "Brown", 12999),
			new Product(5, "Luxury Watch", "Rolex", "Gold", 199999),
			new Product(6, "Sports Watch", "Garmin", "Blue", 24999),
			new Product(7, "Leather Watch", "Tommy", "Brown", 9999),
			new Product(8, "Fitness Band", "Mi", "Black", 3999),
			new Product(9, "Hybrid Watch", "Withings", "Silver", 18999),
			new Product(10, "Classic Watch", "HMT", "White", 2999) };

	static Product[] furniture = { new Product(1, "Sofa Set", "Ikea", "Grey", 45999),
			new Product(2, "Dining Table", "Godrej", "Brown", 38999), new Product(3, "Bed", "Wakefit", "Walnut", 54999),
			new Product(4, "Chair", "Nilkamal", "Black", 4999),
			new Product(5, "Coffee Table", "Urban Ladder", "Teak", 12999),
			new Product(6, "Wardrobe", "Durian", "Brown", 64999),
			new Product(7, "Bookshelf", "Pepperfry", "White", 8999), new Product(8, "TV Unit", "Ikea", "Oak", 15999),
			new Product(9, "Recliner", "LaZBoy", "Beige", 79999),
			new Product(10, "Study Table", "HomeTown", "Brown", 11999) };

	static Product[] lighting = { new Product(1, "LED Bulb", "Philips", "White", 399),
			new Product(2, "Ceiling Light", "Syska", "Warm", 2499),
			new Product(3, "Table Lamp", "Wipro", "Yellow", 1999),
			new Product(4, "Wall Light", "Havells", "White", 2999),
			new Product(5, "Chandelier", "Homesake", "Gold", 15999),
			new Product(6, "Floor Lamp", "Ikea", "Black", 4999),
			new Product(7, "Spot Light", "Crompton", "White", 1499),
			new Product(8, "Pendant Light", "DecorNation", "Copper", 6999),
			new Product(9, "Night Lamp", "Mi", "White", 1299),
			new Product(10, "Smart Light", "Philips Hue", "Multi", 8999) };

	static Product[] wallDecor = { new Product(1, "Wall Painting", "ArtStreet", "Blue", 4999),
			new Product(2, "Wall Clock", "Ajanta", "Brown", 1999), new Product(3, "Mirror", "Ikea", "Silver", 3499),
			new Product(4, "Wall Stickers", "Decals", "Multi", 999),
			new Product(5, "Photo Frame", "Furnish", "Black", 1299),
			new Product(6, "Metal Art", "Homesake", "Gold", 6999),
			new Product(7, "Wooden Art", "CraftVatika", "Brown", 5499),
			new Product(8, "Canvas Art", "Artzolo", "Multi", 2999),
			new Product(9, "Floating Shelves", "Pepperfry", "White", 3999),
			new Product(10, "Wall Panels", "Asian Paints", "Grey", 7999) };

	static Product[] kitchen = { new Product(1, "Mixer Grinder", "Prestige", "White", 4999),
			new Product(2, "Microwave Oven", "LG", "Black", 15999),
			new Product(3, "Induction Stove", "Philips", "Black", 3499),
			new Product(4, "Cookware Set", "Pigeon", "Grey", 2999),
			new Product(5, "Gas Stove", "Sunflame", "Black", 6999),
			new Product(6, "Air Fryer", "Philips", "Black", 11999), new Product(7, "Toaster", "Morphy", "White", 2499),
			new Product(8, "Electric Kettle", "Bajaj", "Silver", 1999),
			new Product(9, "Rice Cooker", "Panasonic", "White", 3499),
			new Product(10, "Water Purifier", "Kent", "White", 18999) };

	static Product[] bags = { new Product(1, "Laptop Bag", "American Tourister", "Black", 2999),
			new Product(2, "Travel Bag", "Skybags", "Blue", 4999),
			new Product(3, "Backpack", "Wildcraft", "Grey", 3499), new Product(4, "Handbag", "Caprese", "Brown", 3999),
			new Product(5, "Sling Bag", "Baggit", "Red", 2499), new Product(6, "Duffle Bag", "Puma", "Black", 2799),
			new Product(7, "School Bag", "Gear", "Blue", 1999),
			new Product(8, "Office Bag", "Samsonite", "Black", 5999), new Product(9, "Gym Bag", "Nike", "Green", 2299),
			new Product(10, "Messenger Bag", "Fossil", "Brown", 8999) };

	static Product[] sunglasses = { new Product(1, "Aviator", "RayBan", "Black", 7999),
			new Product(2, "Wayfarer", "Polaroid", "Brown", 4999),
			new Product(3, "Sport Glasses", "Oakley", "Blue", 12999),
			new Product(4, "Round Frame", "Vincent Chase", "Gold", 3999),
			new Product(5, "Cat Eye", "Fastrack", "Pink", 2999), new Product(6, "Polarized", "IDEE", "Black", 3499),
			new Product(7, "Square Frame", "Tommy", "Brown", 5999),
			new Product(8, "Oversized", "Gucci", "Black", 24999), new Product(9, "Classic", "Carrera", "Grey", 6999),
			new Product(10, "Fashion", "Prada", "Brown", 19999) };

	static Product[] belts = { new Product(1, "Leather Belt", "Louis Philippe", "Brown", 1999),
			new Product(2, "Formal Belt", "Allen Solly", "Black", 1799),
			new Product(3, "Casual Belt", "Wrangler", "Tan", 1499),
			new Product(4, "Reversible Belt", "Van Heusen", "Black", 2299),
			new Product(5, "Stud Belt", "Woodland", "Brown", 2499),
			new Product(6, "Canvas Belt", "Levis", "Blue", 1299), new Product(7, "Slim Belt", "Zara", "Black", 1999),
			new Product(8, "Designer Belt", "Gucci", "Black", 39999),
			new Product(9, "Sports Belt", "Nike", "Grey", 1599),
			new Product(10, "Classic Belt", "Park Avenue", "Brown", 1899) };

	static Product[] wallets = { new Product(1, "Leather Wallet", "Fossil", "Brown", 3499),
			new Product(2, "Slim Wallet", "Tommy", "Black", 2999),
			new Product(3, "Bifold Wallet", "Levis", "Brown", 1999),
			new Product(4, "Card Holder", "Louis Philippe", "Black", 2499),
			new Product(5, "Zipper Wallet", "Caprese", "Red", 2799),
			new Product(6, "Travel Wallet", "Samsonite", "Black", 3999),
			new Product(7, "Designer Wallet", "Gucci", "Black", 49999),
			new Product(8, "RFID Wallet", "Wildcraft", "Grey", 2299),
			new Product(9, "Trifold Wallet", "Van Heusen", "Brown", 2599),
			new Product(10, "Classic Wallet", "Hidesign", "Tan", 4499) };

	public static void main(String[] args) {

	    while (true) {

	        System.out.println(Colors.YELLOW +
	                "--------------------------------------------\n" +
	                "|          E-COMMERCE SYSTEM                |\n" +
	                "--------------------------------------------\n" +
	                "| 1. Electronics                           |\n" +
	                "| 2. Books                                 |\n" +
	                "| 3. Fashion                               |\n" +
	                "| 4. Home Decor                            |\n" +
	                "| 5. Accessories                           |\n" +
	                "| 6. Checkout                              |\n" +
	                "| 7. Exit                                  |\n" +
	                "--------------------------------------------" +
	                Colors.RESET);

	        System.out.println(Colors.MAGENTA + "Choose your interested Section:" + Colors.RESET);
	        int choice = sc.nextInt();

	        if (choice == 1) {

	            System.out.println(Colors.YELLOW +
	                    "--------------------------------------------\n" +
	                    "|          ELECTRONICS                     |\n" +
	                    "--------------------------------------------\n" +
	                    "| 1. MOBILES                               |\n" +
	                    "| 2. LAPTOPS                               |\n" +
	                    "| 3. TVs                                   |\n" +
	                    "| 4. AUDIO DEVICES                         |\n" +
	                    "--------------------------------------------" +
	                    Colors.RESET);

	            System.out.println(Colors.MAGENTA + "Choose one which id you looking for :" + Colors.RESET);
	            int s = sc.nextInt();

	            if (s == 1)
	                ProductHelper.showProducts(mobiles, cart);
	            else if (s == 2)
	                ProductHelper.showProducts(laptops, cart);
	            else if (s == 3)
	                ProductHelper.showProducts(tvs, cart);
	            else if (s == 4)
	                ProductHelper.showProducts(audio, cart);
	            else
	                System.out.println(Colors.RED + "Invalid option!" + Colors.RESET);
	        }
	        else if (choice == 2) {

	            System.out.println(Colors.YELLOW +
	                    "--------------------------------------------\n" +
	                    "|          BOOKS                           |\n" +
	                    "--------------------------------------------\n" +
	                    "| 1. PROGRAMMING                           |\n" +
	                    "| 2. FICTION                               |\n" +
	                    "| 3. SELF-HELP                             |\n" +
	                    "| 4. ACADEMICS                             |\n" +
	                    "--------------------------------------------" +
	                    Colors.RESET);

	            System.out.println(Colors.MAGENTA + "Choose your book type :" + Colors.RESET);
	            int s = sc.nextInt();

	            if (s == 1)
	                ProductHelper.showProducts(programming, cart);
	            else if (s == 2)
	                ProductHelper.showProducts(fiction, cart);
	            else if (s == 3)
	                ProductHelper.showProducts(selfHelp, cart);
	            else if (s == 4)
	                ProductHelper.showProducts(academic, cart);
	            else
	                System.out.println(Colors.RED + "Invalid option!" + Colors.RESET);
	        }
	        else if (choice == 3) {

	            System.out.println(Colors.YELLOW +
	                    "--------------------------------------------\n" +
	                    "|          FASHION                         |\n" +
	                    "--------------------------------------------\n" +
	                    "| 1. MENS WEAR                             |\n" +
	                    "| 2. WOMEN WEAR                            |\n" +
	                    "| 3. FOOTWEAR                              |\n" +
	                    "| 4. WATCHES                               |\n" +
	                    "--------------------------------------------" +
	                    Colors.RESET);

	            System.out.println(Colors.MAGENTA + "Choose one from the above :" + Colors.RESET);
	            int s = sc.nextInt();

	            if (s == 1)
	                ProductHelper.showProducts(menWear, cart);
	            else if (s == 2)
	                ProductHelper.showProducts(womenWear, cart);
	            else if (s == 3)
	                ProductHelper.showProducts(footwear, cart);
	            else if (s == 4)
	                ProductHelper.showProducts(watches, cart);
	            else
	                System.out.println(Colors.RED + "Invalid option!" + Colors.RESET);
	        }
	        else if (choice == 4) {

	            System.out.println(Colors.YELLOW +
	                    "--------------------------------------------\n" +
	                    "|          HOME DECOR                      |\n" +
	                    "--------------------------------------------\n" +
	                    "| 1. FURNITURE                             |\n" +
	                    "| 2. LIGHTING                              |\n" +
	                    "| 3. WALL DECOR                            |\n" +
	                    "| 4. KITCHEN                               |\n" +
	                    "--------------------------------------------" +
	                    Colors.RESET);

	            System.out.println(Colors.MAGENTA + "Choose one from the above :" + Colors.RESET);
	            int s = sc.nextInt();

	            if (s == 1)
	                ProductHelper.showProducts(furniture, cart);
	            else if (s == 2)
	                ProductHelper.showProducts(lighting, cart);
	            else if (s == 3)
	                ProductHelper.showProducts(wallDecor, cart);
	            else if (s == 4)
	                ProductHelper.showProducts(kitchen, cart);
	            else
	                System.out.println(Colors.RED + "Invalid option!" + Colors.RESET);
	        }

	        else if (choice == 5) {

	            System.out.println(Colors.YELLOW +
	                    "--------------------------------------------\n" +
	                    "|          ACCESSORIES                     |\n" +
	                    "--------------------------------------------\n" +
	                    "| 1. BAGS                                  |\n" +
	                    "| 2. SUNGLASSES                            |\n" +
	                    "| 3. BELTS                                 |\n" +
	                    "| 4. WALLETS                               |\n" +
	                    "--------------------------------------------" +
	                    Colors.RESET);

	            System.out.println(Colors.MAGENTA + "Choose one from the above :" + Colors.RESET);
	            int s = sc.nextInt();

	            if (s == 1)
	                ProductHelper.showProducts(bags, cart);
	            else if (s == 2)
	                ProductHelper.showProducts(sunglasses, cart);
	            else if (s == 3)
	                ProductHelper.showProducts(belts, cart);
	            else if (s == 4)
	                ProductHelper.showProducts(wallets, cart);
	            else
	                System.out.println(Colors.RED + "Invalid option!" + Colors.RESET);
	        }
	        else if (choice == 6) {
	            double total = cart.checkout();
	            if (total > 0)
	                Payment.pay(total);
	        }

	       
	        else if (choice == 7) {
	            System.out.println(Colors.RED + "Thank you for shopping!" + Colors.RESET);
	            return;
	        }
	        else {
	            System.out.println(Colors.GREEN + "Invalid choice! Try again." + Colors.RESET);
	        }
	    }
	}
}

