Feature: Test the Guru99 Application

  Scenario Outline: Test the guru99 register page
    Given user is on guru99 register page
    And user validate url and register page title
    When user enter contact page details "<FirstName>" , "<LastName>","<Phone>" and "<Email>"
    And user enter mailing information "<Address>" , "<City>","<State>", "<PostalCode>" and "<Country>"
    And user enter user information details "<UserName>", "<Password>" and "<ConfirPassword>"
    And user validate sucessful register messege

    Examples: 
      | FirstName | LastName | Phone      | Email            | Address  | City    | State       | PostalCode | Country | UserName | Password | ConfirPassword |
      | Disha     | jare     | 9999099990 | disha@gmail.com  | Dighi    | Bhosari | MAHARASHTRA |     411029 | INDIA   | disha    | disha123 | disha123       |
      | Monali    | More     | 8808088088 | monali@gmail.com | Baramati | Pune    | MAHARASHTRA |     411059 | CHINA   | monali   | mona123  | mona123        |
