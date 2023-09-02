Feature: Login to Website
  we have to login to the saucelab website to check the log in process.
#
#  Scenario: login with valid credentials
#    Given Website is opened
#    When User logged in with credentials "standard_user"
#    Then User is on homepage
#    And Browser is Closed
#
#  Scenario: login with invalid credentials
#    Given Website is opened
#    When User logged in with credentials "invaliduser"
#    Then User should not be logged in to the website
#    And Error message is displayed
#    And Browser is Closed

  Scenario: Verify that user is able to sort the products
    Given Website is opened
    When User logged in with credentials "standard_user"
    Then User is on homepage
    And Verify that user is able to sort product with option "Name (A to Z)"
#    And Verify that user is able to sort product with option "Name (Z to A)"
#    And Verify that user is able to sort product with option "Price (low to high)"
#    And Verify that user is able to sort product with option "Price (high to low)"
    And Browser is Closed


#  Scenario: Verify that user is able to add the items to the cart
#    Given User is on homepage
#    When User selects a product to add
#    Then Product should be added to the cart
#    Then Count in the cart should be displayed
#    When User clicks on the remove button
#    Then Product should be removed from the cart
#    And Count in the cart should be displayed
#
#  Scenario: Verify that user is able to checkout a product
#    Given User is on homepage
#    When User selects a product to add
#    Then Product should be added to the cart
#    When User clicks on the checkout button
#    Then User should navigate to the information page
#    When User clicks continue button on Information page
#    Then User should navigate to overview page
#    When User clicks finish button
#    Then User should checkout the product
#    And  Thank you message is displayed "sdfadfaf"
#    When User clicks "Go to home" button
#    Then User navigates to home page

#  Scenario: Verify that on clicking social media apps navigating to websites
#    Given User is on homepage
#    When Scroll down the page to the bottom
#    Then Click on the Twitter icon
#    And User is navigated to the Twitter page
#
#    Given User is on homepage
#    When Scroll down the page to the bottom
#    Then Click on the facebook icon
#    And User is navigated to the Facebook page
#
#    Given User is on homepage
#    When Scroll down the page to the bottom
#    Then Click on the Linkdin icon
#    And User is navigated to the Linkdin page

#  Scenario: Verify that correct count is displayed in cart on adding product
#    Given User is on homepage
#    When User clicks on Add to cart button
#    Then Count in the cart should be displayed
#    And On adding more items count should increase
#
#    Given Given User is on homepage
#    When User clicks on remove button
#    Then Count in the cart should be displayed
#    And On Removing more items count should decrease