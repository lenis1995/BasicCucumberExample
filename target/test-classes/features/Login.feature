Feature: Application Login

Scenario: Home page default login 
Given User is on NetBanking landing page
When User login into application with username "lens" and password "xexo123"
Then Home page is shown
And Cards are displayed "true"

Scenario: Home page default login 
Given User is on NetBanking landing page
When User login into application with username "sebas" and password "lorowe"
Then Home page is shown
And Cards are displayed "false"