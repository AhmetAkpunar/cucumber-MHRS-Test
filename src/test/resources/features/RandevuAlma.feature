
Feature: MHRS randevu

  Scenario: Kullanici MHRS sistemine girip basarili sekilde randevu alabilmeli

    Given mhrs randevu al sitesine git
    And gecerli "kimlik no" ve gecerli "sifre" gir
    And hastane randevusu bul butonuna tikla
    And genel aramaya gore ara
    And il "Elazig" sec
    And ilce "Merkez" sec
    And klinik "iç hastaliklari" sec
    And tarih "24.04.2013" sec
    And randevu ara buttonuna tikla
    And listeden herhangi bir doktoru sec
    And istedigin saati sec
    And tamam butununa tikla
    And randevu onayla buttona tikla
    Then randevu alindigini dogrula
