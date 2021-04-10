Feature: Laptop & NoteBooks 

@TestDesktopsTab 
Scenario: User verify all items are present in desktops tab 
	When User click on Desktop tab 
	And User click on show all Desktop link 
	Then User should see all Desktop 
	Then see all items are present on Desktop 
	
	
@AddToCartMackBook 
Scenario: Add And  Remove a Mac book from cart 
	Given  User is on Retail website 
	When  User click on Laptops & NoteBook tab 
	And  User click on show all Laptop &NoteBook option 
	And  User click on Macbook item 
	And  User click on add to Cart button 
	Then  User should see a message ‘Success: You have added MacBook to your shopping Cart!’ 
	
@productCamparison 
Scenario: Product Comparison 

	Given  User is on Retail website 
	When  User click on Laptops & NoteBook tab 
	And  User click on show all Laptop &NoteBook option 
	And   User click on product comparison icon on ‘MackBook’ 
	And   User click on product copmarison icon on ‘MackBook Air 
	Then   User should see a message ‘Success: You have added Mackook Air to your product comparison!’ 
	And    User click on product comparison link 
	Then    User should see product Comparison Chart. 
@wishList
Scenario: Adding an item to wish list 

	Given  User is on Retail website 
	When  User click on Laptops & NoteBook tab 
	And  User click on show all Laptop &NoteBook option 
	And   User click on heart icon to add ‘Sony Vaio’ laptop t wish list 
	Then    User should get a message ‘You must login or create account to save Sony Vaio to your wish list!’ 
@MacBookPro 
Scenario: Validate the price of MacBook pro is 200 
	Given  User is on Retail website 
	When  User click on Laptops & NoteBook tab 
	And  User click on show all Laptop &NoteBook option 
	And    User click on ‘MacBook pro’ item 
	Then    User should see ‘$2000.00’ price tag is present on UI. 
	
	
	
	
	
	
