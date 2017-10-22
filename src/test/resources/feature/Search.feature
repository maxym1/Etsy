Feature: Search

  Background:
    Given "John" is viewing the landing page

  @Search
  Scenario: Should be able to search for a product from the drop-down menu
    And he mouses over Clothing & Shoes label on the landing page and click Womens from the drop down
    And he selects Dresses from the women clothing down menu
    Then he sees total number "(381,309 items)" of products displayed on the landing page

  @search
  Scenario: Should be able to search for a product from the icons
    When he clicks Jewellery & Accessories label on the landing page
    And he again clicks ALL JEWELLERIES & ACCESSORIES from the drop down
    And he clicks on Free Shipping
    And he clicks on Special offers
    And he selects item "Handmade" as item type
    And he selects price "Under £20" as price range
    And he selects colour "Gold" as colour type
    And he selects ordering "Customisable" as ordering options
    Then he sees a refine number "(3,805 items)" of items displayed on the landing page