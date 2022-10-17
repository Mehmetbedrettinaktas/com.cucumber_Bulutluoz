
Feature: US1003 kullanici paremetre kullanarak arama yapabilmeli


  @paremetre  @sirali
  Scenario: TC06 kullanici parametre ile amazonda arama yapabilmeli
    And kullanici amazon anasayfasinda
    And kullanici "Java" icin arama yapar
    And kullanici sonuclarin "hava" icerdigini test eder
    Then kullanici sayfayi kapatir