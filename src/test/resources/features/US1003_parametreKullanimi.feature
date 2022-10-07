
Feature: US1003 kullanici paremetre kullanarak arama yapabilmeli


  @paremetre
  Scenario: TC06 kullanici parametre ile amazonda arama yapabilmeli
    And kullanici amazon anasayfasinda
    And kullanici "Java" icin arama yapar
    And kullanici sonuclarin "Java" icerdigini test eder
    Then kullanici sayfayi kapatir