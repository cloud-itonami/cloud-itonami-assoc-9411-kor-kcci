(ns association.facts
  "Industry rule/history catalog for the Korea Chamber of Commerce
  and Industry (KCCI, 대한상공회의소) -- a 56th industry-association-
  level source (see cloud-itonami-assoc-9411-sau-fsc, -9411-aut-wko,
  -9411-irl-ibec, -9411-nzl-businessnz, -9411-cze-spcr, -9411-ind-cii,
  -9411-zaf-busa, -9411-bra-cni, -9411-ken-kam, -9411-can-chamber,
  -9411-mex-coparmex, -9411-ita-confindustria, -9411-nld-vnoncw for
  the first thirteen) per ADR-2607141700
  (cloud-itonami-compliance-fact-federation). The FOURTEENTH entry
  aligned to ISIC 9411 (activities of business, employers, and
  professional membership organizations). Fills South Korea's
  previously-open association-axis gap (one of the 14-country gap
  list recorded at tick 148) -- South Korea now has real,
  individually verified facts across ALL THREE axes (country:
  cloud-itonami-iso3166-kor statute.facts; municipality:
  cloud-itonami-municipality-kor-seoul; association: this entry).

  SOURCING, corrected 2026-09-10. This catalog was seeded from Wikipedia
  because an earlier tick reported that korcham.net could not be
  navigated to a founding-history page and that a guessed history
  URL 404'd. The page does exist and is linked from korcham.net's
  own home page: /nCham/Service/Kcci/appl/History.asp. Following the
  site's own links rather than guessing a path reaches KCCI's
  published chronology, and every historical entry below now cites
  KCCI itself. The chronology confirms both facts the Wikipedia
  seeding had asserted -- the 1884 Hanseong Chamber of Commerce and
  the Chambers of Commerce and Industry Act -- and dates the Act
  precisely, to 20 December 1952.

  The two statute entries cite 국가법령정보센터 (law.go.kr), the
  Ministry of Government Legislation's portal. Their Act and Decree
  numbers and effective dates were cross-checked against that
  portal's open API, which returned the same values.

  KCCI's chronology also lists chairman inaugurations. Those are the
  personal names of office-holders and are deliberately NOT persisted
  here, per organization.edn's :head-role-note.

  An association not in `catalog` has NO spec-basis, full stop; never
  fabricate one.")

(def catalog
  "association-slug -> vector of association-rule entries."
  {"kcci"
   [{:association-rule/id "kcci.predecessor-seoul-chamber-1884"
     :association-rule/title "KCCI's earliest predecessor, the Hanseong Chamber of Commerce (한성상업회의소), was established in 1884 -- the year KCCI's own chronology dates its institutional history from"
     :association-rule/association "kcci"
     :association-rule/isic "9411"
     :association-rule/country "KOR"
     :association-rule/kind :governance-program
     :association-rule/url "https://www.korcham.net/nCham/Service/Kcci/appl/History.asp"
     :association-rule/url-provenance :official-korcham-net
     :association-rule/established-date "1884"
     :association-rule/retrieved-at "2026-09-10"
     :association-rule/topic #{:governance}}
    {:association-rule/id "kcci.commercial-conference-regulations-1895"
     :association-rule/title "The Commercial Conference Regulations (상무회의소규례) were enacted on 10 November 1895, the first legal framework for Korean chambers of commerce"
     :association-rule/association "kcci"
     :association-rule/isic "9411"
     :association-rule/country "KOR"
     :association-rule/kind :statute
     :association-rule/url "https://www.korcham.net/nCham/Service/Kcci/appl/History.asp"
     :association-rule/url-provenance :official-korcham-net
     :association-rule/established-date "1895-11-10"
     :association-rule/retrieved-at "2026-09-10"
     :association-rule/topic #{:governance :statute}}
    {:association-rule/id "kcci.joseon-chamber-founded-1946"
     :association-rule/title "The Joseon Chamber of Commerce and Industry (조선상공회의소) was founded on 19 May 1946"
     :association-rule/association "kcci"
     :association-rule/isic "9411"
     :association-rule/country "KOR"
     :association-rule/kind :governance-program
     :association-rule/url "https://www.korcham.net/nCham/Service/Kcci/appl/History.asp"
     :association-rule/url-provenance :official-korcham-net
     :association-rule/established-date "1946-05-19"
     :association-rule/retrieved-at "2026-09-10"
     :association-rule/topic #{:governance}}
    {:association-rule/id "kcci.gyeongseong-chamber-founded-1946"
     :association-rule/title "The Gyeongseong Chamber of Commerce and Industry (경성상공회의소) was founded on 26 September 1946"
     :association-rule/association "kcci"
     :association-rule/isic "9411"
     :association-rule/country "KOR"
     :association-rule/kind :governance-program
     :association-rule/url "https://www.korcham.net/nCham/Service/Kcci/appl/History.asp"
     :association-rule/url-provenance :official-korcham-net
     :association-rule/established-date "1946-09-26"
     :association-rule/retrieved-at "2026-09-10"
     :association-rule/topic #{:governance}}
    {:association-rule/id "kcci.renamed-kcci-1948"
     :association-rule/title "On 23 July 1948 the bodies were renamed the Korea Chamber of Commerce and Industry (대한상공회의소) and the Seoul Chamber of Commerce and Industry (서울상공회의소), the names in use today"
     :association-rule/association "kcci"
     :association-rule/isic "9411"
     :association-rule/country "KOR"
     :association-rule/kind :constitutive-instrument
     :association-rule/url "https://www.korcham.net/nCham/Service/Kcci/appl/History.asp"
     :association-rule/url-provenance :official-korcham-net
     :association-rule/established-date "1948-07-23"
     :association-rule/retrieved-at "2026-09-10"
     :association-rule/topic #{:governance}}
    {:association-rule/id "kcci.statutory-body-1952"
     :association-rule/title "The Chambers of Commerce and Industry Act (상공회의소법) was enacted on 20 December 1952, making KCCI an official statutory body"
     :association-rule/association "kcci"
     :association-rule/isic "9411"
     :association-rule/country "KOR"
     :association-rule/kind :statute
     :association-rule/url "https://www.korcham.net/nCham/Service/Kcci/appl/History.asp"
     :association-rule/url-provenance :official-korcham-net
     :association-rule/established-date "1952-12-20"
     :association-rule/retrieved-at "2026-09-10"
     :association-rule/topic #{:governance :statute}}
    {:association-rule/id "kcci.commerce-industry-day-1974"
     :association-rule/title "The first Commerce and Industry Day (제1회 상공의 날) was held on 20 March 1974"
     :association-rule/association "kcci"
     :association-rule/isic "9411"
     :association-rule/country "KOR"
     :association-rule/kind :governance-program
     :association-rule/url "https://www.korcham.net/nCham/Service/Kcci/appl/History.asp"
     :association-rule/url-provenance :official-korcham-net
     :association-rule/established-date "1974-03-20"
     :association-rule/retrieved-at "2026-09-10"
     :association-rule/topic #{:governance}}
    {:association-rule/id "kcci.centenary-1984"
     :association-rule/title "KCCI marked the centenary of the Korean chamber-of-commerce system (상공회의소 창립 100주년) on 31 October 1984"
     :association-rule/association "kcci"
     :association-rule/isic "9411"
     :association-rule/country "KOR"
     :association-rule/kind :governance-program
     :association-rule/url "https://www.korcham.net/nCham/Service/Kcci/appl/History.asp"
     :association-rule/url-provenance :official-korcham-net
     :association-rule/established-date "1984-10-31"
     :association-rule/retrieved-at "2026-09-10"
     :association-rule/topic #{:governance}}
    {:association-rule/id "kcci.ean-barcode-1988"
     :association-rule/title "KCCI joined EAN and began issuing Korea's distribution standard codes (EAN 가입 및 유통표준코드 보급) on 5 July 1988"
     :association-rule/association "kcci"
     :association-rule/isic "9411"
     :association-rule/country "KOR"
     :association-rule/kind :governance-program
     :association-rule/url "https://www.korcham.net/nCham/Service/Kcci/appl/History.asp"
     :association-rule/url-provenance :official-korcham-net
     :association-rule/established-date "1988-07-05"
     :association-rule/retrieved-at "2026-09-10"
     :association-rule/topic #{:governance}}
    {:association-rule/id "kcci.vocational-training-1994"
     :association-rule/title "KCCI took over eight vocational training institutes and began its vocational training programme (8개 직업훈련원 인수 및 직업훈련사업) on 1 April 1994"
     :association-rule/association "kcci"
     :association-rule/isic "9411"
     :association-rule/country "KOR"
     :association-rule/kind :governance-program
     :association-rule/url "https://www.korcham.net/nCham/Service/Kcci/appl/History.asp"
     :association-rule/url-provenance :official-korcham-net
     :association-rule/established-date "1994-04-01"
     :association-rule/retrieved-at "2026-09-10"
     :association-rule/topic #{:governance}}
    {:association-rule/id "kcci.wcc-seoul-2001"
     :association-rule/title "KCCI hosted the 2nd World Chambers Congress (제2차 세계 상공회의소총회) in Seoul on 7 June 2001"
     :association-rule/association "kcci"
     :association-rule/isic "9411"
     :association-rule/country "KOR"
     :association-rule/kind :governance-program
     :association-rule/url "https://www.korcham.net/nCham/Service/Kcci/appl/History.asp"
     :association-rule/url-provenance :official-korcham-net
     :association-rule/established-date "2001-06-07"
     :association-rule/retrieved-at "2026-09-10"
     :association-rule/topic #{:governance}}
    {:association-rule/id "kcci.sustainability-institute-2005"
     :association-rule/title "KCCI established the Korea Business Council for Sustainable Development (지속가능경영원) on 16 February 2005"
     :association-rule/association "kcci"
     :association-rule/isic "9411"
     :association-rule/country "KOR"
     :association-rule/kind :governance-program
     :association-rule/url "https://www.korcham.net/nCham/Service/Kcci/appl/History.asp"
     :association-rule/url-provenance :official-korcham-net
     :association-rule/established-date "2005-02-16"
     :association-rule/retrieved-at "2026-09-10"
     :association-rule/topic #{:governance}}
    {:association-rule/id "kcci.sgi-2018"
     :association-rule/title "KCCI established the Sustainable Growth Initiative (SGI) on 10 May 2018"
     :association-rule/association "kcci"
     :association-rule/isic "9411"
     :association-rule/country "KOR"
     :association-rule/kind :governance-program
     :association-rule/url "https://www.korcham.net/nCham/Service/Kcci/appl/History.asp"
     :association-rule/url-provenance :official-korcham-net
     :association-rule/established-date "2018-05-10"
     :association-rule/retrieved-at "2026-09-10"
     :association-rule/topic #{:governance}}
    {:association-rule/id "kcci.chambers-act-in-force-2026"
     :association-rule/title "The Chambers of Commerce and Industry Act (상공회의소법) in force is Act No. 21152, promulgated 2 December 2025 and effective 3 March 2026, administered by the Ministry of Trade and Industry -- KCCI's standing statutory basis"
     :association-rule/association "kcci"
     :association-rule/isic "9411"
     :association-rule/country "KOR"
     :association-rule/kind :statute
     :association-rule/url "https://www.law.go.kr/법령/상공회의소법"
     :association-rule/url-provenance :official-law-go-kr
     :association-rule/established-date "2026-03-03"
     :association-rule/retrieved-at "2026-09-10"
     :association-rule/topic #{:governance :statute}}
    {:association-rule/id "kcci.chambers-act-enforcement-decree-2025"
     :association-rule/title "The Enforcement Decree of the Chambers of Commerce and Industry Act (상공회의소법 시행령) in force is Presidential Decree No. 35803, promulgated and effective 1 October 2025"
     :association-rule/association "kcci"
     :association-rule/isic "9411"
     :association-rule/country "KOR"
     :association-rule/kind :statute
     :association-rule/url "https://www.law.go.kr/법령/상공회의소법시행령"
     :association-rule/url-provenance :official-law-go-kr
     :association-rule/established-date "2025-10-01"
     :association-rule/retrieved-at "2026-09-10"
     :association-rule/topic #{:governance :statute}}]})

(defn spec-basis [association] (get catalog association))

(defn coverage
  ([] (coverage (keys catalog)))
  ([associations]
   (let [have (filter catalog associations)
         missing (remove catalog associations)]
     {:requested (count associations)
      :covered (count have)
      :covered-associations (vec (sort have))
      :missing-associations (vec (sort missing))
      :note (str "cloud-itonami-assoc-9411-kor-kcci Wave 0 (ADR-2607141700): "
                 (count (get catalog "kcci")) " KCCI entries, every one cited to "
                 "KCCI's own chronology on korcham.net or to law.go.kr. "
                 "Extend `association.facts/catalog`, never fabricate an id/url.")})))

(defn by-topic [association topic]
  (filterv #(contains? (:association-rule/topic %) topic) (spec-basis association)))
