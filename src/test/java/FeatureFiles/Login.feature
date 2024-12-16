# Ibrahim branch - Kullanıcı giriş testi
Feature: Login Functionality - Basic Scenario

@SmokeTest
Scenario: Login with valid username and password
  Given Navigate to Campus
  When Enter username and password and click login button

# Master branch - Gelişmiş kullanıcı giriş testi
Feature: Login Feature - Full Scenario

Scenario: Successful Login Verification
  Given Navigate to Campus
  When The user types username and password and click login button
  Then The user verifies login successfully

