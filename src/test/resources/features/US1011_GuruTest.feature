Feature: US1011 web tablosundaki istenen sutunu yazdirma
  @guru
  Scenario: TC16 kullanici sutun basligi ile liste alabilmeli



    Given kullanici "guruUrl" anasayfasinda
    And kullanici 2 saniye bekler
    And cookies sorulursa kabul eder
    And "Company", sutunundaki tum degerleri yazdirir
    And kullanici sayfayi kapatir


