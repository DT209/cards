# Cards
Server Code Challenge for Robots and Pencils

## Original Instructions
"Write a simple class in the language of your choice to represent a deck of cards with
operations to shuffle the deck and to deal one card. While not a requirement today, a
likely future enhancement is the need to deal all the cards in a deck.
While not strictly required, we value usage instructions, nicely-modeled data, automated
tests, and thoughtful consideration of architectural decisions and simplicity-vs-
completeness trade-offs." (See docs directory for full set of original instructions)

## Layout
This project follows the standard Maven file structure and is a standard Maven project
* <project root>/src/ contains all of the source code
* <project root>/src/main contains all of the product code
* <project root>/src/test contains all of the test code

## Commonly used commands

### Testing
```
mvn test
```
Specifically you will want to review and run com.dt209.cards.DeckTest

# Architectural Decisions
* No extra code should be written to support testing

# Design Decisions
* Cards should be immutable as they are a well known construct, 
therefore Cards are an inner class of Deck instead of a standalone class. 

# Other Considerations
* There is no "interface" or API to this code as it is not required
* There is no framework (other than a build framework) as it is not required
* It would have been easier to better test this code had the requirements allowed for dealing more cards.
* deck.dealFirst() should really be deck.deal() but the intent of the method was not clear that way, hence it was renamed.