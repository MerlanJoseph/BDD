Feature: Account Creation

  Background: 
    Given User is on Login Page
    When User enter valid credentials and click login
      | username | exp_test |
      | password | exp_test |
    Then User should verify "Actions" in Dashboard page
    When User click New Account in Actions menu
    Then User should verify "Enter Account Information" in Applicant Information page

  @one
  Scenario Outline: Creating Account for Individual Person
    When User enter "<firstname>" and "<lastname>" click search
    Then User should view "The search returned zero results." in Applicant Information page
    When User click Person in Create New Account dropdown
    Then User should verify "Create account" in Create Account page
    When User click search icon in Organization column
    Then User should view "Organizations" in Organizations page
    When User enter "Enigma Fire & Casualty" and click Select in Search Results
    Then User should verify "Create account" in Create Account page
    When User enter all mandatory fields and click Update
      | Address 1     | 123 ABC                          |
      | ZIP Code      |                            85001 |
      | Address Type  | Home                             |
      | Producer Code | INT-3 Internal Producer Code - 3 |
    Then User should verify "<accountname>" in Account Summary page and save Account Number

    Examples: 
      | firstname | lastname | accountname |
      | Test      |      000 | Test 000    |

  @two
  Scenario Outline: Creating Account for Company
    When User enter "<companyname>" and click search
    Then User should view "The search returned zero results." in Applicant Information page
    When User click Company in Create New Account dropdown
    Then User should verify "Create account" in Create Account page
    When User click search icon in Organization column
    Then User should view "Organizations" in Organizations page
    When User enter "Enigma Fire & Casualty" and click Select in Search Results
    Then User should verify "Create account" in Create Account page
    When User enter all mandatory fields and click Update
      | Address 1     | 456 SRK                                  |
      | ZIP Code      |                                    87001 |
      | Address Type  | Business                                 |
      | Producer Code | Standard Code Internal Producer Code - 1 |
    Then User should verify "<accountname>" in Account Summary page and save Account Number

    Examples: 
      | companyname | accountname |
      | GW Ins.     | GW Ins.     |
