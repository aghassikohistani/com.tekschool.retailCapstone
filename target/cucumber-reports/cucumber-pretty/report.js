$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/RetailPage.feature");
formatter.feature({
  "line": 2,
  "name": "Retail Website Features",
  "description": "",
  "id": "retail-website-features",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@retailPage"
    }
  ]
});
formatter.before({
  "duration": 5531859500,
  "status": "passed"
});
formatter.background({
  "line": 6,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "User is on Retail website",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginTestStepDefinition.user_is_on_Retail_website()"
});
formatter.result({
  "duration": 5388959200,
  "status": "passed"
});
formatter.scenario({
  "line": 83,
  "name": "User add HP LP 3065 from Desktops tab to the cart",
  "description": "",
  "id": "retail-website-features;user-add-hp-lp-3065-from-desktops-tab-to-the-cart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 82,
      "name": "@HpDesktop"
    }
  ]
});
formatter.step({
  "line": 84,
  "name": "User is on Retail website",
  "keyword": "Given "
});
formatter.step({
  "line": 85,
  "name": "User click on Desktop tab",
  "keyword": "When "
});
formatter.step({
  "line": 86,
  "name": "User click on show all Desktop link",
  "keyword": "And "
});
formatter.step({
  "line": 87,
  "name": "User Click ADD TO  CART Option on ‘HP LP3065’ item \tAnd User Select quantity one",
  "keyword": "And "
});
formatter.step({
  "line": 88,
  "name": "User Click add to cart button",
  "keyword": "And "
});
formatter.step({
  "line": 89,
  "name": "User should see a message ‘success: you have added HP LP 3065 to your Shopping cart",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTestStepDefinition.user_is_on_Retail_website()"
});
formatter.result({
  "duration": 938313600,
  "status": "passed"
});
formatter.match({
  "location": "RetailPageTestStepDefinitions.user_click_on_Desktop_tab()"
});
formatter.result({
  "duration": 958261400,
  "status": "passed"
});
formatter.match({
  "location": "RetailPageTestStepDefinitions.user_click_on_show_all_Desktop()"
});
formatter.result({
  "duration": 1698698500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3065",
      "offset": 40
    }
  ],
  "location": "RetailPageTestStepDefinitions.user_Click_ADD_TO_CART_Option_on_HP_LP_item_And_User_Select_quantity_one(int)"
});
formatter.result({
  "duration": 181494000,
  "status": "passed"
});
formatter.match({
  "location": "RetailPageTestStepDefinitions.user_Click_add_to_cart_button()"
});
formatter.result({
  "duration": 2977476200,
  "error_message": "org.openqa.selenium.StaleElementReferenceException: stale element reference: element is not attached to the page document\n  (Session info: chrome\u003d89.0.4389.114)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/stale_element_reference.html\nBuild info: version: \u00273.7.0\u0027, revision: \u00272321c73\u0027, time: \u00272017-11-02T22:22:35.584Z\u0027\nSystem info: host: \u0027DESKTOP-L0NT18P\u0027, ip: \u0027192.168.0.12\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002715.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 89.0.4389.114, chrome: {chromedriverVersion: 89.0.4389.23 (61b08ee2c5002..., userDataDir: C:\\Users\\owner\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:62362}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: fbee35165dfc1c936f6dc0b735d4ca3a\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:64)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:600)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:279)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:83)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:64)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:564)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy21.click(Unknown Source)\r\n\tat utilities.WebDriverUtility.clickOnElement(WebDriverUtility.java:23)\r\n\tat pageObjects.RetailPageObj.clickOnAddToCartButton(RetailPageObj.java:138)\r\n\tat stepDefinitions.RetailPageTestStepDefinitions.user_Click_add_to_cart_button(RetailPageTestStepDefinitions.java:145)\r\n\tat ✽.And User Click add to cart button(Features/RetailPage.feature:88)\r\n",
  "status": "failed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 1508120200,
  "status": "passed"
});
});