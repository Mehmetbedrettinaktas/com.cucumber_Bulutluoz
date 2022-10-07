@tumu
Feature: US1001 Kullanici Amazon Sayfasinda Arama Yapar
  @nutella @ikisi
  Scenario: TC01 kullanici amazonda Nutella aratir

    Given kullanici amazon anasayfasinda
    Then  kullanici Nutella icin arama yapar
    And kullanici sonuclarin Nutella icerdigini test eder
    And kullanici sayfayi kapatir

  @java @ikisi
    Scenario: TC02 kullanici amazonda Java aratir
      Given kullanici amazon anasayfasinda
      Then kullanici Java icin arama yapar
      And kullanici Java icerdigini test eder
      And kullanici sayfayi kapatir

    @iphone
      Scenario: TC03 kullanici amazonda iphone aratir
        When kullanici amazon anasayfasinda
        And kullanici iphone icin arama yapar
        Then kullanici sonuclarin iphone icerdigini test eder
        And kullanici sayfayi kapatir