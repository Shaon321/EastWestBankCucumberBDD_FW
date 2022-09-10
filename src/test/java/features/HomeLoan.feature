Feature: HomeLoan feature test
  @signup
  Scenario: Create a account
    Given I am at East West Bank Homepage
    When I click on HomeLoan Button
    Then I should land on home-mortgage-loan page
    Then I should be able to click on Apply Online on equity-line-of-credit box
    Then I should land on Mortgage page
    Then I should be able to click on Equity-line-of-credit button
    Then I should be able to enter Zipcode
    Then I am at sign-up page

