Feature: Ebay search

@smoke
Scenario: Ebay search functionality
Given User is on eBay Home Page
When user search for "iPhone"
Then user is on search result page
