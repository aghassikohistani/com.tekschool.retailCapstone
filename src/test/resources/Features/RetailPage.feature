@retailPage 
Feature: Retail Website Features 



Background: 
	Given User is on Retail website 
	
	
	
	
Scenario: Search functionality Test case 
	When User search for 'iphone' 
	And User click on search button 
	Then User should see Iphone image 
	
	
	
Scenario Outline: Test Search Functionality with multiple set of Data 
	When User search for '<itemName>' 
	And User click on search button 
	
	
	Examples: 
		|itemName|
		|iphone|
		|mac book|
		|Canon|
		
		
@RegisterTest 
Scenario: Register an Account test case 
	When User click on MyAccount 
	And User click on Register option 
	And User fill the Registration form with Below information 
		|firstName|lastName|email|telephone|password|confirmPassword|subscribe|
		|Alex|Sokolova|alex@gmail.com|1012026633|test|test|no|
	And User accept the privacy and policy 
	And User click on Continue button 
	Then User should be registered in Retail Website 
	
@TestDesktopsTab 
Scenario: User verify all items are present in desktops tab 
	When User click on Desktop tab 
	And User click on show all Desktop link 
	Then User should see all Desktop 
	Then see all items are present on Desktop 
	
@HpLP3060 
Scenario: User add HP LP 3065 from Desktops tab to the cart 
	When User click on Desktop tab 
	And User click on show all Desktop link 
	And User Click ADD TO  CART Option on ‘HP LP3065’ item 	And User Select quantity one 
	And User Click add to cart button 
	Then User should see a message ‘success: you have added HP LP 3065 to your Shopping cart’ 
	
@CanonEos
Scenario: User add Canon EOS 5D from Desktops tab to the cart 

	When User click on Desktop tab 
	And User click on show all Desktop link 
	And User click ADD TO CART option on ‘Canon EOS 5D’ item 
	And User select color ‘Red’ 
	And User Select quantity 1 
	And User click add to Cart button 
	Then User should see a message ‘Success: You have added Canon EOS 5D to your shopping cart!’ 
	
@CanonReview 
Scenario: User add review to Canon EOS 5D item in Desktops tab 

	When User click on Desktop tab 
	And User click on show all Desktop link 
	And User click on EOS 5D item 
	And User click on write a review link 
	And user fill the review information with below information 
		|yourName|reviews| 
		|Aghasi|Great product, I have been using made in Japan for ever|
	And User click on good or bad radio button 
	And User click on Continue Button 
	Then User should see a message with ‘Thank you for your review . it has been submitted to the webmaster for approval 
	
@HpDesktop 
Scenario: User add HP LP 3065 from Desktops tab to the cart 
	Given User is on Retail website 
	When User click on Desktop tab 
	And User click on show all Desktop link 
	And User Click ADD TO  CART Option on ‘HP LP3065’ item 	And User Select quantity one 
	And User Click add to cart button 
	Then User should see a message ‘success: you have added HP LP 3065 to your Shopping cart 
	
	
	
	
