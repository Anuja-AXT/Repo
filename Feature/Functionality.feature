@Amazon_appln
Feature:To test amazon appln 

@Function1
Scenario:To test the Registration page
Given open the appln in chrome browser

When enter firstname , lastname , ok button 

Then create an account


@Function2
Scenario Outline: To test registration for multiple users

Given open the appln in chrome browser

When enter "<firstname>" , "<lastname>" , ok button 

Then create an account

Examples:

|firstname| lastname|
|aaaa     | aaaa    |
|bbbbb    | bbbb    |
|cccc     | cccc    |
|dddd     | dddd    |

