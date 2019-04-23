[ ] Pademonstruoti darbo su pasirinktais įrankiais (IDE, Application Server, Build tool, Version Control System) minimalų ciklą (0.15):
  - [ ] naudojantis IDE padaryti minimalų pakeitimą projekto išeities tekstuose ir surinkti projektą, (0.05 balo)
  - [ ] gebėti parodyti, kurioje vietoje IDE yra pasiekiamas dalykinis serveris (Application Server), kaip startuoti/sustabdyti dalykinį serverį, paleisti surinkimo rezultatus vykdymui dalykiniame serveryje, (0.05 balo)
  - [ ] projekto išeities tekstų pakeitimus patalpinti versijų kontrolės sistemoje. (0.05 balo)

[ ] DB, ORM/JPA ir DataMapper/MyBatis (0.25):
  - [ ] Sukurti duomenų bazę. Turi būti naudojami one-to-many ir many-to-many ryšiai. (0.05 balo)
  - [ ] Sugeneruotoms/parašytoms JPA esybėms gebėti parodyti ir paaiškinti, kaip esybių laukai (Java klasių laukai) atitinka DB lentelių stulpelius; ką daryti, jei norime lauką pavadinti kitaip nei pavadintas atitinkamas stulpelis. Gebėti parodyti ir paaiškinti, kur esybėse yra one-to-many bei many-to-many ryšiai ir kaip jie atitinka DB lenteles. (0.1 balo)
[ ] Tą patį gebėti paaiškinti MyBatis esybėms. (0.1)

[ ] Įgyvendinti vieną panaudos atvejį (0.6):
  - [ ] UI: su laisvai pasirinkta technologija:
    - [ ] reikia sukurti bent vieną puslapį, pateikiantį DB esančius duomenis/dalį duomenų. Būtina pateikti kelių susijusių DB esybių duomenis (pvz.: universitetas ir jo studentai; studentai ir jų lankomi kursai). T.y., formuojant UI turi būti naviguojama per DB ryšius one-to-many/many-to-one/many-to-many (bent per vieną). (0.1)
    - [ ] reikia sukurti bent vieną formą, leidžiančią įvesti duomenis. Įvesti duomenys turi būti automatiškai įrašomi į kokios nors klasės objektą (data binding), o vėliau ir į DB. (0.1)
    - [ ] Dalykinio funkcionalumo komponentas (Business logic component): turi būti bent vienas CDI komponentas, apdorojantis per UI įvestus duomenis. Reikia gebėti paaiškinti, kada Java klasė virsta komponentu, ką reiškia @RequestScoped, @SessionScoped, @ApplicationScoped bei @Inject anotacijos. (0.05)

[ ] Duomenų prieigos komponentas (Data Access component - DAO): Turi būti duomenų išsaugojimo/modifikavimo duomenų bazėje DAO komponentas:
  - [ ] Naudojantis ORM/JPA (0.1)
  - [ ] Naudojantis DataMapper/MyBatis (0.1)
  - [ ] Reikia gebėti paaiškinti skirtumus/privalumus/trūkumus tarp ORM ir DataMapper (kada ką geriau naudoti). (0.1)
  - [ ] Būtinos automatinės/deklaratyvios DB transakcijos (rankomis rašyti "begin()/commit()" negalima). (0.05)
