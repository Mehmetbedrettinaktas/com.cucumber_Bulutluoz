Feature: US1004 Kullanici paremetre ile configration file'i kullanabilmeli

  @config
  Scenario: TC07 configration properties dosyasindan parametre kullanimi

    Given kullanici "amazon" anasayfasinda
    Then kullanici 3 saniye bekler
    And kullanici url'in "amazon" icerdigini test eder
    Then kullanici sayfayi kapatir