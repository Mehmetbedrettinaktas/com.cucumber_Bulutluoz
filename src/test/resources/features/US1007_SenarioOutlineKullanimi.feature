# amazon sayfasina gidip sirasiyla nutella, java, elma, armut aratip
  # sonuclarin arama yaptigimiz kelimeyi icerdigini test edelim

Feature: US1007 Kullanici Amazonda istedigi kelimeleri aratir

  Scenario Outline: TC12 amazonda listedeki elementleri aratma

    Given  kullanici "amazonUrl" anasayfasinda
    Then kullanici "<istenenKelime>" icin arama yapar
    And  kullanici sonuclarin "<istenenKelime>" icerdigini test eder
    And kullanici sayfayi kapatir

    Examples:
      | istenenKelime |istenenKelimeKontrol|
      | nutella       |nutella             |
      | java          |java                |
      | elma          |elma                |
      | armut         |armut               |
