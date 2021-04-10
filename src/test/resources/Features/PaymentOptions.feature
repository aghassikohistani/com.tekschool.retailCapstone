Feature: Affiliate Payment Features: 



@BankTransfer 
Scenario: Register as an affiliate user with check payment method 
	Given User is on Retail website 
	And   User Click on affiliate link 
	And   User Click on new affiliate link 
	And   User fil affiliate with below information 
		|firstName|lastName|email|telephone|company|website|taxId|chequePayeeName|password|confirmPassword|
		|brandon|baker|joker@yahoo.com.com|2534567876|vulcan|vulcan.com|787878|brian|01234|01234|
	And User Click on about us link 
	And   User Click on contiue button 
	Then   User should see a sccess message 
@Payment 
Scenario: 
	Edit your affiliate information from cheque payment method Bank Transfer 
	Given User is on Retail website 
	And   User Click on affiliate link 
	And   User Click on new affiliate link 
	And   User fil affiliate with below information 
		|firstName|lastName|email|telephone|company|website|taxId|chequePayeeName|password|confirmPassword|
		|brandon|baker|porterdan@gmail.com|2534567876|vulcan|vulcan.com|787878|brian|01234|01234|
	And User Click on about us link 
	And   User Click on contiue button 
	Then   User should see a sccess message 
	And User click on the continue link 
	When User Click on Edit your affiliate information link 
	And User Click on Bank Transfer radio button 
	And User fill bank information with below information 
		|bankName|abaNumber|swiftCode|accountName|accountNumber|
		|BOA|7878|3334|Tyra|224343|
	And User Click on continue button 
	Then User click should see a success message 
@EditAccount 
Scenario: Edit Your Account Information 

	Given User is on Retail website 
	And   User Click on affiliate link 
	And   User Click on new affiliate link 
	And   User fil affiliate with below information 
		|firstName|lastName|email|telephone|company|website|taxId|chequePayeeName|password|confirmPassword|
		|brandon|baker|pool@gmail.com|2534567876|vulcan|vulcan.com|787878|brian|01234|01234|
	And User Click on about us link 
	And   User Click on contiue button 
	And   User should see a sccess message 
	When User click on Eidt your account information link 
	And User modify below information 
		|name|lastName|email|telephone|
		|jason|petzing|jordan|2063456534|
	And User click on continue button 
	Then User should see a scuccess message 'success: your account has been uodated' 
	
	
	
	
   