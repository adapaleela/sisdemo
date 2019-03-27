
Feature: Sisdemo data driven testing using bdd
     
Scenario: registering new student details
    Given launch site
    When click on administrator link to login as administrator
    And fill userid and password to login
      | userid  | password |
      | admin   |  3xq@123 |
    And click on Login button  
    And click on Student link 
    And click on Add new to register new student
    And fill the below details of student
    |fname  |mname  |lname  |gender|standard|occupation|income|    religion        |   community   |paddress|caddress|mothertongue|moles   |    aadharno    |section|rollno|lastcshoolname|admissionno|regno|housename|fathername|mothername|mobileno  |areacode|landlineno|     email        |country|  state       |nationality|district|pincode|height|weight|bloodgroup|vleft|vright|teeth|
    |hjkhjkh|ghgjhhj|ghghghj|Female|    5   |bussiness |520532|Zoroastrianismwerwer| OthersTitle234|hghghghg|vcgvcgvg|   Telugu   |gfggvgvg|5566123478958569|   A   | 565  |jhhjhhhhhnhgjh|5754454754 |45584|gfgfghfhg|  gfggggh |hghhghghg |7894561230|   2454 |45565656  |dggfghgh@gmail.com| India |Andhra Pradesh|   hindu   |krishna |524613 |  5.9 |  59  |B positive|good |good  |good |
    And click save button
    And click on signout
    And close site
    