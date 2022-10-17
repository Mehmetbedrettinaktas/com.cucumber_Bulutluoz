@wip
Feature:  US1002 Kullanici ortak adimlari Backrgound ile calistirir

  Background: ortak adim
    Given kullanici amazon anasayfasinda

    Scenario: TC04 amazon nutella arama
      And  kullanici Nutella icin arama yapar
      Then kullanici sonuclarin Nutella icerdigini test eder
      And kullanici sayfayi kapatir
  @sirali
      Scenario:  TC05 amazon java arama
        Then kullanici Java icin arama yapar
        Then kullanici Java icerdigini test eder
        And kullanici sayfayi kapatir