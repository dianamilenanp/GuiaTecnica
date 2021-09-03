#Autor: Diana Niño
@stories
  Feature: Academy Choucair
    As auser, I want to learn how to automate in screamplay at the Choucair Academy with the automation course
  @scenario1
  Scenario: Search for a automation course
    Given that Rose wants to learn automation at the academy Choucair
     |strUser    |strPassword       |
     |<strUser>  |<strPassword>     |

    When she search for the course on the Choucair academy platform
      |strCourse    |
      |<strCourse>  |
    Then she finds the course called
      |strCourse   |
      |<strCourse> |