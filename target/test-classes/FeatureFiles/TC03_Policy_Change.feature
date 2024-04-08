Feature: Policy Change

  Scenario Outline: Changes of Existing PA Policy in Existing Account
    Given User is on Home page by login with valid credentials
      | username | exp_test |
      | password | exp_test |
    When User click New Submission in Actions menu
    Then User should verify "New Submissions" in Select Account page
    When User search account by Account Number and select existing account
    Then User should view "Account File Summary" in Account Summary page
    When User select existing PA policy in Account Summary page
    Then User should view "Policy File" in Policy Summary page
    When User click Change Policy from Actions dropdown
    Then User should view "Start Policy Change" in Start Policy Change page
    When User click Next in Start Policy Change page
    Then User should view "Offerings" in Offering Selection page
    When User click Next in Offering Selection page
    Then User should view "Policy Info" in Policy Info page
    When User click Next in Policy Info page
    Then User should view "Drivers" in Drivers page
    When User click Next in Drivers page
    Then User should view "Vehicles" in Vehicles page
    When User click Next in Vehicles page
    Then User should view "PA Coverages" in Coverages page
    When User makes necessary changes and click Next in Coverages page
    Then User should view "Risk Analysis" in Risk Analysis page
    When User click Next in Risk Analysis page
    Then User should view "Policy Review" in Policy Review page
    When User click Quote in Policy Review page
    Then User should view "Quote" in Quote page
    When User click Issue Policy and click OK
    Then User should view "Policy Change Bound" in Policy Change Bound page
    When User click View Your Policy in Policy Change Bound page
    Then User should verify "Policy Change" and save Transaction Number

  Scenario Outline: Changes of Existing CA Policy in Existing Account
    Given User is on Home page by login with valid credentials
      | username | exp_test |
      | password | exp_test |
    When User click New Submission in Actions menu
    Then User should verify "New Submissions" in Select Account page
    When User search account by Account Number and select existing account
    Then User should view "Account File Summary" in Account Summary page
    When User select existing CA policy in Account Summary page
    Then User should view "Policy File" in Policy Summary page
    When User click Change Policy from Actions dropdown
    Then User should view "Start Policy Change" in Start Policy Change page
    When User click Next in Start Policy Change page
    Then User should view "Offerings" in Offering Selection page
    When User click Next in Offering Selection page
    Then User should view "Policy Info" in Policy Info page
    When User click Next in Policy Info page
    Then User should verify "Commercial Auto Line" in Commercial Auto Line page
    When User makes necessary changes and click Next in Commercial Auto Line page
    Then User should view "Locations" in Location Details page
    When User click Next in Location Details page
    Then User should view "Vehicles" in Vehicles page
    When User click Next in Vehicles page
    Then User veiw "State Info" in State Info page
    When User click Next in State Info page
    Then User should view "Drivers" in Drivers page
    When User click Next in Drivers page
    Then User should view "Covered Vehicles" in Covered Vehicles page
    When User click Next in Covered Vehicles page
    Then User should view "Modifiers" in Modifiers page
    When User click Next in Modifiers page
    Then User should view "Risk Analysis" in Risk Analysis page
    When User click Next in Risk Analysis page
    Then User should view "Policy Review" in Policy Review page
    When User click Quote in Policy Review page
    Then User should view "Quote" in Quote page
    When User click Issue Policy and click OK
    Then User should view "Policy Change Bound" in Policy Change Bound page
    When User click View Your Policy in Policy Change Bound page
    Then User should verify "Policy Change" and save Transaction Number

  Scenario Outline: Changes of Existing CP Policy in Existing Account
    Given User is on Home page by login with valid credentials
      | username | exp_test |
      | password | exp_test |
    When User click New Submission in Actions menu
    Then User should verify "New Submissions" in Select Account page
    When User search account by Account Number and select existing account
    Then User should view "Account File Summary" in Account Summary page
    When User select existing CP policy in Account Summary page
    Then User should view "Policy File" in Policy Summary page
    When User click Change Policy from Actions dropdown