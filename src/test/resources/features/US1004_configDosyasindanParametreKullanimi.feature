Feature: US1004 Kullanici paremetre ile configration file'i kullanabilmeli

  @config
  Scenario: TC07 configration properties dosyasindan parametre kullanimi

    Given kullanici "techproeducationUrl" anasayfasinda
    Then kullanici 12 saniye bekler
    And kullanici url'in "techproeducation" icerdigini test eder
    Then kullanici sayfayi kapatir