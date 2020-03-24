Feature: Send a message via the Contact Us section
  In order to communicate with the shop
  As a customer
  I want to send messages from the website contact form

  Scenario Outline: Sending a message via the Contact Us
    Given the user is in the shop's Contact Us section
    When the user selects "<subjectHeading>" as Subject Heading
    And he inserts his email account "<emailAddress>"
    And he inserts his order reference "<orderReference>"
    And he inserts his text message "<message>"
    And he clicks the CTA button
    Then the "<successMessage>" success message is shown

    Examples:
      | subjectHeading   | emailAddress        | orderReference | message                                              | successMessage                                       |
      | Webmaster        | johnnytester@qa.com | 21210000       | src/test/resources/test_files/contact_us_message.txt | Your message has been successfully sent to our team. |
      | Customer service | tester4life@qa.com  | 9999           | src/test/resources/test_files/contact_us_message.txt | Your message has been successfully sent to our team. |