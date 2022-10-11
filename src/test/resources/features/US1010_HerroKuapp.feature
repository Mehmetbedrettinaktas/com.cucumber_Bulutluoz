Feature: US1010 herrokuapp Delete testi

  Scenario: TC15 herrokuapp'dan delete buttonu calismali
    Given kullanici "herrokuappUrl" anasayfasinda
    And kullanici Add Element butona basar
    And kullanici Delete butonu gorunur oluncaya kadar bekler
    Then kullanici Delete butonunun gorunur oldugunu test eder
    Then kullanici Delete butonuna basarak butonu siler
    And kullanici Delete butonunun gorunmedigini test eder
    And kullanici sayfayi kapatir


