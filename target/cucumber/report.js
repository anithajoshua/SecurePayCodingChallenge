$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/ClickLogo.feature");
formatter.feature({
  "name": "Click Logo",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "I want to click on the logo on the Contact Us page",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am at the Contact Us page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.ClickLogo.I_am_at_the_Contact_Us_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the logo",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.ClickLogo.I_click_on_the_logo()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am taken to SecurePay page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.ClickLogo.I_am_taken_to_SecurePay_page()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:Features/FillContactForm.feature");
formatter.feature({
  "name": "Contact us form",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Fill details on the Contact us form",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am at the Contact us page of the SecurePay Website",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.FillContactForm.I_am_at_the_Contact_us_page_of_the_SecurePay_Website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter details for all the fields",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.FillContactForm.I_enter_details_for_all_the_fields()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be able see the details entered",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.FillContactForm.I_should_be_able_see_the_details_entered()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:Features/GoogleLaunch.feature");
formatter.feature({
  "name": "I want to launch the Google Page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Launch Google Page",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I enter the Google URL on chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.GoogleLaunch.I_enter_the_Google_URL_on_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be redirected to the Google Search Page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.GoogleLaunch.I_should_be_redirected_to_the_Google_Search_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:Features/NavigateToContactUs.feature");
formatter.feature({
  "name": "Contact us page navigation",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Navigate to the Contact us page",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am on the SecurePay Website",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.NavigateToContactUs.I_am_on_the_SecurePay_Website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Contact us link",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.NavigateToContactUs.I_click_on_Contact_us_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be navigated to the Contact us page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.NavigateToContactUs.I_should_be_navigated_to_the_contact_us_page()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:Features/NavigateToSecurePay.feature");
formatter.feature({
  "name": "SecurePay page navigation",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Navigate to SecurePay page",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am on the Google Search Page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.NavigateToSecurePay.I_am_on_the_Google_Search_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on a SecurePay link",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.NavigateToSecurePay.I_click_on_a_SecurePay_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be redirected to the SecurePay website",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.NavigateToSecurePay.I_should_be_redirected_to_the_SecurePay_website()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:Features/NavigateToSecurePayOnlinePayments.feature");
formatter.feature({
  "name": "Secure Pay Online Payments page navigation",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Navigate to Secure Pay Online Payments page",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am at the SecurePay Website",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.NavigateToSecurePayOnlinePayments.I_am_at_the_SecurePay_Website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on SecurePay Online Payments link",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.NavigateToSecurePayOnlinePayments.I_click_on_SecurePay_Online_Payments_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be redirected to the SecurePay Online Payments page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.NavigateToSecurePayOnlinePayments.I_should_be_redirected_to_the_SecurePay_Online_Payments_page()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:Features/SearchSecurePay.feature");
formatter.feature({
  "name": "I want to search for SecurePay in Google",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Google Search for SecurePay",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I enter the Google URL",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.SearchSecurePay.I_enter_the_Google_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search for SecurePay",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.SearchSecurePay.I_search_for_SecurePay()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The search should list the Securepay links",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.SearchSecurePay.The_search_should_list_the_Securepay_links()"
});
formatter.result({
  "status": "passed"
});
});