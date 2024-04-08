Feature: Policy Creation

  Background: 
    Given User is on Dashboard page by login with valid credentials
      | username | exp_test |
      | password | exp_test |
    When User click New Submission in Actions menu
    Then User should verify "New Submissions" in Select Account page
    When User search account by Account Number and select existing account
    Then User should view "Account File Summary" in Account Summary page
    When User click New Submission in Actions menu on Account Summary page

  #@one
  #Scenario Outline: Creating Policy for PA LOB in Existing Account
    #Then User should verify "Personal Auto" in LOB page
    #When User select Personal Auto LOB in LOB page
    #Then User should view "Offerings" in Offering page
    #When User select Basic Program in Offering Selection and click Next
    #Then User should verify "Qualification" in Qualification page
    #When User click Next in Qualification page
    #Then User should view "Policy Info" in Policy Info page
    #When User click Next in Policy Info page
    #Then User should view "Drivers" in Drivers page
    #When User select Account Holder from Existing Driver in Add dropdown
    #And User enter contact details of driver
      #| Date of Birth | 02/07/1996 |
      #| License No.   | A98765432  |
      #| License State | Arizona    |
    #And User enter details in roles and Retrive MVR
      #| Year First Licensed  | 2015 |
      #| Number of Accidents  |    0 |
      #| Number of Violations |    0 |
    #Then User should verify MVR Status "Ordered"
    #When User click Next in Drivers page
    #Then User should view "Vehicles" in Vehicles page
    #When User click Create Vehicle enter mandatory details
      #| VIN           | 2FMDK51C99BA83243 |
      #| License State | Arizona           |
      #| Cost New      |              2000 |
    #And User Assign driver in Add dropdown and click Next
    #Then User should view "PA Coverages" in Coverages page
    #When User click Next in Coverages page
    #Then User should view "Risk Analysis" in Risk Analysis page
    #When User click Next in Risk Analysis page
    #Then User should view "Policy Review" in Policy Review page
    #When User click Quote in Policy Review page
    #Then User should view "Quote" in Quote page
    #When User click Issue Policy in Bind Options dropdown and click OK
    #Then User should view "Submission Bound" in Submission Bound page
    #When User click View Your Policy in Submission Bound page
    #Then User should verify "Policy File" and save Policy Number
@two
  Scenario Outline: Creating Policy for CA LOB in Existing Account
    Then User should verify "Commercial Auto" in LOB page
    When User select Commercial Auto LOB in LOB page
    Then User should view "Offerings" in Offering page
    When User select Standard in Offering Selection and click Next
    Then User should verify "Qualification" in Qualification page
    When User click Next in Qualification page
    Then User should view "Policy Info" in Policy Info page
    Then User enter organization Common ownership type
    When User click Next in Policy Info page
    Then User should verify "Commercial Auto Line" in Commercial Auto Line page
    When User enter mandatory details in Commercial Auto Line Page and click Next
      | Product | Motor Carrier and Truckers |
      | Fleet   | Fewer than 10 units        |
    Then User should view "Locations" in Location Details page
    When User click Next in Location Details page
    Then User should view "Vehicles" in Vehicles page
    When User click Create Vehicle
    Then User verify "Vehicle Information" in Vehicle Information page
    When User enter mandatory details
      | GaragedAt    |  1: 456 SRK, Algodones, NM  |
      | VehicleType  | Trucks,Tractors,Trailers |
      | VIN           | 5NPE34AF4FH023266        |
      | License State | Arizona                  |
      | Cost New      |                     2000 |
    And User click Search in Class column
    Then User should view "Vehicle Class Code Search" in VCC Search page
    When User select Size Class dropdown click Search and select
      | Size Class | Light truck |
    Then User should verify "Vehicle Information" in Vehicle Information page
    When User click OK in Vehicle Information page
    Then User should view "Vehicles" in Vehicles page
    When User click Next in Vehicles page
    Then User veiw "State Info" in State Info page
    When User click Next in State Info page
    Then User should view "Drivers" in Drivers page
    When User click Add Driver
    Then User should view "Driver Details" in Driver Details page
    When User enter mandatory details and click OK
      | First name    | SAral      |
      | Last name     | Kumar      |
      | Gender        | Male       |
      | Date of Birth | 02/07/1996 |
      | License No.   | A98765432  |
      | LicenseState  |  Arizona   |
      | License Year  |       2015 |
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
    When User click Issue Policy in Bind Options dropdown and click OK
    Then User should view "Submission Bound" in Submission Bound page
    When User click View Your Policy in Submission Bound page
    Then User should verify "Policy File" and save Policy Number

  Scenario Outline: Creating Policy for CP LOB in Existing Account
    Then User should verify "Commercial Property" in LOB page
    When User select Commercial Property LOB in LOB page
    Then User should view "Policy Info" in Policy Info page
    When User click Next in Policy Info page
    Then User should view "Buildings and Locations" in Buildings and Locations page
    When User click New Building from Add Building in Actions dropdown
    Then User should view "New Building" in New Building page
    When User enter mandatory details and click OK
      | Property Class Code |                           0003 |
      | Coverage From       | Building and Personal Property |
    And User enter anyone Income Limit in Business Income Coverage in Coverages
      | Income Limit - Not Mfg or Rental | 100 |
    Then User should view "Buildings and Locations" in Buildings and Locations page
    When User click Next in Buildings and Locations page
    Then User should view "Blankets" in Blankets page
    When User click Next in Blankets page
    Then User should view "Modifiers" in Modifiers page
    When User click Next in Modifiers page
    Then User should view "Risk Analysis" in Risk Analysis page
    When User click Next in Risk Analysis page
    Then User should view "Policy Review" in Policy Review page
    When User click Quote in Policy Review page
    Then User should view "Quote" in Quote page
    When User click Issue Policy in Bind Options dropdown and click OK
    Then User should view "Submission Bound" in Submission Bound page
    When User click View Your Policy in Submission Bound page
    Then User should verify "Policy File" and save Policy Number
