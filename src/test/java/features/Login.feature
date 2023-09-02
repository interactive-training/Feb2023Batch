@ui
Feature: Login to Website
  Verify login process with valid users where we get home page for all users

  @full
  Scenario Outline: login with valid credentials
    When User logged in with credentials "<User_name>"
    Then User navigates to home page

    @sanity
    Examples:
      | User_name     |
      | standard_user |

    @regression
    Examples:
      | User_name               |
      | problem_user            |
      | performance_glitch_user |

