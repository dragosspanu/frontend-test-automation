Feature: Lookup a definition
  In order to talk better
  As an English student
  I want to look up word definitions

  Scenario Outline: Looking up the definition of a word
    Given the user is on the Wiktionary home page
    When the user looks up the definition of the "<word>"
    Then the "<definition>" definition is displayed

    Examples:
      | word   | definition                                                                                         |
      | apple  | A common, round fruit produced by the tree Malus domestica, cultivated in temperate climates.      |
      | pear   | An edible fruit produced by the pear tree, similar to an apple but elongated towards the stem.     |
      | banana | An elongated curved tropical fruit that grows in bunches and has a creamy flesh and a smooth skin. |
      | lemon  | A semitropical evergreen tree, Citrus limon, that bears such fruits.                               |