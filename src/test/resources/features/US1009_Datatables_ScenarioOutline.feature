Feature: US1009 datatables sitesine 5 farkli giris yapalim

  @datatable
  Scenario Outline: TC14 kullanici 5 farkli kayit girisi yapabilmeli

    When kullanici "datatablesUrl" anasayfasinda
    Then new butonuna basar
    And firstName bolumune "<firstName>" yazar
    Then kullanici 1 saniye bekler
    And lastname bolumune "<lastName>" yazar
    Then kullanici 1 saniye bekler
    And position bolumune "<position>" yazar
    Then kullanici 1 saniye bekler
    And office bolumune "<office>" yazar
    Then kullanici 1 saniye bekler
    And extension bolumune "<extension>" yazar
    Then kullanici 1 saniye bekler
    And startDate bolumune "<startDate>" yazar
    Then kullanici 1 saniye bekler
    And salary bolumune "<salary>" yazar
    Then kullanici 1 saniye bekler
    And Create tusuna basar
    When kullanici "<firstName>" ile arama yapar
    Then kullanici 1 saniye bekler
    Then isim bolumunde "<firstName>" oldugunu test eder
    And kullanici sayfayi kapatir

    Examples:
      | firstName | lastName | position | office | extension | startDate  | salary |
      | Alim      | Alim     | qa       | ankara | UI        | 2021-10-11 | 10000  |
      | Berk      | can      | tester   | ankara | api       | 2022-10-11 | 110000 |
      | salim     | kacar    | qa       | berlin | -         | 2021-06-11 | 120000 |
      | ahmet     | ak       | PO       | ankara | -         | 2020-10-11 | 110000 |
      | mehmet    | kaya     | qa       | ankara | UI        | 2020-11-17 | 10000  |

