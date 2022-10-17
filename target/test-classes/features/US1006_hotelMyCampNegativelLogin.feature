# hotel my camp sitesinde 3 adet negative test senaryosu olusturalim
  # 1- dogru sifre dogru password
  # 2- yanlis username-dogru password
  # 3- yanlis username- yanlis password

  Feature: US1006 yanlis bilgilerle siteye giris yapilmaz

    Scenario: TC09 yanlis password ile giris yapilmaz
      Given kullanici "HotelmycampUrl" anasayfasinda
      Then Log in yazisina tiklar
      And gecerli username girer
      And gecersiz password girer
      And Login butonuna basar
      Then sayfaya giris yapilamadigini test eder
      And kullanici sayfayi kapatir


    Scenario: TC10 yanlis password ile giris yapilmaz
      Given kullanici "HotelmycampUrl" anasayfasinda
      Then Log in yazisina tiklar
      And gecersiz username girer
      And gecerli password girer
      And Login butonuna basar
      Then sayfaya giris yapilamadigini test eder
      And kullanici sayfayi kapatir


    Scenario: TC10 yanlis kulanici adi ve yanlis password ile giris yapilmaz
      Given kullanici "HotelmycampUrl" anasayfasinda
      Then Log in yazisina tiklar
      And gecersiz username girer
      And gecersiz password girer
      And Login butonuna basar
      Then sayfaya giris yapilamadigini test eder
      And kullanici sayfayi kapatir